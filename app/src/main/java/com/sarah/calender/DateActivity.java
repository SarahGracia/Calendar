package com.sarah.calender;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by lamuel on 12/20/16.
 */

public class DateActivity extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        setContentView(R.layout.activity_detail);

        if(getIntent() != null) {
            int year = getIntent().getIntExtra("year", -1);

            TextView yearTextView = (TextView) findViewById(R.id.yearText);
            yearTextView.setText(String.valueOf(year));

        } else {

            //handle error
        }
    }
}
