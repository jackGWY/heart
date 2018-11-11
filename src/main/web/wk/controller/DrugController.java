package wk.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import wk.resp.drugInfoResp;
import wk.service.DrugService;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/drug")
public class DrugController {

    @Autowired
    private DrugService drugService;

    @RequestMapping("/getDrugInfo")
    public List<drugInfoResp> getDrugInfo(){
        //List<drugInfoResp> drugList = new ArrayList<drugInfoResp>();
        return drugService.getDrugInfoList();
    }
}
