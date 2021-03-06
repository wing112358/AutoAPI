package com.autoapitest.FunctionService.service.Function;

import com.alibaba.fastjson.JSONObject;
import com.autoapitest.FunctionService.params.Common.Environment;
import com.autoapitest.FunctionService.params.Common.Response;
import com.autoapitest.FunctionService.service.BasciService;
import com.autoapitest.FunctionService.system.utils.GetEnvironment;
import com.autoapitest.FunctionService.system.utils.GetResponse;
import com.autoapitest.FunctionService.system.utils.JSON;
import com.autoapitest.FunctionService.system.utils.Tools;
import org.apache.http.Header;
import org.springframework.stereotype.Service;
import org.testng.Assert;

import java.io.IOException;


/**
 * 删除权限
 *
 * @author wing
 */

@Service
public class GetFunctionTreeService extends BasciService {

    String GET_FUNCTION_TREE_URL="/customerFunction/getFunctionTree";


    /**
     * 携带cookies登录后获取权限
     *
     * @param result
     * @param headers
     * @return
     *
     * @author wing
     */

    public JSONObject getfunctiontree(String result, Header[] headers, Environment envir, String servicename) throws IOException {

        String BASEURL=new GetEnvironment().getUrl(envir,servicename);

        //发送请求
        Response response = new GetResponse().get(BASEURL+GET_FUNCTION_TREE_URL,null,null,headers);

        //若返回正常，则将结果转为json对象并比对实际结果和预期，并返回结果
        if(response.getStatusCode()== 200){
            JSONObject json = JSON.fromObject(response.getResponse());
            Tools.assertMsgAndData(json,result);
            return  json;

        }


        //失败则打印失败状态码
        Assert.fail("getfunctiontree正常接口失败，响应为:" + response.getStatusCode());

        return null;
    }


}
