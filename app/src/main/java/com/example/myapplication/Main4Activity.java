package com.example.myapplication;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.Entity.SubjectsBean3;
import com.example.myapplication.Entity.Top250;
import com.example.myapplication.retrofit.HttpMethods;

import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import rx.Subscriber;

public class Main4Activity extends AppCompatActivity {

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
        Subscriber<List<SubjectsBean3>> s = new Subscriber<List<SubjectsBean3>>() {
            @Override
            public void onCompleted() {
                Toast.makeText(Main4Activity.this, "Get Top Movie Completed", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onError(Throwable e) {
                resultTV.setText(e.getMessage());
            }

            @Override
            public void onNext(List<SubjectsBean3> list) {
                resultTV.setText(list.size());
            }
        };
        HttpMethods.getInstance().getTopMovie3(s,0, 10);
    }
}