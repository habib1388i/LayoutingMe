package com.example.layoutingme;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class LoginActivity extends AppCompatActivity {

    @BindView(R.id.edt_username)
    TextInputEditText edtUsername;
    @BindView(R.id.edt_password)
    TextInputEditText edtPassword;
    @BindView(R.id.tv_forgot)
    TextView tvForgot;
    @BindView(R.id.btn_login)
    Button btnLogin;
    @BindView(R.id.btn_singup)
    Button btnSingup;
    private boolean isButtonClicked;
    private boolean isButtonClikcked;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.tv_forgot, R.id.btn_login, R.id.btn_singup})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.tv_forgot:

                break;

            case R.id.btn_login:

                isButtonClicked = !isButtonClicked;
                view.setBackgroundResource(isButtonClicked ? R.drawable.rounded_button_click : R.drawable.rounded_button);

                if (edtUsername.getText() == null) {
                    edtUsername.setError("Jangan Kosong");
                } else if (edtPassword.getText() == null) {
                    edtPassword.setError("Jangan Kosong");
                } else if (edtPassword.getText().length() < 6) {
                    edtPassword.setError("Password harus lebih dari 6 karakter");
                } else {
// Put Intent Here
                    Toast.makeText(this, "Intent", Toast.LENGTH_SHORT).show();
                }
                break;


                    case R.id.btn_singup:
                        startActivity(new Intent(LoginActivity.this,SingUpActivity.class));
                        break;
                }
        }
    }
