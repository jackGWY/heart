package wk.dao;

import org.apache.ibatis.annotations.Param;
import wk.entity.MessageBoard;
import wk.entity.MessageTitle;

import java.util.List;

public interface ConsultMapper {
    void saveMessageTitle(@Param("title") String title,@Param("owner") String owner);
    List<MessageTitle> getMessageTitle();
    void saveMessageBoard(@Param("topicTitle")String topicTitle,@Param("toppicOwner")String toppicOwner, @Param("comment")String comment, @Param("commentOwner")String commentOwner);
    List<MessageBoard> getMessageBoardList(@Param("title") String title);
}
