package com.example.myapplication;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.Entity.SubjectsBean3;
import com.example.myapplication.http.ProgressSubscriber;
import com.example.myapplication.http.SubscriberOnNextListener;
import com.example.myapplication.retrofit.HttpMethods;

import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import rx.Subscriber;

public class Main5Activity extends AppCompatActivity {

    @Bind(R.id.click_me_BN)
    Button clickMeBN;
    @Bind(R.id.result_TV)
    TextView resultTV;


    private SubscriberOnNextListener getTopMovieOnNext;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        getTopMovieOnNext = new SubscriberOnNextListener<List<SubjectsBean3>>() {
            @Override
            public void onNext(List<SubjectsBean3> subjects) {
                resultTV.setText(subjects.toString());
            }
        };
    }

    @OnClick(R.id.click_me_BN)
    public void onClick() {
        getMovie();
    }

    //进行网络请求
    private void getMovie(){
        HttpMethods.getInstance().getTopMovie3(
                new ProgressSubscriber(
                        getTopMovieOnNext,
                        Main5Activity.this),
                0, 10);
    }
}