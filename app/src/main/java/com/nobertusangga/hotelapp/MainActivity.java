package com.nobertusangga.hotelapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity
{
    private ImageView _imageView1;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        _imageView1 = (ImageView) findViewById(R.id.imageView1);

        String imageUrl = "https://blue.kumparan.com/image/upload/fl_progressive,fl_lossy,c_fill,q_auto:best,w_640/v1634025439/01g7xkcck81d4e2pqm4getp5xy.jpg";
        Picasso.with(this).load(imageUrl).into(_imageView1);
    }
}