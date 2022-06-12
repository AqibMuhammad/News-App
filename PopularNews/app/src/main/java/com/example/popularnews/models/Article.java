package com.example.popularnews.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.xml.transform.Source;

public class Article {
    @SerializedName("source")
    @Expose
    private Source source;

    @SerializedName("author")
    @Expose
    private string author;

    @SerializedName("title")
    @Expose
    private string title;

    @SerializedName("description")
    @Expose
    private string description;

    @SerializedName("url")
    @Expose
    private string url;

    @SerializedName("urlToImage")
    @Expose
    private string urlToImage;

    @SerializedName("publishedAt")
    @Expose
    private string publishedAt;

    public Source getSource() {
        return source;
    }

    public void setSource(Source source) {
        this.source = source;
    }

    public string getAuthor() {
        return author;
    }

    public void setAuthor(string author) {
        this.author = author;
    }

    public string getTitle() {
        return title;
    }

    public void setTitle(string title) {
        this.title = title;
    }

    public string getDescription() {
        return description;
    }

    public void setDescription(string description) {
        this.description = description;
    }

    public string getUrl() {
        return url;
    }

    public void setUrl(string url) {
        this.url = url;
    }

    public string getUrlToImage() {
        return urlToImage;
    }

    public void setUrlToImage(string urlToImage) {
        this.urlToImage = urlToImage;
    }

    public string getPublishedAt() {
        return publishedAt;
    }

    public void setPublishedAt(string publishedAt) {
        this.publishedAt = publishedAt;
    }
}
