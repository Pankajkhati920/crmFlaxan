package com.flaxeninfosoft.flaxencrm.Android.Fragment;

import android.app.DatePickerDialog;
import android.os.Bundle;

import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.DatePicker;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import com.flaxeninfosoft.flaxencrm.R;
import com.flaxeninfosoft.flaxencrm.databinding.FragmentApplyLeaveAndroidBinding;
import com.flaxeninfosoft.flaxencrm.databinding.FragmentHome2Binding;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;


public class ApplyLeaveAndroidFragment extends Fragment {

    FragmentApplyLeaveAndroidBinding binding;
    int day, month, year;
    String formatted;
    public ApplyLeaveAndroidFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_apply_leave_android, container, false);

        binding.fromTextview.setOnClickListener(v -> {
            Calendar calendar = Calendar.getInstance();
            year = calendar.get(Calendar.YEAR);
            month = calendar.get(Calendar.MONTH);
            day = calendar.get(Calendar.DAY_OF_MONTH);

            Date date = calendar.getTime();
            SimpleDateFormat formatter = new SimpleDateFormat("dd MMM yyyy", Locale.getDefault());
            formatted = formatter.format(date);
            binding.fromTextview.setText(formatted);
            DatePickerDialog datePickerDialog = new DatePickerDialog(getContext(), this::onDateSet, year, month, day);
            datePickerDialog.show();

        });

        binding.toTextview.setOnClickListener(v -> {
            Calendar calendar = Calendar.getInstance();
            year = calendar.get(Calendar.YEAR);
            month = calendar.get(Calendar.MONTH);
            day = calendar.get(Calendar.DAY_OF_MONTH);

            Date date = calendar.getTime();
            SimpleDateFormat formatter = new SimpleDateFormat("dd MMM yyyy", Locale.getDefault());
            formatted = formatter.format(date);
            binding.toTextview.setText(formatted);
            DatePickerDialog datePickerDialog = new DatePickerDialog(getContext(), this::onDateSet, year, month, day);
            datePickerDialog.show();

        });



        binding.btnSend.setOnClickListener(this::OnClickBack);

        toolbarSetup();
        return binding.getRoot();
    }

    private void OnClickBack(View view) {
        Navigation.findNavController(view).navigateUp();
    }


    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
        Calendar c = Calendar.getInstance();
        c.set(Calendar.YEAR, year);
        c.set(Calendar.MONTH, month);
        c.set(Calendar.DAY_OF_MONTH, dayOfMonth);
        Date date = c.getTime();
        SimpleDateFormat formatter = new SimpleDateFormat("dd MMM yyyy", Locale.getDefault());
        formatted = formatter.format(date);
        binding.fromTextview.setText(formatted);
        binding.toTextview.setText(formatted);
    }
    public void toolbarSetup(){
        View view =  binding.tlAppointmentDetails;
        TextView txtHeader = view.findViewById(R.id.txtHeader);
        ImageView ImgBack = view.findViewById(R.id.ImggClose);
        txtHeader.setText("Apply For Leave");
        ImgBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(view).navigateUp();
            }
        });
    }

}