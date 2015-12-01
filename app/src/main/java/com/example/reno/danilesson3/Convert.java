package com.example.reno.danilesson3;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import android.widget.TextView;


public class Convert extends Activity  implements View.OnClickListener{

    private EditText input1;
    private TextView output1;

    private Button   button1;

    private TextView bannerText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);

        LinearLayout myLayout = new LinearLayout(this);
        myLayout.setOrientation(LinearLayout.VERTICAL);

        input1 = new EditText(this);
        output1 = new TextView(this);

        button1 = new Button(this);

        bannerText = new TextView(this);

        myLayout.setOrientation(LinearLayout.VERTICAL);
        myLayout.setGravity(Gravity.CENTER_HORIZONTAL);
        myLayout.setBackgroundColor(Color.LTGRAY);

        bannerText.setWidth(300);
        bannerText.setGravity(Gravity.CENTER_HORIZONTAL);
        bannerText.setTextSize(TypedValue.COMPLEX_UNIT_SP, 50);
        bannerText.setTypeface(Typeface.SANS_SERIF, Typeface.BOLD);
        bannerText.setText(" Currency Converter from Dollar $ to Birr");
        bannerText.setTextColor(Color.BLUE);
        bannerText.setPadding(0, 0, 0, 10);

        input1.setHint("Enter Dollar amount");
        button1.setText("Convert to Birr!");


        output1.setText("0");
        output1.setTextSize(TypedValue.COMPLEX_UNIT_SP, 30);
        output1.setPadding(0, 20, 0, 20);
        output1.setWidth(150);
        output1.setGravity(Gravity.CENTER_HORIZONTAL);
        output1.setTextColor(Color.WHITE);



        //button1.setOnClickListener(myListener);

        button1.setOnClickListener(this);


        myLayout.addView(bannerText);
        myLayout.addView(input1);
        myLayout.addView(output1);

        myLayout.addView(button1);




        LinearLayout.LayoutParams parm = new RadioGroup.LayoutParams(300,100);

        input1.setLayoutParams(parm);
        output1.setLayoutParams(parm);
        button1.setLayoutParams(parm);

        setContentView(myLayout);



        input1.setLayoutParams(new LinearLayout.LayoutParams(225, 50));
        button1.setLayoutParams(new LinearLayout.LayoutParams(170, 50));
       // button2.setLayoutParams(new LinearLayout.LayoutParams(170, 50));



    }

    @Override
    public void onClick(View v) {
        String one = input1.getText().toString();
        double firstNumber = Double.parseDouble(one);

        double result = firstNumber * 21.90;
        String resultString = String.valueOf(result);
        output1.setText(resultString);
    }



}

