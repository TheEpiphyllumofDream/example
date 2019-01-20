package com.example.dell.mengmian;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class AnimalHolder extends RecyclerView.ViewHolder {
    private ImageView imageView;
    private TextView textView;
    public AnimalHolder(@NonNull View itemView) {
        super(itemView);
        itemView=imageView.findViewById(R.id.animal_item_image_view);
        textView=itemView.findViewById(R.id.animal_item_text_view);
    }
    public void bindView(Animal animal){
        imageView.setImageResource(animal.getImage());
        textView.setText(animal.getText());
    }


}
