
package wk.controller;

import com.alibaba.fastjson.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import wk.service.TestService;

/**
 * Created by infodba on 2018/5/23.
 */

@Controller
@RequestMapping("/index")
public class TestController {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    @Qualifier("testService")
    private TestService testService;
 
    
    /*
    * 两个方法
    * 第一个不跳转页面，只会在页面显示出返回值
    * 第二个跳转页面
    * 
    * */

    @RequestMapping(value = "/testAction", method = RequestMethod.GET)
    @ResponseBody
    public JSONObject indexTest(String data) {
        int i = testService.testAction();
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("test", i);
        return jsonObject;
    }
    @RequestMapping(value = "/testActionDemo2", method = RequestMethod.GET)
    public String indexTest2() {

        return "home";
    }

}
