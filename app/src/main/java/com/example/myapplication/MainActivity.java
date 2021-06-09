package com.example.myapplication;

import com.example.myapplication.enums.GodList;
import java.util.EnumSet;
import java.util.Random;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

  TextView helloTextView;
  Button clickMeButton;
  TextView resultTextView;
  ImageView godImageView;


  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    helloTextView = findViewById(R.id.textView);
    clickMeButton = findViewById(R.id.clickMe);
    resultTextView = findViewById(R.id.result);
    godImageView = findViewById(R.id.godImageView);
    EnumSet<GodList> godList = EnumSet.allOf(GodList.class);
    int test = godList.size();

    clickMeButton.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {

        int indexRandom = new Random().nextInt(godList.size());
        GodList godResult = GodList.values()[indexRandom];
        resultTextView.setTextColor(Color.BLACK);
        resultTextView.setTextSize(40);
        resultTextView.setText(godResult.getName() + "\n" + godResult.getRole().getRole());

      }
    });

  }
}
