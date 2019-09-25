package com.example.qimo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnLogin,btnExit ;
    EditText  etPwd, etNum;
    TextView tvMsg;
    private String number, pdd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnLogin=(Button) findViewById(R.id.btn_denglu);
        btnExit=(Button) findViewById(R.id.btn_tuichu);
        etNum =(EditText) findViewById(R.id.btn_username);
        etPwd=(EditText)findViewById(R.id.btn_password);
        btnLogin.setOnClickListener(new Action());
        btnExit.setOnClickListener(new Action());
        TransformationMethod method = PasswordTransformationMethod.getInstance();
        etPwd.setTransformationMethod(method);

    }

    class Action implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            number = etNum.getText().toString();
            pdd= etPwd.getText().toString();
            btnLogin.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String username = ((EditText) findViewById(R.id.btn_username)).getText().toString();
                    String password = ((EditText) findViewById(R.id.btn_password)).getText().toString();
                    if(username.equals("cjx")&& password.equals("123")){
                        Toast.makeText(MainActivity.this,"登录成功",Toast.LENGTH_LONG).show();
                        Intent intent = new Intent(MainActivity.this,Main2Activity.class);
                        intent.putExtra("ttt",username);
                        startActivity(intent);

                    }else{
                        Toast.makeText(MainActivity.this,"账号或密码错误，请重新输入",Toast.LENGTH_LONG).show();
                    }
                }
            });
    }
}}

