package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.res.TypedArrayUtils;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.GridView;
import android.widget.TextView;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button one, two, three, four, five, six, seven, eight, nine, zero,
    dot, equal, delete, divide, multiply, minus, plus;
    private TextView mCalculation, mResult;
    private ArrayList<String> calcultionText = new ArrayList<>();
    private ArrayList<String> firstNumber = new ArrayList<>();
    private ArrayList<String> secondNumber = new ArrayList<>();
    private String finalNumber1;
    private String finalNumber2;
    private boolean clicked = false;
    private boolean plus_clicked = false;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initials();

        Button[] number = {one, two, three, four, five, six, seven, eight, nine, zero, dot, equal,
                delete, divide, multiply, minus, plus};
        for(int i = 0; i < 17; i++) {
            number[i].setOnClickListener(this);
        }

        plus();

        deletePressed();

    }

    private void initials(){
        one = findViewById(R.id.btn_one);
        two = findViewById(R.id.btn_two);
        three = findViewById(R.id.btn_three);
        four = findViewById(R.id.btn_four);
        five = findViewById(R.id.btn_five);
        six = findViewById(R.id.btn_six);
        seven = findViewById(R.id.btn_seven);
        eight = findViewById(R.id.btn_eight);
        nine = findViewById(R.id.btn_nine);
        zero = findViewById(R.id.btn_zero);
        dot = findViewById(R.id.btn_dot);
        equal = findViewById(R.id.btn_equal);
        delete = findViewById(R.id.btn_del);
        divide = findViewById(R.id.btn_divide);
        multiply = findViewById(R.id.btn_multiply);
        minus = findViewById(R.id.btn_minus);
        plus = findViewById(R.id.btn_plus);
        mCalculation = findViewById(R.id.calculation);
        mResult = findViewById(R.id.result);
    }


    @Override
    public void onClick(View view) {

        switch (view.getId()){
            case R.id.btn_one:
                calcultionText.add("1");
                mCalculation.setText(" ");
                for (int i = 0; i < calcultionText.size(); i++){
                    mCalculation.append(calcultionText.get(i));
                }
                if(clicked) {
                    secondNumber.add("1");
                }else {
                    firstNumber.add("1");
                }
                break;
            case R.id.btn_two:
                calcultionText.add("2");
                mCalculation.setText(" ");
                for (int i = 0; i < calcultionText.size(); i++){
                    mCalculation.append(calcultionText.get(i));
                }
                if(clicked) {
                    secondNumber.add("2");
                }else {
                    firstNumber.add("2");
                }
                break;
            case R.id.btn_three:
                calcultionText.add("3");
                mCalculation.setText(" ");
                for (int i = 0; i < calcultionText.size(); i++){
                    mCalculation.append(calcultionText.get(i));
                }
                if(clicked) {
                    secondNumber.add("3");
                }else {
                    firstNumber.add("3");
                }
                break;
            case R.id.btn_four:
                calcultionText.add("4");
                firstNumber.add("4");
                mCalculation.setText(" ");
                for (int i = 0; i < calcultionText.size(); i++){
                    mCalculation.append(calcultionText.get(i));
                }
                break;
            case R.id.btn_five:
                calcultionText.add("5");
                firstNumber.add("5");
                mCalculation.setText(" ");
                for (int i = 0; i < calcultionText.size(); i++){
                    mCalculation.append(calcultionText.get(i));
                }
                break;
            case R.id.btn_six:
                calcultionText.add("6");
                firstNumber.add("6");
                mCalculation.setText(" ");
                for (int i = 0; i < calcultionText.size(); i++){
                    mCalculation.append(calcultionText.get(i));
                }
                break;
            case R.id.btn_seven:
                calcultionText.add("7");
                firstNumber.add("7");
                mCalculation.setText(" ");
                for (int i = 0; i < calcultionText.size(); i++){
                    mCalculation.append(calcultionText.get(i));
                }
                break;
            case R.id.btn_eight:
                calcultionText.add("8");
                firstNumber.add("8");
                mCalculation.setText(" ");
                for (int i = 0; i < calcultionText.size(); i++){
                    mCalculation.append(calcultionText.get(i));
                }
                break;
            case R.id.btn_nine:
                calcultionText.add("9");
                firstNumber.add("9");
                mCalculation.setText(" ");
                for (int i = 0; i < calcultionText.size(); i++){
                    mCalculation.append(calcultionText.get(i));
                }
                break;
            case R.id.btn_zero:
                calcultionText.add("0");
                firstNumber.add("0");
                mCalculation.setText(" ");
                for (int i = 0; i < calcultionText.size(); i++){
                    mCalculation.append(calcultionText.get(i));
                }
                break;

            case R.id.btn_dot:
                if(!calcultionText.contains(".")){
                    calcultionText.add(".");
                }
                mCalculation.setText(" ");
                for (int i = 0; i < calcultionText.size(); i++){
                    mCalculation.append(calcultionText.get(i));
                }
                break;
            case R.id.btn_divide:
                if(!(calcultionText.isEmpty()) && calcultionText.get(calcultionText.size() - 1).matches("[0-9]")) {
                    clicked = true;
                    calcultionText.add("÷");
                }
                mCalculation.setText(" ");
                for (int i = 0; i < calcultionText.size(); i++){
                    mCalculation.append(calcultionText.get(i));
                }
                break;
            case R.id.btn_multiply:
                if((!calcultionText.isEmpty()) && calcultionText.get(calcultionText.size()-1).matches("[0-9]")){
                    clicked = true;
                    calcultionText.add("×");
                }
                mCalculation.setText(" ");
                for (int i = 0; i < calcultionText.size(); i++){
                    mCalculation.append(calcultionText.get(i));
                }
                break;
            case R.id.btn_plus:
                if((!calcultionText.isEmpty()) && calcultionText.get(calcultionText.size()-1).matches("[0-9]")){
                    clicked = true;
                    plus_clicked = true;
                    calcultionText.add("+"); }
                mCalculation.setText(" ");
                for (int i = 0; i < calcultionText.size(); i++){
                    mCalculation.append(calcultionText.get(i));
                }
                break;
            case R.id.btn_minus:
                if((!calcultionText.isEmpty()) && calcultionText.get(calcultionText.size()-1).matches("[0-9]")) {
                    clicked = true;
                    calcultionText.add("-");
                }
                mCalculation.setText(" ");
                for (int i = 0; i < calcultionText.size(); i++){
                    mCalculation.append(calcultionText.get(i));
                }
                break;
            case R.id.btn_equal:
                mResult.setText(sum);
                break;
        }
    }

    private int plus(){
        StringBuilder builder1 = new StringBuilder();
        StringBuilder builder2 = new StringBuilder();
        for (String value : firstNumber) {
            builder1.append(value);
        }
        finalNumber1 = builder1.toString();
        for (String value : secondNumber) {
            builder2.append(value);
        }
        finalNumber2 = builder2.toString();
        if((!finalNumber1.isEmpty()) && (!firstNumber.isEmpty())) {
            int one = Integer.valueOf(finalNumber1);
            int two = Integer.valueOf(finalNumber2);
            if (plus_clicked) {
                int sum = one + two;
            }
        }

        return

    }

    private void deletePressed(){
        delete.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                calcultionText.clear();
                mCalculation.setText(" ");
                return true;
            }
        });
        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!calcultionText.isEmpty()){
                calcultionText.remove(calcultionText.size()-1);
                }
                mCalculation.setText(" ");
                for (int i = 0; i < calcultionText.size(); i++){
                    mCalculation.append(calcultionText.get(i));
                }
            }
        });
    }


}
