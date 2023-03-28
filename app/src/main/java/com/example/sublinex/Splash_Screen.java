package com.example.sublinex;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;

public class Splash_Screen extends AppCompatActivity {
    private ImageView img_skip ;
    private Handler handler ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        //region skip Activity when click to img_skip
        img_skip = findViewById(R.id.img_skip);
        img_skip.setOnClickListener(v -> {
            Intent intent = new Intent(Splash_Screen.this , Google_Authentication.class);
            startActivity(intent);
        });
        //endregion

        //region fininsh Activity After 5s
        new Handler().postDelayed(() -> {
            Intent intent = new Intent(Splash_Screen.this, Google_Authentication.class);
            startActivity(intent);
            finish();
        }, 5000);
        //endregion

    }
}