package com.hastrim.hitungluas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView txtjdl;
    Button btnStart;
    EditText edtText;
    EditText edtPanjang;
    EditText edtLebar;
    TextView txtHasil;
    //membuat variable global ubntung menghitung luas
    Integer panjang,lebar,hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //inisiasi kedalam widget
        txtjdl = findViewById(R.id.txtJudul);
        btnStart = findViewById(R.id.btnStart);
        edtText = findViewById(R.id.edtText);

        //cara membuat variable widget dan langsung mengisinya/inilitiation
        edtPanjang = findViewById(R.id.edtpanjang);
        edtLebar = findViewById(R.id.edtlebar);
        txtHasil = findViewById(R.id.txtHasil);

        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hitung();

            }
        });
    }
    public void hitung(){
        String isieditText = edtText.getText().toString();
       panjang  = Integer.valueOf(edtPanjang.getText().toString());
        lebar  = Integer.valueOf(edtLebar.getText().toString());
        hasil = panjang * lebar;
        //cetak hasil
        txtHasil.setText("Hello "  +  isieditText  +  " Hasil Luasnya adalah: "  +  hasil);

    }
}
