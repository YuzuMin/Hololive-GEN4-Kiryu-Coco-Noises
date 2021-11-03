package com.yuzumin.utonoises;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.Switch;
import android.widget.TableRow;

import androidx.appcompat.app.AppCompatActivity;

public class ClickerSettings extends AppCompatActivity {

    ImageView back_btn;

    TableRow CocoIMG0Row;
    TableRow CocoIMG1Row;
    TableRow CocoIMG2Row;
    TableRow CocoIMG3Row;
    RadioButton CocoIMG0;
    RadioButton CocoIMG1;
    RadioButton CocoIMG2;
    RadioButton CocoIMG3;

    Integer charavalue;

    Switch switch0;
    Switch switch1;
    Switch switch2;


    SharedPreferences SoundSettings;
    SharedPreferences.Editor SoundSettingsEditor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.clicker_settings);
        getSupportActionBar().hide();

        back_btn=findViewById(R.id.back_btn);
        back_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });


        CocoIMG0=findViewById(R.id.coco0_img);
        CocoIMG0Row=findViewById(R.id.coco0_img_row);
        CocoIMG1=findViewById(R.id.coco1_img);
        CocoIMG1Row=findViewById(R.id.coco1_img_row);
        CocoIMG2=findViewById(R.id.coco2_img);
        CocoIMG2Row=findViewById(R.id.coco2_img_row);
        CocoIMG3=findViewById(R.id.coco3_img);
        CocoIMG3Row=findViewById(R.id.coco3_img_row);


        CocoIMG0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                charavalue=0;
                SoundSettingsEditor =getSharedPreferences("Chara",MODE_PRIVATE).edit();
                SoundSettingsEditor.putInt("CharaValue",charavalue);
                SoundSettingsEditor.apply();
                CocoIMG0.setChecked(true);
                CocoIMG1.setChecked(false);
                CocoIMG2.setChecked(false);
                CocoIMG3.setChecked(false);
            }
        });
        CocoIMG0Row.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                charavalue=0;
                SoundSettingsEditor =getSharedPreferences("Chara",MODE_PRIVATE).edit();
                SoundSettingsEditor.putInt("CharaValue",charavalue);
                SoundSettingsEditor.apply();
                CocoIMG0.setChecked(true);
                CocoIMG1.setChecked(false);
                CocoIMG2.setChecked(false);
                CocoIMG3.setChecked(false);
            }
        });
        CocoIMG1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                charavalue=1;
                SoundSettingsEditor =getSharedPreferences("Chara",MODE_PRIVATE).edit();
                SoundSettingsEditor.putInt("CharaValue",charavalue);
                SoundSettingsEditor.apply();
                CocoIMG0.setChecked(false);
                CocoIMG1.setChecked(true);
                CocoIMG2.setChecked(false);
                CocoIMG3.setChecked(false);
            }
        });
        CocoIMG1Row.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                charavalue=1;
                SoundSettingsEditor =getSharedPreferences("Chara",MODE_PRIVATE).edit();
                SoundSettingsEditor.putInt("CharaValue",charavalue);
                SoundSettingsEditor.apply();
                CocoIMG0.setChecked(false);
                CocoIMG1.setChecked(true);
                CocoIMG2.setChecked(false);
                CocoIMG3.setChecked(false);
            }
        });
        CocoIMG2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                charavalue=2;
                SoundSettingsEditor =getSharedPreferences("Chara",MODE_PRIVATE).edit();
                SoundSettingsEditor.putInt("CharaValue",charavalue);
                SoundSettingsEditor.apply();
                CocoIMG0.setChecked(false);
                CocoIMG1.setChecked(false);
                CocoIMG2.setChecked(true);
                CocoIMG3.setChecked(false);
            }
        });
        CocoIMG2Row.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                charavalue=2;
                SoundSettingsEditor =getSharedPreferences("Chara",MODE_PRIVATE).edit();
                SoundSettingsEditor.putInt("CharaValue",charavalue);
                SoundSettingsEditor.apply();
                CocoIMG0.setChecked(false);
                CocoIMG1.setChecked(false);
                CocoIMG2.setChecked(true);
                CocoIMG3.setChecked(false);
            }
        });
        CocoIMG3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                charavalue=3;
                SoundSettingsEditor =getSharedPreferences("Chara",MODE_PRIVATE).edit();
                SoundSettingsEditor.putInt("CharaValue",charavalue);
                SoundSettingsEditor.apply();
                CocoIMG0.setChecked(false);
                CocoIMG1.setChecked(false);
                CocoIMG2.setChecked(false);
                CocoIMG3.setChecked(true);
            }
        });
        CocoIMG3Row.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                charavalue=3;
                SoundSettingsEditor =getSharedPreferences("Chara",MODE_PRIVATE).edit();
                SoundSettingsEditor.putInt("CharaValue",charavalue);
                SoundSettingsEditor.apply();
                CocoIMG0.setChecked(false);
                CocoIMG1.setChecked(false);
                CocoIMG2.setChecked(false);
                CocoIMG3.setChecked(true);
            }
        });


        retrievedata();

        // for switch 0 to activate
        switch0=findViewById(R.id.switch0);
        SoundSettings =getSharedPreferences("save0",MODE_PRIVATE);
        switch0.setChecked(SoundSettings.getBoolean("value0",false));
        switch0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch0.isChecked()){
                    SoundSettingsEditor =getSharedPreferences("save0",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value0",true);
                    SoundSettingsEditor.apply();
                    switch0.setChecked(true);
                }else{
                    SoundSettingsEditor =getSharedPreferences("save0",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value0",false);
                    SoundSettingsEditor.apply();
                    switch0.setChecked(false);
                }
            }
        });

        // for switch 1 to activate
        switch1=findViewById(R.id.switch1);
        SoundSettings =getSharedPreferences("save1",MODE_PRIVATE);
        switch1.setChecked(SoundSettings.getBoolean("value1",true));
        switch1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch1.isChecked()){
                    SoundSettingsEditor =getSharedPreferences("save1",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value1",true);
                    SoundSettingsEditor.apply();
                    switch1.setChecked(true);
                }else{
                    SoundSettingsEditor =getSharedPreferences("save1",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value1",false);
                    SoundSettingsEditor.apply();
                    switch1.setChecked(false);
                }
            }
        });

        // for switch 2 to activate
        switch2=findViewById(R.id.switch2);
        SoundSettings =getSharedPreferences("save2",MODE_PRIVATE);
        switch2.setChecked(SoundSettings.getBoolean("value2",false));
        switch2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch2.isChecked()){
                    SoundSettingsEditor =getSharedPreferences("save2",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value2",true);
                    SoundSettingsEditor.apply();
                    switch2.setChecked(true);
                }else{
                    SoundSettingsEditor =getSharedPreferences("save2",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value2",false);
                    SoundSettingsEditor.apply();
                    switch2.setChecked(false);
                }
            }
        });
    }

    private void retrievedata(){
        SoundSettings=getSharedPreferences("Chara",MODE_PRIVATE);
        charavalue=SoundSettings.getInt("CharaValue",0);

        switch (charavalue) {
            case 0:
                CocoIMG0.setChecked(true);
                break;
            case 1:
                CocoIMG1.setChecked(true);
                break;
            case 2:
                CocoIMG2.setChecked(true);
                break;
            default:
                CocoIMG3.setChecked(true);
                break;
        }
    }
}