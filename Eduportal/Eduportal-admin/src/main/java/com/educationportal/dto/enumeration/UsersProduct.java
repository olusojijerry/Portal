package com.educationportal.dto.enumeration;

public enum UsersProduct {
    TEACHER("TEACHER");

    private final String title;

    UsersProduct(String title){
        this.title = title;
    }

    public String getValue(){
        return this.title;
    }

    public static UsersProduct getEnumFromString(String text){
        for (UsersProduct classGroup : UsersProduct.values()){
            if(classGroup.title.equalsIgnoreCase(text)){
                return classGroup;
            }
        }
        throw new IllegalArgumentException("No Constant with Text " +text+ "found");
    }
}
