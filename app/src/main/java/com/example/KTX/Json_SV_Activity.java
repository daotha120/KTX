package com.example.KTX;



import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.on_tap01.R;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;

public class Json_SV_Activity extends AppCompatActivity {
    String json_data = "[" +
            "{" +
            "\"name\": \"Dao Thi Thao\", " +
            "\"gpa\": 3.1" +
            "}, " +
            "{" +
            "\"name\": \"Nguyen Tuan Anh\", " +
            "\"gpa\": 3.0" +
            "}, " +
            "{" +
            "\"name\": \"Tran Minh Lan\", " +
            "\"gpa\": 2.9" +
            "}" +
            "]";

    Button btnHienthi;
    ListView lvSinhvien;
    ArrayList<SinhVien> dssv = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_json_sv);
        btnHienthi = findViewById(R.id.btn_hienthi);
        lvSinhvien = findViewById(R.id.lv_sinhvien);

        docJson();

        btnHienthi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hienthiLv();
            }
        });

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    private void docJson() {
        try {
            JSONArray jsonArray = new JSONArray(json_data);
            for (int i = 0; i < jsonArray.length(); i++) {
                JSONObject jsonObject = jsonArray.getJSONObject(i);

                String name = jsonObject.getString("name");
                Double gpa = jsonObject.getDouble("gpa");

                SinhVien sv = new SinhVien(name, gpa);
                dssv.add(sv);
            }
        } catch (Exception e) {

        }
    }

    private void hienthiLv() {

        Adapter_sinhvien adapterSinhvien = new Adapter_sinhvien(this, dssv);
        lvSinhvien.setAdapter(adapterSinhvien);
    }
}