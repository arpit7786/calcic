package arp.cal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button button0,button1,button2,button3,button4,button5,button6,button7,button8,button9,
            buttonAdd,buttonSub,buttonMul,buttonDivision,buttonC,buttonEqual,buttonDel,
            buttonDec,buttonMod;

    TextView edt1,edt2;

    float mValueOne , mValueTwo ,mValueThree;

    boolean mAddition , mSubtract ,mMultiplication ,mDivision ;

    int count = 0,count2 = 0,length,count3 = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button0 = (Button) findViewById(R.id.zero);
        button1 = (Button) findViewById(R.id.one);
        button2 = (Button) findViewById(R.id.two);
        button3 = (Button) findViewById(R.id.three);
        button4 = (Button) findViewById(R.id.four);
        button5 = (Button) findViewById(R.id.five);
        button6 = (Button) findViewById(R.id.six);
        button7 = (Button) findViewById(R.id.seven);
        button8 = (Button) findViewById(R.id.eight);
        button9 = (Button) findViewById(R.id.nine);
        buttonAdd = (Button) findViewById(R.id.add);
        buttonSub = (Button) findViewById(R.id.sub);
        buttonMul = (Button) findViewById(R.id.mul);
        buttonDivision = (Button) findViewById(R.id.div);
        buttonC = (Button) findViewById(R.id.clear);
        buttonEqual = (Button) findViewById(R.id.equal);
        edt1 = (TextView) findViewById(R.id.edt1);
        edt2 = (TextView) findViewById(R.id.edt2);
        buttonDel = (Button) findViewById(R.id.del);
        buttonDec = (Button) findViewById(R.id.dec);
        buttonMod = (Button) findViewById(R.id.mod);


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(count == 0) {
                    edt1.setText("1");
                    count++;
                }
                else {
                    edt1.setText(edt1.getText() + "1");
                }
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(count == 0) {
                    edt1.setText("2");
                    count++;
                }
                else {
                    edt1.setText(edt1.getText() + "2");
                }
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(count == 0) {
                    edt1.setText("3");
                    count++;
                }
                else {
                    edt1.setText(edt1.getText() + "3");
                }
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(count == 0) {
                    edt1.setText("4");
                    count++;
                }
                else {
                    edt1.setText(edt1.getText() + "4");
                }
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(count == 0) {
                    edt1.setText("5");
                    count++;
                }
                else {
                    edt1.setText(edt1.getText() + "5");
                }
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(count == 0) {
                    edt1.setText("6");
                    count++;
                }
                else {
                    edt1.setText(edt1.getText() + "6");
                }
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(count == 0) {
                    edt1.setText("7");
                    count++;
                }
                else {
                    edt1.setText(edt1.getText() + "7");
                }
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(count == 0) {
                    edt1.setText("8");
                    count++;
                }
                else {
                    edt1.setText(edt1.getText() + "8");
                }
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(count == 0) {
                    edt1.setText("9");
                    count++;
                }
                else {
                    edt1.setText(edt1.getText() + "9");
                }
            }
        });

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(count == 0) {
                    edt1.setText("0");
                    count++;
                }
                else {
                    edt1.setText(edt1.getText() + "0");
                }
            }
        });

        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(edt1.getText().length() <= 0) {
                    mValueOne = 0;
                    mAddition = true;
                    edt1.setText(null);
                }
                else {
                    mValueOne = Float.parseFloat(edt1.getText() + "");
                    mAddition = true;
                    edt1.setText(null);
                }

                count3 = 0;

            }
        });

        buttonSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(edt1.getText().length() <= 0) {
                    mValueOne = 0;
                    mSubtract = true;
                    edt1.setText(null);
                }
                else {
                    mValueOne = Float.parseFloat(edt1.getText() + "");
                    mSubtract = true;
                    edt1.setText(null);
                }

                count3 = 0;
            }
        });

        buttonMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(edt1.getText().length() <= 0) {
                    mValueOne = 0;
                    mMultiplication = true;
                    edt1.setText(null);
                }
                else {
                    mValueOne = Float.parseFloat(edt1.getText() + "");
                    mMultiplication = true;
                    edt1.setText(null);
                }

                count3 = 0;
            }
        });

        buttonDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(edt1.getText().length() <= 0) {
                    mValueOne = 0;
                    mDivision = true;
                    edt1.setText(null);
                }
                else {
                    mValueOne = Float.parseFloat(edt1.getText() + "");
                    mDivision = true;
                    edt1.setText(null);
                }

                count3 = 0;
            }
        });

        buttonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueTwo = Float.parseFloat(edt1.getText() + "");

                if (mAddition){

                    edt2.setText(mValueOne + mValueTwo +"");
                    mAddition=false;
                }


                if (mSubtract){
                    edt2.setText(mValueOne - mValueTwo+"");
                    mSubtract=false;
                }

                if (mMultiplication){
                    edt2.setText(mValueOne * mValueTwo+"");
                    mMultiplication=false;
                }

                if (mDivision){
                    edt2.setText(mValueOne / mValueTwo+"");
                    mDivision=false;
                }
            }
        });

        buttonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

             if(count2 == 0) {
                 edt1.setText("");
                 count2++;
             }
             else if(count2 == 1) {
                 edt2.setText("");
                 count2--;
             }
             else
                 count2 = 0;

             count3 = 0;

            }
        });

        buttonDel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                length = edt1.getText().length();

                if(length <= 0)
                    edt1.setText(" ");
                else {
                    edt1.setText(edt1.getText().subSequence(0,length-1));
                }

                count3 = 0;
            }
        });

        buttonDec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mValueThree = Float.parseFloat(edt1.getText() + "");
                count3++;

                while(mValueThree != 0){
                    if ((char)(mValueThree%10) == '.')
                        count3 = 2;
                    mValueThree = mValueThree/10;
                }
                if (edt1.getText().length() > 0 && count3 == 1)
                    edt1.setText(edt1.getText() + ".");

            }
        });

        buttonMod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                float newNum;

                newNum = Float.parseFloat(edt1.getText() + "");

                if(edt2.getText().length() <= 0)
                    edt1.setText(Float.toString(newNum / 100));
                else
                    edt2.setText(Float.toString(Float.parseFloat(edt2.getText() + "")));

            }
        });


        }
    }




