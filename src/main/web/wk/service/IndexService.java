package wk.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import wk.dao.IndexMapper;

@Service
public class IndexService {

    @Autowired(required = false)
    private IndexMapper indexMapper;

    public void saveIndex(
            String userName,
            String age,
            String sex,
            String cp,
            String trestbps,
            String chol,
            String fbs,
            String restecg,
            String thalach,
            String exang,
            String oldpeak,
            String slop,
            String ca,
            String thal
    ){
        indexMapper.saveIndexInfo(userName,age,sex,cp,trestbps,chol,fbs,restecg,thalach,exang,oldpeak,slop,ca,thal);
    }
}
