package com.example.android_calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Region;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.button.MaterialButton;

import org.w3c.dom.Text;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {
    String srcn = "";
    boolean dothack = true;
    double num1, num2, resu;
    char op;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //region Controlers
        Button div = (Button)findViewById(R.id.button_divide);
        Button mul = (Button)findViewById(R.id.button_multiply);
        Button sum = (Button)findViewById(R.id.button_plus);
        Button res = (Button)findViewById(R.id.button_minus);
        Button ac = (Button)findViewById(R.id.button_ac);
        Button eq = (Button)findViewById(R.id.button_equals);
        Button dot = (Button)findViewById(R.id.button_dot);
        TextView screen = (TextView)findViewById(R.id.result);
        //endregion
        //region Numbers
        Button n1 = (Button)findViewById(R.id.button_1);
        Button n2 = (Button)findViewById(R.id.button_2);
        Button n3 = (Button)findViewById(R.id.button_3);
        Button n4 = (Button)findViewById(R.id.button_4);
        Button n5 = (Button)findViewById(R.id.button_5);
        Button n6 = (Button)findViewById(R.id.button_6);
        Button n7 = (Button)findViewById(R.id.button_7);
        Button n8 = (Button)findViewById(R.id.button_8);
        Button n9 = (Button)findViewById(R.id.button_9);
        Button n0 = (Button)findViewById(R.id.button_0);
        //endregion Numbers
        //region NumOnText
        n1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(srcn.equals("")){
                    screen.setText("1");
                    srcn = "1";
                }
                else{
                    srcn = srcn + "1";
                    screen.setText(srcn);
                }
            }
        });
        n2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(srcn.equals("")){
                    screen.setText("2");
                    srcn = "2";
                }
                else{
                    srcn = srcn + "2";
                    screen.setText(srcn);
                }
            }
        });
        n3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(srcn.equals("")){
                    screen.setText("3");
                    srcn = "3";
                }
                else{
                    srcn = srcn + "3";
                    screen.setText(srcn);
                }
            }
        });
        n4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(srcn.equals("")){
                    screen.setText("4");
                    srcn = "4";
                }
                else{
                    srcn = srcn + "4";
                    screen.setText(srcn);
                }
            }
        });
        n5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(srcn.equals("")){
                    screen.setText("5");
                    srcn = "5";
                }
                else{
                    srcn = srcn + "5";
                    screen.setText(srcn);
                }
            }
        });
        n6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(srcn.equals("")){
                    screen.setText("6");
                    srcn = "6";
                }
                else{
                    srcn = srcn + "6";
                    screen.setText(srcn);
                }
            }
        });
        n7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(srcn.equals("")){
                    screen.setText("7");
                    srcn = "7";
                }
                else{
                    srcn = srcn + "7";
                    screen.setText(srcn);
                }
            }
        });
        n8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(srcn.equals("")){
                    screen.setText("8");
                    srcn = "8";
                }
                else{
                    srcn = srcn + "2";
                    screen.setText(srcn);
                }
            }
        });
        n9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(srcn.equals("")){
                    screen.setText("9");
                    srcn = "9";
                }
                else{
                    srcn = srcn + "9";
                    screen.setText(srcn);
                }
            }
        });
        n0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(srcn.equals("")){
                    screen.setText("");
                }
                else{
                    srcn = srcn + "0";
                    screen.setText(srcn);
                }
            }
        });
        //endregion
        //region ControllersFunc
        ac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                srcn = "";
                num1 = 0;
                num2 = 0;
                dothack = true;
                screen.setText("");
            }
        });
        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(dothack) {
                    if (srcn.equals("")) {
                        screen.setText("0.");
                        srcn = "0.";
                        dothack = false;
                    } else {
                        srcn = srcn + ".";
                        screen.setText(srcn);
                        dothack = false;
                    }
                }
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    num1 = Double.parseDouble(screen.getText().toString());
                    screen.setText("");
                    op = '/';
                    srcn = "";
                }
                catch (Exception e){
                    num1 = 0;
                    screen.setText("");
                    op = '/';
                    srcn = "";
                }
            }
        });
        sum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    num1 = Double.parseDouble(screen.getText().toString());
                    screen.setText("");
                    op = '+';
                    srcn = "";
                }
                catch (Exception e){
                    num1 = 0;
                    screen.setText("");
                    op = '+';
                    srcn = "";
                }
            }
        });
        res.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    num1 = Double.parseDouble(screen.getText().toString());
                    screen.setText("");
                    op = '-';
                    srcn = "";
                }
                catch (Exception e){
                    num1 = 0;
                    screen.setText("");
                    op = '-';
                    srcn = "";
                }
            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    num1 = Double.parseDouble(screen.getText().toString());
                    screen.setText("");
                    op = '*';
                    srcn = "";
                }
                catch (Exception e){
                    num1 = 0;
                    screen.setText("");
                    op = '*';
                    srcn = "";
                }
            }
        });
        eq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    num2 = Double.parseDouble(screen.getText().toString());
                }catch (Exception e){
                    num2 = 0;
                }
                dothack = true;
                switch (op){
                    case '+':
                        resu = num1 + num2;
                        srcn = "";
                        screen.setText(String.valueOf(resu));
                        break;
                    case '-':
                        resu = num1 - num2;
                        srcn = "";
                        screen.setText(String.valueOf(resu));
                        break;
                    case '*':
                        resu = num1 * num2;
                        srcn = "";
                        screen.setText(String.valueOf(resu));
                        break;
                    case '/':
                        resu = num1 / num2;
                        srcn = "";
                        screen.setText(String.valueOf(resu));
                        break;
                }
            }
        });
        //endregion
    }

}