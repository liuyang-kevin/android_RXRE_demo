package com.example.myapplication;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;


import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.Entity.Top250;
import com.example.myapplication.http.MovieService;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    @Bind(R.id.click_me_BN)
    Button clickMeBN;
    @Bind(R.id.result_TV)
    TextView resultTV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

//        apikey=0df993c66c0c636e29ecbb5344252a4a

    }

    @OnClick(R.id.click_me_BN)
    public void onClick() {
        getMovie();
    }

    //进行网络请求
    private void getMovie(){
        String baseUrl = "https://api.douban.com/v2/movie/";

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(baseUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        MovieService movieService = retrofit.create(MovieService.class);
        Call<Top250> call = movieService.getTopMovie(0, 10, "0df993c66c0c636e29ecbb5344252a4a");
        call.enqueue(new Callback<Top250>() {
            @Override
            public void onResponse(Call<Top250> call, Response<Top250> response) {
                Log.i("45678", response.toString());
//                resultTV.setText(response.body().toString());
                resultTV.setText(response.body().getTitle());
            }

            @Override
            public void onFailure(Call<Top250> call, Throwable t) {
                resultTV.setText(t.getMessage());
            }
        });
    }
}