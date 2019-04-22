package wk.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import wk.dao.SaveUserInfoMapper;
import wk.entity.UserPatient;

import java.util.List;

@Service
public class UserInfoService {

    @Autowired(required = false)
    private SaveUserInfoMapper saveUserInfoMapper;

    public void saveUserInfo( String phone,String uname,String regpass, String userType){
        saveUserInfoMapper.saveUser(phone,uname,regpass,userType);
    }

    public int doLogin(String uname,String regpass,String userType){
        return saveUserInfoMapper.DoLogin(uname,regpass,userType);
    }

    public List<UserPatient> getUserNameList(){
        return saveUserInfoMapper.getUserNameList();
    }
}
