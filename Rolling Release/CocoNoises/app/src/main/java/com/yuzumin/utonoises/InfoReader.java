package com.yuzumin.utonoises;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class InfoReader extends AppCompatActivity {

    int value;
    ImageView back_btn;
    TextView title;
    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.reader);
        getSupportActionBar().hide();

        back_btn=findViewById(R.id.back_btn);
        back_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        Bundle extras = getIntent().getExtras();
        value = extras.getInt("Value");

        title=findViewById(R.id.reader_title);
        text=findViewById(R.id.reader_text);
        displaystuff();
    }

    private void displaystuff(){

        switch(value){
            case 0:
                title.setText(R.string.instruction_manual);
                text.setText(R.string.instruction_manual_text);
                break;
            case 1:
                title.setText(R.string.mit_license);
                text.setText("\n" +
                        "Copyright (c) 2021 YuzuMin\n" +
                        "\n" +
                        "Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the \"Software\"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:\n" +
                        "\n" +
                        "The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.\n" +
                        "\n" +
                        "THE SOFTWARE IS PROVIDED \"AS IS\", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.");
                break;
            case 2:
                title.setText(R.string.release_notes);
                text.setText(R.string.release_notes_text);
                break;
            default:
                title.setText(R.string.error);
                text.setText(R.string.error_text);
        }
    }
}