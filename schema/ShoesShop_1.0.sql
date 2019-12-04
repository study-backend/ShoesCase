
CREATE TABLE ACCOUNT(
    ACCOUNT_ID NUMBER(19) CONSTRAINT id_acc_pk PRIMARY KEY,
    LOGIN_ID VARCHAR2(50) NOT NULL,
    LOGIN_PWD VARCHAR2(50) NOT NULL,
    NAME VARCHAR2(20) NOT NULL,
    PHONE VARCHAR2(20) NOT NULL,
    EMAIL VARCHAR2(30) NOT NULL,
    ADDR VARCHAR2(50) NOT NULL,
    SEX CHAR(1) NOT NULL,
    BIRTHDAY DATE NOT NULL,
--    LOGIN_DATE DATE NOT NULL,
--    LOGOUT_DATE DATE NOT NULL,
    TERMS_VERSION INT NOT NULL,
    TERMS_AGREE_DATE DATE NOT NULL,
    CREATE_DATE DATE NOT NULL,
    UPDATE_DATE DATE NOT NULL,
    DELETE_DATE DATE NOT NULL
);

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

CREATE TABLE GOODS(
    GOODS_ID NUMBER(19) CONSTRAINT id_goods_pk PRIMARY KEY,
    PRICE NUMBER NOT NULL,
    NAME VARCHAR(20) NOT NULL,
    COUNT INT NOT NULL,
    IMG_PATH VARCHAR(100) NOT NULL,
    SUMNAIL_PATH VARCHAR(100) NOT NULL,
    COLOR_CODE INT NOT NULL,
    SIZE_CODE INT NOT NULL,
    ITEM_SN VARCHAR2(50) NOT NULL,
    GOODS_VERSION NUMBER(19) NOT NULL,
    SALE_CODE INT NOT NULL,
    SALE_STATE INT NOT NULL,
    CREATE_DATE DATE NOT NULL,
    UPDATE_DATE DATE NOT NULL
);

CREATE TABLE GOODS_VERSION(
    VERSION_ID NUMBER(19) CONSTRAINT id_good_version_pk PRIMARY KEY,
    FILE_PATH VARCHAR2(100) NOT NULL,
    CREATE_DATE DATE NOT NULL,
    UPDATE_DATE DATE NOT NULL
);

CREATE TABLE PURCHASE_GOODS(
    PURCHASE_GOODS_ID NUMBER(19) CONSTRAINT id_purchase_goods_pk PRIMARY KEY,
    STATE_CODE INT NOT NULL,
    NAME VARCHAR2(20) NOT NULL,
    COUNT INT NOT NULL,
    PRICE NUMBER NOT NULL,
    IMG_PATH VARCHAR(100) NOT NULL,
    BILL_KEY VARCHAR(100) CONSTRAINT id_PGBill_uk UNIQUE NOT NULL,
    PURCHASE_BASKET_ID NUMBER(19) NOT NULL,
    GOODS_ID NUMBER(19) NOT NULL,
    CREATE_DATE DATE NOT NULL,
    UPDATE_DATE DATE NOT NULL,
    ACCOUNT_ID NUMBER(19)
);

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
    UPDATE_DATE DATE  NOT NULL,
);

CREATE TABLE BILL_KEY(
    BILL_KEY VARCHAR2(100) CONSTRAINT id_billkey_pk PRIMARY KEY,
    ISSUE_DATE DATE  NOT NULL,
    CANCLE_DATE DATE  NOT NULL,
    CREATE_DATE DATE  NOT NULL,
    UPDATE_DATE DATE  NOT NULL
);

CREATE TABLE CATEGORY(
    CATEGORY_ID NUMBER(19) CONSTRAINT id_category_pk PRIMARY KEY,
    SORT_ORDER INT  NOT NULL,
    NAME VARCHAR2(20)  NOT NULL,
    CREATE_DATE DATE  NOT NULL,
    UPDATE_DATE DATE NOT NULL
);

CREATE TABLE CATEGORY_MAP(
    CATEGORY_ID NUMBER(19),
    GOODS_ID NUMBER(19),
    CREATE_DATE DATE,
    UPDATE_DATE DATE,
    CONSTRAINT id_category_map_pk PRIMARY KEY(CATEGORY_ID,GOODS_ID)
);

CREATE TABLE MANAGER(
    IDX NUMBER(19) CONSTRAINT id_manager_pk PRIMARY KEY,
    MANAGER_ID VARCHAR2(20),
    MANAGER_PWD VARCHAR(20),
    NAME VARCHAR(50),
    CREATE_DATE DATE,
    UPDATE_DATE DATE
);

CREATE TABLE CANCLE(
    CANCLE_ID NUMBER(19) CONSTRAINT id_cancle_pk PRIMARY KEY,
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

CREATE TABLE PURCHASE_BASKET_PAYMENT(
    PURCHASE_BASKET_ID NUMBER(19) CONSTRAINT id_pur_baseket_pay_pk PRIMARY KEY,
    PAYMENT_TYPE INT,
    PRICE INT,
    RECIEVER_NAME VARCHAR2(20),
    RECIEVER_PHONE VARCHAR2(20),
    DILIVERY_COMMENT VARCHAR2(200),
    CREATE_DATE DATE,
    UPDATE_DATE DATE
);

CREATE TABLE PURCHASE_STATIC(
    SALE_DATE DATE,
    GOODS_ID NUMBER(19),
    PAYMENT_TYPE INT,
    SALE_COUNT INT,
    SALE_PRICE NUMBER
);

create sequence seq_no_accountId increment by 1;
