package com.tutorials.hp.swipetabslistview.mListView;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.tutorials.hp.swipetabslistview.R;
import com.tutorials.hp.swipetabslistview.mData.TVShow;

import java.util.ArrayList;

/**
 * Created by Oclemmy on 5/9/2016 for ProgrammingWizards Channel and http://www.Camposha.com.
 */
public class CustomAdapter extends BaseAdapter {

    Context c;
    ArrayList<TVShow> tvShows;
    LayoutInflater inflater;

    public CustomAdapter(Context c, ArrayList<TVShow> tvShows) {
        this.c = c;
        this.tvShows = tvShows;
    }

    @Override
    public int getCount() {
        return tvShows.size();
    }

    @Override
    public Object getItem(int position) {
        return tvShows.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(inflater==null)
        {
            inflater= (LayoutInflater) c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        }
        if(convertView==null)
        {
            convertView=inflater.inflate(R.layout.model,parent,false);
        }

        TextView nameTxt= (TextView) convertView.findViewById(R.id.nameTxt);
        TextView descTxt= (TextView) convertView.findViewById(R.id.descTxt);
        TextView ponente= (TextView) convertView.findViewById(R.id.ponente);
        TextView hora= (TextView) convertView.findViewById(R.id.hora);
        TextView aula= (TextView) convertView.findViewById(R.id.aula);
        ImageView img= (ImageView) convertView.findViewById(R.id.movieImage);

        final String name=tvShows.get(position).getName();
        final String desc=tvShows.get(position).getDescripcion();
        final String ponen=tvShows.get(position).getPonente();
        final String time=tvShows.get(position).getHora();
        final String aul=tvShows.get(position).getAula();
        int image=tvShows.get(position).getImage();

        nameTxt.setText(name);
        descTxt.setText(desc);
        ponente.setText(ponen);
        hora.setText(time);
        aula.setText(aul);
        img.setImageResource(image);


        return convertView;
    }
}
