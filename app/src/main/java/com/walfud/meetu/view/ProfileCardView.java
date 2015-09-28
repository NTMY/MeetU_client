package com.walfud.meetu.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.walfud.meetu.R;

/**
 * Created by walfud on 2015/9/28.
 */
public class ProfileCardView extends FrameLayout {

    public static final String TAG = "ProfileCardView";

    protected Context mContext;
    protected RelativeLayout mRootLayout;
    protected ImageView mPortrait;
    protected TextView mNick;
    protected TextView mMood;

    public ProfileCardView(Context context) {
        this(context, null);
    }

    public ProfileCardView(Context context, AttributeSet attrs) {
        super(context, attrs);

        mContext = context;

        mRootLayout = (RelativeLayout) LayoutInflater.from(context).inflate(R.layout.view_profile_card, this, false);
        addView(mRootLayout);
        mPortrait = (ImageView) mRootLayout.findViewById(R.id.portrait);
        mNick = (TextView) mRootLayout.findViewById(R.id.nick);
        mMood = (TextView) mRootLayout.findViewById(R.id.mood);
    }

    // Function
    public ProfileData get() {
        return new ProfileData();
    }

    public void set(final ProfileData profileData) {
        final int duration = 200;
        // Fly out
        mPortrait.animate().translationX(-mPortrait.getWidth()).setStartDelay(0).setDuration(duration).setInterpolator(new AnticipateInterpolator());
        mNick.animate().translationX(-mNick.getWidth()).setStartDelay(50).setDuration(duration).setInterpolator(new AnticipateInterpolator());
        mMood.animate().translationX(-mMood.getWidth()).setStartDelay(100).setDuration(duration).setInterpolator(new AnticipateInterpolator());

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                // Change value
                mPortrait.setImageBitmap(profileData.portrait);
                mNick.setText(profileData.nick);
                mMood.setText(profileData.mood);

                // Fly in
                mPortrait.animate().translationX(0).setStartDelay(0).setDuration(duration).setInterpolator(new DecelerateInterpolator());
                mNick.animate().translationX(0).setStartDelay(50).setDuration(duration).setInterpolator(new DecelerateInterpolator());
                mMood.animate().translationX(0).setStartDelay(100).setDuration(duration).setInterpolator(new DecelerateInterpolator());
            }
        }, 700);
    }

    //
    public static class ProfileData {
        public Bitmap portrait;
        public String nick;
        public String mood;

        public ProfileData() {
        }
        public ProfileData(Bitmap portrait, String nick, String mood) {
            this.portrait = portrait;
            this.nick = nick;
            this.mood = mood;
        }
    }
}
