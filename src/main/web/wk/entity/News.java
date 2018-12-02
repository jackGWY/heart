package wk.entity;

import java.io.Serializable;

public class News implements Serializable{
    private String news_url;
    private String title;

    public News(String news_url, String title) {
        this.news_url = news_url;
        this.title = title;
    }

    public String getNews_url() {
        return news_url;
    }

    public void setNews_url(String news_url) {
        this.news_url = news_url;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
