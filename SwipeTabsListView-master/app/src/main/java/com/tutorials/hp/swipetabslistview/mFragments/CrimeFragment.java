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
public class CrimeFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView=inflater.inflate(R.layout.crime_fragment,container,false);

        ListView lv= (ListView) rootView.findViewById(R.id.crimeListView);
        CustomAdapter adapter=new CustomAdapter(this.getActivity(),getCrimeMovies());
        lv.setAdapter(adapter);


        return rootView;
    }

    private ArrayList<TVShow> getCrimeMovies() {
        //COLECTION OF CRIME MOVIES
        ArrayList<TVShow> movies=new ArrayList<>();

        //SINGLE MOVIE
        TVShow tvShow=new TVShow("Red Hat OpenShift",
                "Cómo puede ayudar a desarrolladores y admin. de sistemas Red Hat OpenShift, una plataforma de aplicaciones en contenedores completa que integra de manera nativa tecnologías, como Docker y Kubernetes —un poderoso sistema de administración y desarrollo de clústeres de contenedores—, y las combina con una base empresarial en Red Hat Enterprise Linux.",
                "Nacho Álvarez","\uD83D\uDCCDSUM","9:10-10:10 ⌛",R.drawable.nacho);

        //ADD ITR TO COLLECTION
        movies.add(tvShow);

        tvShow=new TVShow("Liberad a Willy 5","Proceso de despliegue continuo con Gitlab, Digital Ocean y Kubernetes",
                "Rafael Delgado","\uD83D\uDCCDT112","10:10-11:10 ⌛",R.drawable.noslo);
        movies.add(tvShow);

        tvShow=new TVShow("aUXilio: usuarios en apuros","Breve introducción a la eXperiencia de Usuario",
                "Claudia López Iglesias","\uD83D\uDCCD115","10:10-11:10 ⌛",R.drawable.auxilio);
        movies.add(tvShow);

        tvShow=new TVShow("Crea tu perfil profesional con React y Firebase",
                "Utilizando el servicio de Google Firebase y las librerías React de front, construiremos una webapp con tu porfolio profesional publicado.",
                "Juan Calero","\uD83D\uDCCDSUM","11:50-12:50 ⌛",R.drawable.calero);
        movies.add(tvShow);

        tvShow=new TVShow("La Administración de Sistemas y el Cambio Climático",
                "La Administración de Sistemas y el Cambio Climático",
                "Oscar Martín Martínez","\uD83D\uDCCDSUM","12:50-13:40 ⌛"
                ,R.drawable.kaos);
        movies.add(tvShow);

        tvShow=new TVShow("Integración continua GITlab y Docker",
                "Introducción a quién es Dobuss y posteriormente se explicará de forma básica como trabajamos con un control de versiones y como automatizar un despliegue continuo de nuestras aplicaciones en un entorno de producción utilizando contenedores.",
                "Miguel Angel Piedras y José Huertas","\uD83D\uDCCDSUM","13:40-14:40 ⌛"
                ,R.drawable.dobuss);
        movies.add(tvShow);
        return movies;
    }

    @Override
    public String toString() {
        String title="Lunes";
        return title;
    }
}
