package com.example.nn0lumesther.javadev.model;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DeveloperList {

    @SerializedName("items")
    @Expose
    private List<Developer> items = null;

    public List<Developer> getItems() {
        return items;
    }

    public void setItems(List<Developer> developers) {
        this.items = developers;
    }

}
