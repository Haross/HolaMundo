package com.example.holamundo.holamundo;

import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.media.AudioTrack;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import android.media.SoundPool;

import java.io.IOException;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    MediaPlayer mediaPlayer = new MediaPlayer();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView FrasesLocas = (TextView) findViewById(R.id.TVFrases);
        Button Suicidar = (Button) findViewById(R.id.btSuicidar);
        mediaPlayer = MediaPlayer.create(this, R.raw.audio);



        final String[] Frase = new String[6];
        Frase[0]="No te tomes la vida tan en serio, pues no saldrás vivo de ella.";
        Frase[1]="Si no vas a soñar conmigo MEJOR NI TE DUERMAS!!";
        Frase[2]="is.... is... JHON CENA!!!!";
        Frase[3]="Si lo puedes imaginar, lo puedes programar...";
        Frase[4]="Si no trabajas por tus sueños, alguien te contratará para que trabajes por los suyos.";
        Frase[5]="por eso no nos visitan los extraterrestres";
        Suicidar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random  rnd = new Random();
                int i = rnd.nextInt(6);
                if(i==2) {
                    Toast.makeText(getBaseContext(), "Vamo cha Clash", Toast.LENGTH_SHORT).show();
                    mediaPlayer.start();
                }
                FrasesLocas.setText(Frase[i]);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.holis, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
    
}
