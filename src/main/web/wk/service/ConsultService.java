package wk.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import wk.dao.ConsultMapper;
import wk.entity.MessageBoard;
import wk.entity.MessageTitle;

import java.util.List;

@Service
public class ConsultService {
    @Autowired(required = false)
    private ConsultMapper consultMapper;

    public void saveMessageTitle(String title, String owner) {
        consultMapper.saveMessageTitle(title,owner);
    }

    public List<MessageTitle> getMessageTitleList() {
        return consultMapper.getMessageTitle();
    }

    public void saveMessageBoard(String topicTitle,
            String toppicOwner,
            String comment,
            String commentOwner) {
        consultMapper.saveMessageBoard(topicTitle, toppicOwner, comment, commentOwner);
    }
    public List<MessageBoard> getMessageBoardList(String title) {
        return consultMapper.getMessageBoardList(title);
    }
}
