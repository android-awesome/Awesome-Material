package material.awesome.android.cyd.com.awesomematerial;

import android.content.Context;
import android.graphics.Typeface;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by daniellevass on 02/04/15.
 */
public class DrawableLayoutUtil {


    private List<DrawableLayout> possibleLayouts;



    private void setUp(){
        //only do this once if needed

        possibleLayouts = new ArrayList<>();

        possibleLayouts.add(new DrawableLayout(0, R.drawable.button_bootstrap_square_default,
                R.drawable.button_bootstrap_rounded_default, R.color.md_black_1000));
        possibleLayouts.add(new DrawableLayout(1, R.drawable.button_bootstrap_square_primary,
                R.drawable.button_bootstrap_rounded_primary, R.color.md_white_1000_transparent90));
        possibleLayouts.add(new DrawableLayout(2, R.drawable.button_bootstrap_square_success,
                R.drawable.button_bootstrap_rounded_success, R.color.md_white_1000_transparent90));
        possibleLayouts.add(new DrawableLayout(3, R.drawable.button_bootstrap_square_info,
                R.drawable.button_bootstrap_rounded_info, R.color.md_white_1000_transparent90));
        possibleLayouts.add(new DrawableLayout(4, R.drawable.button_bootstrap_square_warning,
                R.drawable.button_bootstrap_rounded_warning, R.color.md_white_1000_transparent90));
        possibleLayouts.add(new DrawableLayout(5, R.drawable.button_bootstrap_square_danger,
                R.drawable.button_bootstrap_rounded_danger, R.color.md_white_1000_transparent90));
        possibleLayouts.add(new DrawableLayout(6, R.drawable.button_bootstrap_square_inverse,
                R.drawable.button_bootstrap_rounded_inverse, R.color.md_white_1000_transparent90));


    }


    public DrawableLayout findLayoutForEnumNumber(int enumNumber){

        if (possibleLayouts == null){
            setUp();
        }


        DrawableLayout layout = null;

        for(DrawableLayout drawableLayout : possibleLayouts){

            if (drawableLayout.getEnumNumber() == enumNumber){
                layout = drawableLayout;
            }

        }

        return layout;

    }






}
