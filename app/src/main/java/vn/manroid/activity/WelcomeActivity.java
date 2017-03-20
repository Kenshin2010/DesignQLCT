package vn.manroid.activity;

import android.animation.Animator;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

import com.romainpiel.shimmer.Shimmer;
import com.romainpiel.shimmer.ShimmerTextView;

import vn.manroid.qlct.R;

public class WelcomeActivity extends AppCompatActivity {

    ShimmerTextView txtShimmer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        txtShimmer = (ShimmerTextView) findViewById(R.id.txt_shimmer);

        startShimmer();


        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(getBaseContext(),LoginActivity.class);
                startActivity(intent);
                finish();
            }
        },10000);



    }

    private void startShimmer() {
        Shimmer shimmer = new Shimmer();
        shimmer.setRepeatCount(3)
                .setDuration(3000)
                .setStartDelay(1000)
                .setDirection(Shimmer.ANIMATION_DIRECTION_LTR)
                .setAnimatorListener(new Animator.AnimatorListener() {
                    @Override
                    public void onAnimationStart(Animator animation) {
                        // do something to here
                    }

                    @Override
                    public void onAnimationEnd(Animator animation) {
                        // do something to here
                    }

                    @Override
                    public void onAnimationCancel(Animator animation) {
                        // do something to here
                    }

                    @Override
                    public void onAnimationRepeat(Animator animation) {
                        // do something to here
                    }
                });

        shimmer.start(txtShimmer);

    }
}
