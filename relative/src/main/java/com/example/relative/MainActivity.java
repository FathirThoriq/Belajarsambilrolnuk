package com.example.relative;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    // Deklarasi TextView
    private TextView namaTextView, nimTextView, prodiTextView, jurusanTextView;
    private Button btnInfo; // Tambahkan Button

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Inisialisasi TextView
        namaTextView = findViewById(R.id.nama);
        nimTextView = findViewById(R.id.nim);
        prodiTextView = findViewById(R.id.prodi);
        jurusanTextView = findViewById(R.id.jurusan);

        // Inisialisasi Button
        btnInfo = findViewById(R.id.btnInfo);

        // Set data identitas
        setUserData();

        // Aksi saat button ditekan
        btnInfo.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, InfoActivity.class);
            startActivity(intent);
        });
    }

    private void setUserData() {
        // Data diri
        namaTextView.setText("Nama : Mohammad Yassir Thoriq");
        nimTextView.setText("NIM : E41240985");
        prodiTextView.setText("Prodi : Teknik Informatika");
        jurusanTextView.setText("Jurusan : Teknologi Informasi");
    }
}
