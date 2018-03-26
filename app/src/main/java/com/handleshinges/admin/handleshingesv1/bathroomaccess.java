package com.handleshinges.admin.handleshingesv1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class bathroomaccess extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bathroomaccess);
    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }

    }
