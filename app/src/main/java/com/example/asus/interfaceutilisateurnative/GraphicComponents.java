package com.example.asus.interfaceutilisateurnative;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.NumberPicker;

/**
 * Created by Greg on 29/01/2017.
 */

public class GraphicComponents extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.graph_components);

            NumberPicker np = (NumberPicker) findViewById(R.id.numberPicker);
            int min= 10;
            int max= 20;
            np.setMinValue(min);
            np.setMaxValue(max);
        }
}
