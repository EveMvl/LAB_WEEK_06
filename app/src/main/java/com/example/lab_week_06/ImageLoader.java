package com.example.lab_week_06;

import android.widget.ImageView;


// Interface untuk abstraction image loading
public interface ImageLoader {
    void loadImage(String imageUrl, ImageView imageView);
}
