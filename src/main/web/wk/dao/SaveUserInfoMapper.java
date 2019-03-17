package wk.dao;

import org.apache.ibatis.annotations.*;
import wk.entity.UserPatient;

import java.util.List;

public interface SaveUserInfoMapper {
    void saveUser(@Param("phone") String phone, @Param("uname") String uname,@Param("password") String password,@Param("userType") String userType);
    int DoLogin(@Param("uname") String uname,@Param("password") String password);

    @Select("SELECT user_name,user_password,phone,user_type from user_patient where user_type = #{userType}")
    @Results({@Result(property = "userName", column = "user_name"),
            @Result(property = "userPassword", column = "user_password"),
            @Result(property = "userType", column = "user_type")
    })
    List<UserPatient> getDoctors(String userType);

    @Insert("REPLACE INTO relation(patient,doctor) values(#{patient},#{doctor})")
    int saveRelation(@Param("patient")String patient,@Param("doctor")String doctor);
}
