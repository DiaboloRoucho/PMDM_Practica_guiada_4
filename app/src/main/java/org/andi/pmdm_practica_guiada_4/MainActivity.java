package org.andi.pmdm_practica_guiada_4;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;

import java.util.Arrays;
import java.util.List;

public class MainActivity extends ListActivity implements AdapterView.OnItemClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        List<Centro> centros = Arrays.asList(
                new Centro("IES Doctor Fleming", "Doctor Fleming, 7, Oviedo", R.drawable.descarga);
                new Centro("IES Monte Naranco", "Pedro Caravia, 9, Oviedo", R.drawable.narancopng);
                new Centro("CIFP Aviles", "Marques S/N, Aviles", R.drawable.fp);
        );
        CentrosAdapter adapter
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

    }
}