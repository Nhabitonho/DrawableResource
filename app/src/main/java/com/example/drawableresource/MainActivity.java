package com.example.drawableresource;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView mTvHex, mTvRng;
    SeekBar mSkAlpha, mSkGreen, mSkBlue, mSkRed;
    LinearLayout mLinerBackGround;
    int mAlpha = 0;
    int mRed = 0;
    int mGreen = 0;
    int mBlue = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkbox);

//        mTvHex = findViewById(R.id.textViewHex);
//        mTvRng = findViewById(R.id.textViewRGB);
//        mSkAlpha = findViewById(R.id.seekBarAlpha);
//        mSkRed = findViewById(R.id.seekBarRed);
//        mSkGreen = findViewById(R.id.seekBarGreen);
//        mSkBlue = findViewById(R.id.seekBarBlue);
//        mLinerBackGround = findViewById(R.id.linearBackGround);
//
//        mSkAlpha.setMax(255);
//        mSkRed.setMax(255);
//        mSkGreen.setMax(255);
//        mSkBlue.setMax(255);
//
//        mSkAlpha.setOnSeekBarChangeListener(onSeekBarChangeListener);
//        mSkRed.setOnSeekBarChangeListener(onSeekBarChangeListener);
//        mSkGreen.setOnSeekBarChangeListener(onSeekBarChangeListener);
//        mSkBlue.setOnSeekBarChangeListener(onSeekBarChangeListener);
//    }
//
//    private SeekBar.OnSeekBarChangeListener onSeekBarChangeListener = new SeekBar.OnSeekBarChangeListener() {
//        @Override
//        public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
//            switch (seekBar.getId()) {
//                case R.id.seekBarAlpha:
//                    mAlpha = i;
//                    break;
//                case R.id.seekBarRed:
//                    mRed = i;
//                    break;
//                case R.id.seekBarGreen:
//                    mGreen = i;
//                    break;
//                case R.id.seekBarBlue:
//                    mBlue = i;
//                    break;
//            }
//            mLinerBackGround.setBackgroundColor(Color.argb(mAlpha, mRed, mGreen, mBlue));
//            mTvRng.setText(String.format("RGB %s %s %s %s",mAlpha,mRed,mGreen,mBlue));
//            mTvHex.setText(String.format("HEX # %s %s %s %s",
//                    Integer.toHexString(mAlpha),
//                    Integer.toHexString(mRed),
//                    Integer.toHexString(mGreen),
//                    Integer.toHexString(mBlue)));
//        }
//        @Override
//        public void onStartTrackingTouch(SeekBar seekBar) {
//
//        }
//
//        @Override
//        public void onStopTrackingTouch(SeekBar seekBar) {
//
//        }
    };
}
