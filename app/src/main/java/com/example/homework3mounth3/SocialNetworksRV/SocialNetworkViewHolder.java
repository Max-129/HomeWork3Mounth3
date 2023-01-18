package com.example.homework3mounth3.SocialNetworksRV;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.homework3mounth3.R;

public class SocialNetworkViewHolder extends RecyclerView.ViewHolder {

    private TextView tvSocialNetwork;

    public SocialNetworkViewHolder(@NonNull View itemView) {
        super(itemView);

        tvSocialNetwork = itemView.findViewById(R.id.tv_social_network_name);
    }

    public void bind(String socialNetwork){
        tvSocialNetwork.setText(socialNetwork);

    }

}
