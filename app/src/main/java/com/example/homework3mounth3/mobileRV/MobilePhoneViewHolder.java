package com.example.homework3mounth3.mobileRV;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.homework3mounth3.R;

public class MobilePhoneViewHolder extends RecyclerView.ViewHolder {

    private TextView tvMobilePhone;

    public MobilePhoneViewHolder(@NonNull View itemView) {
        super(itemView);

        tvMobilePhone = itemView.findViewById(R.id.tv_phone_name);

    }
    public void bind(String phone){
        tvMobilePhone.setText(phone);
    }
}
