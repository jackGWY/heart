package wk.controller;

import com.alibaba.fastjson.JSONObject;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.logging.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import wk.dao.MessageMapper;
import wk.entity.Chat;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/message")
public class MessageController {

    @Autowired(required = false)
    private MessageMapper messageMapper;

    @RequestMapping(value = "/save")
    public JSONObject saveMessage(@RequestParam("patient") String patient, @RequestParam("message") String message,
                                  @RequestParam("doctor")String doctor, @RequestParam("belong")String belong){
        int count=messageMapper.saveMessage(patient,message,doctor,belong);
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("count", count+"");
        System.out.println("count:" + count);
        return jsonObject;
    }

    @RequestMapping(value = "/get")
    public List<Chat> getMessages(@RequestParam("patient") String patient, @RequestParam("doctor")String doctor){
        List<Chat> chats = new ArrayList<>();
        System.out.printf("in getMessages:\n");
        chats=messageMapper.getMessage(patient,doctor);
        System.out.printf(chats.toString());
        return chats;
    }

}
