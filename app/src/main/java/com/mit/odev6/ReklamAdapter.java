package com.mit.odev6;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.snackbar.Snackbar;
import com.mit.odev6.databinding.ReklamCardTasarimBinding;

import java.util.List;

public class ReklamAdapter extends RecyclerView.Adapter<ReklamAdapter.CardTasarimTutucu> {

    private Context mContext;
    private List<Reklam> reklamListesi;

    public ReklamAdapter(Context mContext, List<Reklam> reklamListesi) {
        this.mContext = mContext;
        this.reklamListesi = reklamListesi;
    }

    @NonNull
    @Override
    public CardTasarimTutucu onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ReklamCardTasarimBinding binding =
                ReklamCardTasarimBinding.inflate(LayoutInflater.from(mContext),parent,false);
        return new CardTasarimTutucu(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull CardTasarimTutucu holder, int position) {
        Reklam reklam =reklamListesi.get(position);
        ReklamCardTasarimBinding t=holder.binding;

        t.imageViewReklam.setImageResource(mContext.getResources()
                .getIdentifier(reklam.getReklamAd(),"drawable",mContext.getPackageName()));
        t.cardViewReklam.setOnClickListener(view->{

        });
    }

    @Override
    public int getItemCount() {
        return reklamListesi.size();
    }

    public class CardTasarimTutucu extends RecyclerView.ViewHolder {
        private ReklamCardTasarimBinding binding;
        public CardTasarimTutucu(ReklamCardTasarimBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}
