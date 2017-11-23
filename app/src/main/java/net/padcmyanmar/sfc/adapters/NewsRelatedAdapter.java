package net.padcmyanmar.sfc.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import net.padcmyanmar.sfc.R;
import net.padcmyanmar.sfc.viewholders.NewsRelatedViewHolder;

/**
 * Created by yekokohtet on 11/23/17.
 */

public class NewsRelatedAdapter extends RecyclerView.Adapter<NewsRelatedViewHolder> {

    private LayoutInflater mLayoutInflater;

    public NewsRelatedAdapter(Context context) {
        super();
        mLayoutInflater = LayoutInflater.from(context);
    }

    @Override
    public NewsRelatedViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = mLayoutInflater.inflate(R.layout.view_item_news_related, parent, false);
        return new NewsRelatedViewHolder(view);
    }

    @Override
    public void onBindViewHolder(NewsRelatedViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 10;
    }
}
