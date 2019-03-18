package wk.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import wk.entity.Chat;

import java.util.List;

public interface MessageMapper {

    @Insert("insert into chat_board(patient,message,doctor,belong) values(#{patient},#{message},#{doctor},#{belong})")
    int saveMessage(@Param("patient") String patient,@Param("message") String message, @Param("doctor")String doctor, @Param("belong")String belong);

    @Select("select * from chat_board where patient = #{patient} and doctor = #{doctor}")
    List<Chat> getMessage(@Param("patient") String patient, @Param("doctor") String doctor);
}
