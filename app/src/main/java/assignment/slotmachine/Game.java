package assignment.slotmachine;

import android.graphics.drawable.AnimationDrawable;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


import java.util.Random;

public class Game extends AppCompatActivity {

    Button b_bet5, b_bet10, b_bet20;
    ImageView Slot1, Slot2, Slot3;
    Random r;
    int slot1, slot2, slot3 ;
    int Money = 100;
    int lose, bet;
    TextView text , text2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        r = new Random();

        b_bet5 = (Button) findViewById(R.id.bet5);
        b_bet10 = (Button) findViewById(R.id.bet10);
        b_bet20 = (Button) findViewById(R.id.bet20);

        Slot1 = (ImageView) findViewById(R.id.Slot1);
        Slot2 = (ImageView) findViewById(R.id.Slot2);
        Slot3 = (ImageView) findViewById(R.id.Slot3);
        text= (TextView) findViewById(R.id.Numb);
        text2 = (TextView) findViewById(R.id.Numb2);
        text.setText("$ "+ Money);
        //Bet $5
        b_bet5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //First Slot
                Slot1.setBackgroundResource(R.drawable.anim);
                final AnimationDrawable Slot1anim = (AnimationDrawable) Slot1.getBackground();
                Slot1anim.start();
                //Second Slot
                Slot2.setBackgroundResource(R.drawable.anim);
                final AnimationDrawable Slot2anim = (AnimationDrawable) Slot2.getBackground();
                Slot2anim.start();
                //Third  Slot
                Slot3.setBackgroundResource(R.drawable.anim);
                final AnimationDrawable Slot3anim = (AnimationDrawable) Slot3.getBackground();
                Slot3anim.start();
                bet = 2;

                //To Stop
                Handler handler= new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        Slot1anim.stop();
                        Slot2anim.stop();
                        Slot3anim.stop();

                        setImages();
                        getScore();
                    }
                },500);
            }
        });

        //Bet $10
        b_bet10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //First Slot
                Slot1.setBackgroundResource(R.drawable.anim);
                final AnimationDrawable Slot1anim = (AnimationDrawable) Slot1.getBackground();
                Slot1anim.start();
                //Second Slot
                Slot2.setBackgroundResource(R.drawable.anim);
                final AnimationDrawable Slot2anim = (AnimationDrawable) Slot2.getBackground();
                Slot2anim.start();
                //Third  Slot
                Slot3.setBackgroundResource(R.drawable.anim);
                final AnimationDrawable Slot3anim = (AnimationDrawable) Slot3.getBackground();
                Slot3anim.start();
                bet = 4;

                //To Stop
                Handler handler= new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        Slot1anim.stop();
                        Slot2anim.stop();
                        Slot3anim.stop();

                        setImages();
                        getScore();
                    }
                },500);
            }
        });

        //Bet $20
        b_bet20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //First Slot
                Slot1.setBackgroundResource(R.drawable.anim);
                final AnimationDrawable Slot1anim = (AnimationDrawable) Slot1.getBackground();
                Slot1anim.start();
                //Second Slot
                Slot2.setBackgroundResource(R.drawable.anim);
                final AnimationDrawable Slot2anim = (AnimationDrawable) Slot2.getBackground();
                Slot2anim.start();
                //Third  Slot
                Slot3.setBackgroundResource(R.drawable.anim);
                final AnimationDrawable Slot3anim = (AnimationDrawable) Slot3.getBackground();
                Slot3anim.start();
                bet = 8;

                //To Stop
                Handler handler= new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        Slot1anim.stop();
                        Slot2anim.stop();
                        Slot3anim.stop();

                        setImages();
                        getScore();
                    }
                },500);
            }
        });

    }


    public void setImages()
    {
        //Random Images
        slot1 = r.nextInt(5) + 1;
        slot2 = r.nextInt(5) + 1;
        slot3 = r.nextInt(5) + 1;

        //Set First
        switch (slot1)
        {
            case 1:
                Slot1.setBackgroundResource(R.drawable.bently);
                break;
            case 2:
                Slot1.setBackgroundResource(R.drawable.carmalita);
                break;
            case 3:
                Slot1.setBackgroundResource(R.drawable.murry);
                break;
            case 4:
                Slot1.setBackgroundResource(R.drawable.sly);
                break;
            case 5:
                Slot1.setBackgroundResource(R.drawable.slysluckycoin);
                break;
        }

        switch (slot2)
        {
            case 1:
                Slot2.setBackgroundResource(R.drawable.bently);
                break;
            case 2:
                Slot2.setBackgroundResource(R.drawable.carmalita);
                break;
            case 3:
                Slot2.setBackgroundResource(R.drawable.murry);
                break;
            case 4:
                Slot2.setBackgroundResource(R.drawable.sly);
                break;
            case 5:
                Slot2.setBackgroundResource(R.drawable.slysluckycoin);
                break;
        }

        switch (slot3)
        {
            case 1:
                Slot3.setBackgroundResource(R.drawable.bently);
                break;
            case 2:
                Slot3.setBackgroundResource(R.drawable.carmalita);
                break;
            case 3:
                Slot3.setBackgroundResource(R.drawable.murry);
                break;
            case 4:
                Slot3.setBackgroundResource(R.drawable.sly);
                break;
            case 5:
                Slot3.setBackgroundResource(R.drawable.slysluckycoin);
                break;
        }
    }
    public void getScore()
    {
        //3 Same Images
        if ((slot1==slot2) && (slot2==slot3))
        {
            Toast.makeText(this,"Jackpot",Toast.LENGTH_LONG).show();
            Money +=(bet+bet);
            //text.getText();
            text.setText("$ "+ Money);

        }
        //2 Same Image
        else if ((slot1==slot2) || (slot2==slot3) ||(slot1==slot3))
        {
            Toast.makeText(this,"Hit",Toast.LENGTH_LONG).show();
            text.getText();
            Money +=(bet);
            text.setText("$ " + Money);

        }
        else {
            lose +=bet;
            Money-=bet;
            text.setText("$ " + Money);
            text2.setText("$ " + lose);
        }

    }
}
