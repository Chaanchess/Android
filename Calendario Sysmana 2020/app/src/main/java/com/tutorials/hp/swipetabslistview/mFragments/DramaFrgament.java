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
public class DramaFrgament extends Fragment {
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
        TVShow tvShow=new TVShow("Taller de Microbit",
                "Taller de microbit basado en la resolución de pequeños retos, donde se pueden poner en práctica y aprender programación de forma, divertido y al alcance de todos.",
                "Manuel Jiménez y Álvaro Molina Ayuso","\uD83D\uDCCDT116",
                "8:30-11:15 ⌛",
                R.drawable.microbit);

        //ADD ITR TO COLLECTION
        movies.add(tvShow);
        tvShow=new TVShow("Top Web Hacking",
                "En esta ponencia vamos a conocer cuáles son las vulnerabilidades web más comunes siguiendo el top 10 de OWASP y aprenderemos a explotarlas.",
                "Rafael Sojo","\uD83D\uDCCDSUM","8:30-9:30 ⌛"
                ,R.drawable.sojo);
        movies.add(tvShow);

        tvShow=new TVShow("Pishing en la escuela",
                "¿Qué es el Phishing? ¿Me afecta? Durante esta charla veremos ejemplos reales de ataques de phishing y qué técnicas utilizan para recopilar información de nosotros una vez que hemos sido 'pescados'.",
                "Rafael López","\uD83D\uDCCDSUM","9:30-10:10 ⌛"
                ,R.drawable.lopez);
        movies.add(tvShow);

        tvShow=new TVShow("Técnicas de intrusión con Powershell y BadUsb",
                "Potencial de un ataque con un BadUsb de bajo coste unido a la ejecución de código PowerShell. Veremos como se puede comprometer una máquina en segundos por no tener las medidas de seguridad adecuadas. Todo ello con un dispositivo que cualquiera puede conseguir por 1€ y haciendo uso de Arduino y Powershell. La seguridad física importa y mucho, pues puede ser tu equipo el que ya esté comprometido sin que tú lo sepas.",
                "Eduardo Sánchez Toril","\uD83D\uDCCDSUM",
                "10:15-11:15 ⌛"
                ,R.drawable.eduardo);
        movies.add(tvShow);

        tvShow=new TVShow("Encriptación y búsqueda por campos encriptados en BBDD",
                "Charla sobre como encriptar datos de forma segura, para ser almacenados en BBDD y poder realizar, posteriormente, búsquedas sobre los mismos, sin afectar de forma brusca al rendimiento de la aplicación.",
                "Alejandro Arrabal","\uD83D\uDCCDSUM",
                "11:45-12:45 ⌛"
                ,R.drawable.arrabal);
        movies.add(tvShow);

        tvShow=new TVShow("DevOps (Development y Operations)",
                "Metodología de desarrollo de software que se centra en la comunicación, colaboración e integración entre desarrolladores de software y los profesionales de sistemas.",
                "Sergio Caballero","\uD83D\uDCCDSUM",
                "12:45-13:45 ⌛"
                ,R.drawable.caballero);
        movies.add(tvShow);

        tvShow=new TVShow("Machine Learning & BPMN",
                "Toma de decisiones automatizada y dinámica basada en procesos. Generar automáticamente árboles de decisión dinámicos (basados en el conjunto de datos) que puedan aprender, ser evaluados y pregunten al usuario por el valor de alguna característica que desconozcan para continuar con su clasificación.",
                "Jesús Gil Cabezas","\uD83D\uDCCDSUM",
                "13:45-14:45 ⌛"
                ,R.drawable.cabeas);
        movies.add(tvShow);

        return movies;
    }

    @Override
    public String toString() {
        return "Martes";
    }
}
