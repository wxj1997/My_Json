package com.example.wxj.my_json.net;

import com.example.wxj.my_json.bean.News;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by wxj on 2018/5/2.
 */

public interface ApiService {
  @GET("json.php")
  Call<HttpResult<List<News>>> getNews();
}
