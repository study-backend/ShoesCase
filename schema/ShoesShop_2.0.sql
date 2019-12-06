
CREATE TABLE ACCOUNT(
    ACCOUNT_ID NUMBER(19) CONSTRAINT id_acc_pk PRIMARY KEY,
    LOGIN_ID VARCHAR2(50) NOT NULL,
    LOGIN_PWD VARCHAR2(50) NOT NULL,
    NAME VARCHAR2(20) NOT NULL,
    PHONE VARCHAR2(20) NOT NULL,
    EMAIL VARCHAR2(30) NOT NULL,
    ADDR VARCHAR2(50) NOT NULL,
    SEX CHAR(3) NOT NULL,
    BIRTHDAY DATE NOT NULL,
--    LOGIN_DATE DATE NOT NULL,
--    LOGOUT_DATE DATE NOT NULL,
    TERMS_VERSION INT NOT NULL,
    TERMS_AGREE_DATE DATE NOT NULL,
    CREATE_DATE DATE NOT NULL,
    UPDATE_DATE DATE NOT NULL,
    DELETE_DATE DATE NOT NULL
);

select * from account;
insert into account values(100,'han','1234','용한','010-1122-3333','byh@email.com','관악구 봉천동','남','1992-11-22',1,sysdate, sysdate,sysdate,sysdate);
insert into account values(101,'hany1','1234','수녕','010-1322-3333','sn@email.com','관악구 봉천동','남','1993-11-22',1,sysdate, sysdate,sysdate,sysdate);
insert into account values(102,'byh11','1234','지연','010-1422-3333','jy@email.com','관악구 봉천동','여','1994-11-22',1,sysdate, sysdate,sysdate,sysdate);
insert into account values(103,'hee','1234','세원','010-1125-3333','sw@email.com','관악구 봉천동','남','1990-11-22',1,sysdate, sysdate,sysdate,sysdate);
insert into account values(104,'king','1234','한규','010-1122-3333','gk@email.com','관악구 봉천동','남','1990-11-22',1,sysdate, sysdate,sysdate,sysdate);
insert into account values(105,'queen','1234','장현','010-1122-3333','jh@email.com','관악구 봉천동','남','1990-11-22',1,sysdate, sysdate,sysdate,sysdate);
insert into account values(106,'idid12','1234','바보','010-1122-4333','bbh@email.com','관악구 봉천동','남','1912-11-22',1,sysdate, sysdate,sysdate,sysdate);
insert into account values(107,'idval1','1234','희정','010-1122-3433','hee@email.com','관악구 봉천동','여','1932-11-22',1,sysdate, sysdate,sysdate,sysdate);
insert into account values(108,'zzz1','1234','나영','010-1122-3334','ny@email.com','관악구 봉천동','여','1991-11-22',1,sysdate, sysdate,sysdate,sysdate);
insert into account values(109,'abc','1234','소현','010-1122-3353','sh@email.com','관악구 봉천동','여','1992-11-22',1,sysdate, sysdate,sysdate,sysdate);
insert into account values(110,'edf331','1234','소영','010-1122-3443','sh@email.com','관악구 봉천동','여','1992-11-22',1,sysdate, sysdate,sysdate,sysdate);
insert into account values(111,'abcd1','1234','태연','010-1122-3123','th@email.com','관악구 봉천동','여','1992-11-22',1,sysdate, sysdate,sysdate,sysdate);
insert into account values(112,'33141','1234','수지','010-1122-443','sh@email.com','관악구 봉천동','여','1992-11-22',1,sysdate, sysdate,sysdate,sysdate);
insert into account values(113,'defg11','1234','똥개','010-1132-3333','ddh@email.com','관악구 봉천동','남','1992-11-22',1,sysdate, sysdate,sysdate,sysdate);
insert into account values(114,'ghgh1','1234','그만','010-1144-1233','gg@email.com','관악구 봉천동','여','1992-11-22',1,sysdate, sysdate,sysdate,sysdate);
insert into account values(115,'zzz4545','1234','원빈','010-1122-4133','wb@email.com','관악구 봉천동','남','1992-11-22',1,sysdate, sysdate,sysdate,sysdate);
insert into account values(116,'kkknm1','1234','조정석','010-1122-3893','jj@email.com','관악구 봉천동','여','1992-11-22',1,sysdate, sysdate,sysdate,sysdate);
insert into account values(117,'asdfq','1234','낄낄','010-1122-3389','ggi1@email.com','관악구 봉천동','여','1992-11-22',1,sysdate, sysdate,sysdate,sysdate);
insert into account values(118,'trfgd','1234','하하','010-1122-3337','hhaha@email.com','관악구 봉천동','남','1992-11-22',1,sysdate, sysdate,sysdate,sysdate);
insert into account values(119,'1123zzt','1234','유재석','010-1122-1333','youu@email.com','관악구 봉천동','남','1992-11-22',1,sysdate, sysdate,sysdate,sysdate);
insert into account values(120,'zmtzmt2','1234','박명수','010-1122-333','msms@email.com','관악구 봉천동','남','1992-11-22',1,sysdate, sysdate,sysdate,sysdate);

