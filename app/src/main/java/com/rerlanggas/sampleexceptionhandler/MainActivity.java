package com.rerlanggas.sampleexceptionhandler;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.rerlanggas.lib.ExceptionHandler;

/**
 * Created by Rian Erlangga on 17/10/2016. with awesomeness
 */
public class MainActivity extends AppCompatActivity {

    Button btnForceClose;
    Context ctx;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //init excetion handler
        ExceptionHandler.init(this, CrashActivity.class);
        setContentView(R.layout.activity_main);

        btnForceClose = (Button) findViewById(R.id.btn_fc);
        btnForceClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //do code for force close
                Toast.makeText(ctx, "", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
