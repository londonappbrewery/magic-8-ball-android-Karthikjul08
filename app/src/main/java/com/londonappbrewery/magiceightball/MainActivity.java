package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button askButton;
    ImageView displayImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        askButton = (Button)findViewById(R.id.askButton);
        displayImage = (ImageView)findViewById(R.id.image_eightBall);

        askButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int [] buttonArray = {R.drawable.ball1, R.drawable.ball2, R.drawable.ball3,
                        R.drawable.ball4, R.drawable.ball5};

                Random randNumGen = new Random();
                int randomNumber = randNumGen.nextInt(5);
                displayImage.setImageResource(buttonArray[randomNumber]);

            }
        });






    }
}
