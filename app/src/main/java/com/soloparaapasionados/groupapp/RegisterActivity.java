package com.soloparaapasionados.groupapp;

import android.content.Intent;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.DatePicker;
import android.widget.TextView;

import com.soloparaapasionados.groupapp.fragments.DatePickerFragment;

import java.util.Calendar;

public class RegisterActivity extends AppCompatActivity {

    private TextView birthdayTextView;
    private DatePicker birthdayDatePicker;

    private int year;
    private int month;
    private int day;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        //birthdayTextView = (TextView) findViewById(R.id.birthdayTextView);
        birthdayDatePicker = (DatePicker) findViewById(R.id.birthdayDatePicker);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("Registro");
        toolbar.inflateMenu(R.menu.menu_main);

        final Calendar c = Calendar.getInstance();
        year = c.get(Calendar.YEAR);
        month = c.get(Calendar.MONTH);
        day = c.get(Calendar.DAY_OF_MONTH);
        birthdayDatePicker.init(year, month, day, null);

//        birthdayTextView.setOnClickListener(
//                new View.OnClickListener() {
//                    @Override
//                    public void onClick(View v) {
//                        DialogFragment picker = new DatePickerFragment();
//                        picker.show(getSupportFragmentManager(), "datePicker");
//
//                    }
//                }
//        );
    }

    public void continuar_Click(View view) {

        Intent intent = new Intent(RegisterActivity.this, RegisterCourseActivity.class);
        startActivity(intent);
    }

}
