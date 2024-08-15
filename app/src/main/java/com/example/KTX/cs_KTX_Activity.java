package com.example.KTX;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.on_tap01.R;

public class cs_KTX_Activity extends AppCompatActivity {

    private TextView txtMyxa, txtLinhnam, txtMinhkhai, txtNamdinh;
    private AppCompatButton btnNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_cs_ktx);

        txtLinhnam = findViewById(R.id.txt_linhnam);
        txtMinhkhai = findViewById(R.id.txt_minhkhai);
        txtNamdinh = findViewById(R.id.txt_namdinh);
        txtMyxa = findViewById(R.id.txt_myxa);

        btnNext = findViewById(R.id.btn_next );

        txtLinhnam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(cs_KTX_Activity.this, "Bạn đã chọn cơ sở Linh Nam", Toast.LENGTH_LONG).show();
            }
        });

        txtMinhkhai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(cs_KTX_Activity.this, "Bạn đã chọn cơ sở Minh Khai", Toast.LENGTH_LONG).show();
            }
        });

        txtNamdinh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(cs_KTX_Activity.this, "Bạn đã chọn cơ sở Nam Dinh", Toast.LENGTH_LONG).show();
            }
        });

        txtMyxa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(cs_KTX_Activity.this, "Bạn đã chọn cơ sở My Xa", Toast.LENGTH_LONG).show();
            }
        });

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(cs_KTX_Activity.this, Json_SV_Activity.class);
                startActivity(intent);
            }
        });

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}