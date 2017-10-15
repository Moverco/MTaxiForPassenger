package top.moverco.mtaxiforpassenger.splash;

import android.content.Intent;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import top.moverco.mtaxiforpassenger.MainActivity;
import top.moverco.mtaxiforpassenger.R;

/**
 * Created by Moverco.
 */

public class SplashActivity extends AppCompatActivity {

    private final static int OPEN_NEW_ACTIVITY_TIME = 3000;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            final ImageView logo = (ImageView) findViewById(R.id.logo);
            final AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) logo.getDrawable();
            animatedVectorDrawable.start();
        }
        /**
         * Start Main Activity after 3000 ms
         */
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(SplashActivity.this, MainActivity.class));
                finish();
            }
        },OPEN_NEW_ACTIVITY_TIME);
    }
}
