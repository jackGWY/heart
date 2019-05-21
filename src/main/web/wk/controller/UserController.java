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
import java.util.Map;

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
    @RequestMapping(value = "/getUserPatientByUserName")
    public UserPatient getUserPatientByUserName(@RequestParam(value = "userName")String userName){
        UserPatient user = new UserPatient();
        user=saveUserInfoMapper.getUserPatientByUserName(userName);
        System.out.printf(user.toString());
        return user;
    }
    @RequestMapping(value = "/updateUserPatient")
    public JSONObject updateUserPatient(@RequestParam(value = "originName")String originName, @RequestParam(value = "userName")String userName, @RequestParam(value = "userPassword")String userPassword, @RequestParam(value = "phone")String phone){
        System.out.printf("in updateUserPatient..........");
        int count=saveUserInfoMapper.updateUserPatient(originName,userName,userPassword,phone);
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("count", String.valueOf(count));
        System.out.println(" userController update count:" + count);
        return jsonObject;
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
