package net.padcmyanmar.sfc.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import net.padcmyanmar.sfc.R;
import net.padcmyanmar.sfc.delegates.NewsItemDelegate;
import net.padcmyanmar.sfc.viewholders.NewsViewHolder;

/**
 * Created by yekokohtet on 11/4/17.
 */

public class NewsAdapter extends RecyclerView.Adapter<NewsViewHolder> {

    private LayoutInflater mLayoutInflater;
    private NewsItemDelegate mNewsItemDelegate;

    public NewsAdapter(Context context, NewsItemDelegate newsItemDelegate) {
        super();
        mLayoutInflater = LayoutInflater.from(context);
        mNewsItemDelegate = newsItemDelegate;
    }

    @Override
    public NewsViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View newsItemView = mLayoutInflater.inflate(R.layout.view_item_news, parent, false);
        return new NewsViewHolder(newsItemView, mNewsItemDelegate);
    }

    @Override
    public void onBindViewHolder(NewsViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 16;
    }
}
