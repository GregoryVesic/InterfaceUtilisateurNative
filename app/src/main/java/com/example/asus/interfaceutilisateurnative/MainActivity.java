package com.example.asus.interfaceutilisateurnative;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.NumberPicker;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    String mTitle = "Interface Utilisateur";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_relative);

        Button ButtonG = (Button) findViewById(R.id.buttonG);   //Appel du Bouton
        ButtonG.setOnClickListener(new View.OnClickListener()      //Creation du listener sur ce bouton
        {
            public void onClick(View actualView)    //Au clic sur le bouton
            {
                Intent intent = new Intent(MainActivity.this, GalleryAndroidActivity.class);  //Lancer l'activité
                startActivity(intent);    //Afficher la vue
            }
        });

        Button ButtonGV = (Button) findViewById(R.id.buttonGV);   //Appel du Bouton
        ButtonGV.setOnClickListener(new View.OnClickListener()      //Creation du listener sur ce bouton
        {
            public void onClick(View actualView)    //Au clic sur le bouton
            {
                Intent intent = new Intent(MainActivity.this, HelloGridView.class);  //Lancer l'activité
                startActivity(intent);    //Afficher la vue
            }
        });

        Button ButtonCG = (Button) findViewById(R.id.buttonCG);   //Appel du Bouton
        ButtonCG.setOnClickListener(new View.OnClickListener()      //Creation du listener sur ce bouton
        {
            public void onClick(View actualView)    //Au clic sur le bouton
            {
                Intent intent = new Intent(MainActivity.this, GraphicComponents.class);  //Lancer l'activité
                startActivity(intent);    //Afficher la vue
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        //restoreActionBar();
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayShowTitleEnabled(true);
        actionBar.setTitle(mTitle);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
    // Handle presses on the action bar items
        switch (item.getItemId()) {
            case R.id.action_settings:
                Toast.makeText(MainActivity.this, "" + item.getTitle(),
                        Toast.LENGTH_SHORT).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

}
