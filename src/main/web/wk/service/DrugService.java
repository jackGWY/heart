package wk.service;

import org.apache.commons.logging.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;
import wk.dao.DrugMapper;
import wk.entity.News;
import wk.entity.diary;
import wk.resp.drugInfoResp;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Service
public class DrugService {
    @Autowired(required = false)
    private DrugMapper drugMapper;

    private static Logger logger = LoggerFactory.getLogger(DrugService.class);

    public List<drugInfoResp> getDrugInfoList(){
        logger.info("in DrugService.getDrugInfoList() is invoke...");
        return drugMapper.getDrugInfoList();
    }

    public drugInfoResp getDrugInfoByA1(String a1){
        logger.info("in DrugService.getDrugInfoByA1(): a1="+a1);
        return drugMapper.getDrugInfoByA1(a1);
    }

    public drugInfoResp getDrugInfoByRandom(String a1) {
        logger.info("in DrugService.getDrugInfoByRandom(): a1="+a1);
        return drugMapper.getDrugInfoByRandom(a1);
    }

    public List<News> getNews() {
        logger.info("in DrugService.getNews() is invoke...");
        return drugMapper.getNews();
    }

    public void saveDiary(String time, String reason, String drugUsed, String hospital,String userName) {
        logger.info("in DrugService.saveDiary() is invoke...");
        drugMapper.saveDiary(time,userName,reason,drugUsed,hospital);
    }

    public List<diary> getDiaryListByUserNmae(String userName) {
        logger.info("in DrugService.saveDiary():userName="+userName);
        return drugMapper.getDiaryList(userName);
    }
}
