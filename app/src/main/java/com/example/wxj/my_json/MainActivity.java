package com.example.wxj.my_json;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.wxj.my_json.bean.News;
import com.example.wxj.my_json.net.HttpResult;
import com.example.wxj.my_json.net.HttpUtil;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btnRetrofit;
    private TextView tvShowMsg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initData();
    }

    private void initData() {
        btnRetrofit.setOnClickListener(this);
    }

    private void initView() {
        btnRetrofit = (Button) findViewById(R.id.btn_retrofit);
        tvShowMsg = (TextView) findViewById(R.id.tv_show_msg);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_retrofit:
                getJsonNews();
                break;
        }
    }

    private void getJsonNews() {
        HttpUtil.requestByRetrofit(new Callback<HttpResult<List<News>>>() {
            @Override
            public void onResponse(Call<HttpResult<List<News>>> call, Response<HttpResult<List
                    <News>>> response) {
                List<News> list = response.body().getData();

                for (News mListData : list) {
                    Log.i("TAG",mListData.toString());
                    tvShowMsg.append(mListData.toString()+"\n");
                }

            }

            @Override
            public void onFailure(Call<HttpResult<List<News>>> call, Throwable t) {

            }
        });
    }
}
