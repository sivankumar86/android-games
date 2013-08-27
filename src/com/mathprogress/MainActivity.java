package com.mathprogress;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by siva on 8/25/13.
 */
public class MainActivity extends Activity {
    private Button _simple;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        final Context context = this;
        _simple=(Button) findViewById(R.id.simple);
        _simple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Intent intent = new Intent(context,SimpleMath.class);
                startActivity(intent);

            }

        });

    }
}
