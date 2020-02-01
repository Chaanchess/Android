package com.example.proyectobaloncesto;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int contadorRight, contadorLeft;
    private TextView marcadorLeft, marcadorRight,nEquipo1,nEquipo2;
    private long then = 0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        String equipo1Name = getIntent().getExtras().getString("equipo1");
        String equipo2Name = getIntent().getExtras().getString("equipo2");
        contadorRight=0;
        contadorLeft=0;

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        marcadorLeft = (TextView) findViewById(R.id.txtMarcLeft);
        marcadorRight = (TextView) findViewById(R.id.txtMarcRight);
        nEquipo1 = (TextView) findViewById(R.id.textEquipo1);
        nEquipo1.setText(equipo1Name.toUpperCase());
        nEquipo2 = (TextView) findViewById(R.id.textEquipo2);
        nEquipo2.setText(equipo2Name.toUpperCase());
        Button btn3Left = (Button) findViewById(R.id.btn3left);
        Button btn3Right = (Button) findViewById(R.id.btn3right);
        Button btn2Left = findViewById(R.id.btn2left);
        Button btn2Right = (Button) findViewById(R.id.btn2right);
        Button btn1Left = (Button) findViewById(R.id.btn1left);
        Button btn1Right = (Button) findViewById(R.id.btn1right);
        Button btnReiniciar = (Button) findViewById(R.id.btnRein);
        Button btn1UpLeft = (Button) findViewById(R.id.btnLeftSubir1);
        Button btn1DownLeft = (Button) findViewById(R.id.btnLeftBajar1);
        Button btn1UpRight = (Button) findViewById(R.id.btnRightSubir1);
        Button btn1DownRight = (Button) findViewById(R.id.btnRightBajar1);

        btn2Right.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v){
                contadorRight=contadorRight+2;
                marcadorRight.setText(Integer.toString(contadorRight));
                Toast toast1 =
                        Toast.makeText(getApplicationContext(),
                                "¡Canasta!", Toast.LENGTH_SHORT);

                toast1.show();
            }
        });

        btn2Left.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v){
                contadorLeft=contadorLeft+2;
                marcadorLeft.setText(Integer.toString(contadorLeft));
                Toast toast1 =
                        Toast.makeText(getApplicationContext(),
                                "¡Canasta!", Toast.LENGTH_SHORT);

                toast1.show();
            }
        });

        btn1Left.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v){
                contadorLeft=contadorLeft+1;
                marcadorLeft.setText(Integer.toString(contadorLeft));
                Toast toast1 =
                        Toast.makeText(getApplicationContext(),
                                "¡Canasta!", Toast.LENGTH_SHORT);

                toast1.show();
            }
        });

        btn1Right.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v){
                contadorRight=contadorRight+1;
                marcadorRight.setText(Integer.toString(contadorRight));
                Toast toast1 =
                        Toast.makeText(getApplicationContext(),
                                "¡Canasta!", Toast.LENGTH_SHORT);

                toast1.show();
            }
        });

        btn3Right.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v){
                contadorRight=contadorRight+3;
                marcadorRight.setText(Integer.toString(contadorRight));
                Toast toast1 =
                        Toast.makeText(getApplicationContext(),
                                "¡Canasta!", Toast.LENGTH_SHORT);

                toast1.show();
            }
        });

        btn3Left.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v){
                contadorLeft=contadorLeft+3;
                marcadorLeft.setText(Integer.toString(contadorLeft));
                Toast toast1 =
                        Toast.makeText(getApplicationContext(),
                                "¡Canasta!", Toast.LENGTH_SHORT);

                toast1.show();
            }
        });

        btn1DownLeft.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v){
                contadorLeft=contadorLeft-1;
                marcadorLeft.setText(Integer.toString(contadorLeft));
            }
        });

        btn1UpLeft.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v){
                contadorLeft=contadorLeft+1;
                marcadorLeft.setText(Integer.toString(contadorLeft));
            }
        });

        btn1UpRight.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v){
                contadorRight=contadorRight+1;
                marcadorRight.setText(Integer.toString(contadorRight));
            }
        });

        btn1DownRight.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v){
                contadorRight=contadorRight-1;
                marcadorRight.setText(Integer.toString(contadorRight));
            }
        });


        btnReiniciar.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v){
                DialogInterface.OnClickListener dialogClickListener = new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        switch (which){
                            case DialogInterface.BUTTON_POSITIVE:
                                contadorRight=0;
                                contadorLeft=0;
                                marcadorRight.setText(Integer.toString(contadorRight));
                                marcadorLeft.setText(Integer.toString(contadorLeft));
                                Toast toast1 =
                                        Toast.makeText(getApplicationContext(),
                                                "¡El partido empieza de nuevo!", Toast.LENGTH_SHORT);

                                toast1.show();
                                break;

                            case DialogInterface.BUTTON_NEGATIVE:
                                //No button clicked
                                break;
                        }
                    }
                };

                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setMessage("¿De verdad deseas reiniciar el partido?").setPositiveButton("Si", dialogClickListener)
                        .setNegativeButton("No", dialogClickListener).show();
            }

        });

    }
}
