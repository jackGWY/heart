package wk.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import wk.dao.DrugMapper;
import wk.resp.drugInfoResp;

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
}
