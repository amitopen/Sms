package com.example.op.sms;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by op on 2/19/18.
 */

public class IntroManager {
    SharedPreferences pref;
    SharedPreferences.Editor editor;
    Context context;

    public IntroManager(Context context){
        this.context=context;
        pref=context.getSharedPreferences("first",0);
        editor=pref.edit();
    }
    public void setFirst(boolean isFirst){
        editor.putBoolean("check",isFirst);
        editor.commit();
    }
    public boolean check(){
        return pref.getBoolean("check",true);
    }


}
