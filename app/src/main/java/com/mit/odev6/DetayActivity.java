package com.mit.odev6;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.snackbar.Snackbar;
import com.mit.odev6.databinding.ActivityDetayBinding;

public class DetayActivity extends AppCompatActivity{
    private ActivityDetayBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityDetayBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Urun f =(Urun) getIntent().getSerializableExtra("Nesne");
        binding.toolbarDetay.setTitle(f.getUrunAd());
        binding.imageViewDetay.setImageResource(getResources()
                .getIdentifier(f.getResimAdi(),"drawable",getPackageName()));
        binding.textViewfiyatDetay.setText(f.getFiyat()+"tl");
        binding.textViewUrunOzellik.setText(f.getOzellik());
        binding.textViewUrunDetayAdi.setText(f.getUrunAd());
        binding.textViewUrunDetayKodu.setText(String.valueOf(f.getKod()));

        binding.buttonSiparisVer.setOnClickListener(view->{
            Snackbar.make(view,f.getUrunAd()+" Sipariş verildi ",Snackbar.LENGTH_SHORT).show();
        });

    }

}
