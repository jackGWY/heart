package wk.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import wk.entity.MessageBoard;
import wk.entity.MessageTitle;
import wk.service.ConsultService;

import java.util.List;

@RestController
@RequestMapping("/consult")
public class ConsultController {

    @Autowired
    private ConsultService consultService;
    @RequestMapping("/saveMessageTitle")
    public void saveMessageTitle(@RequestParam("title") String title, @RequestParam("owner") String owner){
        consultService.saveMessageTitle(title,owner);
    }

    @RequestMapping("/getMessageTitleList")
    public List<MessageTitle> getMessageTitleList() {
        return consultService.getMessageTitleList();
    }

    @RequestMapping("/saveMessageBoard")
    public void saveMessageBoard(@RequestParam("topicTitle")String topicTitle, @RequestParam("toppicOwner")String toppicOwner, @RequestParam("comment")String comment, @RequestParam("commentOwner")String commentOwner){
        consultService.saveMessageBoard(topicTitle,toppicOwner,comment,commentOwner);
    }
    @RequestMapping("/getMessageBoardList")
    public List<MessageBoard> getMessageBoardList(@RequestParam("title")String title) {
        return consultService.getMessageBoardList(title);
    }

}
