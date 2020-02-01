package com.tutorials.hp.swipetabslistview.mData;

/**
 * Created by Oclemmy on 5/9/2016 for ProgrammingWizards Channel and http://www.Camposha.com.
 */
public class TVShow {

    String name;
    String descripcion;
    String ponente;
    String aula;
    String hora;
    int image;

    public TVShow(String name, String descripcion, String ponente, String aula, String hora, int image) {
        this.name = name;
        this.descripcion = descripcion;
        this.ponente=ponente;
        this.aula=aula;
        this.hora=hora;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getPonente() {
        return ponente;
    }

    public String getAula() {
        return aula;
    }

    public String getHora() {
        return hora;
    }

    public int getImage() {
        return image;
    }
}
