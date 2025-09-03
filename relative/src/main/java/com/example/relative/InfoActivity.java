package com.example.relative;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class InfoActivity extends AppCompatActivity {

    private TextView jadwalSeninTextView, jadwalSelasaTextView, infoDetailTextView;
    private Button btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);


        jadwalSeninTextView = findViewById(R.id.jadwal_senin);
        jadwalSelasaTextView = findViewById(R.id.jadwal_selasa);
        infoDetailTextView = findViewById(R.id.info_detail);
        btnBack = findViewById(R.id.btnBack);


        setInfoData();


        btnBack.setOnClickListener(v -> {
            Intent intent = new Intent(InfoActivity.this, MainActivity.class);

            startActivity(intent);
            finish();
        });
    }

    private void setInfoData() {

        jadwalSeninTextView.setText("Senin:\n08:00 - Pemrograman Mobile\n10:00 - Basis Data");
        jadwalSelasaTextView.setText("Selasa:\n08:00 - Algoritma Pemrograman\n10:00 - Jaringan Komputer");

        infoDetailTextView.setText(
                "Mata Kuliah: Pemrograman Mobile\n" +
                        "Dosen: Prawidya Destarianto\n" +
                        "📌 Membahas pembuatan aplikasi Android dengan Java/Kotlin.\n" +
                        "👉 Capaian: Mahasiswa mampu membangun aplikasi mobile sederhana."
        );
    }
}
