package com.example.dell.mengmian;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {

    private RecyclerView recyclerView;
    private AnimalAdopter animalAdopter;
    private List<Animal>animals=new ArrayList<>();

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view =inflater.inflate(R.layout.home_fragment_layout,container,false);

        recyclerView=view.findViewById(R.id.first_recycle_viewF);
        for (int i=0;i<10;i++){
            if(i%2==0) {
                Animal temp = new Animal(R.drawable.bolin );
                animals.add(temp);
            }
            else{
                Animal temp = new Animal(R.drawable.dehuai);
                animals.add(temp);
            }
        }
        animalAdopter=new AnimalAdopter(animals,getContext());
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(animalAdopter);
        return view;
    }
}
