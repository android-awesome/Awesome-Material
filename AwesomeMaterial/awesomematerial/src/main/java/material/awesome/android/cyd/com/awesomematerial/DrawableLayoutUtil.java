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


        //bootstrap layouts
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

        //material design layouts
        possibleLayouts.add(new DrawableLayout(7, R.drawable.button_material_square_red,
                R.drawable.button_material_rounded_red, R.color.md_white_1000_transparent90));
        possibleLayouts.add(new DrawableLayout(8, R.drawable.button_material_square_pink,
                R.drawable.button_material_rounded_pink, R.color.md_white_1000_transparent90));
        possibleLayouts.add(new DrawableLayout(9, R.drawable.button_material_square_purple,
                R.drawable.button_material_rounded_purple, R.color.md_white_1000_transparent90));
        possibleLayouts.add(new DrawableLayout(10, R.drawable.button_material_square_deep_purple,
                R.drawable.button_material_rounded_deep_purple, R.color.md_white_1000_transparent90));
        possibleLayouts.add(new DrawableLayout(11, R.drawable.button_material_square_indigo,
                R.drawable.button_material_rounded_indigo, R.color.md_white_1000_transparent90));
        possibleLayouts.add(new DrawableLayout(12, R.drawable.button_material_square_blue,
                R.drawable.button_material_rounded_blue, R.color.md_white_1000_transparent90));
        possibleLayouts.add(new DrawableLayout(13, R.drawable.button_material_square_light_blue,
                R.drawable.button_material_rounded_light_blue, R.color.md_white_1000_transparent90));
        possibleLayouts.add(new DrawableLayout(14, R.drawable.button_material_square_cyan,
                R.drawable.button_material_rounded_cyan, R.color.md_white_1000_transparent90));
        possibleLayouts.add(new DrawableLayout(15, R.drawable.button_material_square_teal,
                R.drawable.button_material_rounded_teal, R.color.md_white_1000_transparent90));
        possibleLayouts.add(new DrawableLayout(16, R.drawable.button_material_square_green,
                R.drawable.button_material_rounded_green, R.color.md_white_1000_transparent90));
        possibleLayouts.add(new DrawableLayout(17, R.drawable.button_material_square_light_green,
                R.drawable.button_material_rounded_light_green, R.color.md_white_1000_transparent90));
        possibleLayouts.add(new DrawableLayout(18, R.drawable.button_material_square_lime,
                R.drawable.button_material_rounded_lime, R.color.md_black_1000_transparent90));
        possibleLayouts.add(new DrawableLayout(19, R.drawable.button_material_square_yellow,
                R.drawable.button_material_rounded_yellow, R.color.md_black_1000_transparent90));
        possibleLayouts.add(new DrawableLayout(20, R.drawable.button_material_square_amber,
                R.drawable.button_material_rounded_amber, R.color.md_black_1000_transparent90));
        possibleLayouts.add(new DrawableLayout(21, R.drawable.button_material_square_orange,
                R.drawable.button_material_rounded_orange, R.color.md_black_1000_transparent90));
        possibleLayouts.add(new DrawableLayout(22, R.drawable.button_material_square_deep_orange,
                R.drawable.button_material_rounded_deep_orange, R.color.md_white_1000_transparent90));
        possibleLayouts.add(new DrawableLayout(23, R.drawable.button_material_square_brown,
                R.drawable.button_material_rounded_brown, R.color.md_white_1000_transparent90));
        possibleLayouts.add(new DrawableLayout(24, R.drawable.button_material_square_grey,
                R.drawable.button_material_rounded_grey, R.color.md_white_1000_transparent90));
        possibleLayouts.add(new DrawableLayout(25, R.drawable.button_material_square_blue_grey,
                R.drawable.button_material_rounded_blue_grey, R.color.md_white_1000_transparent90));

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
