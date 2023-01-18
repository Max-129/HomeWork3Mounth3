package com.example.homework3mounth3.SocialNetworksRV;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.homework3mounth3.R;

import java.util.ArrayList;

public class SocialNetworkAdapter extends RecyclerView.Adapter<SocialNetworkViewHolder>{

    private ArrayList<String> netList;

    public SocialNetworkAdapter(ArrayList<String> netList) {
    }

    @NonNull
    @Override
    public SocialNetworkViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new SocialNetworkViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_mobile_phones, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull SocialNetworkViewHolder holder, int position) {
        holder.bind(netList.get(position));
    }

    @Override
    public int getItemCount() {
        return netList.size();
    }
}
