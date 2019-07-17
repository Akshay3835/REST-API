package com.bridgelabz.sampleretrofit;

import java.util.List;
import java.util.Map;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;

public interface RetrofitService {
    @GET("user")
    Call<List<UserModel>> getAllUsers();

    @GET("user/login")
    Call<List<UserModel>> getUser(@QueryMap Map<String, String> parameters);

//    @GET("/posts/{id}/comments")
//    Call<List<Comment>> getComment(@Path("id") int postId);
//
//    @GET
//    Call<List<Comment>> getComment(@Url String url);


//    @POST
//    Call<UserModel> createPost(@Body UserModel userModel);
//
//    @FormUrlEncoded
//    @POST("post")
//    Call<UserModel> createPost(
//            @Field("userId") int userId,
//            @Field("title") String title,
//            @Field("body") String text
//    );
//
//    @FormUrlEncoded
//    @POST("posts")
//    Call<UserModel> createPost(@FieldMap Map<String , String> fields);
//
//
//    @PUT("posts/{id}")
//    Call<UserModel> putPost(@Path("id") int id, @Body UserModel userModel);
//
//    @PATCH("posts/{id}")
//    Call<UserModel> patchPost(@Path("id") int id, @Body UserModel userModel);
//
//    @DELETE("posts/{id}")
//    Call<Void> deletePost(@Path("id") int id);
}