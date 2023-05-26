package com.maspam.buku_tugas_ilham;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;

import com.maspam.buku_tugas_ilham.databinding.ActivityRecyclerviewBinding;
import com.maspam.buku_tugas_ilham.model.DataModel;

import java.util.ArrayList;

public class RecyclerviewActivity extends AppCompatActivity {

    ArrayList<DataModel> data = new ArrayList<>();
    private ActivityRecyclerviewBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityRecyclerviewBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.rvList.setHasFixedSize(true);
        data.addAll(getData());
        startRecycler();
    }

    private void startRecycler() {
        binding.rvList.setLayoutManager(new LinearLayoutManager(this));
        RecyclerviewAdapter adapter = new RecyclerviewAdapter(data);
        binding.rvList.setAdapter(adapter);
    }

    private ArrayList<DataModel> getData (){
        String[] name = {"Maspam","Maspam","Maspam","Maspam","Maspam","Maspam","Maspam","Maspam","Maspam","Maspam"};
        String[] desk = {"Ini Desk", "Ini Desk","Ini Desk","Ini Desk","Ini Desk","Ini Desk","Ini Desk","Ini Desk","Ini Desk","Ini Desk"};
        int[] picture = {
                R.drawable.himti_logos,
                R.drawable.himti_logos,
                R.drawable.himti_logos,
                R.drawable.himti_logos,
                R.drawable.himti_logos,
                R.drawable.himti_logos,
                R.drawable.himti_logos,
                R.drawable.himti_logos,
                R.drawable.himti_logos,
                R.drawable.himti_logos,
        };

        ArrayList<DataModel> temp = new ArrayList<>();

        for(int i = 0; i < name.length; i++) {
            DataModel data = new DataModel();
            data.setName(name[i]);
            data.setDeskripsi(desk[i]);
            data.setPicture(picture[i]);
            temp.add(data);
        }

        return temp;
    }
}