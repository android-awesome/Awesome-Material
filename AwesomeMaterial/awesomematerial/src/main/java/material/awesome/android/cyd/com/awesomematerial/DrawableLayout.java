package material.awesome.android.cyd.com.awesomematerial;

/**
 * Created by daniellevass on 18/04/15.
 */
public class DrawableLayout {

    private int enumNumber;
    private int backgroundDrawable;
    private int backgroundDrawableRounded;
    private int textColor;


    public int getBackgroundDrawable() {
        return backgroundDrawable;
    }

    public int getBackgroundDrawableRounded() {
        return backgroundDrawableRounded;
    }

    public int getTextColor() {
        return textColor;
    }

    public int getEnumNumber() {
        return enumNumber;
    }

    public DrawableLayout(int enumNumber, int backgroundDrawable,
                          int backgroundDrawableRounded, int textColor) {
        this.enumNumber = enumNumber;
        this.backgroundDrawable = backgroundDrawable;
        this.backgroundDrawableRounded = backgroundDrawableRounded;
        this.textColor = textColor;
    }
}
