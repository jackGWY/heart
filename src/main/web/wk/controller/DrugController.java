package wk.controller;

import com.alibaba.fastjson.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import wk.dao.DrugMapper;
import wk.entity.News;
import wk.entity.diary;
import wk.resp.drugInfoResp;
import wk.service.DrugService;

import java.sql.Date;
import java.util.ArrayList;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/drug")
public class DrugController {

    @Autowired
    private DrugService drugService;
    @Autowired(required = false)
    private DrugMapper drugMapper;
    private static Logger logger = LoggerFactory.getLogger(DrugService.class);

    @RequestMapping("/getDrugInfo")
    public List<drugInfoResp> getDrugInfo(){
        //List<drugInfoResp> drugList = new ArrayList<drugInfoResp>();
        return drugService.getDrugInfoList();
    }

    @RequestMapping("/getDrugInfoByA1")
    public drugInfoResp getDrugInfoByA1(@RequestParam("a1") String a1) {
        return drugService.getDrugInfoByA1(a1);
    }

    @RequestMapping("/getDrugInfoByRandom")
    public drugInfoResp getDrugInfoByRandom(@RequestParam("a1") String a1) {
        return drugService.getDrugInfoByRandom(a1);
    }

    @RequestMapping("/getNews")
    public List<News> getNewsList() {
        return drugService.getNews();
    }

    @RequestMapping(value = "/saveDiary",method = RequestMethod.GET)
    public Map<String, Object> saveDiary(@RequestParam("time") String time, @RequestParam("userName") String userName,
                                         @RequestParam("reason") String reason, @RequestParam("drugUsed") String drugUsed,
                                         @RequestParam("hospital") String hospital) {

        drugService.saveDiary(time,reason,drugUsed,hospital,userName);
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("result", "0");
        return jsonObject;
    }

    @RequestMapping("/getdiaryByUserName")
    public List<diary> getdiaryByUserName(@RequestParam("userName") String userName) {
        return drugService.getDiaryListByUserNmae(userName);
    }
    @RequestMapping("/saveDrugInfo")
    public String saveDrugInfo(@RequestParam("a1") String a1,@RequestParam("a2") String a2,
                               @RequestParam("a3") String a3,@RequestParam("a4") String a4,
                               @RequestParam("a5") String a5,@RequestParam("a6") String a6,
                               @RequestParam("a7") String a7) {
        drugMapper.saveDrugInfo(a1,a2,a3,a4,a5,a6,a7);
        logger.info("in saveDrugInfo() invoke....");
        return "1";
    }
}
