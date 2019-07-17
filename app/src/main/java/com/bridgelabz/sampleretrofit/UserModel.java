package com.bridgelabz.sampleretrofit;

public class UserModel
{

    private String userId;
    private String firstName;
    private String lastName;
    private String role;
    private String phoneNumber;
    private String imageUrl;
    private String service;
    private String userName;
    private String email;
    private String password;
    private String id;


    public UserModel(String userId, String firstName, String lastName, String role,
                     String phoneNumber, String imageUrl, String service, String userName,
                     String email, String password, String id) {
        this.userId = userId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.role = role;
        this.phoneNumber = phoneNumber;
        this.imageUrl = imageUrl;
        this.service = service;
        this.userName = userName;
        this.email = email;
        this.password = password;
        this.id = id;
    }





    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getRole() {
        return role;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public String getService() {
        return service;
    }

    public String getUserName() {
        return userName;
    }

    public String getEmail() {
        return email;
    }

    public String getUserId() {
        return userId;
    }

    public String getId() {
        return id;
    }

    public String getPassword()
    {
        return password;
    }



    public String toString()
    {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("UserId :").append(userId).append("\n")
                .append("FirstName : ").append(firstName).append("\n")
                .append("LastName :").append(lastName).append("\n")
                .append("Role :").append(role).append("\n")
                .append("PhoneNumber :").append(phoneNumber).append("\n")
                .append("ImageUrl : ").append(imageUrl).append("\n")
                .append("Service :").append(service).append("\n")
                .append("UserName : ").append(userName).append("\n")
                .append("Email : ").append(email).append("\n")
                .append("Password :").append(password).append("\n")
                .append("Id : ").append(id).append("\n");



                return stringBuilder.toString();
    }

}
