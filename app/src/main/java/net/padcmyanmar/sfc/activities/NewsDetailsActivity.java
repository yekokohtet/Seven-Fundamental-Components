package net.padcmyanmar.sfc.activities;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import net.padcmyanmar.sfc.R;
import net.padcmyanmar.sfc.adapters.NewsImagesPagerAdapter;
import net.padcmyanmar.sfc.adapters.NewsRelatedAdapter;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by yekokohtet on 11/11/17.
 */

public class NewsDetailsActivity extends AppCompatActivity{

    @BindView(R.id.vp_news_details_images)
    ViewPager vpNewsDetailsImages;

    @BindView(R.id.rv_related_news)
    RecyclerView rvRelatedNews;

    public static Intent newIntent(Context context) {
        Intent intent = new Intent(context, NewsDetailsActivity.class);
        return intent;
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news_details);
        ButterKnife.bind(this, this);

        NewsImagesPagerAdapter newsImagesPagerAdapter = new NewsImagesPagerAdapter(getApplicationContext());
        vpNewsDetailsImages.setAdapter(newsImagesPagerAdapter);

        rvRelatedNews.setLayoutManager(new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.HORIZONTAL, false));
        NewsRelatedAdapter newsRelatedAdapter = new NewsRelatedAdapter(getApplicationContext());
        rvRelatedNews.setAdapter(newsRelatedAdapter);
    }
}
