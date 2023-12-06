package com.walmartlabs.ern.container.plugins;

import android.app.Application;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import com.facebook.react.ReactPackage;
import fr.michaelvilleneuve.customcrop.RNCustomCropPackage;


public class CustomCropManagerPlugin implements ReactPlugin {
    public ReactPackage hook(@NonNull Application application, @Nullable ReactPluginConfig config) {
        return new RNCustomCropPackage();
    }
}
