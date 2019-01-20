package com.example.dell.mengmian;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

public class AnimalAdopter extends RecyclerView.Adapter <AnimalHolder>{
    private List<Animal>animals;
    private Context context;

    public AnimalAdopter(List<Animal>animals,Context context){
        this.animals=animals;
        this.context=context;
    }

    @NonNull
    @Override
    public AnimalHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        //获取一个通过layoutInflater类里的static方法FROM
        View view =LayoutInflater.from(context)
                .inflate(R.layout.animal_item,viewGroup,false);
        AnimalHolder animalHolder= new AnimalHolder(view);

        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull AnimalHolder animalHolder, int i) {
        animalHolder.bindView(animals.get(i));
    }

    @Override
    public int getItemCount() {
        return animals.size();
    }
}
