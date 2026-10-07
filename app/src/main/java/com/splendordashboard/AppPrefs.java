package com.splendordashboard;

import android.content.Context;
import android.content.SharedPreferences;

public final class AppPrefs {
    private static final String P = "dashboard";
    private final SharedPreferences p;
    public AppPrefs(Context c){ p=c.getSharedPreferences(P, Context.MODE_PRIVATE); }
    public float tank(){return p.getFloat("tank",9.8f);} public float mileage(){return p.getFloat("mileage",60f);} public float reserve(){return p.getFloat("reserve",1f);} public float maxRange(){return p.getFloat("maxRange",550f);}
    public float gaugeMax(){return p.getFloat("gaugeMax",160f);} public boolean awake(){return p.getBoolean("awake",true);} public boolean fullscreen(){return p.getBoolean("fullscreen",true);} public boolean autoStart(){return p.getBoolean("autoStart",false);} public boolean autoTrip(){return p.getBoolean("autoTrip",false);}
    public boolean saveHistory(){return p.getBoolean("saveHistory",true);} public boolean demo(){return p.getBoolean("demo",false);} public float demoSpeed(){return p.getFloat("demoSpeed",45f);} public int theme(){return p.getInt("theme",0);} public boolean showClock(){return p.getBoolean("clock",true);} public boolean showBattery(){return p.getBoolean("battery",true);}
    public boolean showGps(){return p.getBoolean("gps",true);} public boolean showCompass(){return p.getBoolean("compass",true);} public boolean chargingExit(){return p.getBoolean("chargingExit",false);}
    public void set(String k,Object v){ SharedPreferences.Editor e=p.edit(); if(v instanceof Float)e.putFloat(k,(Float)v); else if(v instanceof Boolean)e.putBoolean(k,(Boolean)v); else if(v instanceof Integer)e.putInt(k,(Integer)v); e.apply(); }
}