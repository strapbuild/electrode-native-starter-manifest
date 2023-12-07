package com.walmartlabs.ern.container.plugins;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.facebook.react.ReactPackage;
import fr.bamlab.rnimageresizer.ImageResizerPackage;

public class ImageResizerPackagePlugin implements ReactPlugin {
    @Override
    public ReactPackage hook(@NonNull Application application, @Nullable ReactPluginConfig config) {
        return new ImageResizerPackage();
    }
}
