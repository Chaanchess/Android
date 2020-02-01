package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button btnCero ,btnUno, btnDos, btnTres, btnCuatro, btnCinco, btnSeis, btnSiete, btnOcho, btnNueve,
            btnSumar, btnRestar, btnMultiplicar, btnDividir, btnDeleteOne, btnBorrar, btnPunto, btnIgual;
    private EditText txtResultado;
    private Float valor1, valor2;
    private boolean suma, resta, multiplicacion, division;
    private String borradoIndividual;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtResultado=(EditText)findViewById(R.id.resultado);
        btnCero=(Button)findViewById(R.id.cero);
        btnUno=(Button)findViewById(R.id.uno);
        btnDos=(Button)findViewById(R.id.dos);
        btnTres=(Button)findViewById(R.id.tres);
        btnCuatro=(Button)findViewById(R.id.cuatro);
        btnCinco=(Button)findViewById(R.id.cinco);
        btnSeis=(Button)findViewById(R.id.seis);
        btnSiete=(Button)findViewById(R.id.siete);
        btnOcho=(Button)findViewById(R.id.ocho);
        btnNueve=(Button)findViewById(R.id.nueve);
        btnSumar=(Button)findViewById(R.id.sumar);
        btnRestar=(Button)findViewById(R.id.restar);
        btnMultiplicar=(Button)findViewById(R.id.multiplicar);
        btnDividir=(Button)findViewById(R.id.dividir);
        btnDeleteOne=(Button)findViewById(R.id.deleteOne);
        btnBorrar=(Button)findViewById(R.id.borrar);
        btnPunto=(Button)findViewById(R.id.punto);
        btnIgual=(Button)findViewById(R.id.igual);

        btnUno.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                txtResultado.setText(txtResultado.getText()+"1");
            }
        });

        btnDos.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                txtResultado.setText(txtResultado.getText()+"2");
            }
        });

        btnTres.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                txtResultado.setText(txtResultado.getText()+"3");
            }
        });

        btnCuatro.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                txtResultado.setText(txtResultado.getText()+"4");
            }
        });

        btnCinco.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                txtResultado.setText(txtResultado.getText()+"5");
            }
        });

        btnSeis.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                txtResultado.setText(txtResultado.getText()+"6");
            }
        });

        btnSiete.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                txtResultado.setText(txtResultado.getText()+"7");
            }
        });

        btnOcho.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                txtResultado.setText(txtResultado.getText()+"8");
            }
        });

        btnNueve.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                txtResultado.setText(txtResultado.getText()+"9");
            }
        });

        btnCero.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                txtResultado.setText(txtResultado.getText()+"0");
            }
        });

        btnSumar.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                if(txtResultado==null){
                    txtResultado.setText("");
                }else{
                    valor1=Float.parseFloat(txtResultado.getText()+"");
                    suma=true;
                    txtResultado.setText(null);
                }

            }
        });

        btnRestar.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                if(txtResultado==null){
                    txtResultado.setText("");
                }else{
                    valor1=Float.parseFloat(txtResultado.getText()+"");
                    resta=true;
                    txtResultado.setText(null);
                }
            }
        });

        btnMultiplicar.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                if(txtResultado==null){
                    txtResultado.setText("");
                }else{
                    valor1=Float.parseFloat(txtResultado.getText()+"");
                    multiplicacion=true;
                    txtResultado.setText(null);
                }
            }
        });

        btnDividir.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                if(txtResultado.getText().toString()==null){
                    txtResultado.setText("");
                }else{
                    valor1=Float.parseFloat(txtResultado.getText()+"");
                    division=true;
                    txtResultado.setText(null);
                }
            }
        });

        btnPunto.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                txtResultado.setText(txtResultado.getText()+".");
            }
        });

        btnDeleteOne.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                borradoIndividual=txtResultado.getText().toString();
                borradoIndividual=borradoIndividual.substring(0,borradoIndividual.length()-1);
                txtResultado.setText(borradoIndividual);
            }
        });

        btnBorrar.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                txtResultado.setText("");
            }
        });

        btnIgual.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                valor2=Float.parseFloat(txtResultado.getText()+"");

                if(suma==true){
                    txtResultado.setText(valor1+valor2+"");
                    suma=false;
                }

                if(resta==true){
                    txtResultado.setText(valor1-valor2+"");
                    resta=false;
                }

                if(multiplicacion==true){
                    txtResultado.setText(valor1*valor2+"");
                    multiplicacion=false;
                }

                if(division==true){
                    txtResultado.setText(valor1/valor2+"");
                    division=false;
                }
            }
        });


    }
}
