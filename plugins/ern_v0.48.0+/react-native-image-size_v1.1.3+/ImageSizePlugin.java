package com.walmartlabs.ern.container.plugins;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.facebook.react.ReactPackage;
import com.existfragger.rnimagesize.RNImageSizePackage;

public class ImageSizePlugin implements ReactPlugin {
    @Override
    public ReactPackage hook(@NonNull Application application, @Nullable ReactPluginConfig config) {
        return new RNImageSizePackage();
    }
}
