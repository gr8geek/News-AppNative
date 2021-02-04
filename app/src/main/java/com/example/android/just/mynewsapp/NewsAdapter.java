package com.example.android.just.mynewsapp;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

class NewsAdpater extends RecyclerView.Adapter<NewsAdpater.ViewHolder> {

    ArrayList<News> newsList = new ArrayList<>();
    Context context ;
    public static class ViewHolder extends RecyclerView.ViewHolder {
        private final TextView newsHeadLine;
        private final TextView newsSummary;
        private final ImageView image;

        public ViewHolder(View view) {
            super(view);
            // Define click listener for the ViewHolder's View

            newsHeadLine = (TextView) view.findViewById(R.id.title);
            newsSummary = (TextView) view.findViewById(R.id.newssummary);
            image = (ImageView) view.findViewById(R.id.image);


        }

    }

    public NewsAdpater(ArrayList<News> dataSet,Context context) {
        newsList = dataSet;
        this.context = context;
    }

    // Create new views (invoked by the layout manager)
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        // Create a new view, which defines the UI of the list item
        View view = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.news_card, viewGroup, false);

        return new ViewHolder(view);
    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(ViewHolder viewHolder, final int position) {

        // Get element from your dataset at this position and replace the
        // contents of the view with that element
        viewHolder.newsHeadLine.setText(newsList.get(position).headline);
        viewHolder.newsSummary.setText(newsList.get(position).summary);
        Log.d("Deb1",newsList.get(position).summary);
    }

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return newsList.size();
    }
}
