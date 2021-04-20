package com.github.yupanov.resumeyuri;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.util.List;

public class InfoFragment extends Fragment {
    private TextView mTitleTextView;
    private TextView mDescriptionTextView;
    private Info mInfo;

    private static final String ARG = "info ID";

    public static InfoFragment newInstance(int id) {
        Bundle args = new Bundle();
        args.putSerializable(ARG, id);
        InfoFragment fragment = new InfoFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        int index = (int) getArguments().getSerializable(ARG);
        mInfo = InfoBase.get().getInfoBase().get(index);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.info_fragment, container, false);

        mTitleTextView = (TextView) v.findViewById(R.id.tv_title);
        mDescriptionTextView = (TextView) v.findViewById(R.id.tv_description);

        mTitleTextView.setText(mInfo.getTitle());
        mDescriptionTextView.setText((mInfo.getDescription()));

        return v;
    }
}
