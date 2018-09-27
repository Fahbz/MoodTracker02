package com.fahbgar.moodtracker02;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;

/**
 *
 */
public class MainActivity extends AppCompatActivity {

    private static final String BUNDLE_MAINACTIVITY = "CECI EST INRATABLE";

    // Variable main activity views
    private ImageView mImgSmiley;
    private ImageButton mButtonAddNote;
    private ImageButton mButtonHistory;
    private RelativeLayout layout;


    // Variable table
    public static final int tableImgSmiley[] = {R.drawable.smiley_sad, R.drawable.smiley_disappointed, R.drawable.smiley_normal, R.drawable.smiley_happy, R.drawable.smiley_super_happy};
    public static final int tableBackgroundColor[] = {R.color.color_sad, R.color.color_disappointed, R.color.color_normal, R.color.color_happy, R.color.color_super_happy};

    /**
     *
     * @param savedInstanceState details
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.i(BUNDLE_MAINACTIVITY,"On create");

        mImgSmiley = findViewById(R.id.img_smiley);
        mButtonAddNote = findViewById(R.id.btn_add_note);
        mButtonHistory = findViewById(R.id.btn_history);
        layout = findViewById(R.id.main_activity_layout);
    }

}
