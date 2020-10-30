package com.example.dark_gallery;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    ImageView pic;
    ImageButton prev,next;
    TextView text;
    int currentimage = 0;
    String names[] = {"C# LOGO","JS LOGO","TRAIN TRACK","JAVA LOGO","NODE JS PNG"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void prev(View v){
        text = (TextView) findViewById(R.id.pictext);
        String idX = "pic" + currentimage;
        int x = this.getResources().getIdentifier(idX,"id",getPackageName());
        pic = findViewById(x);
        pic.setAlpha(0f);

        currentimage =  ( 5 + currentimage - 1) % 5;
        String idY = "pic" + currentimage;
        int y = this.getResources().getIdentifier(idY,"id",getPackageName());
        pic = findViewById(y);
        pic.setAlpha(1f);
        text.setText(names[currentimage]);
    }
    public void next(View v){
        text = (TextView) findViewById(R.id.pictext);
        String idX = "pic" + currentimage;
        int x = this.getResources().getIdentifier(idX,"id",getPackageName());
        pic = findViewById(x);
        pic.setAlpha(0f);

        currentimage =  (currentimage + 1) % 5;
        String idY = "pic" + currentimage;
        int y = this.getResources().getIdentifier(idY,"id",getPackageName());
        pic = findViewById(y);
        pic.setAlpha(1f);
        text.setText(names[currentimage]);
    }
}