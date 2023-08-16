package com.flaxeninfosoft.flaxencrm.Sales.Views.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.flaxeninfosoft.flaxencrm.R;
import com.flaxeninfosoft.flaxencrm.databinding.ActivitySalesAttedanceBinding;

public class SalesAttendanceActivity extends AppCompatActivity {

    ActivitySalesAttedanceBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_sales_attedance);
       toolbarSetup();
    }
    public void toolbarSetup(){
        View view =  findViewById(R.id.tlAppointmentDetails);
        TextView txtHeader = view.findViewById(R.id.txtHeader);
        ImageView ImgBack = view.findViewById(R.id.ImggClose);
        txtHeader.setText("Attendance");
        ImgBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
    }
}