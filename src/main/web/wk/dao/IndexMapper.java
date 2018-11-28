package wk.dao;

import org.apache.ibatis.annotations.Param;


public interface IndexMapper {
    void saveIndexInfo(@Param("userName") String userName,
                       @Param("age") String age,
                       @Param("sex") String sex,
                       @Param("cp") String cp,
                       @Param("trestbps") String trestbps,
                       @Param("chol") String chol,
                       @Param("fbs") String fbs,
                       @Param("restecg") String restecg,
                       @Param("thalach") String thalach,
                       @Param("exang") String exang,
                       @Param("oldpeak") String oldpeak,
                       @Param("slop") String slop,
                       @Param("ca") String ca,
                       @Param("thal") String thal);
}
