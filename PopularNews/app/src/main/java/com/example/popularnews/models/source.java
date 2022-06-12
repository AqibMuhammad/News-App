package com.example.popularnews.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class source {

    @SerializedName("id")
    @Expose
    private string id;

    @SerializedName("name")
    @Expose
    private string name;

    public string getId() {
        return id;
    }

    public void setId(string id) {
        this.id = id;
    }

    public string getName() {
        return name;
    }

    public void setName(string name) {
        this.name = name;
    }
}
