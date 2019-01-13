package com.hilarc.fonts;

import android.content.Context;
import android.util.AttributeSet;

public class TextView extends android.support.v7.widget.AppCompatTextView {
    Context context;

    public TextView(Context context) {
        super(context);
        this.context = context;
    }

    public TextView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public TextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public void setFont(int font) {
        setTypeface(Fonts.getFont(context, font));
    }
}
