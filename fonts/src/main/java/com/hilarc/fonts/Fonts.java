package com.hilarc.fonts;

import android.content.Context;
import android.graphics.Typeface;
import android.widget.EditText;
import android.widget.TextView;

public class Fonts {
    public static final int NUNITO_EXTRALIGHT = 0;
    public static final int NUNITO_EXTRALIGHTITALIC = 1;
    public static final int NUNITO_LIGHT = 2;
    public static final int NUNITO_LIGHTITALIC = 3;
    public static final int NUNITO_REGULAR = 4;
    public static final int NUNITO_ITALIC = 5;
    public static final int NUNITO_SEMIBOLD = 6;
    public static final int NUNITO_SEMIBOLDITALIC = 7;
    public static final int NUNITO_BOLD = 8;
    public static final int NUNITO_BOLDITALIC = 9;
    public static final int NUNITO_EXTRABOLD = 10;
    public static final int NUNITO_EXTRABOLDITALIC = 11;
    public static final int NUNITO_BLACK = 12;
    public static final int NUNITO_BLACKITALIC = 13;

    private static Typeface getTypeface(Context context, int font) {
        Typeface NunitoExtraLight = Typeface.createFromAsset(context.getAssets(), "fonts/Nunito-ExtraLight.ttf");
        Typeface NunitoExtraLightItalic = Typeface.createFromAsset(context.getAssets(), "fonts/Nunito-ExtraLightItalic.ttf");
        Typeface NunitoLight = Typeface.createFromAsset(context.getAssets(), "fonts/Nunito-Light.ttf");
        Typeface NunitoLightItalic = Typeface.createFromAsset(context.getAssets(), "fonts/Nunito-LightItalic.ttf");
        Typeface NunitoRegular = Typeface.createFromAsset(context.getAssets(), "fonts/Nunito-Regular.ttf");
        Typeface NunitoItalic = Typeface.createFromAsset(context.getAssets(), "fonts/Nunito-Italic.ttf");
        Typeface NunitoSemibold = Typeface.createFromAsset(context.getAssets(), "fonts/Nunito-SemiBold.ttf");
        Typeface NunitoSemiBoldItalic = Typeface.createFromAsset(context.getAssets(), "fonts/Nunito-SemiBoldItalic.ttf");
        Typeface NunitoBold = Typeface.createFromAsset(context.getAssets(), "fonts/Nunito-Bold.ttf");
        Typeface NunitoBoldItalic = Typeface.createFromAsset(context.getAssets(), "fonts/Nunito-BoldItalic.ttf");
        Typeface NunitoExtraBold = Typeface.createFromAsset(context.getAssets(), "fonts/Nunito-ExtraBold.ttf");
        Typeface NunitoExtraBoldItalic = Typeface.createFromAsset(context.getAssets(), "fonts/Nunito-ExtraBoldItalic.ttf");
        Typeface NunitoBlack = Typeface.createFromAsset(context.getAssets(), "fonts/Nunito-Black.ttf");
        Typeface NunitoBlackItalic = Typeface.createFromAsset(context.getAssets(), "fonts/Nunito-BlackItalic.ttf");

        switch (font) {
            case NUNITO_EXTRALIGHT:
                return NunitoExtraLight;
            case NUNITO_EXTRALIGHTITALIC:
                return NunitoExtraLightItalic;
            case NUNITO_LIGHT:
                return NunitoLight;
            case NUNITO_LIGHTITALIC:
                return NunitoLightItalic;
            case NUNITO_REGULAR:
                return NunitoRegular;
            case NUNITO_ITALIC:
                return NunitoItalic;
            case NUNITO_SEMIBOLD:
                return NunitoSemibold;
            case NUNITO_SEMIBOLDITALIC:
                return NunitoSemiBoldItalic;
            case NUNITO_BOLD:
                return NunitoBold;
            case NUNITO_BOLDITALIC:
                return NunitoBoldItalic;
            case NUNITO_EXTRABOLD:
                return NunitoExtraBold;
            case NUNITO_EXTRABOLDITALIC:
                return NunitoExtraBoldItalic;
            case NUNITO_BLACK:
                return NunitoBlack;
            case NUNITO_BLACKITALIC:
                return NunitoBlackItalic;
            default:
                return null;
        }
    }

    public static void ChaneFont(Context context, EditText editText, int font) {
        editText.setTypeface(getTypeface(context,font));
    }

    public static void ChaneFont(Context context, TextView textView, int font) {
        textView.setTypeface(getTypeface(context,font));
    }

}
