package com.doors.photos;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;

public class SquareLayout extends LinearLayout {
    public SquareLayout(Context context) {
        super(context);
        this.setOrientation(LinearLayout.VERTICAL);
    }

    public SquareLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.setOrientation(LinearLayout.VERTICAL);
    }

    public SquareLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.setOrientation(LinearLayout.VERTICAL);
    }
    @Override
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, widthMeasureSpec); // This is the key that will make the height equivalent to its width
    }
}