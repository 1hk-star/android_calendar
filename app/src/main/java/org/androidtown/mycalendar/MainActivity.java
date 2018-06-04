package org.androidtown.mycalendar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    private TextView thedate;
    private Button btn_go_calendar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        thedate = (TextView) findViewById(R.id.date);
        btn_go_calendar = (Button) findViewById(R.id.btn_go_calendar);

        Intent comingIntent = getIntent();
        Log.d(TAG, "getintent OK");
        String date = comingIntent.getStringExtra("date");
        thedate.setText(date);

        btn_go_calendar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, CalendarActivity.class);
                startActivity(intent);
            }
        });
    }
}
