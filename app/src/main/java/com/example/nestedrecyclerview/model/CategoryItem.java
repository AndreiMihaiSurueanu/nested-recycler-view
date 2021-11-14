package com.example.nestedrecyclerview.model;

public class CategoryItem {

    Integer itemId;
    Integer imageUrl;

    public CategoryItem(Integer itemId, Integer imageUrl) {
        this.itemId = itemId;
        this.imageUrl = imageUrl;
    }

    public Integer getImageUrl() {
        return imageUrl;
    }

}
