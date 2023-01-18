package com.example.homework3mounth3.gameRV;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.homework3mounth3.databinding.FragmentGameBinding;
import com.example.homework3mounth3.gameRV.GameAdapter;

import java.util.ArrayList;


public class GameFragment extends Fragment {

    private ArrayList<String> gameList = new ArrayList<>();
    private GameAdapter adapter;

    public FragmentGameBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentGameBinding.inflate(getLayoutInflater());
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        loadData();

        adapter = new GameAdapter(gameList);
        binding.recycleViewGame.setAdapter(adapter);

    }

    private void loadData() {
        gameList.add("Crysis 3");
        gameList.add("FarCry 3");
        gameList.add("Plants VS Zombies");
        gameList.add("S.T.A.L.K.E.R. Call Of Chernobyl");
        gameList.add("Minecraft");
        gameList.add("Battlefield 2");
        gameList.add("Roblox");
        gameList.add("Roblox");
        gameList.add("Roblox");
        gameList.add("Roblox");
    }
}