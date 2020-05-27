package com.example.changebuttoncolor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
     private Button btn1, btn2, btn3;
    View[] groupButtons;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        groupButtons = new View[]{
                findViewById(R.id.btn1),
                findViewById(R.id.btn2),
                findViewById(R.id.btn3)
        };
        for (View view : groupButtons) view.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        int id = v.getId();

        for (View view : groupButtons) view.setSelected(view.getId() == id);
        switch (v.getId()) {
            case R.id.btn1:
                isChecked = true;
                btn1.setSelected(isChecked);
                btn2.setSelected(false);
                btn3.setSelected(false);
                break;
            case R.id.btn2:
                isChecked = true;
                btn2.setSelected(isChecked);
                btn1.setSelected(false);
                btn3.setSelected(false);
        }
    }
}
