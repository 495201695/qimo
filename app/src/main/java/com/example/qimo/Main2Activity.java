package com.example.qimo;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.content.Intent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    private TextView Title;
    private ImageView kc;
    private ImageView gj;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Title = findViewById(R.id.Title);
        Intent intent = getIntent();
        String name = intent.getStringExtra("cjx");
        if (name != null){
            Title.setText(name+"欢迎来到你的空间");
        }

        kc = findViewById(R.id.kcgl);
        gj = findViewById(R.id.gjx);

        kc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main2Activity.this,Third.class);
                startActivity(intent);
            }
        });
    }
}
