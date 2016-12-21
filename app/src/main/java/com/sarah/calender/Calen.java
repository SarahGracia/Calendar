package com.sarah.calender;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.Toast;

import com.sarah.calender.R;

import java.util.Date;

public class Calen extends AppCompatActivity {

    private Button button;

    CalendarView calendar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calen);

        calendar = (CalendarView) findViewById(R.id.calendar1);

        calendar.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {

            @Override
            public void onSelectedDayChange(CalendarView calendarView, int year, int month, int dayOfMonth) {

                Toast.makeText(getBaseContext(), "Selected date " + ++month + "/" + dayOfMonth + "/" + year, Toast.LENGTH_LONG).show();

                Intent i = new Intent(Calen.this, DateActivity.class);
                i.putExtra("month", month);
                i.putExtra("dayOfMonth", dayOfMonth);
                i.putExtra("year", year);
                startActivity(i);
            }
        });

    }
}
