package com.github.yupanov.resumeyuri;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.ViewPager;

import java.util.List;

public class InfoPagerActivity extends AppCompatActivity {
    public static final String EXTRA_INFOID = "com.github.yupanov.resumeyuri.infoid";

    ViewPager mInfoPager;
    List<Info> mInfoList;

    public static Intent newIntent(Context context, int id){
        Intent intent = new Intent(context, InfoPagerActivity.class);
        intent.putExtra(EXTRA_INFOID, id);
        return intent;
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.info_pager);

        mInfoList = InfoBase.get().getInfoBase();

        mInfoPager = (ViewPager) findViewById(R.id.vp_infopager);
        mInfoPager.setAdapter(new FragmentStatePagerAdapter(getSupportFragmentManager(),1) {
            @NonNull
            @Override
            public Fragment getItem(int position) {
                return new InfoFragment().newInstance(position);
            }

            @Override
            public int getCount() {
                return mInfoList.size();
            }
        });

    }
}
