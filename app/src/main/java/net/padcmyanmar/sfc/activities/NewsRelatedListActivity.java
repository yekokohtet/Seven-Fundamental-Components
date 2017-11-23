package net.padcmyanmar.sfc.activities;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import net.padcmyanmar.sfc.R;
import net.padcmyanmar.sfc.adapters.NewsRelatedAdapter;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by yekokohtet on 11/16/17.
 */

public class NewsRelatedListActivity extends AppCompatActivity {

    @BindView(R.id.rv_related_news)
    RecyclerView rvRelatedNews;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news_related_list);
        ButterKnife.bind(this, this);

        rvRelatedNews.setLayoutManager(new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.VERTICAL, false));
        NewsRelatedAdapter newsRelatedAdapter = new NewsRelatedAdapter(getApplicationContext());
        rvRelatedNews.setAdapter(newsRelatedAdapter);
    }
}
