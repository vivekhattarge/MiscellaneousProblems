package com.misc.Comparator;


import java.util.Comparator;

public class News {

    private Integer newsId;
    private Integer catId;
    private String news;

    public Integer getNewsId() {
        return newsId;
    }

    public void setNewsId(Integer newsId) {
        this.newsId = newsId;
    }

    public Integer getCatId() {
        return catId;
    }

    public void setCatId(Integer catId) {
        this.catId = catId;
    }

    public String getNews() {
        return news;
    }

    public void setNews(String news) {
        this.news = news;
    }

    @Override
    public String toString() {
        return "News{" +
                "newsId=" + newsId +
                ", catId=" + catId +
                ", news='" + news + '\'' +
                '}';
    }

}
