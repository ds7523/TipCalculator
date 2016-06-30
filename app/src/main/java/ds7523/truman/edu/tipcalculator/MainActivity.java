package ds7523.truman.edu.tipcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {

    EditText amountEnteredTextView;
    TextView tipCalculatedTextView;
    NumberFormat numberFormat = new DecimalFormat("#,###.00");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        amountEnteredTextView = (EditText) findViewById(R.id.inputAmount);
        tipCalculatedTextView = (TextView) findViewById(R.id.calculatedTip);

        Button calcTip15 = (Button) findViewById(R.id.tip15Percent);
        Button calcTip18 = (Button) findViewById(R.id.tip18Percent);
        Button calcTip20 = (Button) findViewById(R.id.tip20Percent);
        Button calcTip25 = (Button) findViewById(R.id.tip25Percent);
        Button calcTip30 = (Button) findViewById(R.id.tip30Percent);


        calcTip15.setOnClickListener(new View.OnClickListener(){
            float tipPercentage = 15;
            @Override
            public void onClick(View view){
                String amountStr = amountEnteredTextView.getText().toString();
                float amount;
                amount = !amountStr.equals("") ? Float.parseFloat(amountStr) : 0;
                float tipAmount = (tipPercentage / 100 )* amount;
                tipCalculatedTextView.setText(tipAmount == 0 ? "Calculated tip amount" : numberFormat.format(tipAmount));
            }
        });

        calcTip18.setOnClickListener(new View.OnClickListener(){
            float tipPercentage = 18;
            @Override
            public void onClick(View view){
                String amountStr = amountEnteredTextView.getText().toString();
                float amount;
                amount = !amountStr.equals("") ? Float.parseFloat(amountStr) : 0;
                float tipAmount = (tipPercentage / 100 )* amount;
                tipCalculatedTextView.setText(tipAmount == 0 ? "Calculated tip amount" : numberFormat.format(tipAmount));
            }
        });

        calcTip20.setOnClickListener(new View.OnClickListener(){
            float tipPercentage = 20;
            @Override
            public void onClick(View view){
                String amountStr = amountEnteredTextView.getText().toString();
                float amount;
                amount = !amountStr.equals("") ? Float.parseFloat(amountStr) : 0;
                float tipAmount = (tipPercentage / 100 )* amount;
                tipCalculatedTextView.setText(tipAmount == 0 ? "Calculated tip amount" : numberFormat.format(tipAmount));
            }
        });

        calcTip25.setOnClickListener(new View.OnClickListener(){
            float tipPercentage = 25;
            @Override
            public void onClick(View view){
                String amountStr = amountEnteredTextView.getText().toString();
                float amount;
                amount = !amountStr.equals("") ? Float.parseFloat(amountStr) : 0;
                float tipAmount = (tipPercentage / 100 )* amount;
                tipCalculatedTextView.setText(tipAmount == 0 ? "Calculated tip amount" : numberFormat.format(tipAmount));
            }
        });

        calcTip30.setOnClickListener(new View.OnClickListener(){
            float tipPercentage = 30;
            @Override
            public void onClick(View view){
                String amountStr = amountEnteredTextView.getText().toString();
                float amount;
                amount = !amountStr.equals("") ? Float.parseFloat(amountStr) : 0;
                float tipAmount = (tipPercentage / 100 )* amount;
                tipCalculatedTextView.setText(tipAmount == 0 ? "Calculated tip amount" : numberFormat.format(tipAmount));
            }
        });


    }
}
