package com.example.homework3mounth3.mobileRV;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.homework3mounth3.databinding.FragmentMobileBinding;

import java.util.ArrayList;

public class MobileFragment extends Fragment {

    private ArrayList<String> phoneList = new ArrayList<>();
    private MobilePhoneAdapter mobilePhoneAdapter;

    public FragmentMobileBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentMobileBinding.inflate(getLayoutInflater());
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        loadData1();

        mobilePhoneAdapter = new MobilePhoneAdapter(phoneList);
        binding.recycleViewPhone.setAdapter(mobilePhoneAdapter);

    }

    private void loadData1() {
        phoneList.add("Xiaomi");
        phoneList.add("Huavei");
        phoneList.add("Google Pixel");
        phoneList.add("Honor");
        phoneList.add("IPhone");
        phoneList.add("Samsung");
        phoneList.add("OnePlus");
        phoneList.add("RealMe");

    }
}