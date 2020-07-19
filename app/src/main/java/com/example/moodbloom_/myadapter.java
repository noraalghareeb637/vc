package com.example.moodbloom_;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class myadapter extends RecyclerView.Adapter {

    ArrayList<moodbloom> marray ;
    Context context;

    public myadapter(ArrayList<moodbloom> marray,Context context) {

        this.marray = marray;
        this.context = context;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.moodbloom_items,parent,false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, final int position) {
        ((ViewHolder)holder).img.setImageResource(marray.get(position).getImage());
        ((ViewHolder)holder).mood.setText(marray.get(position).getName());
        ((ViewHolder)holder).view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(context,MainActivity3.class);
                i.putExtra("moodbloom",marray.get(position));
                context.startActivity(i);

            }
        });



    }

    @Override
    public int getItemCount() {
        return marray.size();
    }

   public static class ViewHolder extends RecyclerView.ViewHolder{

        public ImageView img ;
        public TextView mood;
        public View view;

       public ViewHolder(@NonNull View itemView) {
           super(itemView);
           view=itemView;
           mood=itemView.findViewById(R.id.textView);
           img=itemView.findViewById(R.id.imageView);

       }
   }
}
