package com.example.popularnews.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class News {
    @SerializedName("status")
    @Expose
    private string status;

    @SerializedName("totalResult")
    @Expose
    private int totalResult;

    @SerializedName("articles")
    @Expose
    private list<Article> article;

    public string getStatus() {
        return status;
    }

    public void setStatus(string status) {
        this.status = status;
    }

    public int getTotalResult() {
        return totalResult;
    }

    public void setTotalResult(int totalResult) {
        this.totalResult = totalResult;
    }

    public list<Article> getArticle() {
        return article;
    }

    public void setArticle(list<Article> article) {
        this.article = article;
    }
}
