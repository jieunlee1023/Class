package com.example.my_celculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private TextView oneTextView;
    private TextView twoTextView;
    private TextView threeTextView;
    private TextView fourTextView;
    private TextView fiveTextView;
    private TextView sixTextView;
    private TextView sevenTextView;
    private TextView eightTextView;
    private TextView nineTextView;
    private TextView caTextView;
    private TextView plusTextView;
    private TextView minusTextView;
    private TextView mulTextView;
    private TextView divTextView;
    private TextView zeroTextView;
    private TextView resultTextView;

    // 이전에 눌러졌던 값 + 새로 눌러진 값을 표현
    // 1 + 2 = 12 old + new
    String oldValue = "0";
    String newValue = "";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initData();
        addEventListener();
    }

    private void initData() {

        oneTextView = findViewById(R.id.one);
        twoTextView = findViewById(R.id.two);
        threeTextView = findViewById(R.id.three);
        fourTextView = findViewById(R.id.four);
        fiveTextView = findViewById(R.id.five);
        sixTextView = findViewById(R.id.six);
        sevenTextView = findViewById(R.id.seven);
        eightTextView = findViewById(R.id.eight);
        nineTextView = findViewById(R.id.nine);
        caTextView = findViewById(R.id.ca);
        plusTextView = findViewById(R.id.plus);
        minusTextView = findViewById(R.id.minus);
        mulTextView = findViewById(R.id.mul);
        divTextView = findViewById(R.id.div);
        zeroTextView = findViewById(R.id.zero);
        resultTextView = findViewById(R.id.resultTextView);

    }

    private void addEventListener() {
        oneTextView.setOnClickListener(view -> {
            newValue = newValue + "1";
            resultTextView.setText(newValue);
        });
        twoTextView.setOnClickListener(view -> {
            newValue = newValue + "2";
            resultTextView.setText(newValue);
        });

        threeTextView.setOnClickListener(view -> {
            newValue = newValue + "3";
            resultTextView.setText(newValue);
        });

        fourTextView.setOnClickListener(view -> {
            newValue = newValue + "4";
            resultTextView.setText(newValue);
        });
        fiveTextView.setOnClickListener(view -> {
            newValue = newValue + "5";
            resultTextView.setText(newValue);
        });
        sixTextView.setOnClickListener(view -> {
            newValue = newValue + "6";
            resultTextView.setText(newValue);
        });
        sevenTextView.setOnClickListener(view -> {
            newValue = newValue + "7";
            resultTextView.setText(newValue);
        });
        eightTextView.setOnClickListener(view -> {
            newValue = newValue + "8";
            resultTextView.setText(newValue);
        });
        nineTextView.setOnClickListener(view -> {
            newValue = newValue + "9";
            resultTextView.setText(newValue);
        });
        zeroTextView.setOnClickListener(view -> {
            newValue = newValue + "0";
            resultTextView.setText(newValue);
        });
        caTextView.setOnClickListener(view -> {
            newValue = "";
            oldValue = "0";
            resultTextView.setText("0");
        });
        plusTextView.setOnClickListener(view -> {

            int num1 = Integer.parseInt(oldValue);
            int num2 = Integer.parseInt(newValue);

            int sum = num1 + num2;
            oldValue = String.valueOf(sum);
            newValue = "";
            resultTextView.setText(oldValue);


        });
        minusTextView.setOnClickListener(view -> {

            if (oldValue.equals("0")) {
                oldValue = newValue;
                newValue = "";
                resultTextView.setText("0");
            } else {
                if (newValue.equals("")) {
                    newValue = "0";
                }
                int num1 = Integer.parseInt(oldValue);
                int num2 = Integer.parseInt(newValue);
                int minus = (num1 - num2);
                oldValue = String.valueOf(minus);
                newValue = "";
                resultTextView.setText(oldValue);
            }


        });

        mulTextView.setOnClickListener(view -> {

            if (oldValue.equals("0")) {
                oldValue = newValue;
                newValue = "";
                resultTextView.setText("0");
            } else {
                if (newValue.equals("")) {
                    newValue = "0";
                }
                int num1 = Integer.parseInt(oldValue);
                int num2 = Integer.parseInt(newValue);

                int mul = num1 * num2;
                oldValue = String.valueOf(mul);
                newValue = "";
                resultTextView.setText(oldValue);
            }

        });

        divTextView.setOnClickListener(view -> {


            if (oldValue.equals("0")) {
                oldValue = newValue;
                newValue = "";
                resultTextView.setText("0");
            } else {
                if (newValue.equals("")) {
                    newValue = "0";
                }
                int num1 = Integer.parseInt(oldValue);
                int num2 = Integer.parseInt(newValue);

                int div = num1 / num2;
                oldValue = String.valueOf(div);
                newValue = "";
                resultTextView.setText(oldValue);
            }

        });
    }
}