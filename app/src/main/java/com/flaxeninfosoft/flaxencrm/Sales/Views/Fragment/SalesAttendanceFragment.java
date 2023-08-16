package com.flaxeninfosoft.flaxencrm.Sales.Views.Fragment;

import android.os.Bundle;

import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.flaxeninfosoft.flaxencrm.R;
import com.flaxeninfosoft.flaxencrm.databinding.FragmentMyAttendanceBinding;


public class SalesAttendanceFragment extends Fragment {


    public SalesAttendanceFragment() {
        // Required empty public constructor
    }
    FragmentMyAttendanceBinding binding;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_my_attendance, container, false);
        return binding.getRoot();
    }
}