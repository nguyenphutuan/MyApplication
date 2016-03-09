package com.example.nguyenphutuan.myapplication;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ScrollView;

/**
 * Created by nguyen phu tuan on 3/9/2016.
 */
public class customscroll  extends ScrollView {
    ScrollViewListener scrollViewListener=null;

    public customscroll(Context context) {
        super(context);
    }

    public customscroll(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public customscroll(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }
    public void setScrollViewListener(ScrollViewListener scrollViewListener){
        this.scrollViewListener=scrollViewListener;
    }

    @Override
    protected void onScrollChanged(int l, int t, int oldl, int oldt) {
        super.onScrollChanged(l, t, oldl, oldt);
        if (scrollViewListener!=null){
            scrollViewListener.onScrollChanged(this,l,t,oldl,oldt);
        }
    }

    public interface ScrollViewListener {

        void onScrollChanged(customscroll customscroll, int x, int y, int oldx, int oldy);

    }


}
