package cyd.awesome.material;

import android.content.Context;
import android.graphics.Typeface;
import android.util.Log;


/**
 * Created by daniellevass on 02/04/15.
 */
public class FontUtil {


    private static Typeface fontAwesome;
    private static Typeface materialDesignFont;
    private static Typeface pixedenFont;

    /**
     * Returns the Font Awesome typeface
     * @param context - current activity context
     * @return Font Awesome typeface
     */
    public static Typeface getFontAwesome(Context context) {
        if (fontAwesome == null) {
            try {
                fontAwesome = Typeface.createFromAsset(context.getAssets(), "fonts/fontawesome-webfont-4-3.ttf");
            } catch (Exception e) {
                Log.e("AWESOME_MATERIAL", "Could not get FONT AWESOME typeface because " + e.getMessage());
                fontAwesome = Typeface.DEFAULT;
            }
        }
        return fontAwesome;
    }

    /**
     * Returns the Material Design Iconic Font typeface
     * @param context - current activity context
     * @return Material Design Iconic Font typeface
     */
    public static Typeface getMaterialDesignFont(Context context) {
        if (materialDesignFont == null) {
            try {
                materialDesignFont = Typeface.createFromAsset(context.getAssets(), "fonts/material-design-iconic-font-1-1.ttf");
            } catch (Exception e) {
                Log.e("AWESOME_MATERIAL", "Could not get MATERIAL DESIGN ICONIC FONT typeface because " + e.getMessage());
                materialDesignFont = Typeface.DEFAULT;
            }
        }
        return materialDesignFont;
    }

    /**
     * Returns the Pixeden Stroke typeface
     * @param context - current activity context
     * @return Pixeden Stroke typeface
     */
    public static Typeface getPixedenFont(Context context) {
        if (pixedenFont == null) {
            try {
                pixedenFont = Typeface.createFromAsset(context.getAssets(), "fonts/pixeden-icon-font-stroke-1-3.ttf");
            } catch (Exception e) {
                Log.e("AWESOME_MATERIAL", "Could not get PIXEDEN TYPEFACE typeface because " + e.getMessage());
                pixedenFont = Typeface.DEFAULT;
            }
        }
        return pixedenFont;
    }




}
