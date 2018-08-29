package com.angel.alberto.calculadoraxd;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends Activity {
    public double n1=0;
    public double n2=0;
    public boolean pto=false;
    public boolean ene1=false;
    public int ope=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnsiete=(Button) findViewById(R.id.btn7);
        Button btnocho=(Button) findViewById(R.id.btn8);
        Button btnnueve=(Button) findViewById(R.id.btn9);
        Button btnce=(Button) findViewById(R.id.btnce);
        Button btncuatro=(Button) findViewById(R.id.btn4);
        Button btncinco=(Button) findViewById(R.id.btn5);
        Button btnseis=(Button) findViewById(R.id.btn6);
        Button btnmas=(Button) findViewById(R.id.btnmas);
        Button btnuno=(Button) findViewById(R.id.btn1);
        Button btndos=(Button) findViewById(R.id.btn2);
        Button btntres=(Button) findViewById(R.id.btn3);
        Button btnmenos=(Button) findViewById(R.id.btnmenos);
        Button btnpunto=(Button) findViewById(R.id.btnpunto);
        Button btnzero=(Button) findViewById(R.id.btncero);
        Button btnentre=(Button) findViewById(R.id.btnentre);
        Button btnpor=(Button) findViewById(R.id.btnpor);
        Button btnigual=(Button) findViewById(R.id.btnigual);




        btnsiete.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                TextView txtMsj=(TextView) findViewById(R.id.txtNumeros);
                txtMsj.setText(txtMsj.getText()+"7");
            }
        });
        btnocho.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                TextView txtMsj=(TextView) findViewById(R.id.txtNumeros);
                txtMsj.setText(txtMsj.getText()+"8");
            }
        });
        btnnueve.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                TextView txtMsj=(TextView) findViewById(R.id.txtNumeros);
                txtMsj.setText(txtMsj.getText()+"9");
            }
        });
        btncuatro.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                TextView txtMsj=(TextView) findViewById(R.id.txtNumeros);
                txtMsj.setText(txtMsj.getText()+"4");
            }
        });
        btncinco.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                TextView txtMsj=(TextView) findViewById(R.id.txtNumeros);
                txtMsj.setText(txtMsj.getText()+"5");
            }
        });
        btnseis.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                TextView txtMsj=(TextView) findViewById(R.id.txtNumeros);
                txtMsj.setText(txtMsj.getText()+"6");
            }
        });
        btnuno.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                TextView txtMsj=(TextView) findViewById(R.id.txtNumeros);
                txtMsj.setText(txtMsj.getText()+"1");
            }
        });
        btndos.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                TextView txtMsj=(TextView) findViewById(R.id.txtNumeros);
                txtMsj.setText(txtMsj.getText()+"2");
            }
        });
        btntres.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                TextView txtMsj=(TextView) findViewById(R.id.txtNumeros);
                txtMsj.setText(txtMsj.getText()+"3");
            }
        });
        btnzero.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                TextView txtMsj=(TextView) findViewById(R.id.txtNumeros);
                txtMsj.setText(txtMsj.getText()+"0");
            }
        });
        //////////////////////////////////////////////////////////////////////////////---------------------
        btnmas.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                TextView txtMsj=(TextView) findViewById(R.id.txtNumeros);
                n1= Double.parseDouble(txtMsj.getText()+"");
                txtMsj.setText("");
                ene1=true;
                ope=1;
                pto=false;
            }
        });
        btnmenos.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                TextView txtMsj=(TextView) findViewById(R.id.txtNumeros);
                n1= Double.parseDouble(txtMsj.getText()+"");
                txtMsj.setText("");
                ene1=true;
                ope=2;
                pto=false;
            }
        });
        btnpor.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                TextView txtMsj=(TextView) findViewById(R.id.txtNumeros);
                n1= Double.parseDouble(txtMsj.getText()+"");
                txtMsj.setText("");
                ene1=true;
                ope=3;
                pto=false;
            }
        });
        btnentre.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                TextView txtMsj=(TextView) findViewById(R.id.txtNumeros);
                n1= Double.parseDouble(txtMsj.getText()+"");
                txtMsj.setText("");
                ene1=true;
                ope=4;
                pto=false;

            }
        });

        btnigual.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if (ene1){
                    double res=0;
                TextView txtMsj=(TextView) findViewById(R.id.txtNumeros);
                    n2= Double.parseDouble(txtMsj.getText()+"");
                switch (ope){
                    case 1:
                        res= n1+n2;
                        txtMsj.setText(res+"");
                        break;

                    case 2:
                        res= n1-n2;
                        txtMsj.setText(res+"");
                        break;
                    case 3:
                        res= n1*n2;
                        txtMsj.setText(res+"");
                        break;
                    case 4:
                        res= n1/n2;
                        txtMsj.setText(res+"");
                        break;
                }
                n1=0;
                n2=0;
                pto=false;
                ene1=false;

                }
            }
        });
        btnce.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                TextView txtMsj=(TextView) findViewById(R.id.txtNumeros);
                txtMsj.setText("");
                n1=0;
                n2=0;
                ene1=false;
                pto=false;

            }
        });

        btnpunto.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                TextView txtMsj=(TextView) findViewById(R.id.txtNumeros);
                if (!pto) {

                    txtMsj.setText(txtMsj.getText() + ".");
                    pto=true;


                }
            }
        });



    }


}
