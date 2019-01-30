package com.maseko.root.loadingshimmer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import io.supercharge.shimmerlayout.ShimmerLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ShimmerLayout shimmerText = findViewById(R.id.shimmer_text);

        Animation animation1 = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.blink);

       // shimmerText.setAnimation(animation1);
        shimmerText.startShimmerAnimation();

        // shimmerText.stopShimmerAnimation();
    }
}
