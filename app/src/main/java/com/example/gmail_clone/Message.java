package com.example.gmail_clone;

public class Message {
    private Integer id;
    private String address;
    private String title;
    private String description;
    private String timestamp;
    private boolean isSelected;
    public Message(Integer id, String address, String title, String description,String timestamp) {
        this.id = id;
        this.address = address;
        this.title = title;
        this.description = description;
        this.timestamp=timestamp;
        this.isSelected=false;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public boolean isSelected() {
        return isSelected;
    }

    public void setSelected(boolean selected) {
        isSelected = selected;
    }
}
