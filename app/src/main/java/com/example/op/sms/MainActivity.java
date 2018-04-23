package com.example.op.sms;

import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.preference.PreferenceManager;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

   // SharedPreferences mPrefs;
    final String splashScreenPref= "SplashScreenShown";
    Button call1,sms1,aramanCall,armanSms,nahidCall,nahidSms,delwarCall,delwarSms,soniaCall,
            soniaSms,raziaCall,raziaSms,samsulCall,samsulSms,zohirCall,zohirSms,azadCall,azadSms,ratonCall,
    ratonSms,kaderCall,kaderSms,munniCall,munniSms,afrozaCall,afrozaSms,farzanaCall,farzanaSms,sowebCall,sowebSms;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        /*mPrefs = PreferenceManager.getDefaultSharedPreferences(this);


        Boolean splashScreenShown= mPrefs.getBoolean("f", false);

        if (splashScreenShown==false) {
            Intent intent=new Intent(MainActivity.this,SplashScreen.class);
            startActivity(intent);

            SharedPreferences.Editor editor = mPrefs.edit();
            editor.putBoolean("f",true);
            editor.commit();
            finish();
        }*/
        setContentView(R.layout.activity_main);
        call1=(Button)findViewById(R.id.btnCall1);
        sms1=(Button)findViewById(R.id.btnSms1);
        call1.setOnClickListener(this);
        sms1.setOnClickListener(this);
        aramanCall=(Button)findViewById(R.id.btnCallArman);
        armanSms=(Button)findViewById(R.id.btnSmsArman);
        nahidCall=(Button)findViewById(R.id.btnCallNahid);
        nahidSms=(Button)findViewById(R.id.btnSmsNahid);
        soniaCall=(Button)findViewById(R.id.btnCallSonia);
        soniaSms=(Button)findViewById(R.id.btnSmsSonia);
        delwarCall=(Button)findViewById(R.id.btnCallDelwar);
        delwarSms=(Button)findViewById(R.id.btnSmsDelwar);
        samsulCall=(Button)findViewById(R.id.btnCallSamsul);
        samsulSms=(Button)findViewById(R.id.btnSmsSamsul);
        raziaCall=(Button)findViewById(R.id.btnCallRazia);
        raziaSms=(Button)findViewById(R.id.btnSmsRazia);
        zohirCall=(Button)findViewById(R.id.btnCallzahir);
        zohirSms=(Button)findViewById(R.id.btnSmszahir);
        azadCall=(Button)findViewById(R.id.btnCallAzad);
        azadSms=(Button)findViewById(R.id.btnSmsArman);
        ratonCall=(Button)findViewById(R.id.btnCall1Raton);
        ratonSms=(Button)findViewById(R.id.btnSmsRaton);
        kaderCall=(Button)findViewById(R.id.btnCallKader);
        kaderSms=(Button)findViewById(R.id.btnSmsKader);
        munniCall=(Button)findViewById(R.id.btnCallMunni);
        munniSms=(Button)findViewById(R.id.btnSmsMunni);
        sowebCall=(Button)findViewById(R.id.btnCallSoweb);
        sowebSms=(Button)findViewById(R.id.btnSmsSoweb);
        farzanaCall=(Button)findViewById(R.id.btnCallFarzana);
        farzanaSms=(Button)findViewById(R.id.btnSmsFarzana);

        azadCall.setOnClickListener(this);
        armanSms.setOnClickListener(this);
        nahidCall.setOnClickListener(this);
        nahidSms.setOnClickListener(this);
        soniaCall.setOnClickListener(this);
        soniaSms.setOnClickListener(this);
        call1.setOnClickListener(this);
        sms1.setOnClickListener(this);
        call1.setOnClickListener(this);
        sms1.setOnClickListener(this);
        call1.setOnClickListener(this);
        sms1.setOnClickListener(this);
        call1.setOnClickListener(this);
        sms1.setOnClickListener(this);
        call1.setOnClickListener(this);
        sms1.setOnClickListener(this);
        call1.setOnClickListener(this);
        sms1.setOnClickListener(this);
        call1.setOnClickListener(this);
        sms1.setOnClickListener(this);
        call1.setOnClickListener(this);
        sms1.setOnClickListener(this);
        call1.setOnClickListener(this);
        sms1.setOnClickListener(this);
        call1.setOnClickListener(this);
        sms1.setOnClickListener(this);
        call1.setOnClickListener(this);
        sms1.setOnClickListener(this);
        call1.setOnClickListener(this);
        sms1.setOnClickListener(this);
        call1.setOnClickListener(this);
        sms1.setOnClickListener(this);


    }

    public void btn_call(View view) {
        String number = "01933814269";
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:" +number));
        startActivity(intent);
    }

    public void btn_msg(View view) {
        Uri uri = Uri.parse("smsto:01933814269");
        Intent it = new Intent(Intent.ACTION_SENDTO, uri);
        it.putExtra("sms_body", "You are too silly");
        startActivity(it);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btnCall1:
                btn_call(view);
                break;

            case R.id.btnSms1:
                btn_msg(view);
                break;

        }

    }

}
