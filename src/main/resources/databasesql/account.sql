create table ACCOUNT (
ID VARCHAR(10) COMMENT 'USER ID',
NAME VARCHAR(50) COMMENT 'USER NAME',
PASSWORD VARCHAR(50) COMMENT 'USER PASSWORD',
PHONE VARCHAR(11) COMMENT 'USER PHONE NUMBER',
MAIL VARCHAR(50) COMMENT 'USER EMAIL ADDRESS',
IND_SEX VARCHAR(1) COMMENT 'USER SEX INDEX',
IND_STATUS VARCHAR(1) COMMENT 'INDEX OF USER STATUS',
PRIMARY KEY (ID)
)COMMENT='USER ACCCOUNT TABLE';
