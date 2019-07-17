package com.bridgelabz.sampleretrofit;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    private RetrofitService retrofitService;
    TextView mUser;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mUser = findViewById(R.id.user_model);

        Gson gson = new GsonBuilder().serializeNulls().create();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://34.213.106.173/api/")
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();

        retrofitService = retrofit.create(RetrofitService.class);


        getPosts();
//        getComments();
//        createPost();
//        updatePost();
//        deletePost();


    }

    private void getPosts() {
        Map<String, String> parameters = new HashMap<>();
//        parameters.put("userid", "1");
//        parameters.put("_sort", "id");
//        parameters.put("_order", "desc");

        Call<List<UserModel>> call = retrofitService.getAllUsers();

        call.enqueue(new Callback<List<UserModel>>() {
            @Override
            public void onResponse(Call<List<UserModel>> call, Response<List<UserModel>> response) {
                if (!response.isSuccessful()) {
                    mUser.setText("Code:" + response.code());
                    return;
                }
                List<UserModel> user = response.body();
                for (UserModel userModel : user) {
                    String content = "";
                    content += "ID :" + userModel.getId() + "\n";
                    content += "UserId :" + userModel.getUserId() + "\n";
                    content += "FirstName : " + userModel.getFirstName() + "\n";
                    content += "LastName : " + userModel.getLastName() + "\n";
                    content +=  "Password : " + userModel.getPassword() + "\n";
                    content += "Role : " + userModel.getRole() + "\n";
                    content += "PhoneNumber : " + userModel.getPhoneNumber() + "\n";
                    content += "ImageUrl : " + userModel.getImageUrl() + "\n";
                    content += "Service : " + userModel.getService() + "\n";
                    content += "UserName : " + userModel.getUserName() + "\n";
                    content += "Email :" + userModel.getEmail() + "\n";
                    content += "FirstName : " + userModel.getFirstName() + "\n";


                    mUser.append(content);
                }
            }

            @Override
            public void onFailure(Call<List<UserModel>> call, Throwable t) {
                mUser.setText(t.getMessage());

            }
        });
    }
}
//    }
//
//    private void getComments() {
//        Call<List<Comment>> call = retrofitService
//                .getComment("http://34.213.106.173/api/user/");
//
//        call.enqueue(new Callback<List<Comment>>() {
//            @Override
//            public void onResponse(Call<List<Comment>> call, Response<List<Comment>> response) {
//                if (!response.isSuccessful()) {
//                    mUser.setText("Code:" + response.code());
//                    return;
//                }
//                List<Comment> comments = response.body();
//
//                for (Comment comment : comments) {
//                    String content = "";
////                    content += "ID :" + comment.getId() + "\n";
//                    content += "UserId :" + comment.getPostId() + "\n";
//                    content += "Title : " + comment.getName() + "\n";
//                    content += "Email : " + comment.getEmail() + "\n";
//                    content += "Text : " + comment.getText() + "\n\n";
//
//                    mUser.append(content);
//                }
//            }

//            @Override
//            public void onFailure(Call<List<Comment>> call, Throwable t) {
//                mUser.setText(t.getMessage());
//
//            }
//        });
//    }

//
//    private void createPost() {
//        UserModel userModel = new UserModel(2, "New Title", "New Text");
//
//        Map<String, String> fields = new HashMap<>();
//        fields.put("userId", "25");
//        fields.put("title", "New Title");
//
//        Call<UserModel> call = retrofitService.createPost(fields);
//
//        call.enqueue(new Callback<UserModel>() {
//            @Override
//            public void onResponse(Call<UserModel> call, Response<UserModel> response) {
//
//                if (!response.isSuccessful()) {
//                    mUser.setText("Code: " + response.code());
//                    return;
//                }
//
//                UserModel userModelResponse = response.body();
//                String content = "";
//                content += "ID :" + userModelResponse.getId() + "\n";
//                content += "UserId :" + userModelResponse.getUserId() + "\n";
//                content += "FirstName : " + userModelResponse.getFirstName() + "\n";
//                content += "LastName : " + userModelResponse.getLastName() + "\n";
//                content += "Role : " + userModelResponse.getRole() + "\n";
//  content +=  "Password : " + userModel.getPassword() + "\n";
//                content += "PhoneNumber : " + userModelResponse.getPhoneNumber() + "\n";
//                content += "ImageUrl : " + userModelResponse.getImageUrl()+ "\n";
//                content += "Service : " + userModelResponse.getService() + "\n";
//                content += "UserName : " + userModelResponse.getUserName() + "\n";
//                content += "Email :"   + userModelResponse.getEmail() + "\n";
//                content += "FirstName : " + userModelResponse.getFirstName() + "\n";
//
//
//                mUser.setText(content);
//
//            }

//            @Override
//            public void onFailure(Call<UserModel> call, Throwable t) {
//                mUser.setText(t.getMessage());
//            }
//        });
//    }
//
//
//    private void updatePost() {
//        UserModel userModel = new UserModel(12, null, "New Text");
//
//        Call<UserModel> call = retrofitService.patchPost(5, userModel);
//
//        call.enqueue(new Callback<UserModel>() {
//            @Override
//            public void onResponse(Call<UserModel> call, Response<UserModel> response) {
//
//                if (!response.isSuccessful()) {
//                    mUser.setText("Code: " + response.code());
//                    return;
//                }
//
//                UserModel userModelResponse = response.body();
//
//                String content = "";
//                content += "ID :" + userModelResponse.getId() + "\n";
//                content += "UserId :" + userModelResponse.getUserId() + "\n";
//                content += "FirstName : " + userModelResponse.getFirstName() + "\n";
//                content += "LastName : " + userModelResponse.getLastName() + "\n";
//     content +=  "Password : " + userModel.getPassword() + "\n";
//                content += "Role : " + userModelResponse.getRole() + "\n";
//                content += "PhoneNumber : " + userModelResponse.getPhoneNumber() + "\n";
//                content += "ImageUrl : " + userModelResponse.getImageUrl()+ "\n";
//                content += "Service : " + userModelResponse.getService() + "\n";
//                content += "UserName : " + userModelResponse.getUserName() + "\n";
//                content += "Email :"   + userModelResponse.getEmail() + "\n";
//                content += "FirstName : " + userModelResponse.getFirstName() + "\n";
//
//
//                mUser.setText(content);
//            }
//
//            @Override
//            public void onFailure(Call<UserModel> call, Throwable t) {
//                mUser.setText(t.getMessage());
//            }
//        });
//    }
//
//    private void deletePost() {
//        Call<Void> call = retrofitService.deletePost(5);
//
//        call.enqueue(new Callback<Void>() {
//            @Override
//            public void onResponse(Call<Void> call, Response<Void> response) {
//                mUser.setText("Code: " + response.code());
//            }
//
//            @Override
//            public void onFailure(Call<Void> call, Throwable t) {
//                mUser.setText(t.getMessage());
//            }
//        });
//    }
//}