DROP TABLE ACCOUNT;
CREATE TABLE ACCOUNT(
    ACCOUNT_ID NUMBER(19) CONSTRAINT id_acc_pk PRIMARY KEY,
    LOGIN_ID VARCHAR2(50) NOT NULL,
    LOGIN_PWD VARCHAR2(50) NOT NULL,
    NAME VARCHAR2(20) NOT NULL,
    PHONE VARCHAR2(20) NOT NULL,
    EMAIL VARCHAR2(30) NOT NULL,
    ADDR VARCHAR2(200) NOT NULL,
    SEX CHAR(3) NOT NULL,
    BIRTHDAY DATE NOT NULL,
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


insert into account values(500,'swsw22','1234','김세원2','010-1122-333','byh5112@naver.com','관악구 봉천동','남','1992-11-22',1,sysdate, sysdate,sysdate,sysdate);
insert into account values(600,'yonghan','1234','배용한2','010-1122-333','k31sw2@hanmail.net','관악구 봉천동','남','1992-11-22',1,sysdate, sysdate,sysdate,sysdate);


DROP TABLE REVIEW;
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
select * from REVIEW;
commit;
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
insert into review values(116,2,106,'1234',';;;ㅋ','진짜이뻐요 크기도 잘맞고 ㅇㅇ굿',2,sysdate,sysdate);
insert into review values(117,2,107,'1234','zzzzz','진짜이뻐zzz 잘맞고 ㅇㅇ굿',2,sysdate,sysdate);
insert into review values(118,2,108,'1234','ff신발~!','진짜이ddg크기도 잘맞고 ㅇㅇ굿',1,sysdate,sysdate);
insert into review values(119,2,109,'1234','zz신발~!','진짜dgdg 크기도 잘맞고 ㅇㅇ굿',1,sysdate,sysdate);
insert into review values(120,2,110,'1234','dd신발~!','진zz 잘맞고 ㅇㅇ굿',5,sysdate,sysdate);
insert into review values(121,2,111,'1234','21이44발~!','진짜123124도 잘맞고 ㅇㅇ굿',5,sysdate,sysdate);
commit;
DROP TABLE GOODS;
CREATE TABLE GOODS(
    GOODS_ID NUMBER(19) CONSTRAINT id_goods_pk PRIMARY KEY,
    PRICE NUMBER NOT NULL,
    NAME VARCHAR2(50) NOT NULL,
    COUNT INT NOT NULL,
    IMG_PATH VARCHAR2(500) NOT NULL,
    SUMNAIL_PATH VARCHAR2(500) NOT NULL,
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
select A1.LOGIN_ID,R1.REVIEW_ID,R1.GOODS_ID,R1.TITLE,R1.CONTENT,R1.SCORE,R1.CREATE_DATE,R1.UPDATE_DATE
from REVIEW R1 inner join GOODS G1 on R1.GOODS_ID = G1.GOODS_ID inner join ACCOUNT A1 on A1.ACCOUNT_ID = R1.ACCOUNT_ID
WHERE G1.NAME = 'NEARBY';

select * from goods
--운동화 삽입
insert into goods values(1,50000,'Reebok classic',30,'https://github.com/study-backend/ShoesCase/blob/master/WebContent/image/sneakers/adoran01.jpg?raw=true','https://github.com/study-backend/ShoesCase/blob/master/WebContent/image/sneakers/adoran.jpg?raw=true',0,0,'시리얼넘버0001', 1,1,1,1,sysdate,sysdate);
insert into goods values(2,50000,'NEARBY',20,'https://github.com/study-backend/ShoesCase/blob/master/WebContent/image/sneakers/andy01.png?raw=true','https://github.com/study-backend/ShoesCase/blob/master/WebContent/image/sneakers/andy.png?raw=true',0,0,'시리얼넘버0002', 1,1,1,1,sysdate,sysdate);
insert into goods values(3,50000,'아디다스 블랙 운동화',40,'https://github.com/study-backend/ShoesCase/blob/master/WebContent/image/sneakers/black01.jpg?raw=true','https://github.com/study-backend/ShoesCase/blob/master/WebContent/image/sneakers/black.jpg?raw=true',0,0,'시리얼넘버0003', 1,1,1,1,sysdate,sysdate);
insert into goods values(4,50000,'STAR WARS',30,'https://github.com/study-backend/ShoesCase/blob/master/WebContent/image/sneakers/dark01.jpg?raw=true','https://github.com/study-backend/ShoesCase/blob/master/WebContent/image/sneakers/dark.jpg?raw=true',0,0,'시리얼넘버0001', 1,1,1,1,sysdate,sysdate);
insert into goods values(5,50000,'FRED PERRY',20,'https://github.com/study-backend/ShoesCase/blob/master/WebContent/image/sneakers/ferry01.jpg?raw=true','https://github.com/study-backend/ShoesCase/blob/master/WebContent/image/sneakers/ferry.jpg?raw=true',0,0,'시리얼넘버0002', 1,1,1,1,sysdate,sysdate);
insert into goods values(6,50000,'Reebok CLASSIC',40,'https://github.com/study-backend/ShoesCase/blob/master/WebContent/image/sneakers/impers01.jpg?raw=true','https://github.com/study-backend/ShoesCase/blob/master/WebContent/image/sneakers/impers.jpg?raw=true',0,0,'시리얼넘버0003', 1,1,1,1,sysdate,sysdate);
insert into goods values(7,50000,'뉴발란스 화이트 운동화',30,'https://github.com/study-backend/ShoesCase/blob/master/WebContent/image/sneakers/new01.jpg?raw=true','https://github.com/study-backend/ShoesCase/blob/master/WebContent/image/sneakers/new.jpg?raw=true',0,0,'시리얼넘버0001', 1,1,1,1,sysdate,sysdate);
insert into goods values(8,50000,'reebok 블랙 발목 운동화',20,'https://github.com/study-backend/ShoesCase/blob/master/WebContent/image/sneakers/run01.jpg?raw=true','https://github.com/study-backend/ShoesCase/blob/master/WebContent/image/sneakers/run.jpg?raw=true',0,0,'시리얼넘버0002', 1,1,1,1,sysdate,sysdate);
insert into goods values(9,50000,'baize운동화',40,'https://github.com/study-backend/ShoesCase/blob/master/WebContent/image/sneakers/runner01.jpg?raw=true','https://github.com/study-backend/ShoesCase/blob/master/WebContent/image/sneakers/runner.jpg?raw=true',0,0,'시리얼넘버0003', 1,1,1,1,sysdate,sysdate);
insert into goods values(10,50000,'orange스니커즈',30,'https://github.com/study-backend/ShoesCase/blob/master/WebContent/image/sneakers/sola01.jpg?raw=true','https://github.com/study-backend/ShoesCase/blob/master/WebContent/image/sneakers/sola.jpg?raw=true',0,0,'시리얼넘버0001', 1,1,1,1,sysdate,sysdate);
insert into goods values(11,50000,'BUCKET DWALKER',20,'https://github.com/study-backend/ShoesCase/blob/master/WebContent/image/sneakers/walker01.jpg?raw=true','https://github.com/study-backend/ShoesCase/blob/master/WebContent/image/sneakers/walker.jpg?raw=true',0,0,'시리얼넘버0002', 1,1,1,1,sysdate,sysdate);
insert into goods values(12,50000,'asicstiger',40,'https://github.com/study-backend/ShoesCase/blob/master/WebContent/image/sneakers/zel01.jpg?raw=true','https://github.com/study-backend/ShoesCase/blob/master/WebContent/image/sneakers/zel.jpg?raw=true',0,0,'시리얼넘버0003', 1,1,1,1,sysdate,sysdate);
-- 구두 삽입
insert into goods values(13,50000,'트윈아치',50,'https://github.com/study-backend/ShoesCase/blob/master/WebContent/image/dressShoes/aco01.jpg?raw=true','https://github.com/study-backend/ShoesCase/blob/master/WebContent/image/dressShoes/aco.jpg?raw=true',0,0,'시리얼넘버0003', 2,1,1,1,sysdate,sysdate);
insert into goods values(14,50000,'MARY JANE',50,'https://github.com/study-backend/ShoesCase/blob/master/WebContent/image/dressShoes/adorable01.jpg?raw=true','https://github.com/study-backend/ShoesCase/blob/master/WebContent/image/dressShoes/adorable.jpg?raw=true',0,0,'시리얼넘버0003', 2,1,1,1,sysdate,sysdate);
insert into goods values(15,50000,'FIREZE',50,'https://github.com/study-backend/ShoesCase/blob/master/WebContent/image/dressShoes/ammm01.jpg?raw=true','https://github.com/study-backend/ShoesCase/blob/master/WebContent/image/dressShoes/ammm.jpg?raw=true',0,0,'시리얼넘버0003', 2,1,1,1,sysdate,sysdate);
insert into goods values(16,50000,'SONIAVIA',50,'https://github.com/study-backend/ShoesCase/blob/master/WebContent/image/dressShoes/aqua01.jpg?raw=true','https://github.com/study-backend/ShoesCase/blob/master/WebContent/image/dressShoes/aqua.jpg?raw=true',0,0,'시리얼넘버0003', 2,1,1,1,sysdate,sysdate);
insert into goods values(17,50000,'ATELIER',50,'https://github.com/study-backend/ShoesCase/blob/master/WebContent/image/dressShoes/attri01.jpg?raw=true','https://github.com/study-backend/ShoesCase/blob/master/WebContent/image/dressShoes/attri.jpg?raw=true',0,0,'시리얼넘버0003', 2,1,1,1,sysdate,sysdate);
insert into goods values(18,50000,'BALLE',50,'https://github.com/study-backend/ShoesCase/blob/master/WebContent/image/dressShoes/balle01.jpg?raw=true','https://github.com/study-backend/ShoesCase/blob/master/WebContent/image/dressShoes/balle.jpg?raw=true',0,0,'시리얼넘버0003', 2,1,1,1,sysdate,sysdate);
insert into goods values(19,50000,'비브람',50,'https://github.com/study-backend/ShoesCase/blob/master/WebContent/image/dressShoes/bee01.jpg?raw=true','https://github.com/study-backend/ShoesCase/blob/master/WebContent/image/dressShoes/bee.jpg?raw=true',0,0,'시리얼넘버0003', 2,1,1,1,sysdate,sysdate);
insert into goods values(20,50000,'BENTA',50,'https://github.com/study-backend/ShoesCase/blob/master/WebContent/image/dressShoes/benta01.jpg?raw=true','https://github.com/study-backend/ShoesCase/blob/master/WebContent/image/dressShoes/benta.jpg?raw=true',0,0,'시리얼넘버0003', 2,1,1,1,sysdate,sysdate);
insert into goods values(21,50000,'BOLO',50,'https://github.com/study-backend/ShoesCase/blob/master/WebContent/image/dressShoes/bolo01.jpg?raw=true','https://github.com/study-backend/ShoesCase/blob/master/WebContent/image/dressShoes/bolo.jpg?raw=true',0,0,'시리얼넘버0003', 2,1,1,1,sysdate,sysdate);
insert into goods values(22,50000,'BRICK',50,'https://github.com/study-backend/ShoesCase/blob/master/WebContent/image/dressShoes/brick01.jpg?raw=true','https://github.com/study-backend/ShoesCase/blob/master/WebContent/image/dressShoes/brick.jpg?raw=true',0,0,'시리얼넘버0003', 2,1,1,1,sysdate,sysdate);
insert into goods values(23,50000,'Smoothie Mule',50,'https://github.com/study-backend/ShoesCase/blob/master/WebContent/image/dressShoes/choice01.jpg?raw=true','https://github.com/study-backend/ShoesCase/blob/master/WebContent/image/dressShoes/choice.jpg?raw=true',0,0,'시리얼넘버0003', 2,1,1,1,sysdate,sysdate);
insert into goods values(24,50000,'CHUNG',50,'https://github.com/study-backend/ShoesCase/blob/master/WebContent/image/dressShoes/chung01.jpg?raw=true','https://github.com/study-backend/ShoesCase/blob/master/WebContent/image/dressShoes/chung.jpg?raw=true',0,0,'시리얼넘버0003', 2,1,1,1,sysdate,sysdate);
insert into goods values(25,50000,'SONIAVIA',50,'https://github.com/study-backend/ShoesCase/blob/master/WebContent/image/dressShoes/coves01.jpg?raw=true','https://github.com/study-backend/ShoesCase/blob/master/WebContent/image/dressShoes/coves.jpg?raw=true',0,0,'시리얼넘버0003', 2,1,1,1,sysdate,sysdate);
insert into goods values(26,50000,'DUBBY',50,'https://github.com/study-backend/ShoesCase/blob/master/WebContent/image/dressShoes/dubby01.jpg?raw=true','https://github.com/study-backend/ShoesCase/blob/master/WebContent/image/dressShoes/dubby.jpg?raw=true',0,0,'시리얼넘버0003', 2,1,1,1,sysdate,sysdate);
insert into goods values(27,50000,'ELIS',50,'https://github.com/study-backend/ShoesCase/blob/master/WebContent/image/dressShoes/elis01.jpg?raw=true','https://github.com/study-backend/ShoesCase/blob/master/WebContent/image/dressShoes/elis.jpg?raw=true',0,0,'시리얼넘버0003', 2,1,1,1,sysdate,sysdate);
insert into goods values(28,50000,'FREKS',50,'https://github.com/study-backend/ShoesCase/blob/master/WebContent/image/dressShoes/from01.jpg?raw=true','https://github.com/study-backend/ShoesCase/blob/master/WebContent/image/dressShoes/from.jpg?raw=true',0,0,'시리얼넘버0003', 2,1,1,1,sysdate,sysdate);
insert into goods values(29,50000,'JEMINI',50,'https://github.com/study-backend/ShoesCase/blob/master/WebContent/image/dressShoes/jemini01.jpg?raw=true','https://github.com/study-backend/ShoesCase/blob/master/WebContent/image/dressShoes/jemini.jpg?raw=true',0,0,'시리얼넘버0003', 2,1,1,1,sysdate,sysdate);
insert into goods values(30,50000,'JUDE',50,'https://github.com/study-backend/ShoesCase/blob/master/WebContent/image/dressShoes/jude01.jpg?raw=true','https://github.com/study-backend/ShoesCase/blob/master/WebContent/image/dressShoes/jude.jpg?raw=true',0,0,'시리얼넘버0003', 2,1,1,1,sysdate,sysdate);
insert into goods values(31,50000,'KERRY',50,'https://github.com/study-backend/ShoesCase/blob/master/WebContent/image/dressShoes/kerry01.jpg?raw=true','https://github.com/study-backend/ShoesCase/blob/master/WebContent/image/dressShoes/kerry.jpg?raw=true',0,0,'시리얼넘버0003', 2,1,1,1,sysdate,sysdate);
insert into goods values(32,50000,'LINE',50,'https://github.com/study-backend/ShoesCase/blob/master/WebContent/image/dressShoes/line01.jpg?raw=true','https://github.com/study-backend/ShoesCase/blob/master/WebContent/image/dressShoes/line.jpg?raw=true',0,0,'시리얼넘버0003', 2,1,1,1,sysdate,sysdate);
insert into goods values(33,50000,'LOVELY',50,'https://github.com/study-backend/ShoesCase/blob/master/WebContent/image/dressShoes/lovely01.jpg?raw=true','https://github.com/study-backend/ShoesCase/blob/master/WebContent/image/dressShoes/lovely.jpg?raw=true',0,0,'시리얼넘버0003', 2,1,1,1,sysdate,sysdate);
insert into goods values(34,50000,'LOVER',50,'https://github.com/study-backend/ShoesCase/blob/master/WebContent/image/dressShoes/lover01.jpg?raw=true','https://github.com/study-backend/ShoesCase/blob/master/WebContent/image/dressShoes/lover.jpg?raw=true',0,0,'시리얼넘버0003', 2,1,1,1,sysdate,sysdate);
insert into goods values(35,50000,'LOWER',50,'https://github.com/study-backend/ShoesCase/blob/master/WebContent/image/dressShoes/lower01.jpg?raw=true','https://github.com/study-backend/ShoesCase/blob/master/WebContent/image/dressShoes/lower.jpg?raw=true',0,0,'시리얼넘버0003', 2,1,1,1,sysdate,sysdate);
insert into goods values(36,50000,'MIA',50,'https://github.com/study-backend/ShoesCase/blob/master/WebContent/image/dressShoes/mia01.jpg?raw=true','https://github.com/study-backend/ShoesCase/blob/master/WebContent/image/dressShoes/mia.jpg?raw=true',0,0,'시리얼넘버0003', 2,1,1,1,sysdate,sysdate);
insert into goods values(37,50000,'MICRO',50,'https://github.com/study-backend/ShoesCase/blob/master/WebContent/image/dressShoes/micro01.jpg?raw=true','https://github.com/study-backend/ShoesCase/blob/master/WebContent/image/dressShoes/micro.jpg?raw=true',0,0,'시리얼넘버0003', 2,1,1,1,sysdate,sysdate);
insert into goods values(38,50000,'MOMO',50,'https://github.com/study-backend/ShoesCase/blob/master/WebContent/image/dressShoes/momo01jpg.jpg?raw=true','https://github.com/study-backend/ShoesCase/blob/master/WebContent/image/dressShoes/momo.jpg?raw=true',0,0,'시리얼넘버0003', 2,1,1,1,sysdate,sysdate);
insert into goods values(39,50000,'MUL',50,'https://github.com/study-backend/ShoesCase/blob/master/WebContent/image/dressShoes/mul01.jpg?raw=true','https://github.com/study-backend/ShoesCase/blob/master/WebContent/image/dressShoes/mul.jpg?raw=true',0,0,'시리얼넘버0003', 2,1,1,1,sysdate,sysdate);
insert into goods values(40,50000,'NAVY',50,'https://github.com/study-backend/ShoesCase/blob/master/WebContent/image/dressShoes/navy01.jpg?raw=true','https://github.com/study-backend/ShoesCase/blob/master/WebContent/image/dressShoes/navy.jpg?raw=true',0,0,'시리얼넘버0003', 2,1,1,1,sysdate,sysdate);
insert into goods values(41,50000,'NUGGY',50,'https://github.com/study-backend/ShoesCase/blob/master/WebContent/image/dressShoes/nuggy01.jpg?raw=true','https://github.com/study-backend/ShoesCase/blob/master/WebContent/image/dressShoes/nuggy.jpg?raw=true',0,0,'시리얼넘버0003', 2,1,1,1,sysdate,sysdate);
insert into goods values(42,50000,'PSMARY',50,'https://github.com/study-backend/ShoesCase/blob/master/WebContent/image/dressShoes/psmary01.jpg?raw=true','https://github.com/study-backend/ShoesCase/blob/master/WebContent/image/dressShoes/psmary.jpg?raw=true',0,0,'시리얼넘버0003', 2,1,1,1,sysdate,sysdate);
insert into goods values(43,50000,'PYSIS',50,'https://github.com/study-backend/ShoesCase/blob/master/WebContent/image/dressShoes/pysis01.jpg?raw=true','https://github.com/study-backend/ShoesCase/blob/master/WebContent/image/dressShoes/pysis.jpg?raw=true',0,0,'시리얼넘버0003', 2,1,1,1,sysdate,sysdate);
insert into goods values(44,50000,'SERA',50,'https://github.com/study-backend/ShoesCase/blob/master/WebContent/image/dressShoes/sera01.jpg?raw=true','https://github.com/study-backend/ShoesCase/blob/master/WebContent/image/dressShoes/sera.jpg?raw=true',0,0,'시리얼넘버0003', 2,1,1,1,sysdate,sysdate);
insert into goods values(45,50000,'SHOOP',50,'https://github.com/study-backend/ShoesCase/blob/master/WebContent/image/dressShoes/shoop01.jpg?raw=true','https://github.com/study-backend/ShoesCase/blob/master/WebContent/image/dressShoes/shoop.jpg?raw=true',0,0,'시리얼넘버0003', 2,1,1,1,sysdate,sysdate);
insert into goods values(46,50000,'SNOOPY',50,'https://github.com/study-backend/ShoesCase/blob/master/WebContent/image/dressShoes/snoopy01.jpg?raw=true','https://github.com/study-backend/ShoesCase/blob/master/WebContent/image/dressShoes/snoopy.jpg?raw=true',0,0,'시리얼넘버0003', 2,1,1,1,sysdate,sysdate);
insert into goods values(47,50000,'SOL',50,'https://github.com/study-backend/ShoesCase/blob/master/WebContent/image/dressShoes/sol01.jpg?raw=true','https://github.com/study-backend/ShoesCase/blob/master/WebContent/image/dressShoes/sol.jpg?raw=true',0,0,'시리얼넘버0003', 2,1,1,1,sysdate,sysdate);
insert into goods values(48,50000,'VIA',50,'https://github.com/study-backend/ShoesCase/blob/master/WebContent/image/dressShoes/sonia01.jpg?raw=true','https://github.com/study-backend/ShoesCase/blob/master/WebContent/image/dressShoes/sonia.jpg?raw=true',0,0,'시리얼넘버0003', 2,1,1,1,sysdate,sysdate);
insert into goods values(49,50000,'TORUS',50,'https://github.com/study-backend/ShoesCase/blob/master/WebContent/image/dressShoes/torus01.jpg?raw=true','https://github.com/study-backend/ShoesCase/blob/master/WebContent/image/dressShoes/torus.jpg?raw=true',0,0,'시리얼넘버0003', 2,1,1,1,sysdate,sysdate);
insert into goods values(50,50000,'VANDAL',50,'https://github.com/study-backend/ShoesCase/blob/master/WebContent/image/dressShoes/vandal01.jpg?raw=true','https://github.com/study-backend/ShoesCase/blob/master/WebContent/image/dressShoes/vandal.jpg?raw=true',0,0,'시리얼넘버0003', 2,1,1,1,sysdate,sysdate);
insert into goods values(51,50000,'WAIK',50,'https://github.com/study-backend/ShoesCase/blob/master/WebContent/image/dressShoes/waik01.jpg?raw=true','https://github.com/study-backend/ShoesCase/blob/master/WebContent/image/dressShoes/waik.jpg?raw=true',0,0,'시리얼넘버0003', 2,1,1,1,sysdate,sysdate);


--샌달 삽입
insert into goods values(52,50000,'ADIL',50,'https://github.com/study-backend/ShoesCase/blob/master/WebContent/image/sandal/adil01.jpg?raw=true','https://github.com/study-backend/ShoesCase/blob/master/WebContent/image/sandal/adil.jpg?raw=true',0,0,'시리얼넘버0003', 3,1,1,1,sysdate,sysdate);
insert into goods values(53,50000,'BOSTON',50,'https://github.com/study-backend/ShoesCase/blob/master/WebContent/image/sandal/boston01.jpg?raw=true','https://github.com/study-backend/ShoesCase/blob/master/WebContent/image/sandal/boston.jpg?raw=true',0,0,'시리얼넘버0003', 3,1,1,1,sysdate,sysdate);
insert into goods values(54,50000,'BREAK',50,'https://github.com/study-backend/ShoesCase/blob/master/WebContent/image/sandal/break01jpg.jpg?raw=true','https://github.com/study-backend/ShoesCase/blob/master/WebContent/image/sandal/break.jpg?raw=true',0,0,'시리얼넘버0003', 3,1,1,1,sysdate,sysdate);
insert into goods values(55,50000,'BRISHEL',50,'https://github.com/study-backend/ShoesCase/blob/master/WebContent/image/sandal/brishel01.jpg?raw=true','https://github.com/study-backend/ShoesCase/blob/master/WebContent/image/sandal/brishel.jpg?raw=true',0,0,'시리얼넘버0003', 3,1,1,1,sysdate,sysdate);
insert into goods values(56,50000,'BSBSBS',50,'https://github.com/study-backend/ShoesCase/blob/master/WebContent/image/sandal/bs01.jpg?raw=true','https://github.com/study-backend/ShoesCase/blob/master/WebContent/image/sandal/bs.jpg?raw=true',0,0,'시리얼넘버0003', 3,1,1,1,sysdate,sysdate);
insert into goods values(57,50000,'ROOM SHOES',50,'https://github.com/study-backend/ShoesCase/blob/master/WebContent/image/sandal/dobby01.jpg?raw=true','https://github.com/study-backend/ShoesCase/blob/master/WebContent/image/sandal/dobby.jpg?raw=true',0,0,'시리얼넘버0003', 3,1,1,1,sysdate,sysdate);
insert into goods values(58,50000,'DFIF',50,'https://github.com/study-backend/ShoesCase/blob/master/WebContent/image/sandal/drif01.jpg?raw=true','https://github.com/study-backend/ShoesCase/blob/master/WebContent/image/sandal/drif.jpg?raw=true',0,0,'시리얼넘버0003', 3,1,1,1,sysdate,sysdate);
insert into goods values(59,50000,'FUR',50,'https://github.com/study-backend/ShoesCase/blob/master/WebContent/image/sandal/fur01.jpg?raw=true','https://github.com/study-backend/ShoesCase/blob/master/WebContent/image/sandal/fur.jpg?raw=true',0,0,'시리얼넘버0003', 3,1,1,1,sysdate,sysdate);
insert into goods values(60,50000,'GEOGRAPHIC',50,'https://github.com/study-backend/ShoesCase/blob/master/WebContent/image/sandal/geographic01.jpg?raw=true','https://github.com/study-backend/ShoesCase/blob/master/WebContent/image/sandal/geographic.jpg?raw=true',0,0,'시리얼넘버0003', 3,1,1,1,sysdate,sysdate);
insert into goods values(61,50000,'GRIFFEN',50,'https://github.com/study-backend/ShoesCase/blob/master/WebContent/image/sandal/griffen01.jpg?raw=true','https://github.com/study-backend/ShoesCase/blob/master/WebContent/image/sandal/griffen.jpg?raw=true',0,0,'시리얼넘버0003', 3,1,1,1,sysdate,sysdate);
insert into goods values(62,50000,'HURRY',50,'https://github.com/study-backend/ShoesCase/blob/master/WebContent/image/sandal/hurry01.jpg?raw=true','https://github.com/study-backend/ShoesCase/blob/master/WebContent/image/sandal/hurry.jpg?raw=true',0,0,'시리얼넘버0003', 3,1,1,1,sysdate,sysdate);
insert into goods values(63,50000,'IILAND',50,'https://github.com/study-backend/ShoesCase/blob/master/WebContent/image/sandal/iilland01.jpg?raw=true','https://github.com/study-backend/ShoesCase/blob/master/WebContent/image/sandal/iilland.jpg?raw=true',0,0,'시리얼넘버0003', 3,1,1,1,sysdate,sysdate);
insert into goods values(64,50000,'JORDAN',50,'https://github.com/study-backend/ShoesCase/blob/master/WebContent/image/sandal/jodan01.jpg?raw=true','https://github.com/study-backend/ShoesCase/blob/master/WebContent/image/sandal/jodan.jpg?raw=true',0,0,'시리얼넘버0003', 3,1,1,1,sysdate,sysdate);
insert into goods values(65,50000,'KEEN',50,'https://github.com/study-backend/ShoesCase/blob/master/WebContent/image/sandal/keen01.jpg?raw=true','https://github.com/study-backend/ShoesCase/blob/master/WebContent/image/sandal/keen.jpg?raw=true',0,0,'시리얼넘버0003', 3,1,1,1,sysdate,sysdate);
insert into goods values(66,50000,'KRISH',50,'https://github.com/study-backend/ShoesCase/blob/master/WebContent/image/sandal/kirsh01.jpg?raw=true','https://github.com/study-backend/ShoesCase/blob/master/WebContent/image/sandal/kirsh.jpg?raw=true',0,0,'시리얼넘버0003', 3,1,1,1,sysdate,sysdate);
insert into goods values(67,50000,'MILA',50,'https://github.com/study-backend/ShoesCase/blob/master/WebContent/image/sandal/milla01.jpg?raw=true','https://github.com/study-backend/ShoesCase/blob/master/WebContent/image/sandal/milla.jpg?raw=true',0,0,'시리얼넘버0003', 3,1,1,1,sysdate,sysdate);
insert into goods values(68,50000,'MONG',50,'https://github.com/study-backend/ShoesCase/blob/master/WebContent/image/sandal/mong01.jpg?raw=true','https://github.com/study-backend/ShoesCase/blob/master/WebContent/image/sandal/mong.jpg?raw=true',0,0,'시리얼넘버0003', 3,1,1,1,sysdate,sysdate);
insert into goods values(69,50000,'NATIONAL',50,'https://github.com/study-backend/ShoesCase/blob/master/WebContent/image/sandal/national01.jpg?raw=true','https://github.com/study-backend/ShoesCase/blob/master/WebContent/image/sandal/national.jpg?raw=true',0,0,'시리얼넘버0003', 3,1,1,1,sysdate,sysdate);
insert into goods values(70,50000,'NEARDY',50,'https://github.com/study-backend/ShoesCase/blob/master/WebContent/image/sandal/nerdy01.jpg?raw=true','https://github.com/study-backend/ShoesCase/blob/master/WebContent/image/sandal/nerdy.gif?raw=true',0,0,'시리얼넘버0003', 3,1,1,1,sysdate,sysdate);
insert into goods values(71,50000,'OIOI',50,'https://github.com/study-backend/ShoesCase/blob/master/WebContent/image/sandal/oioi01.jpg?raw=true','https://github.com/study-backend/ShoesCase/blob/master/WebContent/image/sandal/oioi.jpg?raw=true',0,0,'시리얼넘버0003', 3,1,1,1,sysdate,sysdate);
insert into goods values(72,50000,'OLIVER',50,'https://github.com/study-backend/ShoesCase/blob/master/WebContent/image/sandal/oliver01.jpg?raw=true','https://github.com/study-backend/ShoesCase/blob/master/WebContent/image/sandal/oliver.jpg?raw=true',0,0,'시리얼넘버0003', 3,1,1,1,sysdate,sysdate);
insert into goods values(73,50000,'OREO',50,'https://github.com/study-backend/ShoesCase/blob/master/WebContent/image/sandal/oreo01.jpg?raw=true','https://github.com/study-backend/ShoesCase/blob/master/WebContent/image/sandal/oreo.jpg?raw=true',0,0,'시리얼넘버0003', 3,1,1,1,sysdate,sysdate);
insert into goods values(74,50000,'OSTIN',50,'https://github.com/study-backend/ShoesCase/blob/master/WebContent/image/sandal/ostin01.jpg?raw=true','https://github.com/study-backend/ShoesCase/blob/master/WebContent/image/sandal/ostin.jpg?raw=true',0,0,'시리얼넘버0003', 3,1,1,1,sysdate,sysdate);
insert into goods values(75,50000,'SOFT',50,'https://github.com/study-backend/ShoesCase/blob/master/WebContent/image/sandal/soft01.jpg?raw=true','https://github.com/study-backend/ShoesCase/blob/master/WebContent/image/sandal/soft.jpg?raw=true',0,0,'시리얼넘버0003', 3,1,1,1,sysdate,sysdate);
insert into goods values(76,50000,'STOCK',50,'https://github.com/study-backend/ShoesCase/blob/master/WebContent/image/sandal/stock01.jpg?raw=true','https://github.com/study-backend/ShoesCase/blob/master/WebContent/image/sandal/stock.jpg?raw=true',0,0,'시리얼넘버0003', 3,1,1,1,sysdate,sysdate);
insert into goods values(77,50000,'SUNLAY',50,'https://github.com/study-backend/ShoesCase/blob/master/WebContent/image/sandal/sunlay01.jpg?raw=true','https://github.com/study-backend/ShoesCase/blob/master/WebContent/image/sandal/sunlay.jpg?raw=true',0,0,'시리얼넘버0003', 3,1,1,1,sysdate,sysdate);
insert into goods values(78,50000,'SWIDTH',50,'https://github.com/study-backend/ShoesCase/blob/master/WebContent/image/sandal/swidth01.jpg?raw=true','https://github.com/study-backend/ShoesCase/blob/master/WebContent/image/sandal/swidth.jpg?raw=true',0,0,'시리얼넘버0003', 3,1,1,1,sysdate,sysdate);
insert into goods values(79,50000,'TANGON',50,'https://github.com/study-backend/ShoesCase/blob/master/WebContent/image/sandal/tangon01.jpg?raw=true','https://github.com/study-backend/ShoesCase/blob/master/WebContent/image/sandal/tangon.jpg?raw=true',0,0,'시리얼넘버0003', 3,1,1,1,sysdate,sysdate);
insert into goods values(80,50000,'TANJUN',50,'https://github.com/study-backend/ShoesCase/blob/master/WebContent/image/sandal/tanjun01.jpg?raw=true','https://github.com/study-backend/ShoesCase/blob/master/WebContent/image/sandal/tanjun.jpg?raw=true',0,0,'시리얼넘버0003', 3,1,1,1,sysdate,sysdate);
insert into goods values(81,50000,'VENESHI',50,'https://github.com/study-backend/ShoesCase/blob/master/WebContent/image/sandal/veneshi01.jpg?raw=true','https://github.com/study-backend/ShoesCase/blob/master/WebContent/image/sandal/veneshi.jpg?raw=true',0,0,'시리얼넘버0003', 3,1,1,1,sysdate,sysdate);
insert into goods values(82,50000,'ZURIFFER',50,'https://github.com/study-backend/ShoesCase/blob/master/WebContent/image/sandal/zuriffer01.jpg?raw=true','https://github.com/study-backend/ShoesCase/blob/master/WebContent/image/sandal/zuriffer.jpg?raw=true',0,0,'시리얼넘버0003', 3,1,1,1,sysdate,sysdate);

--BOOTS
insert into goods values(83,50000,'ANKLE',50,'https://github.com/study-backend/ShoesCase/blob/master/WebContent/image/boots/ankle01.jpg?raw=true','https://github.com/study-backend/ShoesCase/blob/master/WebContent/image/boots/ankle.jpg?raw=true',0,0,'시리얼넘버0003', 4,1,1,1,sysdate,sysdate);
insert into goods values(84,50000,'CHELSI',50,'https://github.com/study-backend/ShoesCase/blob/master/WebContent/image/boots/chelsi01.jpg?raw=true','https://github.com/study-backend/ShoesCase/blob/master/WebContent/image/boots/chelsi.jpg?raw=true',0,0,'시리얼넘버0003', 4,1,1,1,sysdate,sysdate);
insert into goods values(85,50000,'DANIEL',50,'https://github.com/study-backend/ShoesCase/blob/master/WebContent/image/boots/daniel01.jpg?raw=true','https://github.com/study-backend/ShoesCase/blob/master/WebContent/image/boots/daniel.jpg?raw=true',0,0,'시리얼넘버0003', 4,1,1,1,sysdate,sysdate);
insert into goods values(86,50000,'ELKANTO',50,'https://github.com/study-backend/ShoesCase/blob/master/WebContent/image/boots/elkanto01.jpg?raw=true','https://github.com/study-backend/ShoesCase/blob/master/WebContent/image/boots/elkanto.jpg?raw=true',0,0,'시리얼넘버0003', 4,1,1,1,sysdate,sysdate);
insert into goods values(87,50000,'ELLA',50,'https://github.com/study-backend/ShoesCase/blob/master/WebContent/image/boots/ella01.jpg?raw=true','https://github.com/study-backend/ShoesCase/blob/master/WebContent/image/boots/ella.jpg?raw=true',0,0,'시리얼넘버0003', 4,1,1,1,sysdate,sysdate);
insert into goods values(88,50000,'FFOLIA',50,'https://github.com/study-backend/ShoesCase/blob/master/WebContent/image/boots/ffa01.jpg?raw=true','https://github.com/study-backend/ShoesCase/blob/master/WebContent/image/boots/ffa.jpg?raw=true',0,0,'시리얼넘버0003', 4,1,1,1,sysdate,sysdate);
insert into goods values(89,50000,'FILEN',50,'https://github.com/study-backend/ShoesCase/blob/master/WebContent/image/boots/filen01.jpg?raw=true','https://github.com/study-backend/ShoesCase/blob/master/WebContent/image/boots/filen.jpg?raw=true',0,0,'시리얼넘버0003', 4,1,1,1,sysdate,sysdate);
insert into goods values(90,50000,'YELLOW BOOTS',50,'https://github.com/study-backend/ShoesCase/blob/master/WebContent/image/boots/free01.jpg?raw=true','https://github.com/study-backend/ShoesCase/blob/master/WebContent/image/boots/free.jpg?raw=true',0,0,'시리얼넘버0003', 4,1,1,1,sysdate,sysdate);
insert into goods values(91,50000,'LAND',50,'https://github.com/study-backend/ShoesCase/blob/master/WebContent/image/boots/land01.jpg?raw=true','https://github.com/study-backend/ShoesCase/blob/master/WebContent/image/boots/land.jpg?raw=true',0,0,'시리얼넘버0003', 4,1,1,1,sysdate,sysdate);
insert into goods values(92,50000,'LOAD',50,'https://github.com/study-backend/ShoesCase/blob/master/WebContent/image/boots/load01.jpg?raw=true','https://github.com/study-backend/ShoesCase/blob/master/WebContent/image/boots/load.jpg?raw=true',0,0,'시리얼넘버0003', 4,1,1,1,sysdate,sysdate);
insert into goods values(93,50000,'LOOST',50,'https://github.com/study-backend/ShoesCase/blob/master/WebContent/image/boots/loost01.jpg?raw=true','https://github.com/study-backend/ShoesCase/blob/master/WebContent/image/boots/loost.jpg?raw=true',0,0,'시리얼넘버0003', 4,1,1,1,sysdate,sysdate);
insert into goods values(94,50000,'BLACK PRINCE',50,'https://github.com/study-backend/ShoesCase/blob/master/WebContent/image/boots/lost01.jpg?raw=true','https://github.com/study-backend/ShoesCase/blob/master/WebContent/image/boots/lost.jpg?raw=true',0,0,'시리얼넘버0003', 4,1,1,1,sysdate,sysdate);
insert into goods values(95,50000,'MASK',50,'https://github.com/study-backend/ShoesCase/blob/master/WebContent/image/boots/maks01.jpg?raw=true','https://github.com/study-backend/ShoesCase/blob/master/WebContent/image/boots/maks.jpg?raw=true',0,0,'시리얼넘버0003', 4,1,1,1,sysdate,sysdate);
insert into goods values(96,50000,'MIAMMI',50,'https://github.com/study-backend/ShoesCase/blob/master/WebContent/image/boots/miami01.jpg?raw=true','https://github.com/study-backend/ShoesCase/blob/master/WebContent/image/boots/miami.jpg?raw=true',0,0,'시리얼넘버0003', 4,1,1,1,sysdate,sysdate);
insert into goods values(97,50000,'REFLA',50,'https://github.com/study-backend/ShoesCase/blob/master/WebContent/image/boots/refla01.jpg?raw=true','https://github.com/study-backend/ShoesCase/blob/master/WebContent/image/boots/refla.jpg?raw=true',0,0,'시리얼넘버0003', 4,1,1,1,sysdate,sysdate);
insert into goods values(98,50000,'ROMANTIC',50,'https://github.com/study-backend/ShoesCase/blob/master/WebContent/image/boots/romantic01.jpg?raw=true','https://github.com/study-backend/ShoesCase/blob/master/WebContent/image/boots/romantic.jpg?raw=true',0,0,'시리얼넘버0003', 4,1,1,1,sysdate,sysdate);


select * from goods



select * from REVIEW R1 inner join GOODS G1 on R1.GOODS_ID = G1.GOODS_ID WHERE G1.NAME = '나이키에어맥스';
select R1.REVIEW_ID,R1.GOODS_ID,R1.ACCOUNT_ID,R1.TITLE,R1.CONTENT,R1.SCORE,R1.CREATE_DATE,R1.UPDATE_DATE from REVIEW R1 inner join GOODS G1 on R1.GOODS_ID = G1.GOODS_ID WHERE G1.NAME = '나이키에어맥스';
select A1.LOGIN_ID,R1.GOODS_ID,R1.TITLE,R1.CONTENT,R1.SCORE,R1.CREATE_DATE,R1.UPDATE_DATE
from REVIEW R1 inner join GOODS G1 on R1.GOODS_ID = G1.GOODS_ID inner join ACCOUNT A1 on A1.ACCOUNT_ID = R1.ACCOUNT_ID
 WHERE G1.NAME = '나이키에어맥스';

select *
from REVIEW R1 inner join GOODS G1 on R1.GOODS_ID = G1.GOODS_ID inner join ACCOUNT A1 on A1.ACCOUNT_ID = R1.ACCOUNT_ID
 WHERE G1.NAME = '나이키에어맥스';


select A1.LOGIN_ID,R1.GOODS_ID,R1.TITLE,R1.CONTENT,R1.SCORE,R1.CREATE_DATE,R1.UPDATE_DATE 
from REVIEW R1 inner join GOODS G1 on R1.GOODS_ID = G1.GOODS_ID inner join ACCOUNT A1 on A1.ACCOUNT_ID = R1.ACCOUNT_ID
WHERE G1.NAME = '나이키에어맥스';
                
DROP TABLE GOODS_VERSION;
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


DROP TABLE PURCHASE_GOODS;
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
insert into purchase_goods values(1, 1, 'Reebok classic', 1, 50000, 'https://github.com/study-backend/ShoesCase/blob/master/WebContent/image/sneakers/adoran.jpg?raw=true', '구매번호01010', 1,3,sysdate, sysdate, 100);
insert into purchase_goods values(2, 1, 'NEARBY', 1, 50000, 'https://github.com/study-backend/ShoesCase/blob/master/WebContent/image/sneakers/andy.png?raw=true', '구매번호01111', 2,3,sysdate, sysdate, 100);
insert into purchase_goods values(3, 1, '아디다스 블랙 운동화', 1, 50000, 'https://github.com/study-backend/ShoesCase/blob/master/WebContent/image/sneakers/black.jpg?raw=true', '구매번호01222', 3,1,sysdate, sysdate, 101);



DROP TABLE PURCHASE_BASKET;
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
insert into purchase_basket values(1,100,150000,'2019-12-01','https://github.com/study-backend/ShoesCase/blob/master/WebContent/image/sneakers/adoran.jpg?raw=true',1,'구매번호01222','봉천동',sysdate,sysdate);
insert into purchase_basket values(2,100,100000,'2019-12-03','https://github.com/study-backend/ShoesCase/blob/master/WebContent/image/sneakers/andy.png?raw=true',1,'구매번호01111','봉천동',sysdate,sysdate);
insert into purchase_basket values(3,101,150000,'2019-11-11','https://github.com/study-backend/ShoesCase/blob/master/WebContent/image/sneakers/black.jpg?raw=true',1,'구매번호01010','신림동',sysdate,sysdate);

DROP TABLE BILL_KEY;
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


DROP TABLE CATEGORY;
CREATE TABLE CATEGORY(
    CATEGORY_ID NUMBER(19) CONSTRAINT id_category_pk PRIMARY KEY,
    SORT_ORDER INT  NOT NULL,
    NAME VARCHAR2(50)  NOT NULL,
    CREATE_DATE DATE  NOT NULL,
    UPDATE_DATE DATE NOT NULL
); -- ? goods테이블에  카테고리에 date가 필요한가 ?


insert into category values(1,9999,'sneakers',sysdate,sysdate);
insert into category values(2,9999,'dressShoes',sysdate,sysdate);
insert into category values(3,9999,'sandal',sysdate,sysdate);
insert into category values(4,9999,'boots',sysdate,sysdate);

delete from category;
select * from category;


DROP TABLE MANAGER;
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

DROP TABLE CANCel;
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


DROP TABLE PURCHASE_BASKET_PAYMENT;
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


DROP TABLE PURCHASE_STATIC;
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

select G1.PRICE, G1.NAME, G1.IMG_PATH  from GOODS G1 INNER JOIN CATEGORY G2 ON G1.CATEGORY_ID = G2.CATEGORY_ID where G2.NAME='운동화';
select G1.PRICE, G1.NAME, G1.IMG_PATH  from GOODS G1 INNER JOIN CATEGORY G2 ON G1.CATEGORY_ID = G2.CATEGORY_ID where G2.NAME='sneakers';
commit

-- 아래는 원래 다 : 다 관계이다.. 젠장 일단 급하니.. 단순하게.. -- 자동증가 필요
CREATE TABLE ROLLING_BANNER(
	ROLLING_ID NUMBER(19) CONSTRAINT id_roll_pk PRIMARY KEY,  
	VERSION_ID NUMBER(19) NOT NULL, 		
	NAME VARCHAR2(20) NOT NULL,
	IMG_PATH VARCHAR2(200) NOT NULL,
	CREATE_DATE DATE NOT NULL,
    UPDATE_DATE DATE NOT NULL
);
drop table rolling_banner;
delete from rolling_banner;
select * from rolling_banner;
insert into ROLLING_BANNER values(1, 1, '나이키신발', 'https://raw.githubusercontent.com/study-backend/ShoesCase/master/WebContent/image/mainImage/andy.png', sysdate, sysdate);
insert into ROLLING_BANNER values(2, 1, '아디다스신발','https://raw.githubusercontent.com/study-backend/ShoesCase/master/WebContent/image/mainImage/big.jpg',sysdate, sysdate);
insert into ROLLING_BANNER values(3, 1, '신년이벤트', 'https://raw.githubusercontent.com/study-backend/ShoesCase/master/WebContent/image/mainImage/bold03.jpg',sysdate, sysdate);
insert into ROLLING_BANNER values(4, 1, '크리스벤', 'https://raw.githubusercontent.com/study-backend/ShoesCase/master/WebContent/image/mainImage/flower03.jpg',sysdate, sysdate);

commit

select *  from GOODS G1 INNER JOIN CATEGORY G2 ON G1.CATEGORY_ID = G2.CATEGORY_ID where G2.NAME='sneakers'

select * from review

select * from account where login_id = 'park';
