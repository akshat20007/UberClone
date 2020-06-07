package com.example.uberclone;

import android.app.Application;

import com.parse.Parse;

public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("DO0r5KKSdap9CIQH5L7iq4ztHSa1BVnEURuCFIOF")
                // if defined
                .clientKey("EOSmaSVdng50nhoNjbJ3r3rwSFYdkSr1aY9oFZQb")
                .server("https://parseapi.back4app.com/")
                .build()
        );
    }
}
