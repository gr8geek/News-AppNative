package com.example.android.just.mynewsapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import java.util.ArrayList;

public class NewsDisp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news_disp);
        ArrayList<News> news = new ArrayList<>();
        for(int i=0;i<20;i++){
            news.add(new News("Sample News "+i,"","Sample Description "+i));
        }

        NewsAdpater adp = new NewsAdpater(news,this);
        RecyclerView rv = (RecyclerView) findViewById(R.id.newsList);
        rv.setAdapter(adp);
        rv.setLayoutManager(new LinearLayoutManager(this));
    }
}