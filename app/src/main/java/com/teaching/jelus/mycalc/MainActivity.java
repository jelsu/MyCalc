package com.teaching.jelus.mycalc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private String result = "";
    private Calculation calculation;
    private Button numberZeroButton;
    private Button numberOneButton;
    private Button numberTwoButton;
    private Button numberThreeButton;
    private Button numberFourButton;
    private Button numberFiveButton;
    private Button numberSixButton;
    private Button numberSevenButton;
    private Button numberEightButton;
    private Button numberNineButton;
    private Button additionButton;
    private Button subtractionButton;
    private Button multiplicationButton;
    private Button divideButton;
    private Button clearButton;
    private Button deleteButton;
    private Button resultButton;
    private TextView resultView;
    private TextView statementView;
    private boolean inputAfterChoiceOperation = false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        calculation = new Calculation(0, 0);
        resultView = (TextView) findViewById(R.id.resultView);
        statementView = (TextView) findViewById(R.id.statementView);
        numberZeroButton = (Button) findViewById(R.id.numberZeroButton);
        numberOneButton = (Button) findViewById(R.id.numberOneButton);
        numberTwoButton = (Button) findViewById(R.id.numberTwoButton);
        numberThreeButton = (Button) findViewById(R.id.numberThreeButton);
        numberFourButton = (Button) findViewById(R.id.numberFourButton);
        numberFiveButton = (Button) findViewById(R.id.numberFiveButton);
        numberSixButton = (Button) findViewById(R.id.numberSixButton);
        numberSevenButton = (Button) findViewById(R.id.numberSevenButton);
        numberEightButton = (Button) findViewById(R.id.numberEightButton);
        numberNineButton = (Button) findViewById(R.id.numberNineButton);
        additionButton = (Button) findViewById(R.id.additionButton);
        subtractionButton = (Button) findViewById(R.id.subtractionButton);
        multiplicationButton = (Button) findViewById(R.id.multiplicationButton);
        divideButton = (Button) findViewById(R.id.divideButton);
        clearButton = (Button) findViewById(R.id.clearButton);
        deleteButton = (Button) findViewById(R.id.deleteButton);
        resultButton = (Button) findViewById(R.id.resultButton);
        numberZeroButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkInputAfterChoiceOperation();
                result = deleteExcessZero(resultView.getText().toString());
                resultView.setText(result + "0");
            }
        });
        numberOneButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkInputAfterChoiceOperation();
                result = deleteExcessZero(resultView.getText().toString());
                resultView.setText(result + "1");
            }
        });
        numberTwoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkInputAfterChoiceOperation();
                result = deleteExcessZero(resultView.getText().toString());
                resultView.setText(result + "2");
            }
        });
        numberThreeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkInputAfterChoiceOperation();
                result = deleteExcessZero(resultView.getText().toString());
                resultView.setText(result + "3");
            }
        });
        numberFourButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkInputAfterChoiceOperation();
                result = deleteExcessZero(resultView.getText().toString());
                resultView.setText(result + "4");
            }
        });
        numberFiveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkInputAfterChoiceOperation();
                result = deleteExcessZero(resultView.getText().toString());
                resultView.setText(result + "5");
            }
        });
        numberSixButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkInputAfterChoiceOperation();
                result = deleteExcessZero(resultView.getText().toString());
                resultView.setText(result + "6");

            }
        });
        numberSevenButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkInputAfterChoiceOperation();
                result = deleteExcessZero(resultView.getText().toString());
                resultView.setText(result + "7");
            }
        });
        numberEightButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkInputAfterChoiceOperation();
                result = deleteExcessZero(resultView.getText().toString());
                resultView.setText(result + "8");
            }
        });
        numberNineButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkInputAfterChoiceOperation();
                result = deleteExcessZero(resultView.getText().toString());
                resultView.setText(result + "9");
            }
        });
        clearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clearView();
            }
        });
        deleteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String result = resultView.getText().toString();
                if (result.length() > 0) {
                    result = result.substring(0, result.length() - 1);
                    resultView.setText(result);
                }
            }
        });
        additionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculation.setFirstArgument(Double.valueOf(resultView.getText().toString()));
                calculation.setTypeOfOperation(TypeOfOperation.ADDICTION);
                statementView.setText(String.valueOf("+ " + calculation.getFirstArgument()));
                inputAfterChoiceOperation = true;
            }
        });
        subtractionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculation.setFirstArgument(Double.valueOf(resultView.getText().toString()));
                calculation.setTypeOfOperation(TypeOfOperation.SUBTRACTION);
                statementView.setText(String.valueOf("- " + calculation.getFirstArgument()));
                inputAfterChoiceOperation = true;
            }
        });
        multiplicationButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculation.setFirstArgument(Double.valueOf(resultView.getText().toString()));
                calculation.setTypeOfOperation(TypeOfOperation.MULTIPLICATION);
                statementView.setText(String.valueOf("* " + calculation.getFirstArgument()));
                inputAfterChoiceOperation = true;
            }
        });
        divideButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculation.setFirstArgument(Double.valueOf(resultView.getText().toString()));
                calculation.setTypeOfOperation(TypeOfOperation.DIVIDE);
                statementView.setText(String.valueOf("/ " + calculation.getFirstArgument()));
                inputAfterChoiceOperation = true;
            }
        });
        resultButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculation.setSecondArgument(Double.valueOf(resultView.getText().toString()));
                clearView();
                switch (calculation.getTypeOfOperation())
                {
                    case ADDICTION:
                        resultView.setText(String.valueOf(calculation.additionOperation()));
                        break;
                    case SUBTRACTION:
                        resultView.setText(String.valueOf(calculation.subtractionOperation()));
                        break;
                    case MULTIPLICATION:
                        resultView.setText(String.valueOf(calculation.multiplicationOperation()));
                        break;
                    case DIVIDE:
                        resultView.setText(String.valueOf(calculation.divideOperation()));
                        break;
                    case NULL:
                        break;
                }
                calculation.setTypeOfOperation(TypeOfOperation.NULL);
                inputAfterChoiceOperation = true;
            }
        });
    }

    private boolean isInteger(double number){
        return (number % 1) == 0;
    }

    private long convertToLong(double number){
        return (long) number;
    }

    private void clearView(){
        resultView.setText("");
        statementView.setText("");
    }

    private void checkInputAfterChoiceOperation(){
        if (inputAfterChoiceOperation){
            resultView.setText("");
            inputAfterChoiceOperation = false;
        }
    }

    private String deleteExcessZero(String string){
        if (!string.equals("")){
            if (string.substring(0, 1).equals("0")){
                return string.substring(1, string.length());
            }
        }
        return string;
    }
}
