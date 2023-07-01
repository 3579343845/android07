package com.example.newslist;

public class News {
    private String Title;
    private String Author;
    private String Content;
    private int ImageId;

    public String getTitle() {
        return Title;
    }

    public String getAuthor() {
        return Author;
    }

    public String getContent() {
        return Content;
    }

    public void setTitle(String mTitle) {
        this.Title = mTitle;
    }

    public void setAuthor(String mAuthor) {
        this.Author = mAuthor;
    }

    public void setContent(String mContent) {
        this.Content = mContent;
    }

    public int getImageId() {
        return ImageId;
    }

    public void setImageId(int mImageId) {
        this.ImageId = mImageId;
    }
}
