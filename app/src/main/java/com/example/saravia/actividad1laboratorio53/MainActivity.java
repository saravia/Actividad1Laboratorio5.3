package com.example.saravia.actividad1laboratorio53;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private ListView lstOpciones;
    private Comida[] comida =
            new Comida[]{
                    new Comida("Arroz con pollo", "Ingredientes : Arroz y Pollo \nTiempo de coccion : 20minutos"),
                    new Comida("Aji de gallina", "Ingredientes: Gallina y Papa \nTiempo de coccion : 25minutos "),
                    new Comida("Lomo saltado", "Ingredientes: Arroz, lomo y Papas \nTiempo de coccion : 30minutos"),
                    new Comida("Tacu tacu", "Ingredientes: Frejol, papas y arroz \nTiempo de coccion : 30minutos"),
                    new Comida("Ceviche", "Ingredientes: Pescado, cebolla y Aji \nTiempo de coccion : 15minutos")
            };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lstOpciones = (ListView)findViewById(R.id.LstOpciones);
        AdaptadorTitulares adaptador =
                new AdaptadorTitulares(this, comida);

        lstOpciones.setAdapter(adaptador);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    class AdaptadorTitulares extends ArrayAdapter<Comida> {

        public AdaptadorTitulares(Context context, Comida[] datos) {
            super(context, R.layout.lista_comida, datos);
        }

        public View getView(int position, View convertView, ViewGroup parent) {
            LayoutInflater inflater = LayoutInflater.from(getContext());
            View item = inflater.inflate(R.layout.lista_comida, null);

            TextView lblTitulo = (TextView)item.findViewById(R.id.LblTitulo);
            lblTitulo.setText(comida[position].getNombre());

            TextView lblSubtitulo = (TextView)item.findViewById(R.id.LblSubTitulo);
            lblSubtitulo.setText(comida[position].getIngrediente());


            return(item);
        }
    }

}
