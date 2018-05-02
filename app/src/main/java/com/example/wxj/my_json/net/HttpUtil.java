package com.example.wxj.my_json.net;

import com.example.wxj.my_json.bean.News;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by wxj on 2018/5/2.
 */

public class HttpUtil {
    public static void requestByRetrofit(Callback<HttpResult<List<News>>> callback) {
        Retrofit retrofit = new Retrofit.Builder().baseUrl("http://10.0.2.2").addConverterFactory
                (GsonConverterFactory.create()).build();
        ApiService apiService = retrofit.create(ApiService.class);
        Call<HttpResult<List<News>>> call = apiService.getNews();
        call.enqueue(callback);

    }

}
