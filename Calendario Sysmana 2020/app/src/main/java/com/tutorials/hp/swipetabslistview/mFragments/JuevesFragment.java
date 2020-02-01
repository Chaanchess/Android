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
public class JuevesFragment extends Fragment {
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

        TVShow tvShow=new TVShow("Adios VirtualBox, Hola Nube (AWS)",
                "\n\nMigración de servicios a la nube (AWS), instlacion de dos pilas LAMP, una base de datos, y un balanceador de carga",
                "Jorge Rodríguez Mora\nJuan Pavón Vázquez\nFrancisco Alberto Torres Higuera",
                "\uD83D\uDCCDSUM",
                "8:30-9:30 ⌛",
                R.drawable.aws);
        movies.add(tvShow);

        tvShow=new TVShow("Introducción a web components con NextJS",
                "Introducción a web components con NextJS",
                "Miguel Ángel Gavilán","\uD83D\uDCCDT115",
                "8:20-9:20 ⌛"
                ,R.drawable.gavilan);
        movies.add(tvShow);

        tvShow=new TVShow("React para muggles: Redux, Storybook y otros trucos para hacer magia en el frontend",
                "Aprenderemos lo básico para comprender cómo funciona React, además de algunos trucos muggles que harán que nuestro trabajo con esta librería parezca magia. Aprenderemos a crear componentes fantásticos sin caer en las artes oscuras",
                "\n\nNieves Borrero","\uD83D\uDCCDT115",
                "9:20-10:20 ⌛"
                ,R.drawable.nieves);
        movies.add(tvShow);

        tvShow=new TVShow("Qubit (bit cuántico)",
                "El auge en ciencia y en informática nos ha llevado a poder expresar la información en el lenguaje mismo que se expresa los más elemental del universo, sus partículas. Poder entender los principios de la mecánica cuántica nos abre un abanico de posibilidades en informática, pues podemos dejar atrás el clásico sistema binario, en el que solo existen dos opciones, a un infinito de posibilidades, contenidas entre esos dos únicos valores clásicos (0 y 1), aumentando de manera el número de procesos complejos simultáneos que pueden realizarse en un ordenador.",
                "Rafael Siles","\uD83D\uDCCDSUM",
                "9:30-10:20 ⌛"
                ,R.drawable.qbit);
        movies.add(tvShow);

        tvShow=new TVShow("Desmárcate con una buena marca personal",
                "Nos esforzamos muy mucho en la nuestra formación técnica, pero para llegar al trabajo que deseamos necesitamos llamar la atención y desmarcarnos de los demás. Tras trabajar en varios procesos de selección en distintas empresas internacionales vamos a repasar todo lo que se puede hacer para demostrar lo que valemos antes incluso de ser entrevistados por la empresa en la que queremos trabajar.",
                "Javier Aguirre","\uD83D\uDCCDSUM",
                "10:20-11:15 ⌛"
                ,R.drawable.aguirre);
        movies.add(tvShow);

        tvShow=new TVShow("Tips para optimizar tu web y convertirla en una PWA",
                "Taller donde se indicarán una serie de buenas prácticas para optimizar tu sitio web y además convertirlo en una PWA y así llevarlo a otro nivel.",
                "Jesús Mejías","\uD83D\uDCCDT116",
                "11:45-12:45 ⌛"
                ,R.drawable.mejias);
        movies.add(tvShow);

        tvShow=new TVShow("SONS OF ELK",
                "\n\n\n\nPresentación y demostración de como instalar un clúster ELK en UNIX. Configuración de este conjunto de herramientas de gran potencial, las cuales combinadas realizan una eficiente gestión de registros.",
                "Alfonso López López\nJose David Villegas Mendoza\nFrancisco Zamorano Zamorano\nPablo Murillo Ávila\nJosé Jiménez Romero","\uD83D\uDCCDSUM",
                "11:45-12:45 ⌛"
                ,R.drawable.elk);
        movies.add(tvShow);

        tvShow=new TVShow("El día a día de la lucha contra el malware",
                "Hablaremos sobre la lucha contra el malware, porque siguen produciéndose grandes incidentes de seguridad y las limitaciones de las soluciones del mercado junto a algunas soluciones innovadoras.",
                "Adrián Rodríguez","\uD83D\uDCCDSUM",
                "12:45-13:25 ⌛"
                ,R.drawable.garcia);
        movies.add(tvShow);

        tvShow=new TVShow("Soc: el secreto de la seguridad",
                "Conoceremos lo que es un SOC (Centros de Operaciones de Seguridad) y sus principales funciones como el  seguimiento y análisis de la actividad en redes, servidores, puntos finales, bases de datos, aplicaciones, sitios web y otros sistemas, siempre buscando actividades anómalas que puedan ser indicativas de un incidente o compromiso de seguridad.",
                "Fernando Muñoz","\uD83D\uDCCDSUM",
                "13:25-14:05 ⌛"
                ,R.drawable.espejo);
        movies.add(tvShow);

        tvShow=new TVShow("Ingenia. Búsqueda de empleo y cómo entrenar para una entrevista de trabajo.",
                "Conoce más acerca de Ingenia. Realidad del mercado laboral: búsqueda de empleo y entrenamiento para afrontar una entrevista de trabajo.",
                "\nÁngela López Muñoz","\uD83D\uDCCDSUM",
                "14:05-14:45 ⌛"
                ,R.drawable.angela);
        movies.add(tvShow);

        return movies;
    }

    @Override
    public String toString() {
        return "Jueves";
    }
}