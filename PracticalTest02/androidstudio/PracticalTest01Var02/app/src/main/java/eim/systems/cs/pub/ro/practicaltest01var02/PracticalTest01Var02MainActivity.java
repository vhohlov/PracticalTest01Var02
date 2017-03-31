package eim.systems.cs.pub.ro.practicaltest01var02;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import static android.R.attr.phoneNumber;

public class PracticalTest01Var02MainActivity extends AppCompatActivity {


    private EditText non_edit;
    private Button plusButton;
    private Button minusButton;
    private EditText edit1;
    private EditText edit2;
    private String setText;

    private ButtonClickListener ButtonClickListener = new ButtonClickListener();
    private class ButtonClickListener implements View.OnClickListener {
        @Override
        public void onClick(View view) {

            int nr1 = Integer.parseInt(edit1.getText().toString());
            int nr2 = Integer.parseInt(edit2.getText().toString());
            int ans;


            if (((Button)view).getText().toString().equals("+")) {
                ans = nr1 + nr2;
                setText = nr1 + "+" + nr2 + " = " + ans;
            }

            if (((Button)view).getText().toString().equals("-")) {
                ans = nr1 - nr2;
                setText = nr1 + "+" + nr2  + " = " + ans;
            }

            non_edit.setText(setText);
        }
    }




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practical_test01_var02_main);

        non_edit = (EditText) findViewById(R.id.non_edit_text);
        edit1 = (EditText) findViewById(R.id.text1);
        edit2 = (EditText) findViewById(R.id.text2);
        plusButton = (Button) findViewById(R.id.plus_button);
        minusButton = (Button) findViewById(R.id.minus_button);
        plusButton.setOnClickListener(ButtonClickListener);
        minusButton.setOnClickListener(ButtonClickListener);

    }


/*
    protected void onSaveInstanceState(Bundle savedInstanceState) {
        savedInstanceState.putString("on", leftEditText.getText().toString());
        savedInstanceState.putString("rightCount", rightEditText.getText().toString());
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        if (savedInstanceState.containsKey("leftCount")) {
            leftEditText.setText(savedInstanceState.getString("leftCount"));
        } else {
            leftEditText.setText(String.valueOf(0));
        }
        if (savedInstanceState.containsKey("rightCount")) {
            rightEditText.setText(savedInstanceState.getString("rightCount"));
        } else {
            rightEditText.setText(String.valueOf(0));
        }
    }
    */

}
