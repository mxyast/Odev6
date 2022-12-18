package com.mit.odev6;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.snackbar.Snackbar;
import com.mit.odev6.databinding.CardTasarimBinding;

import java.util.List;

public class UrunAdapter extends RecyclerView.Adapter<UrunAdapter.CardTasarimTutucu> {
    private Context mContext;
    private List<Urun> urunListesi;

    public UrunAdapter(Context mContext, List<Urun> urunListesi) {
        this.mContext = mContext;
        this.urunListesi = urunListesi;
    }

    @NonNull
    @Override
    public CardTasarimTutucu onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        CardTasarimBinding binding =
                CardTasarimBinding.inflate(LayoutInflater.from(mContext),parent,false);
        return new CardTasarimTutucu(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull CardTasarimTutucu holder, int position) {

        Urun urun=urunListesi.get(position);
        CardTasarimBinding t=holder.binding;

        t.imageViewUrun.setImageResource(mContext.getResources()
                .getIdentifier(urun.getResimAdi(),"drawable",mContext.getPackageName()));
        t.textViewfiyat.setText(urun.getFiyat()+"Tl");
        t.textViewUrunBilgi.setText(urun.getUrunAd());
        t.textViewUrunKodu.setText(String.valueOf(urun.getKod()));
        t.buttonSepeteEkle.setOnClickListener(view->{
            Snackbar.make(view,urun.getKod()+" sepete eklendi ",Snackbar.LENGTH_SHORT).show();
        });
        t.cardViewUrun.setOnClickListener(view->{
            Intent intent =new Intent(mContext,DetayActivity.class);
            intent.putExtra("Nesne",urun);
            mContext.startActivity(intent);
        });
    }

    @Override
    public int getItemCount() {
        return urunListesi.size();
    }

    public class CardTasarimTutucu extends RecyclerView.ViewHolder {
        private CardTasarimBinding binding;
        public CardTasarimTutucu(CardTasarimBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}