CREATE TABLE REVIEW(
    REVIEW_ID NUMBER(19) CONSTRAINT id_review_pk PRIMARY KEY,
    GOODS_ID NUMBER(19) NOT NULL,
    ACCOUNT_ID NUMBER(19) NOT NULL,
    review_pwd varchar2(20) not null,  -- 리뷰 패스워드 필드 하나 추가
    TITLE VARCHAR2(30) NOT NULL,
    CONTENT VARCHAR2(300) NOT NULL,
    SCORE INT NOT NULL,
    CREATE_DATE DATE NOT NULL,
    UPDATE_DATE DATE NOT NULL
);
insert into review values(10,1,100,'1234','나이키신발~!','진짜이뻐요 크기도 잘맞고 ㅇㅇ굿',4,sysdate,sysdate);
insert into review values(11,1,101,'1234','이 신발','진짜이뻐요 크기도 잘맞고 ㅇㅇ굿',3,sysdate,sysdate);
insert into review values(12,1,102,'1234','짱짱','진짜이뻐요 크기도 잘맞고 ㅇㅇ굿',3,sysdate,sysdate);
insert into review values(13,1,103,'1234','배송도빠름!','진짜이뻐요 크기도 잘맞고 ㅇㅇ굿',4,sysdate,sysdate);
insert into review values(14,1,104,'1234','제목없음ㅋ','진짜이뻐요 크기도 잘맞고 ㅇㅇ굿',2,sysdate,sysdate);
insert into review values(15,1,105,'1234','ㅋㅋㅋ','진짜이뻐요 크기도 잘맞고 ㅇㅇ굿',2,sysdate,sysdate);
insert into review values(16,1,106,'1234',';;;ㅋ','진짜이뻐요 크기도 잘맞고 ㅇㅇ굿',2,sysdate,sysdate);
insert into review values(17,1,107,'1234','zzzzz','진짜이뻐요 크기도 잘맞고 ㅇㅇ굿',2,sysdate,sysdate);
insert into review values(18,1,108,'1234','나이키신발~!','진짜이뻐요 크기도 잘맞고 ㅇㅇ굿',1,sysdate,sysdate);
insert into review values(19,1,109,'1234','나이키신발~!','진짜이뻐요 크기도 잘맞고 ㅇㅇ굿',1,sysdate,sysdate);
insert into review values(20,1,110,'1234','나이키신발~!','진짜이뻐요 크기도 잘맞고 ㅇㅇ굿',5,sysdate,sysdate);
insert into review values(21,1,111,'1234','나이키신발~!','진짜이뻐요 크기도 잘맞고 ㅇㅇ굿',5,sysdate,sysdate);
select * from review;


CREATE TABLE GOODS(
    GOODS_ID NUMBER(19) CONSTRAINT id_goods_pk PRIMARY KEY,
    PRICE NUMBER NOT NULL,
    NAME VARCHAR2(50) NOT NULL,
    COUNT INT NOT NULL,
    IMG_PATH VARCHAR2(100) NOT NULL,
    SUMNAIL_PATH VARCHAR2(100) NOT NULL,
    COLOR_CODE INT NOT NULL,
    SIZE_CODE INT NOT NULL,
    ITEM_SN VARCHAR2(50) NOT NULL,
    CATEGORY_ID NUMBER(19) NOT NULL,
    GOODS_VERSION NUMBER(19) NOT NULL,
    SALE_CODE INT NOT NULL,
    SALE_STATE INT NOT NULL,
    CREATE_DATE DATE NOT NULL,
    UPDATE_DATE DATE NOT NULL
); 
insert into goods values(1,50000,'나이키에어맥스',30,'#이미지path','#섬네일path',0,0,'시리얼넘버0001', 1,1,1,1,sysdate,sysdate);
insert into goods values(2,50000,'fila운동화',20,'#이미지path','#섬네일path',0,0,'시리얼넘버0002', 1,1,1,1,sysdate,sysdate);
insert into goods values(3,50000,'아디다스운동화',40,'#이미지path','#섬네일path',0,0,'시리얼넘버0003', 1,1,1,1,sysdate,sysdate);
select * from goods


