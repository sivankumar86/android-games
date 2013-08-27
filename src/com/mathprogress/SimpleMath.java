package com.mathprogress;

import android.app.Activity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;



/**
 * Created by siva on 8/25/13.
 */
public class SimpleMath extends Activity {


    private EditText _result;
    private TextView _firstValue;
    private TextView _secondValue;
    private TextView _thirdValue;
    private TextView _forthValue;
    private TextView _cfirstValue;
    private TextView _csecondValue;
    private TextView _cthirdValue;
    private TextView _status;
    private Button _submit;
    private Button _reset;
    private int _avalue;
    private int _dvalue;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.simplegame);
        setInitialvalue();
        setallvalues();
        _result = (EditText) findViewById(R.id.answer);
        _submit = (Button) findViewById(R.id.Button01);
        _reset = (Button) findViewById(R.id.Button02);
//Adding listener to button
        _submit.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
//Getting first & second values and passing to show result
                showResult(_result.getText());
            }
        });
        //Adding listener to button
        _reset.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                setInitialvalue();
                setallvalues();
            }
        });
    }

    private void setallvalues() {
        _firstValue = (TextView) findViewById(R.id.first);
        _status = (TextView) findViewById(R.id.status);
        _firstValue.setText(Integer.toString(_avalue));
        _secondValue = (TextView) findViewById(R.id.second);
        _secondValue.setText(Integer.toString(_avalue*_dvalue));
        _thirdValue = (TextView) findViewById(R.id.third);
        _thirdValue.setText(Integer.toString(_avalue*2*_dvalue));
        _forthValue = (TextView) findViewById(R.id.fourth);
        _forthValue.setText("?");
        setoptions();
    }

    private void setoptions(){

        _cfirstValue = (TextView) findViewById(R.id.cfirst);
        _cfirstValue.setText(Integer.toString(_avalue*3*_dvalue+20));
        _csecondValue = (TextView) findViewById(R.id.csecond);
        _csecondValue.setText(Integer.toString(_avalue*3*_dvalue+10));
        _cthirdValue = (TextView) findViewById(R.id.cthird);
        _cthirdValue.setText(Integer.toString(_avalue*3*_dvalue));


    }

    //Showing multiply results
    protected void showResult(Editable first)
    {
        int num1 = Integer.parseInt(first.toString());
        int result=_avalue*3*_dvalue;
        if(num1==result){
            _status.setText("Correct !");
        }
        else{
            _status.setText("Wrong !");
        }
        _forthValue.setText(Integer.toString(result));
        //float num2 = Float.parseFloat(second.toString());
        //float result = num1 * num2;
        //_result.setText(String.valueOf(result));
    }

    private void setInitialvalue(){

        _avalue=5 + (int)(Math.random() * ((15 - 5) + 1));
        _dvalue=10 + (int)(Math.random() * ((25 - 10) + 1));
    }







}
