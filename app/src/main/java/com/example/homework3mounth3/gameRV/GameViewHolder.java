package com.example.homework3mounth3.gameRV;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.homework3mounth3.R;

public class GameViewHolder extends RecyclerView.ViewHolder {

    private TextView tvGame;

    public GameViewHolder(@NonNull View itemView) {
        super(itemView);

        tvGame = itemView.findViewById(R.id.tv_game_name);
    }

    public void bind(String game){
        tvGame.setText(game);

    }
}
