package wk.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import wk.dao.TestDao;
import wk.service.TestService;

/**
 * Created by infodba on 2018/5/23.
 */

@Service("testService")
public class TestServiceImpl implements TestService {


    @Autowired(required = false)
    private TestDao testDao;

    @Override
    public int testAction() {

        int i = testDao.selectCount();

        return i;
    }
}
