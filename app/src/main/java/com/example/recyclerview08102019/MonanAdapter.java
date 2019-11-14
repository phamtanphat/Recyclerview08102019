package com.example.recyclerview08102019;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MonanAdapter extends RecyclerView.Adapter<MonanAdapter.MonanViewHolder> {

    private ArrayList<Monan> monanArrayList;

    public MonanAdapter(ArrayList<Monan> monanArrayList) {
        this.monanArrayList = monanArrayList;
    }

    @NonNull
    @Override
    public MonanViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.item_layout_monan,null);
        return new MonanViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MonanViewHolder holder, int position) {
        Monan monan = monanArrayList.get(position);
        holder.img.setImageResource(monan.getHinhanh());
        holder.txtTen.setText(monan.getTen());
        holder.txtMota.setText(monan.getMota());
    }

    @Override
    public int getItemCount() {
        return monanArrayList!= null ? monanArrayList.size() : 0;
    }

    class MonanViewHolder extends RecyclerView.ViewHolder{
        ImageView img;
        TextView txtTen,txtMota;
        public MonanViewHolder(@NonNull View itemView) {
            super(itemView);
            img = itemView.findViewById(R.id.imageviewHinh);
            txtTen = itemView.findViewById(R.id.textviewTen);
            txtMota = itemView.findViewById(R.id.textviewMota);
        }
    }
}
