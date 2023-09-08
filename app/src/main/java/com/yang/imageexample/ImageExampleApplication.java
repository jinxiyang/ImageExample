package com.yang.imageexample;

import android.app.Application;

import com.facebook.drawee.backends.pipeline.Fresco;

public class ImageExampleApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Fresco.initialize(this);
    }
}
