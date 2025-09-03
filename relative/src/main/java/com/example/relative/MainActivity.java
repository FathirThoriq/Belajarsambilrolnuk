package com.example.relative;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    // Deklarasi TextView
    private TextView namaTextView, nimTextView, prodiTextView, jurusanTextView;
    private TextView jadwalSeninTextView, jadwalSelasaTextView, infoDetailTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Inisialisasi TextView
        namaTextView = findViewById(R.id.nama);
        nimTextView = findViewById(R.id.nim);
        prodiTextView = findViewById(R.id.prodi);
        jurusanTextView = findViewById(R.id.jurusan);
        jadwalSeninTextView = findViewById(R.id.jadwal_senin);
        jadwalSelasaTextView = findViewById(R.id.jadwal_selasa);
        infoDetailTextView = findViewById(R.id.info_detail);

        // Set data ke TextView
        setUserData();
    }

    private void setUserData() {
        // Data diri
        namaTextView.setText("Nama : Mohammad Yassir Thoriq");
        nimTextView.setText("NIM : E41240985");
        prodiTextView.setText("Prodi : Teknik Informatika");
        jurusanTextView.setText("Jurusan : Teknologi Informasi");

        // Jadwal
        jadwalSeninTextView.setText("Senin:\n08:00 - Pemrograman Mobile\n10:00 - Basis Data");
        jadwalSelasaTextView.setText("Selasa:\n08:00 - Algoritma Pemrograman\n10:00 - Jaringan Komputer");

        // Info mata kuliah
        infoDetailTextView.setText(
                "Mata Kuliah: Pemrograman Mobile\n" +
                        "Dosen: Prawidya Destarianto\n" +
                        "📌 Membahas pembuatan aplikasi Android dengan Java/Kotlin.\n" +
                        "👉 Capaian: Mahasiswa mampu membangun aplikasi mobile sederhana."
        );
    }
}
