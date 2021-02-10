package com.szhuddea.buladde.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.szhuddea.buladde.R;
import com.szhuddea.buladde.models.kikaModel;

import java.util.ArrayList;
import java.util.List;


public class kika_adapter  extends RecyclerView.Adapter<kika_adapter .ViewHolder> {

    private List<kikaModel> items = new ArrayList<>();
    Context context;

    public kika_adapter(Context context, List<kikaModel> items){
        this.items = items;
        this.context = context;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(context);

        // Inflate the custom layout
        View contactView = inflater.inflate(R.layout.item_kika, parent, false);

        // Return a new holder instance
        ViewHolder viewHolder = new ViewHolder(contactView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {


        kikaModel kikaModel = items.get(position);

        // Set item views based on your views and data model
        holder.imag.setImageDrawable(context.getDrawable(kikaModel.image));
        holder.kikabtn.setText("KIKA: "+kikaModel.ekika);


    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    // Provide a direct reference to each of the views within a data item
    // Used to cache the views within the item layout for fast access
    public class ViewHolder extends RecyclerView.ViewHolder {
        // Your holder should contain a member variable
        // for any view that will be set as you render a row
        public ImageView imag;
        public Button kikabtn;

        // We also create a constructor that accepts the entire item row
        // and does the view lookups to find each subview
        public ViewHolder(View itemView) {
            // Stores the itemView in a public final member variable that can be used
            // to access the context from any ViewHolder instance.
            super(itemView);
            imag =  itemView.findViewById(R.id.imag);
            kikabtn = itemView.findViewById(R.id.kikabtn);

        }
    }
}
