package mx.edu.utr.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    String btnNumber;
    String Operator;
    float n1, n2, result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView txtInput = findViewById(R.id.txtInput);
        final TextView txtSolution = findViewById(R.id.txtSolution);

        final Button btnZero =  findViewById(R.id.btnZero);
        final Button btnOne =  findViewById(R.id.btnOne);
        final Button btnTwo =  findViewById(R.id.btnTwo);
        final Button btnThree =  findViewById(R.id.btnThree);
        final Button btnFour =  findViewById(R.id.btnFour);
        final Button btnFive =  findViewById(R.id.btnFive);
        final Button btnSix =  findViewById(R.id.btnSix);
        final Button btnSeven =  findViewById(R.id.btnSeven);
        final Button btnEight =  findViewById(R.id.btnEight);
        final Button btnNine =  findViewById(R.id.btnNine);
        final Button btnEquals =  findViewById(R.id.btnEquals);
        final Button btnAdd =  findViewById(R.id.btnAdd);
        final Button btnSubstract =  findViewById(R.id.btnSubtract);
        final Button btnMultiply =  findViewById(R.id.btnMultiply);
        final Button btnDivide =  findViewById(R.id.btnDivide);
        final Button btnDecimal =  findViewById(R.id.btnDecimal);
        final Button btnBack =  findViewById(R.id.btnBack);
        final Button btnClear =  findViewById(R.id.btnClear);


        btnZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnNumber = btnZero.getText().toString();
                txtInput.setText(txtInput.getText() + btnNumber);
            }
        });

        btnOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnNumber = btnOne.getText().toString();
                txtInput.setText(txtInput.getText() + btnNumber);
            }
        });

        btnTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnNumber = btnTwo.getText().toString();
                txtInput.setText(txtInput.getText() + btnNumber);
            }
        });

        btnThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnNumber = btnThree.getText().toString();
                txtInput.setText(txtInput.getText() + btnNumber);
            }
        });

        btnFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnNumber = btnFour.getText().toString();
                txtInput.setText(txtInput.getText() + btnNumber);
            }
        });

        btnFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnNumber = btnFive.getText().toString();
                txtInput.setText(txtInput.getText() + btnNumber);
            }
        });

        btnSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnNumber = btnSix.getText().toString();
                txtInput.setText(txtInput.getText() + btnNumber);
            }
        });

        btnSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnNumber = btnSeven.getText().toString();
                txtInput.setText(txtInput.getText() + btnNumber);
            }
        });

        btnEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnNumber = btnEight.getText().toString();
                txtInput.setText(txtInput.getText() + btnNumber);
            }
        });

        btnNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnNumber = btnNine.getText().toString();
                txtInput.setText(txtInput.getText() + btnNumber);
            }
        });

        btnDecimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnNumber = btnDecimal.getText().toString();
                txtInput.setText(txtInput.getText() + btnNumber);
            }
        });

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               if(!(txtInput.getText().equals(""))){
                   Operator = "+";
                   txtSolution.setText(txtInput.getText());
                   txtInput.setText("");
               }else{
                   //nada
               }
            }
        });

        btnSubstract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!(txtInput.getText().equals(""))){
                    Operator = "-";
                    txtSolution.setText(txtInput.getText());
                    txtInput.setText("");
                }else{
                    //nada
                }
            }
        });

        btnMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!(txtInput.getText().equals(""))){
                    Operator = "*";
                    txtSolution.setText(txtInput.getText());
                    txtInput.setText("");
                }else{
                    //nada
                }
            }
        });
    //
        btnDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!(txtInput.getText().equals(""))){
                    Operator = "/";
                    txtSolution.setText(txtInput.getText());
                    txtInput.setText("");
                }else{
                    //nada
                }
            }
        });

        btnEquals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                switch(Operator){
                    case "+":
                        n1 = Float.parseFloat(txtSolution.getText().toString());
                        n2 = Float.parseFloat(txtInput.getText().toString());
                        result = Operations.add(n1,n2);
                        txtSolution.setText(String.valueOf(result));
                        txtInput.setText("");
                        break;
                    case "-":
                        n1 = Float.parseFloat(txtSolution.getText().toString());
                        n2 = Float.parseFloat(txtInput.getText().toString());
                        result = Operations.subs(n1,n2);
                        txtSolution.setText(String.valueOf(result));
                        txtInput.setText("");
                        break;
                    case"*":
                        n1 = Float.parseFloat(txtSolution.getText().toString());
                        n2 = Float.parseFloat(txtInput.getText().toString());
                        result = Operations.mult(n1,n2);
                        txtSolution.setText(String.valueOf(result));
                        txtInput.setText("");
                        break;
                    case"/":
                        n1 = Float.parseFloat(txtSolution.getText().toString());
                        n2 = Float.parseFloat(txtInput.getText().toString());
                        result = Operations.div(n1,n2);
                        txtSolution.setText(String.valueOf(result));
                        txtInput.setText("");
                        break;

                }
            }
        });

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(!(txtInput.getText().equals(""))) {
                    txtInput.setText(txtInput.getText().subSequence(0, txtInput.getText().length() - 1));
                }else{
                    txtInput.setText("");
                }
            }
        });

        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               n1 = 0;
               n2 = 0;
               result = 0;
               btnNumber = "";
               txtInput.setText("");
               txtSolution.setText("");
            }
        });

    }
}
