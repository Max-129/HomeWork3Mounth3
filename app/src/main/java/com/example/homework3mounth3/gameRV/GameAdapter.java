package com.example.homework3mounth3.gameRV;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.homework3mounth3.R;

import java.util.ArrayList;

public class GameAdapter extends RecyclerView.Adapter<GameViewHolder> {

    private ArrayList<String> gameList;

    public GameAdapter(ArrayList<String> gameList) {
        this.gameList = gameList;
    }

    @NonNull
    @Override
    public GameViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new GameViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_game, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull GameViewHolder holder, int position) {
        holder.bind(gameList.get(position));
    }

    @Override
    public int getItemCount() {
        return gameList.size();
    }
}


