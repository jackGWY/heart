package wk.dao;

import org.apache.ibatis.annotations.Param;
import wk.resp.drugInfoResp;
import java.util.List;

public interface DrugMapper {
    List<drugInfoResp> getDrugInfoList();
    drugInfoResp getDrugInfoByA1(@Param("a1") String a1);
}