package com.apps.taufiq.tugas2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import butterknife.ButterKnife;
import butterknife.OnClick;

/*
    Developed by 10117173 - Taufiq Muhamad Siraj - IF5
    on Thursday, April 16 2020
 */

public class Register extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        ButterKnife.bind(this);
    }

    @OnClick(R.id.btn_register)
    void register() {
        // Perintah pindah halaman
        Intent intent = new Intent(this, almost.class);
        startActivity(intent);
    }
}
