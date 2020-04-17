package com.apps.taufiq.tugas2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/*
    Developed by 10117173 - Taufiq Muhamad Siraj - IF5
    on Wednesday, April 15 2020
 */

public class Login extends AppCompatActivity {
    @BindView(R.id.txtRegister)
    TextView txtRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

        txtRegister.setText(Html.fromHtml(getString(R.string.txtRegister)));
    }

    @OnClick(R.id.btn_login)
    void mulai() {
        // Perintah pindah halaman
        Intent intent = new Intent(this, Register.class);
        startActivity(intent);
    }
}
