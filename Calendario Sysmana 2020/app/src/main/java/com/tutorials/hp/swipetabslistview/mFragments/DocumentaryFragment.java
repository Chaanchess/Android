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
public class DocumentaryFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView=inflater.inflate(R.layout.documentary_fragment,container,false);

        ListView lv= (ListView) rootView.findViewById(R.id.docsListView);
        CustomAdapter adapter=new CustomAdapter(this.getActivity(),getDocumentaries());

        lv.setAdapter(adapter);
        return rootView;
    }
    private ArrayList<TVShow> getDocumentaries() {
        ArrayList<TVShow> movies=new ArrayList<>();
        //SINGLE MOVIE
        TVShow tvShow=new TVShow("Creamos API Rest con NodeJS y de paso croquetas",
                "Creamos una API Rest en un momentito, con NodeJS y Express",
                "Emanuel Fontalba",
                "\uD83D\uDCCDT116",
                "8:30-10:00 ⌛",
                R.drawable.emmanuel);
        movies.add(tvShow);

        tvShow=new TVShow("Taller Raspberry (asistente voz)",
                "\nEl taller consistirá en instalar y configurar en una Raspberry el software necesario para convertirla en un asistente de voz similar a Alexa o Google Home.",
                "Juan José Gil Luna\nFco. Javier Rodríguez Méndez","\uD83D\uDCCDSUM",
                "8:30-10:00 ⌛"
                ,R.drawable.raps);
        movies.add(tvShow);

        tvShow=new TVShow("Drones Low Cost",
                "Drones Low Cost",
                "Daniel Verdú","\uD83D\uDCCDSUM",
                "10:00-11:00 ⌛"
                ,R.drawable.blasinfante);
        movies.add(tvShow);

        tvShow=new TVShow("La Desinformación: Qué es y Cómo nos afecta",
                "Estudiaremos el fenómeno de la desinformación (las mal llamadas Fake News), su importancia y difusión. Cómo funcionan, qué forma tienen, cómo se difunden, quién las emiten y qué trabajo hacemos desde MALDITA.ES",
                "Stephen M. Grueso (Maldita.es)","\uD83D\uDCCDSUM",
                "11:45-12:45 ⌛"
                ,R.drawable.maldita);
        movies.add(tvShow);

        tvShow=new TVShow("Mesa redonda: Fake News",
                "\n\nMesa redonda: Fake News; que no te la cuelen",
                "Stephen M. Grueso(Maldita.es)\nAlfonso Alba Cuesta(Cordópolis)\nMª Eugenia Vilches(Cadena Ser)","\uD83D\uDCCDSUM",
                "12:45-14:45 ⌛"
                ,R.drawable.fakenew);
        movies.add(tvShow);

        return movies;
    }

    @Override
    public String toString() {
        return "Miérc.";
    }
}
