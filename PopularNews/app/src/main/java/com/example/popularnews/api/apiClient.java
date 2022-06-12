package com.example.popularnews.api;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class apiClient {
    public static final String BASE_URL =" https://newsapi.org/v2";
    public static Retrofit retrofit;
    public static Retrofit getApiClient(){
if (retrofit == null) {
    retrofit = new Retrofit.Builder().baseUrl(BASE_URL)
            .client(getunsafeOkHttpClint().build())
            .addConverterFactory(GsonConverterFactory.create())
            .build();
}
    return retrofit;
}
public static OkHttpClient.Builder getunsafeOkHttpClint(){
        return null;
}


    }
}
