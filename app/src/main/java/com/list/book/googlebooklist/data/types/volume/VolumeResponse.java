package com.list.book.googlebooklist.data.types.volume;


import java.util.List;

public class VolumeResponse {

    private String kind;
    private int totalItems;

    private List<Volume> items;

    public VolumeResponse() {
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public int getTotalItems() {
        return totalItems;
    }

    public void setTotalItems(int totalItems) {
        this.totalItems = totalItems;
    }

    public List<Volume> getItems() {
        return items;
    }

    public void setItems(List<Volume> items) {
        this.items = items;
    }
}
