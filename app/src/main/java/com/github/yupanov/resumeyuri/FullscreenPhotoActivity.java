package com.github.yupanov.resumeyuri;


import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.ViewCompat;
import androidx.transition.Transition;
import androidx.transition.TransitionInflater;


public class FullscreenPhotoActivity extends AppCompatActivity {
    private ImageView mLargePhotoImageView;
    private Transition sharedElementEnterTransition;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fullscreen_photo);
        mLargePhotoImageView = (ImageView) findViewById(R.id.iv_large_photo);
        ViewCompat.setTransitionName(mLargePhotoImageView, "large_photo");
//        sharedElementEnterTransition = TransitionInflater.from(this).inflateTransition(android.R.transition.fade);
    }
}