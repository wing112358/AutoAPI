package com.autoapitest.FunctionService.service;

import java.util.ResourceBundle;


/**
 * 基础数据服务
 *
 * @author wing
 */
public class BasciService {

    ResourceBundle bundle = ResourceBundle.getBundle("application");
    public String BASEURL = bundle.getString("internal_itemurl");
}


