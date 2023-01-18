package com.example.homework3mounth3.mobileRV;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.homework3mounth3.R;

import java.util.ArrayList;

public class MobilePhoneAdapter extends RecyclerView.Adapter<MobilePhoneViewHolder> {

    private ArrayList<String> phoneList;

    public MobilePhoneAdapter(ArrayList<String> phoneList) {
    }

    @NonNull
    @Override
    public MobilePhoneViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MobilePhoneViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_mobile_phones, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull MobilePhoneViewHolder holder, int position) {
        holder.bind(phoneList.get(position));
    }

    @Override
    public int getItemCount() {
        return phoneList.size();
    }
}
