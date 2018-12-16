package wk.dao;

import org.apache.ibatis.annotations.Param;
import wk.entity.MessageTitle;

import java.util.List;

public interface ConsultMapper {
    void saveMessageTitle(@Param("title") String title,@Param("owner") String owner);
    List<MessageTitle> getMessageTitle();
}
