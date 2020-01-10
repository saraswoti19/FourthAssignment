package com.android.fourthassignment.api;

import com.android.fourthassignment.model.Post;
import com.android.fourthassignment.model.User;

import okhttp3.MultipartBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;

public interface PostAPI {


    @Multipart
    @POST("upload")
    Call<Post> uploadImage(@Part MultipartBody.Part img);

    @POST("addpost")
    Call<Void> addPost(@Body Post post);

}

