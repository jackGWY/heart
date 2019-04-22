package wk.dao;

import org.apache.ibatis.annotations.*;
import wk.entity.UserPatient;

import java.util.List;

public interface SaveUserInfoMapper {
    void saveUser(@Param("phone") String phone, @Param("uname") String uname,@Param("password") String password,@Param("userType") String userType);
    int DoLogin(@Param("uname") String uname,@Param("password") String password,@Param("userType") String userType);

    @Select("SELECT user_name,user_password,phone,user_type from user_patient where user_type = #{userType}")
    @Results({@Result(property = "userName", column = "user_name"),
            @Result(property = "userPassword", column = "user_password"),
            @Result(property = "userType", column = "user_type")
    })
    List<UserPatient> getDoctors(@Param("userType")String userType);

    @Select("SELECT user_name,user_password,phone,user_type from user_patient where user_name = #{userName}")
    @Results({@Result(property = "userName", column = "user_name"),
            @Result(property = "userPassword", column = "user_password"),
            @Result(property = "userType", column = "user_type")
    })
    UserPatient getUserPatientByUserName(@Param("userName")String userName);

    @Update("update user_patient set user_name=#{userName},user_password=#{userPassword},phone=#{phone} where user_name=#{originName}")
    int updateUserPatient(@Param("originName")String originName,@Param("userName")String userName,@Param("userPassword")String userPassword,@Param("phone")String phone);

    @Insert("REPLACE INTO relation(patient,doctor) values(#{patient},#{doctor})")
    int saveRelation(@Param("patient")String patient,@Param("doctor")String doctor);

    @Select("SELECT user_name,user_password,phone,user_type from user_patient")
    @Results({@Result(property = "userName", column = "user_name"),
            @Result(property = "userPassword", column = "user_password"),
            @Result(property = "userType", column = "user_type")
    })
    List<UserPatient> getUserNameList();
}
