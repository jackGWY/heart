package wk.controller;

import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import wk.dao.SaveUserInfoMapper;
import wk.entity.UserPatient;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/user")
public class UserController {
    @Autowired(required = false)
    private SaveUserInfoMapper saveUserInfoMapper;
    @RequestMapping(value = "/getDoctors")
    public List<UserPatient> getDoctors(@RequestParam(value = "userType") String userType){
        List<UserPatient> users = new ArrayList<>();
        users=saveUserInfoMapper.getDoctors(userType);
        System.out.printf(users.toString());
        return users;
    }
    @RequestMapping(value = "/saveRelation")
    public JSONObject saveRelation(@RequestParam("patient") String patient, @RequestParam("doctor") String doctor){
        int i = saveUserInfoMapper.saveRelation(patient,doctor);
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("count", i+"");
        System.out.printf("message:"+i);
        return jsonObject;
    }
}
