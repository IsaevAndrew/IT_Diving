package com.example.kr;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.media.Image;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    boolean f=true;
    boolean f2=true;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageButton cam=(ImageButton)findViewById(R.id.cam);
        cam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (f)
                cam.setImageResource(R.drawable.video);
                else
                    cam.setImageResource(R.drawable.notvideo);
                f = !f;
            }
        });
        ImageButton mic=(ImageButton)findViewById(R.id.mic);
        mic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (f)
                    mic.setImageResource(R.drawable.mic);
                else
                    mic.setImageResource(R.drawable.notmic);
                f = !f;
            }
        });
        ImageButton hand=(ImageButton)findViewById(R.id.hand);
        hand.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder alert= new AlertDialog.Builder(MainActivity.this);
                alert.setMessage("привет");
                alert.show();
            }
        });
        ImageButton stop=(ImageButton)findViewById(R.id.stop);
        stop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finishAndRemoveTask();
            }
        });
        ImageButton chat=(ImageButton)findViewById(R.id.chat);
        chat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.fromParts("sms","0123456789",null));
                startActivity(intent);

            }
        });
        ImageButton contact = (ImageButton)findViewById(R.id.contact);
        contact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), Contact.class);
                startActivity(intent);
            }
        });
        TextView text1 = (TextView)findViewById(R.id.firsttext);
        TextView text2 = (TextView)findViewById(R.id.secondtext);
        ImageButton change = (ImageButton)findViewById(R.id.change);
        change.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    float text1x = text1.getX();
                    float text1y = text1.getY();

                    float text2x = text2.getX();
                    float text2y = text2.getY();

                    text1.setX(text2x);
                    text1.setY(text2y);

                    text2.setX(text1x);
                    text2.setY(text1y);
            }
        });
    }
};
