package com.example.op.sms;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.annotation.Nullable;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class SplashScreen extends Activity {
    private TextView[] dots;
    private IntroManager introManager;
    private ViewPager viewPager;
    LinearLayout dotsLayout;
    ViewPagerAdapter viewPagerAdapter;
    Button skip,next;
    private  int currentPage;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_screen);
        final ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);
        next=(Button)findViewById(R.id.btnNext);
        skip=(Button)findViewById(R.id.btnSkip);
        dotsLayout=(LinearLayout)findViewById(R.id.layoutDots);

       /* introManager = new IntroManager(this);
        if (!introManager.check()) {
            introManager.setFirst(false);
            Intent intent = new Intent(SplashScreen.this, MainActivity.class);
            startActivity(intent);
            finish();
        }
        */

        /*final Animation an = AnimationUtils.loadAnimation(getBaseContext(),R.anim.rotate);

        iv.startAnimation(an);

        an.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                finish();
                Intent i = new Intent(getBaseContext(),MainActivity.class);
                startActivity(i);

            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });*/
            addBootomDots(0);
            viewPagerAdapter = new ViewPagerAdapter(getBaseContext());
            viewPager.setAdapter(viewPagerAdapter);
            viewPager.addOnPageChangeListener(vListener);
            skip.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(SplashScreen.this, MainActivity.class);
                    startActivity(intent);
                    finish();
                }
            });
            next.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {


                    if (viewPager.getCurrentItem() >viewPagerAdapter.nextSlide(0))
                    {
                        viewPager.setCurrentItem(viewPager.getCurrentItem()+1);

                    } else {
                        Intent intent = new Intent(SplashScreen.this, MainActivity.class);
                        startActivity(intent);
                        finish();
                    }
                }
            });

    }
    private void getItem()
    {

        viewPager.setCurrentItem(currentPage+1);
    }

    public void addBootomDots(int position) {
            dots = new TextView[3];
            int[] colorActive = getResources().getIntArray(R.array.dot_active);
            int[] colorInActive = getResources().getIntArray(R.array.dot_inactive);
            dotsLayout.removeAllViews();
            for(int i=0;i<dots.length;i++)
            {
                dots[i] =new TextView(this);
                dots[i].setText(Html.fromHtml("&#8226"));
                dots[i].setTextSize(35);
                dots[i].setTextColor(getResources().getColor(R.color.colorTransparentWhite));
                dotsLayout.addView(dots[i]);
            }
            if (dots.length>0)
                dots[position].setTextColor(colorActive[position]);
    }

    ViewPager.OnPageChangeListener vListener = new ViewPager.OnPageChangeListener() {
        @Override
        public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

        }

        @Override
        public void onPageSelected(int position) {
                addBootomDots(position);
                currentPage=position;

            if (position==dots.length -1)
            {
                next.setText("Proceed");
                skip.setVisibility(View.GONE);

            }

            else {
                next.setText("Next");
                skip.setVisibility(View.VISIBLE);
            }
            }



        @Override
        public void onPageScrollStateChanged(int state) {

        }
    };

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "splash screen destroyed", Toast.LENGTH_SHORT).show();
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(this);
        SharedPreferences.Editor editor = preferences.edit();
        editor.putBoolean("first", true);
        editor.commit();

    }


//

}