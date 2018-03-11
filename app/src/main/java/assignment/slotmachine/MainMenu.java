//Author(s): Jatin Kumar Student ID: 101035696, Macdonald Maunder Student ID: 101060770,
//Created On: Feb 24, 2018
//Description: This is the main MainMenu java file with all the requested Functions and there Functionality.
//Git Hub: https://github.com/OFFRANKED/SlotMachine.git
package assignment.slotmachine;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
        Context context = getApplicationContext();
        Toast.makeText(context, "onCreate completed", Toast.LENGTH_LONG).show();

        //Play Button
        Button playButtonVariable = (Button) findViewById(R.id.Play);
        PlayButtonListener playListenerVariable = new PlayButtonListener();
        playButtonVariable.setOnClickListener(playListenerVariable);

        //Quit Button
        Button quit = (Button) findViewById(R.id.Quit);
        QuitButtonListener quitListener = new QuitButtonListener();
        quit.setOnClickListener(quitListener);
    }

    //Quit Listener
    private class QuitButtonListener implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            finish();
        }
    }

    //Start Play function
    private void startPlay() {
        Intent intentInstance = new Intent(this, Game.class);
        startActivity(intentInstance);
    }
    //Play Listener
    private class PlayButtonListener implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            startPlay();
        }
    }
}
