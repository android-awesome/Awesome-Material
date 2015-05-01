package material.awesome.android.cyd.com.awesomematerial;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

/**
 * Created by daniellevass on 12/04/15.
 */
public class AwesomeButton extends LinearLayout {

    private DrawableLayout drawableLayout;
    private DrawableLayoutUtil drawableLayoutUtil;


    private Typeface font;

    private String iconLeft;
    private String textMiddle;
    private String iconMiddle;
    private String iconRight;

    private boolean useRounded;

    private int textSize;


    private TextView lblLeft;
    private TextView lblMiddle;
    private TextView lblRight;



    public enum AwesomeFont {

        FONT_AWESOME, MATERIAL_DESIGN, PIXEDEN_STROKE

    }

    public AwesomeButton(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        initialise(attrs);
    }

    public AwesomeButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        initialise(attrs);
    }

    public AwesomeButton(Context context) {
        super(context);
        initialise(null);
    }

    private void initialise(AttributeSet attrs) {

        //get info written in layout file
        TypedArray a = getContext().obtainStyledAttributes(attrs, R.styleable.AwesomeButton);

        //default a ? from FontAwesome
        font = FontUtil.getFontAwesome(getContext());
        textMiddle = FontCharacterMaps.FontAwesome.FA_QUESTION.toString();


        try {


            if (a != null) {

                int fontType = a.getInteger(R.styleable.AwesomeButton_awesome_font, 0);

                switch (fontType){

                    case 0:
                        font = FontUtil.getFontAwesome(getContext());
                        break;
                    case 1:
                        font = FontUtil.getMaterialDesignFont(getContext());
                        break;
                    case 2:
                        font = FontUtil.getPixedenFont(getContext());
                        break;

                }//end switch

                //text items

                int middleInt = a.getInt(R.styleable.AwesomeButton_awesome_icon, 0);
                int leftInt = a.getInt(R.styleable.AwesomeButton_awesome_icon_left, 0);
                int rightInt = a.getInt(R.styleable.AwesomeButton_awesome_icon_right, 0);


                if (middleInt == 0){
                    iconMiddle = null;
                } else {
                    iconMiddle = getUnicodeCharacterFromInt(middleInt);
                }

                if (leftInt == 0){
                    iconLeft = null;
                } else {
                    iconLeft = getUnicodeCharacterFromInt(leftInt);
                }

                if (rightInt == 0){
                    iconRight = null;
                } else {
                    iconRight = getUnicodeCharacterFromInt(rightInt);
                }

                textMiddle = a.getString(R.styleable.AwesomeButton_android_text);

                //button types
                int buttonType = a.getInteger(R.styleable.AwesomeButton_awesome_type, 0);
                useRounded = a.getBoolean(R.styleable.AwesomeButton_awesome_rounded_corners, false);

                String attrTextSize = a.getString(R.styleable.AwesomeButton_android_textSize);

                textSize = 12; //default

                if (attrTextSize != null){
                    if (attrTextSize.contains("sp")){

                        String[] parts = attrTextSize.split("sp");

                        try{
                            float textSizePart = Float.parseFloat(parts[0]);

                            textSize = Math.round(textSizePart);
                        }catch (Exception e){
                            //don't really need to handle because we have a default above.
                        }




                    }
                }

                drawableLayoutUtil = new DrawableLayoutUtil();
                drawableLayout = drawableLayoutUtil.findLayoutForEnumNumber(buttonType);

            }//end if any attrs


        }finally {
            if (a != null) {
                a.recycle();
            }
        }

        this.setClickable(true);
        this.setOrientation(LinearLayout.HORIZONTAL);
        float density = getContext().getResources().getDisplayMetrics().scaledDensity;

        //set items
        if (useRounded){
            this.setBackgroundResource(drawableLayout.getBackgroundDrawableRounded());
        } else {
            this.setBackgroundResource(drawableLayout.getBackgroundDrawable());
        }

        if (iconLeft != null){

            Log.d("DANIELLE", iconLeft);

            lblLeft = new TextView(getContext());
            lblLeft.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.MATCH_PARENT));
            lblLeft.setGravity(Gravity.CENTER);

            lblLeft.setTextColor(getResources().getColor(drawableLayout.getTextColor()));
            lblLeft.setTextSize(TypedValue.COMPLEX_UNIT_SP, textSize);

            lblLeft.setText(iconLeft);
            lblLeft.setTypeface(font);

            float leftButtonPadding = 10 * density ;
            lblLeft.setPadding(0,0,Math.round(leftButtonPadding),0);

            this.addView(lblLeft);
        }





        lblMiddle = new TextView(getContext());
        lblMiddle.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.MATCH_PARENT));
        lblMiddle.setGravity(Gravity.CENTER);

        lblMiddle.setTextColor(getResources().getColor(drawableLayout.getTextColor()));
        lblMiddle.setTextSize(TypedValue.COMPLEX_UNIT_SP, textSize);

        setMiddleItem();

        this.addView(lblMiddle);


        if (iconRight != null){

            Log.d("DANIELLE", iconRight);

            lblRight = new TextView(getContext());
            lblRight.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.MATCH_PARENT));
            lblRight.setGravity(Gravity.CENTER);

            lblRight.setTextColor(getResources().getColor(drawableLayout.getTextColor()));
            lblRight.setTextSize(TypedValue.COMPLEX_UNIT_SP, textSize);

            lblRight.setText(iconRight);
            lblRight.setTypeface(font);

            float leftButtonPadding = 10 * density ;
            lblRight.setPadding(Math.round(leftButtonPadding),0,0,0);

            this.addView(lblRight);
        }

        this.setGravity(Gravity.CENTER);



    }

    private void setMiddleItem()
    {
        if (textMiddle != null && textMiddle.length() > 0){
            lblMiddle.setText(textMiddle);
            lblMiddle.setTypeface(Typeface.DEFAULT);
        } else {

            if (iconMiddle != null && iconMiddle.length() > 0) {
                lblMiddle.setText(iconMiddle);
                lblMiddle.setTypeface(font);
            }
        }
    }




    public String getUnicodeCharacterFromInt(int unicode){
        return new String(Character.toChars(unicode));
    }

    /*
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
    }*/

}
