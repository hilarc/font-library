package com.hilarc.fonts;

import android.content.Context;
import android.util.AttributeSet;

public class EditText extends android.support.v7.widget.AppCompatEditText {
    Context context;

    public EditText(Context context, Context context1) {
        super(context);
        this.context = context1;
    }

    public EditText(Context context, AttributeSet attrs, Context context1) {
        super(context, attrs);
        this.context = context1;
    }

    public EditText(Context context, AttributeSet attrs, int defStyleAttr, Context context1) {
        super(context, attrs, defStyleAttr);
        this.context = context1;
    }

    public void setFont(int font) {
        setTypeface(Fonts.getFont(context, font));
    }
}
