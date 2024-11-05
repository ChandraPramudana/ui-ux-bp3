package com.example.tugas_apps;



import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class registerActivity extends AppCompatActivity {

    private EditText usernameEditText, passwordEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register_frame);

        // Referensi elemen layout
        ImageView backButton = findViewById(R.id.imageView4);
        ImageView registerButton = findViewById(R.id.imageView12);
        usernameEditText = findViewById(R.id.editTextUsername); // Pastikan ID sesuai
        passwordEditText = findViewById(R.id.editTextPassword); // Pastikan ID sesuai

        // Fungsi tombol back
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Mengakhiri aktivitas saat back button diklik
                finish();
            }
        });

        // Fungsi tombol register
        registerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Ambil teks dari EditText
                String username = usernameEditText.getText().toString();
                String password = passwordEditText.getText().toString();

                // Cek input sederhana
                if (!username.isEmpty() && !password.isEmpty()) {
                    // Simpan data atau pindah ke aktivitas lain setelah registrasi
                    Toast.makeText(registerActivity.this, "Registrasi berhasil", Toast.LENGTH_SHORT).show();

                    // Kembali ke layar login atau halaman utama
                    Intent intent = new Intent(registerActivity.this, MainActivity.class);
                    startActivity(intent);
                    finish(); // Mengakhiri RegisterActivity
                } else {
                    // Tampilkan pesan jika input kosong
                    Toast.makeText(registerActivity.this, "Username atau password tidak boleh kosong", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}

