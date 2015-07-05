package com.karthil.calculator;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;


public class MainCalculator extends ActionBarActivity {

    protected String str = "0";
    protected String str1 = str;
    protected char[] char2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_calculator);






        TextView screenView = (TextView)findViewById(R.id.screenView);

        Button button1 = (Button)findViewById(R.id.button1);
        button1.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v) {
                        str = str.concat("1");
                        TextView screenView = (TextView)findViewById(R.id.screenView);
                        screenView.setText(strToStr1(str));
                    }
                }
        );

        Button button2 = (Button)findViewById(R.id.button2);
        button2.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v) {
                        str = str.concat("2");
                        TextView screenView = (TextView)findViewById(R.id.screenView);
                        screenView.setText(strToStr1(str));
                    }
                }
        );


        Button button3 = (Button)findViewById(R.id.button3);
        button3.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v) {
                        str = str.concat("3");
                        TextView screenView = (TextView)findViewById(R.id.screenView);
                        screenView.setText(strToStr1(str));
                    }
                }
        );

        Button button4 = (Button)findViewById(R.id.button4);
        button4.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v) {
                        str = str.concat("4");
                        TextView screenView = (TextView)findViewById(R.id.screenView);
                        screenView.setText(strToStr1(str));
                    }
                }
        );

        Button button5 = (Button)findViewById(R.id.button5);
        button5.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v) {
                        str = str.concat("5");
                        TextView screenView = (TextView)findViewById(R.id.screenView);
                        screenView.setText(strToStr1(str));
                    }
                }
        );

        Button button6 = (Button)findViewById(R.id.button6);
        button6.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v) {
                        str = str.concat("6");
                        TextView screenView = (TextView)findViewById(R.id.screenView);
                        screenView.setText(strToStr1(str));
                    }
                }
        );

        Button button7 = (Button)findViewById(R.id.button7);
        button7.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v) {
                        str = str.concat("7");
                        TextView screenView = (TextView)findViewById(R.id.screenView);
                        screenView.setText(strToStr1(str));
                    }
                }
        );

        Button button8 = (Button)findViewById(R.id.button8);
        button8.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v) {
                        str = str.concat("8");
                        TextView screenView = (TextView)findViewById(R.id.screenView);
                        screenView.setText(strToStr1(str));
                    }
                }
        );

        Button button9 = (Button)findViewById(R.id.button9);
        button9.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v) {
                        str = str.concat("9");
                        TextView screenView = (TextView)findViewById(R.id.screenView);
                        screenView.setText(strToStr1(str));
                    }
                }
        );

        Button button0 = (Button)findViewById(R.id.button0);
        button0.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v) {
                        str = str.concat("0");
                        TextView screenView = (TextView)findViewById(R.id.screenView);
                        screenView.setText(strToStr1(str));
                    }
                }
        );

        button0.setOnLongClickListener(
                new Button.OnLongClickListener() {
                    public boolean onLongClick(View view) {
                        str = str.concat(".");
                        TextView screenView = (TextView)findViewById(R.id.screenView);
                        screenView.setText(strToStr1(str));
                        return true;
                    }
                }
        );


        Button buttonC = (Button)findViewById(R.id.buttonC);
        buttonC.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v) {

                        if(str.length()>1) {
                            char[] charStr = str.toCharArray();
                            str = String.copyValueOf(charStr, 0, ((str.length() - 1)));
                            str1 = str.replace('%', '+');
                            str1 = str1.replace('&', '*');
                            char2 = str1.toCharArray();
                            str1 = String.copyValueOf(char2,1,((char2.length)-1));
                            TextView screenView = (TextView) findViewById(R.id.screenView);
                            screenView.setText(str1);
                        }



                    }
                }
        );


        buttonC.setOnLongClickListener(
                new Button.OnLongClickListener(){
                    public boolean onLongClick(View view){
                        str = "0";
                        str1 = str.replace('%','+');
                        str1 = str1.replace('&','*');
                        TextView screenView = (TextView)findViewById(R.id.screenView);
                        screenView.setText(str1);
                        return true;
                    }
                }
        );






        Button buttonPlus = (Button)findViewById(R.id.buttonPlus);
        buttonPlus.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v) {
                        str = str.concat("%");
                        TextView screenView = (TextView)findViewById(R.id.screenView);
                        screenView.setText(strToStr1(str));
                    }
                }
        );



        Button buttonMinus = (Button)findViewById(R.id.buttonMinus);
        buttonMinus.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v) {
                        str = str.concat("-");
                        TextView screenView = (TextView)findViewById(R.id.screenView);
                        screenView.setText(strToStr1(str));
                    }
                }
        );



        Button buttonMulti = (Button)findViewById(R.id.buttonMulti);
        buttonMulti.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v) {
                        str = str.concat("&");
                        TextView screenView = (TextView)findViewById(R.id.screenView);
                        screenView.setText(strToStr1(str));
                    }
                }
        );



        Button buttonDiv = (Button)findViewById(R.id.buttonDiv);
        buttonDiv.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v) {
                        str = str.concat("/");
                        TextView screenView = (TextView)findViewById(R.id.screenView);
                        screenView.setText(strToStr1(str));
                    }
                }
        );

        Button buttonEqual = (Button)findViewById(R.id.buttonEqual);
        buttonEqual.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v) {

                        TextView screenView = (TextView)findViewById(R.id.screenView);
                        str = Double.toString(calC(str));
                        str1 = "0";
                        str1 = str1.concat(str);
                        str = str1;
                        screenView.setText(strToStr1(str));
                    }
                }
        );


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main_calculator, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_about) {
            cal_search();
            return true;
        }

        else if (id == R.id.action_info){
            cal_info();
        }

        return super.onOptionsItemSelected(item);
    }

    private void cal_info() {

        Intent intent = new Intent(this,CalculatorInfo.class);
        startActivity(intent);
    }

    private void cal_search() {

        Intent intent = new Intent(this, CalculatorAbout.class);
        startActivity(intent);
    }








    public static Double calC(String input) {

        Double result = resMinus(input);
        return result;


    }


    public static ArrayList<String> splitMinus(String inputMinus){

        String[] strMinus;
        strMinus = inputMinus.split("-");
        ArrayList<String> arrMinus = new ArrayList<String>();
        for (String string : strMinus) {
            arrMinus.add(string);
        }

        return arrMinus;
    }

    public static Double resMinus(String input){
        ArrayList<String> res = new ArrayList<String>();

        ArrayList<Double> resDouble = new ArrayList<Double>();

        res = splitMinus(input);


        int count = 0;

        for (String string1 : res) {
            res.set(count, Double.toString(resPlus(string1)));
            count++;
        }



        for (String string : res) {
            resDouble.add(Double.parseDouble(string));
        }


        while (resDouble.size() != 1) {
            Double d = resDouble.get(0)-resDouble.get(1);
            resDouble.set(0,d);
            resDouble.remove(1);

        }

        return resDouble.get(0);
    }



    public static ArrayList<String> splitPlus(String input){

        String[] str;
        str = input.split("%");
        ArrayList<String> arr = new ArrayList<String>();
        for (String string : str) {
            arr.add(string);
        }

        return arr;
    }

    public static Double resPlus(String input){
        ArrayList<String> res = new ArrayList<String>();

        ArrayList<Double> resDouble = new ArrayList<Double>();

        res = splitPlus(input);

        int count = 0;

        for (String string1 : res) {
            res.set(count, Double.toString(resMulti(string1)));
            count++;
        }




        for (String string : res) {
            resDouble.add(Double.parseDouble(string));
        }


        while (resDouble.size() != 1) {
            Double d = resDouble.get(0)+resDouble.get(1);
            resDouble.set(0,d);
            resDouble.remove(1);

        }

        return resDouble.get(0);
    }




    public static ArrayList<String> splitMulti(String input){

        String[] str;
        str = input.split("&");
        ArrayList<String> arr = new ArrayList<String>();
        for (String string : str) {
            arr.add(string);
        }

        return arr;
    }

    public static Double resMulti(String input){
        ArrayList<String> res = new ArrayList<String>();

        ArrayList<Double> resDouble = new ArrayList<Double>();

        res = splitMulti(input);


        int count = 0;

        for (String string1 : res) {
            res.set(count, Double.toString(resDiv(string1)));
            count++;
        }






        for (String string : res) {
            resDouble.add(Double.parseDouble(string));
        }


        while (resDouble.size() != 1) {
            Double d = resDouble.get(0)*resDouble.get(1);
            resDouble.set(0,d);
            resDouble.remove(1);

        }

        return resDouble.get(0);
    }



    public static ArrayList<String> splitDiv(String input){

        String[] str;
        str = input.split("/");
        ArrayList<String> arr = new ArrayList<String>();
        for (String string : str) {
            arr.add(string);
        }

        return arr;
    }

    public static Double resDiv(String input){
        ArrayList<String> res = new ArrayList<String>();

        ArrayList<Double> resDouble = new ArrayList<Double>();

        res = splitDiv(input);

        for (String string : res) {
            resDouble.add(Double.parseDouble(string));
        }


        while (resDouble.size() != 1) {
            Double d = resDouble.get(0)/resDouble.get(1);
            resDouble.set(0,d);
            resDouble.remove(1);

        }

        return resDouble.get(0);
    }

    protected String strToStr1 (String string){
        str1 = string.replace('%', '+');
        str1 = str1.replace('&', '*');
        char2 = str1.toCharArray();
        if (char2[0]=='0') {
            str1 = String.copyValueOf(char2, 1, ((char2.length) - 1));
        }
        return str1;
    }






}
