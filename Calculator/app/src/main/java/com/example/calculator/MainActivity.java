package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button button0, button1, button2, button3, button4, button5, button6,
            button7, button8, button9, buttonAdd, buttonSub, buttonDivision,
            buttonMul, buttonDecimal, buttonC, buttonEqual;

    EditText editText;

    float value1, value2;

    boolean add, sub, mul, div;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button0 = findViewById(R.id.button0);
        button1 =  findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 =  findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 =  findViewById(R.id.button5);
        button6 =  findViewById(R.id.button6);
        button7 =  findViewById(R.id.button7);
        button8 =  findViewById(R.id.button8);
        button9 =  findViewById(R.id.button9);
        buttonDecimal =  findViewById(R.id.buttonDecimal);
        buttonAdd =  findViewById(R.id.buttonadd);
        buttonSub =  findViewById(R.id.buttonsub);
        buttonMul =  findViewById(R.id.buttonmul);
        buttonDivision =  findViewById(R.id.buttondiv);
        buttonC = findViewById(R.id.buttonC);
        buttonEqual = findViewById(R.id.buttoneql);
        editText = findViewById(R.id.editText);

        // editText.getText()+"1" gets whatever is written in the editText already and adds string 0 to it
        button0.setOnClickListener(v -> editText.setText((editText.getText() + "0")));
        button1.setOnClickListener(v -> editText.setText((editText.getText() + "1")));
        button2.setOnClickListener(v -> editText.setText((editText.getText() + "2")));
        button3.setOnClickListener(v -> editText.setText((editText.getText() + "3")));
        button4.setOnClickListener(v -> editText.setText((editText.getText() + "4")));
        button5.setOnClickListener(v -> editText.setText((editText.getText() + "5")));
        button6.setOnClickListener(v -> editText.setText((editText.getText() + "6")));
        button7.setOnClickListener(v -> editText.setText((editText.getText() + "7")));
        button8.setOnClickListener(v -> editText.setText((editText.getText() + "8")));
        button9.setOnClickListener(v -> editText.setText((editText.getText() + "9")));

        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (editText == null) {
                    editText.setText("");
                } else {
                    value1 = Float.parseFloat(editText.getText() + "");
                    add = true;
                    editText.setText(null);
                }
            }
        });

        buttonSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (editText == null) {
                    editText.setText("");
                } else {
                    value1 = Float.parseFloat(editText.getText() + "");
                    sub = true;
                    editText.setText(null);
                }
            }
        });

        buttonMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (editText == null) {
                    editText.setText("");
                } else {
                    value1 = Float.parseFloat(editText.getText() + "");
                    mul = true;
                    editText.setText(null);
                }
            }
        });

        buttonDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (editText == null) {
                    editText.setText("");
                } else {
                    value1 = Float.parseFloat(editText.getText() + "");
                    div = true;
                    editText.setText(null);
                }
            }
        });

        buttonDecimal.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                editText.setText(editText.getText()+".");
            }
        });

        buttonC.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                editText.setText("");
            }
        });

        buttonEqual.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                value2 = Float.parseFloat(editText.getText()+"");

                if(add==true)
                {
                    editText.setText((value1+value2)+"");
                    add=false;
                }
                if(sub==true)
                {
                    editText.setText((value1-value2)+"");
                    sub=false;
                }
                if(mul==true)
                {
                    editText.setText((value1*value2)+"");
                    mul=false;
                }
                if(add==true)
                {
                    editText.setText((value1/value2)+"");
                    div=false;
                }
            }
        });


        }
    }