CREATE TABLE GOODS_VERSION(
    VERSION_ID NUMBER(19) CONSTRAINT id_good_version_pk PRIMARY KEY,
    FILE_PATH VARCHAR2(100) NOT NULL,
    CREATE_DATE DATE NOT NULL,
    UPDATE_DATE DATE NOT NULL
);
insert into goods_version values(1,'#filepath경로!',sysdate, sysdate);
insert into goods_version values(2,'#filepath경로!',sysdate, sysdate);
insert into goods_version values(3,'#filepath경로!',sysdate, sysdate);
insert into goods_version values(4,'#filepath경로!',sysdate, sysdate);
insert into goods_version values(5,'#filepath경로!',sysdate, sysdate);
select * from goods_version;

CREATE TABLE PURCHASE_GOODS(
    PURCHASE_GOODS_ID NUMBER(19) CONSTRAINT id_purchase_goods_pk PRIMARY KEY,
    STATE_CODE INT NOT NULL,
    NAME VARCHAR2(50) NOT NULL,
    COUNT INT NOT NULL,
    PRICE NUMBER NOT NULL,
    IMG_PATH VARCHAR2(100) NOT NULL,
    BILL_KEY VARCHAR2(100) CONSTRAINT id_PGBill_uk UNIQUE NOT NULL,
    PURCHASE_BASKET_ID NUMBER(19) NOT NULL,
    GOODS_ID NUMBER(19) NOT NULL,
    CREATE_DATE DATE NOT NULL,
    UPDATE_DATE DATE NOT NULL,
    ACCOUNT_ID NUMBER(19)
);
drop table purchase_goods;
insert into purchase_goods values(1, 1, '아디다스운동화', 1, 50000, '#이미지path', '구매번호01010', 1,3,sysdate, sysdate, 100);
insert into purchase_goods values(2, 1, '아디다스운동화', 1, 50000, '#이미지path', '구매번호01111', 1,3,sysdate, sysdate, 100);
insert into purchase_goods values(3, 1, '나이키에어맥스', 1, 50000, '#이미지path', '구매번호01222', 1,1,sysdate, sysdate, 101);

CREATE TABLE PURCHASE_BASKET(
    PURCHASE_BASKET_ID NUMBER(19) CONSTRAINT id_purchase_basket_pk PRIMARY KEY,
    ACCOUNT_ID NUMBER(19) NOT NULL,
    TOTAL_PRICE NUMBER NOT NULL,
    ORDER_DATE DATE NOT NULL,
    IMG_PATH VARCHAR(100) NOT NULL,
    STATE_CODE INT NOT NULL,
    BILL_KEY VARCHAR2(100) CONSTRAINT id_PBBill_uk UNIQUE NOT NULL,
    DELEVERY_ADDR VARCHAR2(50)  NOT NULL,
    CREATE_DATE DATE  NOT NULL,
    UPDATE_DATE DATE  NOT NULL
); --varchar2로 고침 delivery_addr varchar2 바이트수 너무작음 ->공백없이 한글 16글자밖에 못넣음
select * from purchase_basket;
insert into purchase_basket values(1,100,150000,'2019-12-01','#이미지path',1,'구매번호01222','봉천동',sysdate,sysdate);
insert into purchase_basket values(2,100,100000,'2019-12-03','#이미지path',1,'구매번호01111','봉천동',sysdate,sysdate);
insert into purchase_basket values(3,101,150000,'2019-11-11','#이미지path',1,'구매번호01010','신림동',sysdate,sysdate);


CREATE TABLE BILL_KEY(
    BILL_KEY VARCHAR2(100) CONSTRAINT id_billkey_pk PRIMARY KEY,
    ISSUE_DATE DATE  NOT NULL,
    CANCel_DATE DATE  NOT NULL,
    CREATE_DATE DATE  NOT NULL,
    UPDATE_DATE DATE  NOT NULL
);
, 
select * from bill_key
insert into bill_key values('구매번호01010', sysdate, sysdate, sysdate,sysdate);
insert into bill_key values('구매번호01222', sysdate, sysdate, sysdate,sysdate);
insert into bill_key values('구매번호01111', sysdate, sysdate, sysdate,sysdate);

