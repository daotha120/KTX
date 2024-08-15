package com.example.KTX;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.on_tap01.R;

public class dk_KTX_Activity extends AppCompatActivity {

    private RadioGroup rdGroup;
    private RadioButton rd1Giuong, rd2Giuong, rd4Giuong, rd8Giuong;
    private CheckBox ckDoxe, ckWifi;
    private AppCompatButton btnChoose, btnExit, btnNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_dk_ktx);

        rdGroup = findViewById(R.id.rd_group );

        rd1Giuong = findViewById(R.id.rd_1giuong);
        rd2Giuong = findViewById(R.id.rd_2giuong);
        rd4Giuong = findViewById(R.id.rd_4giuong);
        rd8Giuong = findViewById(R.id.rd_8giuong);

        ckDoxe = findViewById(R.id.ck_doxe);
        ckWifi = findViewById(R.id.ck_wifi);

        btnChoose = findViewById(R.id.btn_choose);
        btnExit = findViewById(R.id.btn_exit);
        btnNext = findViewById(R.id.btn_next);

        btnExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.exit(0);
            }
        });

        btnChoose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Kiemtra();
            }
        });

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(dk_KTX_Activity.this, cs_KTX_Activity.class);
                startActivity(intent);
            }
        });

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    private void Kiemtra() {
        String checkBox1 = "", checkBox2 = "";
        String radio = "";

        if(rd1Giuong.isChecked()){
            radio = "Phong rieng 1 giuong";
        } else if (rd2Giuong.isChecked()) {
            radio = "Phong ghep 2 giuong";
        }else if (rd4Giuong.isChecked()) {
            radio = "Phong ghep 4 giuong";
        }else if (rd8Giuong.isChecked()) {
            radio = "Phong ghep 8 giuong";
        }

        if(ckDoxe.isChecked()){
            checkBox1 = "Bai do xe";
        } else if(ckWifi.isChecked()){
            checkBox2 = "Wifi";
        }

        Toast.makeText(dk_KTX_Activity.this, "Bạn đã đăng ký " + radio + ", " + checkBox1 + " " + checkBox2, Toast.LENGTH_LONG).show();
    }
}