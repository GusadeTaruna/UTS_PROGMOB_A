package com.example.android.utsku;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        getIncomingIntent();
    }

    private void getIncomingIntent(){
        if(getIntent().hasExtra("image_url")&&getIntent().hasExtra("image_name")&&getIntent().hasExtra("image_desc")){
            String imageUrl = getIntent().getStringExtra("image_url");
            String imageName = getIntent().getStringExtra("image_name");
            String imageDesc = getIntent().getStringExtra("image_desc");

            setImage(imageUrl,imageName,imageDesc);
        }
    }

    @SuppressLint("SetTextI18n")
    private void setImage(String imageUrl, String imageName, String imageDesc){
        TextView name = findViewById(R.id.image_name);
        name.setText("Nama Hero : "+imageName);
        TextView deskripsi = findViewById(R.id.image_description);
        deskripsi.setText("Deskripsi : "+imageDesc);

        ImageView image = findViewById(R.id.image);
        Glide.with(this)
                .load(imageUrl)
                .into(image);
    }
}
