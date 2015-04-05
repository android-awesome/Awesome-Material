package sample.material.awesome.android.cyd.com.awesomematerialsample;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import material.awesome.android.cyd.com.awesomematerial.FontCharacterMaps;
import material.awesome.android.cyd.com.awesomematerial.FontUtil;

public class MainActivity extends ActionBarActivity {

    private TextView lblTest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);


       // lblTest = (TextView)findViewById(R.id.lblTest);


       // lblTest.setTypeface(FontUtil.getFontAwesome(MainActivity.this));

       // lblTest.setText(FontCharacterMaps.FontAwesome.FA_SMILE_O.toString());

       //  lblTest.setText("DANIELLE");


    }



}
