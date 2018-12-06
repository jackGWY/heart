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

@Service
public class DrugService {
    @Autowired(required = false)
    private DrugMapper drugMapper;

    public List<drugInfoResp> getDrugInfoList(){
        return drugMapper.getDrugInfoList();
    }

    public drugInfoResp getDrugInfoByA1(String a1){
        return drugMapper.getDrugInfoByA1(a1);
    }

    public List<News> getNews() {
        return drugMapper.getNews();
    }

    public void saveDiary(String time, String reason, String drugUsed, String hospital,String userName) {
        drugMapper.saveDiary(time,userName,reason,drugUsed,hospital);
    }

    public List<diary> getDiaryListByUserNmae(String userName) {
        return drugMapper.getDiaryList(userName);
    }
}
