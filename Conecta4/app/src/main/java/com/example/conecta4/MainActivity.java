package com.example.conecta4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Game game;
    public Musica music;
    private ImageButton imageButtonFicha;

    private final int ids[][] = {
            {R.id.f0c0Button,R.id.f0c1Button,R.id.f0c2Button,R.id.f0c3Button,R.id.f0c4Button,R.id.f0c5Button,R.id.f0c6Button},
            {R.id.f1c0Button,R.id.f1c1Button,R.id.f1c2Button,R.id.f1c3Button,R.id.f1c4Button,R.id.f1c5Button,R.id.f1c6Button},
            {R.id.f2c0Button,R.id.f2c1Button,R.id.f2c2Button,R.id.f2c3Button,R.id.f2c4Button,R.id.f2c5Button,R.id.f2c6Button},
            {R.id.f3c0Button,R.id.f3c1Button,R.id.f3c2Button,R.id.f3c3Button,R.id.f3c4Button,R.id.f3c5Button,R.id.f3c6Button},
            {R.id.f4c0Button,R.id.f4c1Button,R.id.f4c2Button,R.id.f4c3Button,R.id.f4c4Button,R.id.f4c5Button,R.id.f4c6Button},
            {R.id.f5c0Button,R.id.f5c1Button,R.id.f5c2Button,R.id.f5c3Button,R.id.f5c4Button,R.id.f5c5Button,R.id.f5c6Button},
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        game = new Game(2);
    }


    @Override
    public void onClick(View view) {

    }


    public void pulsado(View v){
        int id = v.getId();
        int turno = game.getTurno();
        Coordenada coordenada = new Coordenada(0,0);
        coordenada = coorJuego(id);
        if(game.colCompleta(coordenada.getColumna())){
            Toast toast1 =
                    Toast.makeText(getApplicationContext(),
                            R.string.noFichas, Toast.LENGTH_SHORT);

            toast1.show();
        }else{
            if(game.actualizaTablero(coordenada)){
                dibujaFicha(coordenada, turno);
                if(game.jugadaGanadora(coordenada)== 0 || game.jugadaGanadora(coordenada)== 1 || game.jugadaGanadora(coordenada)== 2 || game.jugadaGanadora(coordenada)== 3){
                    Toast toast2 =
                            Toast.makeText(getApplicationContext(),
                                    R.string.gana + game.getTurno(), Toast.LENGTH_SHORT);

                    toast2.show();
                }
                game.cambiarTurno();
            }
        }

    }

    private void dibujaFicha(Coordenada coordenada, int jugador) {
        int fila = coordenada.getFila();
        int columna = coordenada.getColumna();

        int id = ids[fila][columna];
        ImageButton imageButton = (ImageButton) findViewById(id);

        if (jugador == game.jugador) {
            if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE) {
                imageButton.setImageDrawable(getResources().getDrawable(R.drawable.ficha_jugadorland));
            } else {
                imageButton.setImageDrawable(getResources().getDrawable(R.drawable.ficha_jugador));
            }
        }
        if (jugador == game.maquina) {
            if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE) {
                imageButton.setImageDrawable(getResources().getDrawable(R.drawable.ficha_maquinaland));
            } else {
                imageButton.setImageDrawable(getResources().getDrawable(R.drawable.ficha_maquina));
            }
        }
    }

    private Coordenada coorJuego(int id) {
        int fila = 0;
        int columna = 0;
        for (int i = 0; i < Game.nFilas; i++){
            for (int j = 0; j < Game.nColumnas; j++){
                if(ids[i][j] == id){
                    fila=i;
                    columna = j;
                }
            }
        }
        fila = game.filSelect(columna);
        Coordenada coordenada = new Coordenada(fila,columna);
        return coordenada;
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        outState.putString("TABLERO",game.tableroToString());
        outState.putInt("TURNO",game.getTurno());
        super.onSaveInstanceState(outState);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        game.stringToTablero(savedInstanceState.getString("TABLERO"));
        game.setTurno(savedInstanceState.getInt("TURNO"));
        dibujarTablero();
        super.onRestoreInstanceState(savedInstanceState);
    }

    private void dibujarTablero() {
        for(int i = 0; i<Game.nFilas;i++) {
            for (int j = 0; j < Game.nColumnas; j++) {
                Coordenada coordenada = new Coordenada(i,j);
                dibujaFicha(coordenada,game.tablero[i][j]);
            }
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.option_about:
                startActivity(new Intent(this, About.class));
                return true;
            case R.id.option_mensaje:
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_SEND);
                intent.putExtra(Intent.EXTRA_TEXT, R.string.juegayDiviertete);
                intent.setType("text/plain");
                startActivity(Intent.createChooser(intent, "Compartir"));
                return true;
            case R.id.option_preferencias:
                startActivity(new Intent(this, preferenciasFragment.class));
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    @Override
    protected void onResume() {
        super.onResume();
           Boolean play = false;
        SharedPreferences sharedPreferences =
                PreferenceManager.getDefaultSharedPreferences(this);
        if(sharedPreferences.contains(Preferencias.PLAY_MUSIC_KEY))
            play = sharedPreferences.getBoolean(Preferencias.PLAY_MUSIC_KEY,
                    Preferencias.PLAY_MUSIC_DEFAULT);
        if(play==true){
            Musica.play(this, R.raw.sans);
        }
    }

    @Override
    protected void onPause() {
        super.onPause();
            music.stop(this);
    }




}
