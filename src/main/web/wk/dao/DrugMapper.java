package wk.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.RequestParam;
import wk.entity.News;
import wk.entity.diary;
import wk.resp.drugInfoResp;

import java.sql.Date;
import java.util.List;

public interface DrugMapper {
    List<drugInfoResp> getDrugInfoList();
    drugInfoResp getDrugInfoByA1(@Param("a1") String a1);
    List<News> getNews();
    void saveDiary(@Param("time") String time,@Param("userName") String userNmae,
                   @Param("reason") String reason, @Param("drugUsed") String drugUsed,
                   @Param("hospital") String hospital);
    List<diary> getDiaryList(@Param("userName") String userName);
}
