INSERT INTO users (name, email, password, enabled, token_expired, account_expired, account_locked)
VALUES ('admin', 'jerry@systems.com', '{bcrypt}$2a$10$O6TVnOlkbeGAg6S0CTo65OZo1MZzEBXRM9wCkjYe34HZ.THec.qOG',
1, 0, 0, 0), ('test', 'test@test.com', '{bcrypt}$2a$10$O6TVnOlkbeGAg6S0CTo65OZo1MZzEBXRM9wCkjYe34HZ.THec.qOG',
1, 0, 0, 0)