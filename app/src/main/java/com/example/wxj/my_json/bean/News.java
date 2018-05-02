package com.example.wxj.my_json.bean;

/**
 * Created by wxj on 2018/5/2.
 */

public class News {
    private String tittle;
    private String content;
    private String newsUrl;

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getNewsUrl() {
        return newsUrl;
    }

    public void setNewsUrl(String newsUrl) {
        this.newsUrl = newsUrl;
    }

    @Override
    public String toString() {
        return "News{" +
                "tittle='" + tittle + '\'' +
                ", content='" + content + '\'' +
                ", newsUrl='" + newsUrl + '\'' +
                '}';
    }
}
