package com.mit.odev6;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;

import com.mit.odev6.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements SearchView.OnQueryTextListener{
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

       binding.rvReklam.setLayoutManager(
               new StaggeredGridLayoutManager(1,StaggeredGridLayoutManager.HORIZONTAL));
        binding.rvUrun.setLayoutManager(
               new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL));

        ArrayList<Reklam> reklamListesi=new  ArrayList<>();
        Reklam r1 =new Reklam(1,"reklam1");
        Reklam r2 =new Reklam(2,"reklam2");
        Reklam r3 =new Reklam(3,"reklam3");
        Reklam r4 =new Reklam(4,"reklam4");
        reklamListesi.add(r1);
        reklamListesi.add(r2);
        reklamListesi.add(r3);
        reklamListesi.add(r4);
        ReklamAdapter reklamAdapter=new ReklamAdapter(this,reklamListesi);
        binding.rvReklam.setAdapter(reklamAdapter);

        ArrayList<Urun> urunListesi=new  ArrayList<>();
        Urun u1 =new Urun(1234,"Hp Victus","bilgisayar","Hp Victus 16-d1029nt 12.Nesil Core i5 12500H-8Gb-512Ssd-16.1inc-Gtx1650",18999.0);
        Urun u2 =new Urun(1235,"ASUS MONITOR","monitor","ASUS 23,8\" VA24EHE 5Ms 75Hz Full HD HDMI FreeSync IPS Monitör",2766.0);
        Urun u3 =new Urun(1236,"Ipad Air","tablet","Ipad Air 5.Nesil 64GB WIFI 10.9''Liquid Retina Ekran iPadOS Tablet Purple",14999.0);
        Urun u4 =new Urun(1237,"iPhone 11","telefon","iPhone 11 64 Gb Siyah",15999.0);
        Urun u5 =new Urun(1238,"LG 50UQ81 Smart TV","tv","LG 50UQ81 50inc 126 cm 4K webOS Smart TV,Uydu Alıcılı",11999.0);
        Urun u6 =new Urun(1329,"OPPO Enco Buds2","img","OPPO Enco Buds2 Gerçek Kablosuz Kulaklık - Beyaz",599.0);
        urunListesi.add(u1);
        urunListesi.add(u2);
        urunListesi.add(u3);
        urunListesi.add(u4);
        urunListesi.add(u5);
        urunListesi.add(u6);
        UrunAdapter urunAdapter=new UrunAdapter(this,urunListesi);
        binding.rvUrun.setAdapter(urunAdapter);

    }

    @Override
    public boolean onQueryTextSubmit(String query) {
        return true;
    }

    @Override
    public boolean onQueryTextChange(String newText) {
        return true;
    }
}