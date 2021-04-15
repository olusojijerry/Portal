package com.educationportal.utils;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

public class Utils {

    //this method generates the id for records with string id
    public static String generateId() throws NoSuchAlgorithmException, UnsupportedEncodingException {
        UUID uuid = UUID.randomUUID();

        MessageDigest salt = MessageDigest.getInstance("SHA-256");
        salt.update(uuid.toString().getBytes("UTF-8"));

        String digest = bytesToHex(salt.digest());

        return digest;
    }

    public static String id(){
        String s = UUID.randomUUID().toString();
        s = s.substring(0, Math.min(s.length(), 15));

        return s;
    }

    private static String bytesToHex(byte[] byteArray){
        StringBuffer hexStringBuffer = new StringBuffer();
        for (int i = 0; i < byteArray.length; i++) {
            hexStringBuffer.append(byteToHex(byteArray[i]));
        }
        return hexStringBuffer.toString();
    }

    public static String byteToHex(byte num) {
        char[] hexDigits = new char[2];
        hexDigits[0] = Character.forDigit((num >> 4) & 0xF, 16);
        hexDigits[1] = Character.forDigit((num & 0xF), 16);
        return new String(hexDigits);
    }

    public static String generateAdmissionNum(String serials, String surname){
        StringBuilder admissionNum = new StringBuilder();
        SimpleDateFormat sf = new SimpleDateFormat("yyyy");

        String dt = sf.format(new Date());
        admissionNum.append(dt);
        admissionNum.append("/");
        admissionNum.append(surname.substring(0,2));
        admissionNum.append(serials);

        return admissionNum.toString();
    }
}
