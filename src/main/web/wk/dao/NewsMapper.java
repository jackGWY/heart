package wk.dao;

import org.apache.ibatis.annotations.Select;
import wk.entity.HeartNews;

import java.util.List;

public interface NewsMapper {

    @Select("select title,picurl,newsurl from heartnews")
    List<HeartNews> getNews();
}
