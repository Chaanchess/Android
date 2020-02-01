package com.example.conecta4;

import androidx.appcompat.app.AppCompatActivity;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;

public class Preferencias extends AppCompatActivity {

    public final  static  String PLAY_MUSIC_KEY = "music";
    public final  static  boolean PLAY_MUSIC_DEFAULT = true;
    public final  static  String PLAYER_INITIAL_KEY = "jugadorInicial";
    public final  static  String PLAYER_INITIAL_DEFAULT = "";
    public final  static  String PLAYER_NAME_KEY = "";
    public final  static  String PLAYER_NAME_DEFAULT = "Jugador";


    public  void  onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preferencias);

        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        preferenciasFragment fragment = new preferenciasFragment();
        fragmentTransaction.replace(android.R.id.content, fragment);
        fragmentTransaction.commit();

    }
}
