package com.walmartlabs.ern.container.plugins;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.facebook.react.ReactPackage;
import fr.michaelvilleneuve.customcrop.RNCustomCropPackage;


public class RNCustomCropPluginPlugin implements ReactPlugin {
    @Override
    public ReactPackage hook(@NonNull Application application, @Nullable ReactPluginConfig config) {
        return new RNCustomCropPackage();
    }
}
