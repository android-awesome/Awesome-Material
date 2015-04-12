package material.awesome.android.cyd.com.awesomematerial;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * Created by daniellevass on 12/04/15.
 */
public class AwesomeText extends TextView {

    public enum AwesomeFont {

        FONT_AWESOME, MATERIAL_DESIGN, PIXEDEN_STROKE

    }

    public AwesomeText(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        initialise(attrs);
    }

    public AwesomeText(Context context, AttributeSet attrs) {
        super(context, attrs);
        initialise(attrs);
    }

    public AwesomeText(Context context) {
        super(context);
        initialise(null);
    }

    private void initialise(AttributeSet attrs) {

        //get info written in layout file
        TypedArray a = getContext().obtainStyledAttributes(attrs, R.styleable.AwesomeText);

        //default a ? from FontAwesome
        AwesomeFont font = AwesomeFont.FONT_AWESOME;
        String icon = FontCharacterMaps.FontAwesome.FA_QUESTION.toString();

        try {


            if (a != null) {

                int fontType = a.getInteger(R.styleable.AwesomeText_awesome_font, 0);

                switch (fontType){

                    case 0:
                        font = AwesomeFont.FONT_AWESOME;
                        break;
                    case 1:
                        font = AwesomeFont.MATERIAL_DESIGN;
                        break;
                    case 2:
                        font = AwesomeFont.PIXEDEN_STROKE;
                        break;

                }

                icon = getUnicodeCharacterFromInt( a.getInt(R.styleable.AwesomeText_awesome_icon, 0xF128) );


            }


        }finally {
            if (a != null) {
                a.recycle();
            }
        }

        this.setText(icon);

        //set the actual font
        switch (font){
                    case FONT_AWESOME:
                        this.setTypeface(FontUtil.getFontAwesome(getContext()));
                        break;
                    case MATERIAL_DESIGN:
                        this.setTypeface(FontUtil.getMaterialDesignFont(getContext()));;
                        break;
                    case PIXEDEN_STROKE:
                        this.setTypeface(FontUtil.getPixedenFont(getContext()));
                        break;

        }




    }

    public String getUnicodeCharacterFromInt(int unicode){
        return new String(Character.toChars(unicode));
    }

    public void setFontAwesomeIcon(FontCharacterMaps.FontAwesome icon) {
        this.setText(icon.toString());
        this.setTypeface(FontUtil.getFontAwesome(getContext()));
    }

    public void setMaterialDesignIcon(FontCharacterMaps.MaterialDesign icon) {
        this.setText(icon.toString());
        this.setTypeface(FontUtil.getMaterialDesignFont(getContext()));
    }

    public void setPixedenStrokeIcon(FontCharacterMaps.Pixeden icon) {
        this.setText(icon.toString());
        this.setTypeface(FontUtil.getPixedenFont(getContext()));
    }

}
