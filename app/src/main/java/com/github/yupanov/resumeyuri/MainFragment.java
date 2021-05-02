package com.github.yupanov.resumeyuri;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import androidx.fragment.app.Fragment;

public class MainFragment extends Fragment {
    private static final String TAG = "MainFragment";
    ImageView mPhotoImageView;
    ImageButton mContactsImageButton, mSkillsImageButton, mEducationImageButton, mExperienceImageButton, mMoreImageButton;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.atcivity_fragment, container, false);

        mPhotoImageView = (ImageView) v.findViewById(R.id.Photo);
        mPhotoImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v1) {
                showLargePhoto();
            }
        });
        ViewCompat.setTransitionName(mPhotoImageView, "photo");

        mContactsImageButton = (ImageButton) v.findViewById(R.id.bt_contacts);
        mContactsImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i(TAG, "onClickContacts");
                Intent intent = InfoPagerActivity.newIntent(getActivity(), 0);
                startActivity(intent);
            }
        });
        return v;
    }

    @Override
    public void onCreateOptionsMenu(@NonNull Menu menu, @NonNull MenuInflater inflater) {
        super.onCreateOptionsMenu(menu, inflater);

        inflater.inflate(R.menu.main_fragment, menu);
        MenuItem aboutItem = menu.findItem(R.id.menu_item_about);


    }

    public  void showLargePhoto() {
        Log.i(TAG, "showLargePhoto");
        Toast.makeText(getActivity(), "Large photo!", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(getActivity(), FullscreenPhotoActivity.class);
        startActivity(intent);
    }
}
