package com.example.movie.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.movie.Model.DataModel;
import com.example.movie.R;

import java.util.List;

public class AdapterData extends RecyclerView.Adapter<AdapterData.HolderData>{
    private Context ctx;
    private List<DataModel> ListData;

    public AdapterData(Context ctx, List<DataModel> ListData) {
        this.ctx = ctx;
        this.ListData = ListData;
    }

    @NonNull
    @Override
    public HolderData onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View layout = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_item, parent, false);
        HolderData holder = new HolderData(layout);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull HolderData holder, int position) {
        DataModel dm = ListData.get(position);

        holder.tvId.setText(String.valueOf(dm.getId()));
        holder.tvNama.setText(dm.getNama());
        holder.tvDeskripsi.setText(dm.getDeskripsi());
        holder.tvTahun.setText(dm.getTahun());
    }

    @Override
    public int getItemCount() {
        return ListData.size();
    }

    public class HolderData extends RecyclerView.ViewHolder {
        TextView tvId, tvNama, tvDeskripsi, tvTahun;

        public HolderData(@NonNull View itemView) {
            super(itemView);

            tvId = itemView.findViewById(R.id.tv_id);
            tvNama = itemView.findViewById(R.id.tv_nama);
            tvDeskripsi = itemView.findViewById(R.id.tv_deskripsi);
            tvTahun = itemView.findViewById(R.id.tv_Tahun);
        }
    }

}
