package com.bridgelabz.sampleretrofit;

import com.google.gson.annotations.SerializedName;

public class UserModel
{

    private int userId;

    private Integer id;

    private String title;

    @SerializedName("body")
    private String text;


    public UserModel(int userId, String title, String text)
    {
        this.userId = userId;
        this.title = title;
        this.text = text;
    }



    public int getUserId() {
        return userId;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getText() {
        return text;
    }

    public String toString()
    {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("UserId :").append(userId).append("\n")
                .append("Title : ").append(title).append("\n")
                .append("Text :").append(text).append("\n");

                return stringBuilder.toString();
    }

}
