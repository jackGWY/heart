package wk.dao;

import org.apache.ibatis.annotations.Param;

public interface SaveUserInfoMapper {
    void saveUser(@Param("phone") String phone, @Param("uname") String uname,@Param("password") String password,@Param("userType") String userType);
    int DoLogin(@Param("uname") String uname,@Param("password") String password);
}
