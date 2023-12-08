package com.example.blink;

import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.graphics.Color;
import android.view.View;
import android.view.animation.Animation;

public class BlinkEffect {

    public static void blink(View view) {
        ObjectAnimator animator = ObjectAnimator.ofInt(
                view, "backgroundColor", Color.YELLOW,
                Color.RED, Color.GREEN
        );

        animator.setDuration(500);
        animator.setEvaluator(new ArgbEvaluator());
        animator.setRepeatMode(ValueAnimator.REVERSE);
        animator.setRepeatCount(Animation.INFINITE);
        animator.start();
    }
}