CREATE TABLE CATEGORY(
    CATEGORY_ID NUMBER(19) CONSTRAINT id_category_pk PRIMARY KEY,
    SORT_ORDER INT  NOT NULL,
    NAME VARCHAR2(50)  NOT NULL,
    CREATE_DATE DATE  NOT NULL,
    UPDATE_DATE DATE NOT NULL
); -- ? goods테이블에  카테고리에 date가 필요한가 ?

insert into category values(1,9999,'운동화',sysdate,sysdate);
insert into category values(2,9999,'구두',sysdate,sysdate);
insert into category values(3,9999,'샌들',sysdate,sysdate);
insert into category values(4,9999,'부츠',sysdate,sysdate);
select * from category;



CREATE TABLE MANAGER(
    IDX NUMBER(19) CONSTRAINT id_manager_pk PRIMARY KEY,
    MANAGER_ID VARCHAR2(50),
    MANAGER_PWD VARCHAR2(50),
    NAME VARCHAR2(50),
    CREATE_DATE DATE,
    UPDATE_DATE DATE
);
insert into manager values(1, 'admin','1234','관리자1',sysdate, sysdate);
insert into manager values(2, 'admin2','1234','관리자2',sysdate, sysdate);
insert into manager values(3, 'admin3','1234','관리자3',sysdate, sysdate);
select * from manager;


CREATE TABLE CANCel(
    CANCel_ID NUMBER(19) CONSTRAINT id_cancel_pk PRIMARY KEY,
    PURCHASE_GOODS_ID  NUMBER(19),
    PURCHASE_BASKET_ID NUMBER(19),
    PRICE NUMBER,
    STATE_CODE INT,
    REASON VARCHAR2(100),
    BILL_KEY VARCHAR2(100),
    GOODS_ID NUMBER(19),
    ITEM_COUNT INT,
    ITEM_SN VARCHAR2(50),
    CREATE_DATE DATE ,
    UPDATE_DATE DATE
);
select * from cancel;
insert into cancel values(1, 1, 1, 50000, 1, '사이즈가 안맞음!', '구매번호01010',1,30,'시리얼넘버00000',sysdate,sysdate);
insert into cancel values(2, 1, 1, 50000, 1, '사이즈가 너무커요', '구매번호01010',1,30,'시리얼넘버00000',sysdate,sysdate);
insert into cancel values(3, 1, 1, 50000, 1, '사이즈가 너무작아요', '구매번호01010',1,30,'시리얼넘버00000',sysdate,sysdate);

CREATE TABLE PURCHASE_BASKET_PAYMENT(
    PURCHASE_BASKET_ID NUMBER(19) CONSTRAINT id_pur_baseket_pay_pk PRIMARY KEY,
    PAYMENT_TYPE INT,
    PRICE INT,
    RECIEVER_NAME VARCHAR2(20),
    RECIEVER_PHONE VARCHAR2(50),
    DILIVERY_COMMENT VARCHAR2(300),
    CREATE_DATE DATE,
    UPDATE_DATE DATE
); --accountid가 없어도 되는건가?
insert into purchase_basket_payment values(1, 1, 50000, '용한','010-111-5774','부재시 경비실에 맡겨주세용',sysdate, sysdate);
insert into purchase_basket_payment values(2, 1, 50000, '수녕','010-111-3374','부재시 경비실에 맡겨주세용',sysdate, sysdate);
insert into purchase_basket_payment values(3, 1, 50000, '장현','010-111-2274','부재시 경비실에 맡겨주세용',sysdate, sysdate);
insert into purchase_basket_payment values(4, 1, 50000, '세원','010-111-5174','부재시 경비실에 맡겨주세용',sysdate, sysdate);


CREATE TABLE PURCHASE_STATIC(
    SALE_DATE DATE,
    GOODS_ID NUMBER(19),
    PAYMENT_TYPE INT,
    SALE_COUNT INT,
    SALE_PRICE NUMBER
); 
insert into purchase_static values(sysdate, 1, 1, 10, 50000);
insert into purchase_static values(sysdate, 1, 1, 10, 50000);
insert into purchase_static values(sysdate, 2, 1, 20, 50000);
insert into purchase_static values(sysdate, 2, 1, 20, 50000);
insert into purchase_static values(sysdate, 3, 1, 30, 50000);
select * from purchase_static

create sequence seq_Id increment by 1;

COMMIT
