package com.flaxeninfosoft.flaxencrm.Sales.Views.Fragment;

import android.os.Bundle;

import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.flaxeninfosoft.flaxencrm.R;
import com.flaxeninfosoft.flaxencrm.databinding.FragmentClientBinding;


public class SalesClientFragment extends Fragment {


    public SalesClientFragment() {
        // Required empty public constructor
    }

   FragmentClientBinding binding;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_client, container, false);

        RecyclerView recyclerView = new RecyclerView(getContext());
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

//
//        List<String> data= new ArrayList<>();
//        data.add("jnjx");
//        data.add("jnjx");
//        data.add("jnjx");
//
//        ClientAdapter adapter = new ClientAdapter(data);
//        binding.rec1.setAdapter(adapter);
//        adapter.notifyDataSetChanged();

        return binding.getRoot();
    }

    private void backOnClick(View view) {
        Navigation.findNavController(view).navigateUp();
    }
}