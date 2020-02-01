package com.tutorials.hp.swipetabslistview.mFragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.tutorials.hp.swipetabslistview.R;
import com.tutorials.hp.swipetabslistview.mData.TVShow;
import com.tutorials.hp.swipetabslistview.mListView.CustomAdapter;

import java.util.ArrayList;

/**
 * Created by Oclemmy on 5/9/2016 for ProgrammingWizards Channel and http://www.Camposha.com.
 */
public class ViernesFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView=inflater.inflate(R.layout.drama_frgament,container,false);

        ListView lv= (ListView) rootView.findViewById(R.id.dramaListView);
        CustomAdapter adapter=new CustomAdapter(this.getActivity(),getDramaMovies());
        lv.setAdapter(adapter);

        return rootView;
    }


    private ArrayList<TVShow> getDramaMovies() {
        ArrayList<TVShow> movies=new ArrayList<>();
        //SINGLE MOVIE
        TVShow tvShow=new TVShow("Rickinillo, el poder de la terquedad humana",
                "C+H*A= Todos dicen que no, pues mi terquedad dice que sí. Forma de afrontar la vida de systemas y seguridad, no muriendo en el intento y algunas veces triunfando.",
                "Manu Hidalgo",
                "\uD83D\uDCCDSUM",
                "8:20-9:20 ⌛",
                R.drawable.hidalgo);
        movies.add(tvShow);

        tvShow=new TVShow("Anti Virus - El despertar del Exploit",
                "Aprenderemos cómo evadir los antivirus a través de técnicas de camuflaje de payloads y enseñaremos algunos métodos para la ocultación de exploits en imágenes o PDF con el fin de engañar a los usuarios finales.",
                "Verónica Berenguer","\uD83D\uDCCDSUM",
                "9:20-10:20 ⌛"
                ,R.drawable.veronica);
        movies.add(tvShow);

        tvShow=new TVShow("Dockers Reboot",
                "Un reinicio y vuelta a empezar con dockers, intentando explicar ansible y todo lo que podamos.",
                "Juan José Martínez González","\uD83D\uDCCDSUM",
                "10:20-11:15 ⌛"
                ,R.drawable.gonzalez);
        movies.add(tvShow);

        tvShow=new TVShow("Low energy hacking",
                "Uso de hardware de bajo consumo para hacking, con ejemplos prácticos con placas reducidas, microcontroladores y algunos usos que se le pueden dar a este tipo de dispositivos y componentes.",
                "Miguel Ángel Arroyo","\uD83D\uDCCDSUM",
                "12:45-13:45 ⌛"
                ,R.drawable.arroyo);
        movies.add(tvShow);

        tvShow=new TVShow("Jornadas de relación y valoración de capacidades a través del Juego",
                "La LanParty Sngular Córdoba, actividad que realiza mensualmente en sus instalaciones, este año llega a las Sysmana 2020! Realizaremos 2 tracks simultáneos: juegos de mesa, y juegos indie / clásicos. Podremos conocernos mejor y valorar mejor la capacidad / habilidades de nuestros compañeros de juego.",
                "\nJose María Romero","\uD83D\uDCCDT112",
                "12:45-14:45 ⌛"
                ,R.drawable.sngular);
        movies.add(tvShow);

        return movies;
    }

    @Override
    public String toString() {
        return "Viernes";
    }
}