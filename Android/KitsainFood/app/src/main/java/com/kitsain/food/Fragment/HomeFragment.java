package com.kitsain.food.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.kitsain.food.ContentDetailActivity;
import com.kitsain.food.R;
import com.kitsain.food.SendContentActivity;

import org.jetbrains.annotations.NotNull;

public class HomeFragment extends Fragment {

    @Override
    public View onCreateView(@NotNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View contentView = inflater.inflate(R.layout.fragment_home, container, false);

        contentView.findViewById(R.id.home_send_content_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getContext(), SendContentActivity.class));
            }
        });
        contentView.findViewById(R.id.content_item_view).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getContext(), ContentDetailActivity.class));
            }
        });

        return contentView;

    }

}
