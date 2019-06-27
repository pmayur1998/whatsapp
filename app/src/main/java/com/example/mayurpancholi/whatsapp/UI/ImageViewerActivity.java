package com.example.mayurpancholi.whatsapp.UI;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatDelegate;
import android.widget.ImageView;

import com.example.mayurpancholi.whatsapp.R;
import com.squareup.picasso.Picasso;

public class ImageViewerActivity extends AppCompatActivity {

    private ImageView imageView;
    private String imageUrl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_viewer);

        AppCompatDelegate.setCompatVectorFromResourcesEnabled(true);

        imageView =(ImageView)findViewById(R.id.image_viewer);
        imageUrl= getIntent().getStringExtra("url");


        Picasso.with(this).load(imageUrl).into(imageView);
    }
}
