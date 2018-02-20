package com.example.op.sms;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class ViewPagerAdapter extends PagerAdapter {
    private LayoutInflater layoutInflater;
    Context context;
    ViewPager viewPager;
    private Integer[] layouts = {R.layout.custom_layout, R.layout.layout2,R.layout.layout3};
    public int[] slide_images={R.drawable.me,R.drawable.nu,R.drawable.amith};
    public String [] slide_headings = {"eat","sleep","wake"};
    public ViewPagerAdapter(Context context) {
        this.context=context;
    }


    @Override
    public int getCount() {
        return layouts.length;
    }

    @Override
    public boolean isViewFromObject(View v, Object object) {
        return v == object;
    }


    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        layoutInflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(layouts[position], container, false);

        //ImageView imageView = (ImageView) view.findViewById(R.id.imageView2);
        // imageView.setImageResource(images[position]);

        //ViewPager vp = (ViewPager)container;
        container.addView(view, 0);

        return view;
    }
    public int nextSlide(int next)
    {
        int next_slide =  layouts.length;

        return next_slide;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {

        View view = (View) object;
        container.removeView(view);
    }
}
