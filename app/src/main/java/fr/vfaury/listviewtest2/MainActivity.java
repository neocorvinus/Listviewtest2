package fr.vfaury.listviewtest2;

import android.app.ListActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;

public class MainActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] choix = {"Caméra","bouton","langage","Options"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getListView().getContext(),android.R.layout.simple_list_item_1,choix);
        getListView().setAdapter(adapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        int id= item.getItemId();
        if(id==R.id.action_settings){
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
