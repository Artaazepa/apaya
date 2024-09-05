package com.example.apaya;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnBukaShopee;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.relative_main);
        // hubungkan variabel dengan button
        btnBukaShopee= findViewById(R.id.btn_buka_shopee);


        // berikan aksi pada button
        btnBukaShopee.setOnClickListener(v -> {
            Intent intent = new Intent();
            intent.setData(Uri.parse("https://shopee.co.id/LAPTOP-GAMING-ACER-NITRO-5-AN515-58-i5-12500H-16GB-1TB-SSD-RTX-3050-4GB-144Hz-WINDOWS-11-i.236174149.24617027612?sp_atk=e03efba8-0df0-4cf4-9db2-8daeb27deeb5&xptdk=e03efba8-0df0-4cf4-9db2-8daeb27deeb5"));
            intent.setAction(Intent.ACTION_VIEW);

            startActivity(intent);
        });


    }

}