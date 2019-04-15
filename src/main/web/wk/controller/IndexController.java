package wk.controller;

import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import wk.dao.IndexMapper;
import wk.service.IndexService;

import java.util.Map;

@RestController
@RequestMapping(value = "/zhibiao")
public class IndexController {

    @Autowired
    private IndexService indexService;

    @RequestMapping(value = "/saveInput", method = RequestMethod.GET)
    public Map<String, Object> saveIndex(
            @RequestParam("userName") String userName,
            @RequestParam("age") String age,
            @RequestParam("sex") String sex,
            @RequestParam("cp") String cp,
            @RequestParam("trestbps") String trestbps,
            @RequestParam("chol") String chol,
            @RequestParam("fbs") String fbs,
            @RequestParam("restecg") String restecg,
            @RequestParam("thalach") String thalach,
            @RequestParam("exang") String exang,
            @RequestParam("oldpeak") String oldpeak,
            @RequestParam("slop") String slop,
            @RequestParam("ca") String ca,
            @RequestParam("thal") String thal
    ) {
        indexService.saveIndex(userName,age,sex,cp,trestbps,chol,fbs,restecg,thalach,exang,oldpeak,slop,ca,thal);
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("result", "0");
        System.out.printf("indexController \n");
        return jsonObject;
    }
}
