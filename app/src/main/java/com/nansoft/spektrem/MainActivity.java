package com.nansoft.spektrem;

import android.content.Intent;
import android.speech.tts.TextToSpeech;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.util.Locale;

public class MainActivity extends AppCompatActivity implements TextToSpeech.OnInitListener {

    EditText edtUserText;
    private TextToSpeech mTts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // referencias al edit text
        edtUserText = (EditText) findViewById(R.id.edtUserText);


    }



    public void onClick(View view)
    {
        switch (view.getId())
        {
            case R.id.btnStartTalk:
                startToTalk();
                break;

            case R.id.btnShareText:
                break;

            case R.id.btnReset:
                break;
        }
    }

    private void startToTalk()
    {
        TextToSpeech textToSpeech = new TextToSpeech(this, this);
        textToSpeech.speak(edtUserText.getText().toString(),TextToSpeech.QUEUE_FLUSH, null);

    }

    // listener tts
    @Override
    public void onInit(int i) {

    }
}
