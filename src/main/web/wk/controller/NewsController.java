package wk.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import wk.dao.NewsMapper;
import wk.entity.HeartNews;

import java.util.List;

@RestController
@RequestMapping(value = "/news")
public class NewsController {

    @Autowired(required = false)
    private NewsMapper newsMapper;
    @RequestMapping(value = "/getNews")
    public List<HeartNews> getHeartNews(){
        System.out.println("in new-getnews");
        List<HeartNews> news=newsMapper.getNews();
        return news;
    }
}
