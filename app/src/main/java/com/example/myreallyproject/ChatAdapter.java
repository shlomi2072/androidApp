package com.example.myreallyproject;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ChatAdapter extends RecyclerView.Adapter<ChatAdapter.ChatViewHolder>{
    private ArrayList<Image_class> images;

    public ChatAdapter(ArrayList<Image_class> images) {
        this.images = images;
    }

    @NonNull
    @Override
    public ChatViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View chatView = LayoutInflater.from(parent.getContext()).
                inflate(R.layout.recycler_item_image,parent,false);

        return new ChatViewHolder(chatView);
    }

    @Override
    public void onBindViewHolder(@NonNull ChatViewHolder holder, int position) {
           Image_class carrentImage = images.get(position);
           holder.image.setImageResource(
                   holder.button.getResources().getIdentifier(carrentImage.getSourse()
                   ,"drawable",holder.button.getContext().getPackageName())
           );
    }

    @Override
    public int getItemCount() {
        return images.size();
    }

    public static class ChatViewHolder extends RecyclerView.ViewHolder {
        public Button button;
        public ImageView image;

        public ChatViewHolder(@NonNull View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.imageView);
            button = itemView.findViewById(R.id.button_share);
        }
    }
}
