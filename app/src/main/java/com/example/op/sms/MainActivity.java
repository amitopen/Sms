package com.example.op.sms;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button call1,sms1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        call1=(Button)findViewById(R.id.btnCall1);
        sms1=(Button)findViewById(R.id.btnSms1);
        call1.setOnClickListener(this);
        sms1.setOnClickListener(this);
    }

    public void btn_send(View view) {
        Uri uri = Uri.parse("smsto:0800000123");
        Intent it = new Intent(Intent.ACTION_SENDTO, uri);
        it.putExtra("sms_body", "The SMS text");
        startActivity(it);
    }

    public void btn_call(View view) {
        String number = "23454568678";
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:" +number));
        startActivity(intent);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btnCall1:
                String number = "01933814269";
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:" +number));
                startActivity(intent);
                break;

            case R.id.btnSms1:
                Uri uri = Uri.parse("smsto:0800000123");
                Intent it = new Intent(Intent.ACTION_SENDTO, uri);
                it.putExtra("sms_body", "You are too silly");
                startActivity(it);
        }

    }
}
