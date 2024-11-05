package com.example.tugas_apps;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class loginActivity extends AppCompatActivity {

    private EditText usernameEditText, passwordEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_frame);

        // Referensi elemen layout
        ImageView backButton = findViewById(R.id.imageView2);
        ImageView loginButton = findViewById(R.id.imageView13);
        usernameEditText = findViewById(R.id.editTextUsername);
        passwordEditText = findViewById(R.id.editTextPassword);

        // Fungsi tombol back
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Mengakhiri aktivitas saat back button diklik
                finish();
            }
        });

        // Fungsi tombol login
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Ambil teks dari EditText
                String username = usernameEditText.getText().toString();
                String password = passwordEditText.getText().toString();

                // Cek kredensial login sederhana
                if (username.equals("admin") && password.equals("password")) {
                    // Intent ke halaman utama atau aktivitas lain setelah login berhasil
                    Intent intent = new Intent(loginActivity.this, MainActivity.class);
                    startActivity(intent);
                    finish(); // Mengakhiri LoginActivity
                } else {
                    // Menampilkan pesan kesalahan
                    Toast.makeText(loginActivity.this, "Username atau password salah", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}


