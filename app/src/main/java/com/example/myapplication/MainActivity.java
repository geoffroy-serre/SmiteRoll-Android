package com.example.myapplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

  TextView helloTextView;
  Button clickMeButton;
  TextView resultTextView;


  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    helloTextView = findViewById(R.id.textView);
    clickMeButton = findViewById(R.id.clickMe);
    resultTextView = findViewById(R.id.result);

    clickMeButton.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        int indexRandom = new Random().nextInt(GodList.values().length);
        resultTextView.setTextColor(Color.BLACK);
        resultTextView.setTextSize(40);
        resultTextView.setText(GodList.values()[indexRandom].toString());
      }
    });

  }
}
