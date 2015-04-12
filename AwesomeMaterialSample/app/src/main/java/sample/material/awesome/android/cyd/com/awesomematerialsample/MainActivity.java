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


       // sampleTextIcons();


    }


    private void sampleTextIcons()
    {

        TextView lblFontAwesome = (TextView)findViewById(R.id.lblFontAwesome);
        TextView lblMaterialDesign = (TextView)findViewById(R.id.lblMaterialDesign);
        TextView lblPixeden = (TextView)findViewById(R.id.lblPixeden);


        lblFontAwesome.setTypeface(FontUtil.getFontAwesome(this));

        lblMaterialDesign.setTypeface(FontUtil.getMaterialDesignFont(this));

        lblPixeden.setTypeface(FontUtil.getPixedenFont(this));

        lblFontAwesome.setText( FontCharacterMaps.FontAwesome.FA_SMILE_O.toString() + " " +
                                        FontCharacterMaps.FontAwesome.FA_BAR_CHART.toString() + " " +
                                        FontCharacterMaps.FontAwesome.FA_QRCODE.toString() + " " +
                                        FontCharacterMaps.FontAwesome.FA_ROCKET.toString() + " " +
                                        FontCharacterMaps.FontAwesome.FA_STAR.toString());


        lblMaterialDesign.setText(
                FontCharacterMaps.MaterialDesign.MD_FACE_UNLOCK.toString() + " " +
                        FontCharacterMaps.MaterialDesign.MD_ACCESSIBILITY  + " " +
                        FontCharacterMaps.MaterialDesign.MD_BUG_REPORT  + " " +
                        FontCharacterMaps.MaterialDesign.MD_LOCATION_HISTORY  + " " +
                        FontCharacterMaps.MaterialDesign.MD_DOMAIN
        );
        lblPixeden.setText( FontCharacterMaps.Pixeden.PE_ANCHOR.toString() + " " +
                                    FontCharacterMaps.Pixeden.PE_LEAF.toString() + " " +
                                    FontCharacterMaps.Pixeden.PE_SETTINGS.toString() + " " +
                                    FontCharacterMaps.Pixeden.PE_TOOLS.toString() + " " +
                                    FontCharacterMaps.Pixeden.PE_SCIENCE.toString());

    }




}
