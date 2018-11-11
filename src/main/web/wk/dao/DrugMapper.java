package wk.dao;

import wk.resp.drugInfoResp;

import java.util.List;

public interface DrugMapper {
    List<drugInfoResp> getDrugInfoList();
}
