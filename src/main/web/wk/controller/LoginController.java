package wk.controller;

import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import wk.entity.UserPatient;
import wk.service.UserInfoService;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value = "/login")
public class LoginController {

    @Autowired
    private UserInfoService userInfoService;

    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public JSONObject saveUserInfo(@RequestParam(value = "phone") String phone,@RequestParam(value = "uname")
            String uname, @RequestParam(value = "regpass") String regpass, @RequestParam(value = "userType") String userType){
        System.out.println(phone+" "+uname+" "+regpass);

        List<UserPatient> userPatientList=userInfoService.getUserNameList();
        if(userPatientList!=null && userPatientList.size()!=0){
            for(UserPatient u : userPatientList){
                if(u.getUserName().equals(uname)){
                    JSONObject jsonObject = new JSONObject();
                    jsonObject.put("result", "9");
                    return jsonObject;
                }
            }
        }
        userInfoService.saveUserInfo(phone,uname,regpass,userType);
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("result", "0");
        return jsonObject;
    }



    @RequestMapping(value = "/doLogin")
    public Map<String,Object> doLogin(@RequestParam(value = "uname") String uname, @RequestParam(value = "regpass") String regpass, @RequestParam(value = "userType") String userType){
        System.out.println(" "+uname+" "+regpass);
        int count=userInfoService.doLogin(uname,regpass,userType);
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("count", count+"");
        System.out.println("count:" + count);
        return jsonObject;
    }

}
