package com.example.songjunmain.asdf;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    EditText edittext1;
    int i =0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView) findViewById(R.id.st2);
    }
    public void fuckyou(View v){
    i++;
            if(i==0) {
                textView.setText("안전");
                textView.setTextColor(0xFF00FF00);
            }
        else if(i==1) {
            textView.setText("불안");
                textView.setTextColor(0xFF0000FF);
        }

            else if(i==2) {
                textView.setText("위험");
                textView.setTextColor(0xFFFF0000);
            }
        else
                i=-1;
    }
}
