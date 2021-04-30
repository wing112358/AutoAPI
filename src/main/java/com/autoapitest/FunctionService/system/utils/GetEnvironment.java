package com.autoapitest.FunctionService.system.utils;

import com.autoapitest.FunctionService.params.Common.Environment;
import lombok.extern.slf4j.Slf4j;

import java.util.ResourceBundle;
@Slf4j
public class GetEnvironment {

    public String getUrl(Environment envir){
        String baseurl="";
        ResourceBundle bundle = ResourceBundle.getBundle("application");

        switch(envir)
        {
            case Dev :
                baseurl =bundle.getString("internal_itemurl_dev");
                log.info("开发环境域名："+ baseurl);
                break;
            case Test :
                baseurl =bundle.getString("internal_itemurl_test");
                log.info("测试环境域名："+ baseurl);
                break;
            case Pre :
                baseurl =bundle.getString("internal_itemurl_pre");
                log.info("预发环境域名："+ baseurl);
                break;
            case Production :
                baseurl =bundle.getString("internal_itemurl_production");
                log.info("生产环境域名："+ baseurl);
                break;
            default :
                log.info("未知环境");
        }

        return baseurl;
    }
}
