package com.yiyang.common;

import com.google.common.collect.Sets;

import java.util.Set;
public class Const {
    public static final String CURRENT_USER = "currentUser";

    public static final String EMAIL = "email";
    public static final String USERNAME = "username";

    public interface ProductListOrderBy{
        Set<String> PRICE_ASC_DESC = Sets.newHashSet("price_desc","price_asc");
    }

    public interface Role{
        int ROLE_CUSTOMER = 0; //普通用户
        int ROLE_ADMIN = 1;//管理员
        int ROLE_DOCTOR = 2;//医生
        int ROLE_FAMILY = 3;//亲人
    }
}
