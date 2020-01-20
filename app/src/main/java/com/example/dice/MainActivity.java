package com.example.dice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private ImageView imageViewDice, imageViewDice2, imageViewDice3, imageViewDice4, imageViewDice5 ;
    Random rng = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageViewDice = findViewById(R.id.dice1);
        imageViewDice2 = findViewById(R.id.dice2);
        imageViewDice3 = findViewById(R.id.dice3);
        imageViewDice4 = findViewById(R.id.dice4);
        imageViewDice5 = findViewById(R.id.dice5);

        Button button = findViewById(R.id.toggle_button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rollDice();
            }
        });

    }

     private void rollDice(){
         int RandomNumber1 =  rng.nextInt(6) + 1;
         int RandomNumber2 =  rng.nextInt(6) + 1;
         int RandomNumber3 =  rng.nextInt(6) + 1;
         int RandomNumber4 =  rng.nextInt(6) + 1;
         int RandomNumber5 =  rng.nextInt(6) + 1;

        switch (RandomNumber1){
            case 1:
                imageViewDice.setImageResource(R.drawable.dice1);
                break;
            case 2:
                imageViewDice.setImageResource(R.drawable.dice2);
                break;
            case 3:
                imageViewDice.setImageResource(R.drawable.dice3);
                break;
            case 4:
                imageViewDice.setImageResource(R.drawable.dice4);
                break;
            case 5:
                imageViewDice.setImageResource(R.drawable.dice5);
                break;
            case 6:
                imageViewDice.setImageResource(R.drawable.dice6);
                break;
        }
         switch (RandomNumber2) {
             case 1:
                 imageViewDice2.setImageResource(R.drawable.dice1);
                 break;
             case 2:
                 imageViewDice2.setImageResource(R.drawable.dice2);
                 break;
             case 3:
                 imageViewDice2.setImageResource(R.drawable.dice3);
                 break;
             case 4:
                 imageViewDice2.setImageResource(R.drawable.dice4);
                 break;
             case 5:
                 imageViewDice2.setImageResource(R.drawable.dice5);
                 break;
             case 6:
                 imageViewDice2.setImageResource(R.drawable.dice6);
                 break;
         }

         switch (RandomNumber3) {
             case 1:
                 imageViewDice3.setImageResource(R.drawable.dice1);
                 break;
             case 2:
                 imageViewDice3.setImageResource(R.drawable.dice2);
                 break;
             case 3:
                 imageViewDice3.setImageResource(R.drawable.dice3);
                 break;
             case 4:
                 imageViewDice3.setImageResource(R.drawable.dice4);
                 break;
             case 5:
                 imageViewDice3.setImageResource(R.drawable.dice5);
                 break;
             case 6:
                 imageViewDice3.setImageResource(R.drawable.dice6);
                 break;
         }
         switch (RandomNumber4) {
             case 1:
                 imageViewDice4.setImageResource(R.drawable.dice1);
                 break;
             case 2:
                 imageViewDice4.setImageResource(R.drawable.dice2);
                 break;
             case 3:
                 imageViewDice4.setImageResource(R.drawable.dice3);
                 break;
             case 4:
                 imageViewDice4.setImageResource(R.drawable.dice4);
                 break;
             case 5:
                 imageViewDice4.setImageResource(R.drawable.dice5);
                 break;
             case 6:
                 imageViewDice4.setImageResource(R.drawable.dice6);
                 break;
         }
         switch (RandomNumber5) {
             case 1:
                 imageViewDice5.setImageResource(R.drawable.dice1);
                 break;
             case 2:
                 imageViewDice5.setImageResource(R.drawable.dice2);
                 break;
             case 3:
                 imageViewDice5.setImageResource(R.drawable.dice3);
                 break;
             case 4:
                 imageViewDice5.setImageResource(R.drawable.dice4);
                 break;
             case 5:
                 imageViewDice5.setImageResource(R.drawable.dice5);
                 break;
             case 6:
                 imageViewDice5.setImageResource(R.drawable.dice6);
                 break;
         }
     }
}
