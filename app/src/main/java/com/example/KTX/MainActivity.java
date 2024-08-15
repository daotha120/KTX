package com.example.KTX;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.on_tap01.R;

public class MainActivity extends AppCompatActivity {

    private EditText edtUsername, edtPassword;
    private AppCompatButton btnLogin, btnExit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        edtUsername = findViewById(R.id.edt_username);
        edtPassword = findViewById(R.id.edt_password);
        btnExit = findViewById(R.id.btn_exitf1);
        btnLogin = findViewById(R.id.btn_loginf1);

        btnExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.exit(0);
            }
        });

       btnLogin.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               String username =edtUsername.getText().toString();
               String passwork =edtPassword.getText().toString();
               if (edtUsername.getText().toString().equals("cnttk15hn")&&edtPassword.getText().toString().equals("cnttk15hn")){
                   Intent intent =new Intent(MainActivity.this, dk_KTX_Activity.class);
                   startActivity(intent);
               }else{
                   Toast.makeText(MainActivity.this,"tai khoan hoac mat khau khong dung",Toast.LENGTH_SHORT).show();
               }
           }
       });

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}