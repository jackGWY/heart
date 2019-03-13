package wk.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import wk.dao.FeelingMapper;
import wk.entity.Feelings;

import java.util.List;

@RestController
@RequestMapping(value = "/feeling")
public class FeelingController {
    @Autowired(required = false)
    private FeelingMapper feelingMapper;
    @RequestMapping(value = "/saveFeeling")
    public void saveFeeling(@RequestParam(value = "userName") String userName,@RequestParam(value = "sports") String sports,
                            @RequestParam(value = "feeling") String feeling,@RequestParam(value = "bloodPressure") String bloodPressure,
                            @RequestParam(value = "heartRate") String heartRate,@RequestParam(value = "remark") String remark){
        Feelings feelings = new Feelings();
        feelings.setUserName(userName);
        feelings.setSports(sports);
        feelings.setFeeling(feeling);
        feelings.setBloodPressure(bloodPressure);
        feelings.setHeartRate(heartRate);
        feelings.setRemark(remark);
        System.out.printf(feelings.toString());
        int count = feelingMapper.saveFeelings(feelings);
        System.out.printf("count:"+count);
    }
    @RequestMapping(value = "/getFeelings")
    public List<Feelings> getFeelings(@RequestParam(value = "userName") String userName) {
        List<Feelings> feelings = feelingMapper.getFeelings(userName);
        System.out.printf("succeed!"+feelings.toString());
        return feelings;
    }
}
