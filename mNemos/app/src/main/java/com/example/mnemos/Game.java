package com.example.mnemos;
import android.app.Activity;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collections;

public class Game extends Activity {
    ImageButton bt1, bt2, bt3, bt4,
                bt5, bt6, bt7, bt8,
                bt9, bt10, bt11, bt12,
                bt13, bt14, bt15, bt16,
                bt17, bt18, bt19, bt20,
                bt21, bt22, bt23, bt24,
                bt25, bt26, bt27, bt28,
                bt29, bt30, bt31, bt32;

    int imagenes[];
    ImageButton[] fichas = new ImageButton[32];
    int fondo;
    ArrayList<Integer> arrayFichasMezcladas;
    ImageButton primero;

    int fichaPrimera, fichaSegunda;

    boolean bloqueo = false;

    final Handler handler = new Handler();
    int aciertos = 0;
    long tInicio;
    long tFinal;
    long tDiferencia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.game);
        cargarImagenes();
        iniciar();
    }

    public void cargarImagenes() {
        imagenes = new int[]{
                R.drawable.ficha1,
                R.drawable.ficha2,
                R.drawable.ficha3,
                R.drawable.ficha4,
                R.drawable.ficha5,
                R.drawable.ficha6,
                R.drawable.ficha7,
                R.drawable.ficha8,
                R.drawable.ficha9,
                R.drawable.ficha10,
                R.drawable.ficha12,
                R.drawable.ficha14,
                R.drawable.ficha15,
                R.drawable.ficha16,
                R.drawable.ficha17,
                R.drawable.ficha18
        };

        fondo = R.drawable.fondo;
    }

    public ArrayList<Integer> mezclar(int longitud) {
        ArrayList arrayParaMezclar = new ArrayList<Integer>();
        for (int i = 0; i < longitud; i++)
            arrayParaMezclar.add(i % longitud / 2);
        Collections.shuffle(arrayParaMezclar);
        return arrayParaMezclar;
    }

    public void asignaBoton() {
        bt1 = (ImageButton) findViewById(R.id.boton00);
        fichas[0] = bt1;
        bt2 = (ImageButton) findViewById(R.id.boton01);
        fichas[1] = bt2;
        bt3 = (ImageButton) findViewById(R.id.boton02);
        fichas[2] = bt3;
        bt4 = (ImageButton) findViewById(R.id.boton03);
        fichas[3] = bt4;
        bt5 = (ImageButton) findViewById(R.id.boton04);
        fichas[4] = bt5;
        bt6 = (ImageButton) findViewById(R.id.boton05);
        fichas[5] = bt6;
        bt7 = (ImageButton) findViewById(R.id.boton06);
        fichas[6] = bt7;
        bt8 = (ImageButton) findViewById(R.id.boton07);
        fichas[7] = bt8;
        bt9 = (ImageButton) findViewById(R.id.boton08);
        fichas[8] = bt9;
        bt10 = (ImageButton) findViewById(R.id.boton09);
        fichas[9] = bt10;
        bt11 = (ImageButton) findViewById(R.id.boton10);
        fichas[10] = bt11;
        bt12 = (ImageButton) findViewById(R.id.boton11);
        fichas[11] = bt12;
        bt13 = (ImageButton) findViewById(R.id.boton12);
        fichas[12] = bt13;
        bt14 = (ImageButton) findViewById(R.id.boton13);
        fichas[13] = bt14;
        bt15 = (ImageButton) findViewById(R.id.boton14);
        fichas[14] = bt15;
        bt16 = (ImageButton) findViewById(R.id.boton15);
        fichas[15] = bt16;
        bt17 = (ImageButton) findViewById(R.id.boton16);
        fichas[16] = bt17;
        bt18 = (ImageButton) findViewById(R.id.boton17);
        fichas[17] = bt18;
        bt19 = (ImageButton) findViewById(R.id.boton18);
        fichas[18] = bt19;
        bt20 = (ImageButton) findViewById(R.id.boton19);
        fichas[19] = bt20;
        bt21 = (ImageButton) findViewById(R.id.boton20);
        fichas[20] = bt21;
        bt22 = (ImageButton) findViewById(R.id.boton21);
        fichas[21] = bt22;
        bt23 = (ImageButton) findViewById(R.id.boton22);
        fichas[22] = bt23;
        bt24 = (ImageButton) findViewById(R.id.boton23);
        fichas[23] = bt24;
        bt25 = (ImageButton) findViewById(R.id.boton24);
        fichas[24] = bt25;
        bt26 = (ImageButton) findViewById(R.id.boton25);
        fichas[25] = bt26;
        bt27 = (ImageButton) findViewById(R.id.boton26);
        fichas[26] = bt27;
        bt28 = (ImageButton) findViewById(R.id.boton27);
        fichas[27] = bt28;
        bt29 = (ImageButton) findViewById(R.id.boton28);
        fichas[28] = bt29;
        bt30 = (ImageButton) findViewById(R.id.boton29);
        fichas[29] = bt30;
        bt31 = (ImageButton) findViewById(R.id.boton30);
        fichas[30] = bt31;
        bt32 = (ImageButton) findViewById(R.id.boton31);
        fichas[31] = bt32;
    }

    public void compruebaFicha(int i, final ImageButton imageBtn){

        if(primero==null){

            primero = imageBtn;

            primero.setScaleType(ImageView.ScaleType.CENTER_CROP);
            primero.setImageResource(imagenes[arrayFichasMezcladas.get(i)]);

            primero.setEnabled(false);

            fichaPrimera=arrayFichasMezcladas.get(i);
        }else{

            bloqueo=true;
            imageBtn.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageBtn.setImageResource(imagenes[arrayFichasMezcladas.get(i)]);
            imageBtn.setEnabled(false);
            fichaSegunda=arrayFichasMezcladas.get(i);

            if(fichaPrimera==fichaSegunda){
                primero=null;
                bloqueo=false;
                SoundPool soundPool = new SoundPool(5, AudioManager.STREAM_MUSIC, 0);
                int soundId = soundPool.load(this, R.raw.correcto, 1);
                soundPool.play(soundId, 1, 1, 0, 0, 1);

                aciertos++;
                if(aciertos==16){
                    tFinal = System.currentTimeMillis();
                    tDiferencia = tFinal - tInicio;
                    Toast toast = Toast.makeText(getApplicationContext(), "¡Has ganado en "+tDiferencia/1000+" segundos!", Toast.LENGTH_LONG);
                    toast.show();
                }
            }else{
                SoundPool soundPool2 = new SoundPool(5, AudioManager.STREAM_MUSIC, 0);
                int soundId2 = soundPool2.load(this, R.raw.fallo, 1);
                soundPool2.play(soundId2, 1, 1, 0, 0, 1);
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {


                        primero.setScaleType(ImageView.ScaleType.CENTER_CROP);
                        primero.setImageResource(R.drawable.fondo);
                        imageBtn.setScaleType(ImageView.ScaleType.CENTER_CROP);
                        imageBtn.setImageResource(R.drawable.fondo);

                        primero.setEnabled(true);
                        imageBtn.setEnabled(true);

                        primero = null;
                        bloqueo = false;
                    }
                }, 1000);
            }
        }

    }

    public void iniciar(){
        tInicio = System.currentTimeMillis();
        arrayFichasMezcladas = mezclar(imagenes.length*2);
        asignaBoton();

        for (int i = 0; i < fichas.length; i++) {
            fichas[i].setScaleType(ImageView.ScaleType.CENTER_CROP);
            fichas[i].setImageResource(fondo);
        }


        for(int i=0; i <arrayFichasMezcladas.size(); i++){
            final int j=i;
            fichas[i].setEnabled(true);
            fichas[i].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(!bloqueo)
                        compruebaFicha(j, fichas[j]);
                }
            });
        }
        aciertos=0;
    }
}
