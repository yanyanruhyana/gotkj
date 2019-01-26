package net.sukasarifamily.gotkj;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText txtjarak, txtharga, txttip;
    TextView tvhasil;
    Button btntunai, btnvoucher;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtjarak =findViewById(R.id.txtjarak);
        txtharga = findViewById(R.id.txtharga);
        txttip = findViewById(R.id.txttip);
        tvhasil = findViewById(R.id.tvhasil);
        btntunai = findViewById(R.id.btntunai);
        btnvoucher = findViewById(R.id.btnvoucher);

        btntunai.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                int j1 = Integer.parseInt(txtjarak.getText().toString());
                int h1 = Integer.parseInt(txtharga.getText().toString());
                int t1 = Integer.parseInt(txttip.getText().toString());
                int jumlah = ((j1 * h1) + t1);
                tvhasil.setText(String.valueOf(jumlah));
            }
        });
        btnvoucher.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                int j2 = Integer.parseInt(txtjarak.getText().toString());
                int h2 = Integer.parseInt(txtharga.getText().toString());
                int t2 = Integer.parseInt(txttip.getText().toString());
                int jumlah = ((j2 * h2)*10/100) + t2;
                tvhasil.setText(String.valueOf(jumlah));
            }
        });


    }
}
