package wk.dao;

import org.apache.ibatis.annotations.*;
import wk.entity.Feelings;

import java.util.List;

public interface FeelingMapper {
    @Insert("" +
            "insert into feeling(user_name,sports,feeling,blood_pressure,heart_rate,remark)\n" +
            "        values(#{userName},#{sports}, #{feeling},#{bloodPressure},#{heartRate},#{remark})")
    int saveFeelings(Feelings feelings);

    @Select("" +
            "select * from feeling WHERE user_name = #{userName}")
    @Results({@Result(property = "userName", column = "user_name"),
            @Result(property = "heartRate", column = "heart_rate"),
            @Result(property = "bloodPressure", column = "blood_pressure")
            })
    List<Feelings> getFeelings(String userName);
}
