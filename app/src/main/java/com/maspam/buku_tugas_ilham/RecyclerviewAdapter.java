package com.maspam.buku_tugas_ilham;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.maspam.buku_tugas_ilham.databinding.ItemRecyclerBinding;
import com.maspam.buku_tugas_ilham.model.DataModel;

import java.util.ArrayList;

public class RecyclerviewAdapter extends RecyclerView.Adapter<RecyclerviewAdapter.AdapterViewControl> {

    ArrayList<DataModel> dataModels;

    public RecyclerviewAdapter(ArrayList<DataModel> data) {
        this.dataModels = data;
    }

    @NonNull
    @Override
    public RecyclerviewAdapter.AdapterViewControl onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new AdapterViewControl(ItemRecyclerBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerviewAdapter.AdapterViewControl holder, int position) {
        DataModel data = dataModels.get(position);
        holder.binding.tvName.setText(data.getName());
        holder.binding.tvDeskripsi.setText(data.getDeskripsi());
        holder.binding.ivPoster.setImageResource(data.getPicture());
    }

    @Override
    public int getItemCount() {
        return dataModels.size();
    }

    public class AdapterViewControl extends RecyclerView.ViewHolder {

        private ItemRecyclerBinding binding;

        public AdapterViewControl(@NonNull ItemRecyclerBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}
