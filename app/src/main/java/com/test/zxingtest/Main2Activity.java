package com.test.zxingtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    private TextView tv_show;
    private Button btn_share,btn_save;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        String s=getIntent().getStringExtra("message");
        tv_show=(TextView)findViewById(R.id.tv_show);
        tv_show.setText(s);
        btn_save=(Button)findViewById(R.id.btn_save);

        btn_share=(Button)findViewById(R.id.btn_share);
        btn_save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        btn_share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}
