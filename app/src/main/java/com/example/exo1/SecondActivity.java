package com.example.exo1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView count;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Button toast = (Button) findViewById(R.id.toast);
        toast.setOnClickListener(this);

        count = (TextView) findViewById(R.id.count);

        Button countBtnIncrement = (Button) findViewById(R.id.countBtnIncrement);
        countBtnIncrement.setOnClickListener(this);

        Button countBtnDecrement = (Button) findViewById(R.id.countBtnDecrement);
        countBtnDecrement.setOnClickListener(this);
    }

    private void reset() {
        count.setText("0");
    }

    private void increment() {
        count.setText(String.valueOf((Integer.parseInt(count.getText().toString()) + 1)));
    }

    private void decrement() {
        count.setText(String.valueOf((Integer.parseInt(count.getText().toString()) - 1)));
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case (R.id.toast):
                Toast.makeText(SecondActivity.this, "Reset count", Toast.LENGTH_SHORT).show();
                this.reset();
                break;
            case (R.id.countBtnIncrement):
                this.increment();
                break;
            case (R.id.countBtnDecrement):
                this.decrement();
                break;
        }
    }
}
