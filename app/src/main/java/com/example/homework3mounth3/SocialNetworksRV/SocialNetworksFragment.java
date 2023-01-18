package com.example.homework3mounth3.SocialNetworksRV;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.homework3mounth3.R;
import com.example.homework3mounth3.databinding.FragmentGameBinding;
import com.example.homework3mounth3.databinding.FragmentSocialNetworksBinding;
import com.example.homework3mounth3.gameRV.GameAdapter;

import java.util.ArrayList;

public class SocialNetworksFragment extends Fragment {

    private ArrayList<String> netList = new ArrayList<>();
    private SocialNetworkAdapter adapter;

    public FragmentSocialNetworksBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentSocialNetworksBinding.inflate(getLayoutInflater());
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        loadData();

        adapter = new SocialNetworkAdapter(netList);
        binding.recycleViewSocialNetworks.setAdapter(adapter);

    }

    private void loadData() {
        netList.add("Telegram");
        netList.add("Whatsapp");
        netList.add("Instagram");
        netList.add("Discord");
        netList.add("TikTok");
        netList.add("Vkontakte");
        netList.add("Pinterest");
        netList.add("Viber");
        netList.add("Viber");
        netList.add("Viber");
        netList.add("Viber");
        netList.add("Viber");
        netList.add("Viber");
        netList.add("Viber");

    }
}