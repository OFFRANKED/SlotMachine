//Author(s): Jatin Kumar Student ID: 101035696, Macdonald Maunder Student ID: 101060770,
//Created On: Feb 24, 2018
//Description: This is the main Game Activity java file with all the requested Functions and there Functionality.
//Git Hub: https://github.com/OFFRANKED/SlotMachine.git
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

    //Variables Name declare :
    Button B_bet2, B_bet4, B_bet8, B_reset, B_quit;
    ImageView I_Slot1, I_Slot2, I_Slot3;
    Random r;
    int slot1, slot2, slot3 ;
    int Money = 50;
    int Lose, Bet;
    TextView T_Money, T_Lose;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        //Random For switch
        r = new Random();

        //Button IDs
        B_bet2 = (Button) findViewById(R.id.Bet2);
        B_bet4 = (Button) findViewById(R.id.Bet4);
        B_bet8 = (Button) findViewById(R.id.Bet8);
        B_reset = (Button) findViewById(R.id.Reset);
        B_quit = (Button) findViewById(R.id.Quit);

        //Image holders for slots
        I_Slot1 = (ImageView) findViewById(R.id.Slot1);
        I_Slot2 = (ImageView) findViewById(R.id.Slot2);
        I_Slot3 = (ImageView) findViewById(R.id.Slot3);
        T_Money = (TextView) findViewById(R.id.Numb);
        T_Lose = (TextView) findViewById(R.id.Numb2);
        T_Money.setText("$ " + Money);

        //Money Check Function
        if((Money==0) || (Money<Bet))
        {
            B_bet2.setActivated(false);
            B_bet4.setActivated(false);
            B_bet8.setActivated(false);
        }
        else {
            //Bet $2 OnClick Function
            B_bet2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    //First Slot
                    I_Slot1.setBackgroundResource(R.drawable.anim);
                    final AnimationDrawable Slot1anim = (AnimationDrawable) I_Slot1.getBackground();
                    Slot1anim.start();
                    //Second Slot
                    I_Slot2.setBackgroundResource(R.drawable.anim);
                    final AnimationDrawable Slot2anim = (AnimationDrawable) I_Slot2.getBackground();
                    Slot2anim.start();
                    //Third  Slot
                    I_Slot3.setBackgroundResource(R.drawable.anim);
                    final AnimationDrawable Slot3anim = (AnimationDrawable) I_Slot3.getBackground();
                    Slot3anim.start();
                    Bet = 2;

                    //To Stop
                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            Slot1anim.stop();
                            Slot2anim.stop();
                            Slot3anim.stop();

                            setImages();
                            getScore();
                        }
                    }, 500);
                }
            });

            //Bet $4 OnClick Function
            B_bet4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    //First Slot
                    I_Slot1.setBackgroundResource(R.drawable.anim);
                    final AnimationDrawable Slot1anim = (AnimationDrawable) I_Slot1.getBackground();
                    Slot1anim.start();
                    //Second Slot
                    I_Slot2.setBackgroundResource(R.drawable.anim);
                    final AnimationDrawable Slot2anim = (AnimationDrawable) I_Slot2.getBackground();
                    Slot2anim.start();
                    //Third  Slot
                    I_Slot3.setBackgroundResource(R.drawable.anim);
                    final AnimationDrawable Slot3anim = (AnimationDrawable) I_Slot3.getBackground();
                    Slot3anim.start();
                    Bet = 4;

                    //To Stop
                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            Slot1anim.stop();
                            Slot2anim.stop();
                            Slot3anim.stop();

                            setImages();
                            getScore();
                        }
                    }, 500);
                }
            });

            //Bet $8 OnClick Function
            B_bet8.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    //First Slot
                    I_Slot1.setBackgroundResource(R.drawable.anim);
                    final AnimationDrawable Slot1anim = (AnimationDrawable) I_Slot1.getBackground();
                    Slot1anim.start();
                    //Second Slot
                    I_Slot2.setBackgroundResource(R.drawable.anim);
                    final AnimationDrawable Slot2anim = (AnimationDrawable) I_Slot2.getBackground();
                    Slot2anim.start();
                    //Third  Slot
                    I_Slot3.setBackgroundResource(R.drawable.anim);
                    final AnimationDrawable Slot3anim = (AnimationDrawable) I_Slot3.getBackground();
                    Slot3anim.start();
                    Bet = 8;

                    //To Stop
                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            Slot1anim.stop();
                            Slot2anim.stop();
                            Slot3anim.stop();

                            setImages();
                            getScore();
                        }
                    }, 500);
                }
            });
        }
        //Reset Button OnClick Function
        B_reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //startActivity(getIntent());
                recreate();
            }
        });


        B_quit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }

    //Set images function
    public void setImages()
    {
        //Random Images
        slot1 = r.nextInt(5) + 1;
        slot2 = r.nextInt(5) + 1;
        slot3 = r.nextInt(5) + 1;

        //Set Slot 1
        switch (slot1)
        {
            case 1:
                I_Slot1.setBackgroundResource(R.drawable.bently);
                break;
            case 2:
                I_Slot1.setBackgroundResource(R.drawable.carmalita);
                break;
            case 3:
                I_Slot1.setBackgroundResource(R.drawable.murry);
                break;
            case 4:
                I_Slot1.setBackgroundResource(R.drawable.sly);
                break;
            case 5:
                I_Slot1.setBackgroundResource(R.drawable.slysluckycoin);
                break;
        }

        //Set Slot 2
        switch (slot2)
        {
            case 1:
                I_Slot2.setBackgroundResource(R.drawable.bently);
                break;
            case 2:
                I_Slot2.setBackgroundResource(R.drawable.carmalita);
                break;
            case 3:
                I_Slot2.setBackgroundResource(R.drawable.murry);
                break;
            case 4:
                I_Slot2.setBackgroundResource(R.drawable.sly);
                break;
            case 5:
                I_Slot2.setBackgroundResource(R.drawable.slysluckycoin);
                break;
        }

        //Set Slot 3
        switch (slot3)
        {
            case 1:
                I_Slot3.setBackgroundResource(R.drawable.bently);
                break;
            case 2:
                I_Slot3.setBackgroundResource(R.drawable.carmalita);
                break;
            case 3:
                I_Slot3.setBackgroundResource(R.drawable.murry);
                break;
            case 4:
                I_Slot3.setBackgroundResource(R.drawable.sly);
                break;
            case 5:
                I_Slot3.setBackgroundResource(R.drawable.slysluckycoin);
                break;
        }
    }

    //Score Function
    public void getScore()
    {
        //3 Same Images
        if ((slot1==slot2) && (slot2==slot3))
        {
            Toast.makeText(this,"Jackpot",Toast.LENGTH_LONG).show();
            Money +=(3*Bet);
            //T_Money.getText();
            T_Money.setText("$ "+ Money);

        }
        //2 Same Image
        else if ((slot1==slot2) || (slot2==slot3) ||(slot1==slot3))
        {
            Toast.makeText(this,"Hit",Toast.LENGTH_LONG).show();
            T_Money.getText();
            Money +=(Bet+ Bet);
            T_Money.setText("$ " + Money);

        }
        //No same Image
        else {
            Lose += Bet;
            Money-= Bet;
            T_Money.setText("$ " + Money);
            T_Lose.setText("$ " + Lose);
        }

    }
}
