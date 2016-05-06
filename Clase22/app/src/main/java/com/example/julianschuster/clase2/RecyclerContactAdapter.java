package com.example.julianschuster.clase2;

import android.content.Context;
import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by julianschuster on 05/05/16.
 */
public class RecyclerContactAdapter extends RecyclerView.Adapter<RecyclerContactAdapter.ContactItemViewHolder>  {

    Context context;
    List<Contact> contacts;

    public RecyclerContactAdapter(Context context, List<Contact> list){
        this.context = context;
        this.contacts = list;
    }

    @Override
    public ContactItemViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.view_contact, parent, false);
        return new ContactItemViewHolder(v);
    }
    @Override
    public void onBindViewHolder(final ContactItemViewHolder holder, final int position) {
        holder.nameTextView.setText(contacts.get(position).getName());
        holder.phoneTextView.setText(contacts.get(position).getPhone());
        holder.emailTextView.setText(contacts.get(position).getEmail());
        Picasso.with(holder.contactImage.getContext()).load(contacts.get(position).getImageUrl()).into(holder.contactImage);
        holder.favImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageView favouriteStar = (ImageView)v;
                boolean fav = contacts.get(position).isFavorite();
                fav = !fav;
                contacts.get(position).setFavorite(fav);

                if(fav)
                {
                    favouriteStar.setImageResource(R.drawable.star_pink);
                }
                else
                {
                    favouriteStar.setImageResource(R.drawable.star);
                }
            }
        });



        final int positionFinal = position;
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle datos = new Bundle();
                datos.putString("name", contacts.get(positionFinal).getName());
                datos.putString("image", contacts.get(positionFinal).getImageUrl());
                datos.putString("phone", contacts.get(positionFinal).getPhone());
                datos.putString("adress", contacts.get(positionFinal).getAddress());
                datos.putString("birth", contacts.get(positionFinal).getBirthdate());
                datos.putString("email", contacts.get(positionFinal).getEmail());
                datos.putBoolean("fav", contacts.get(positionFinal).isFavorite());

                Intent goToContact = new Intent(context, MainActivity.class);
                goToContact.putExtra("contacto", datos);
                context.startActivity(goToContact);

            }
        });
    }
    @Override
    public int getItemCount() {
        return contacts.size();
    }

    public static class ContactItemViewHolder extends RecyclerView.ViewHolder{
        TextView nameTextView;
        TextView phoneTextView;
        TextView emailTextView;
        ImageView contactImage,favImage;
        public ContactItemViewHolder(View itemView) {
            super(itemView);
            nameTextView= (TextView) itemView.findViewById(R.id.ContactNameList);
            phoneTextView= (TextView) itemView.findViewById(R.id.ContactphoneList);
            emailTextView= (TextView) itemView.findViewById(R.id.ContactEmailList);
            favImage= (ImageView) itemView.findViewById(R.id.favIcon);
            contactImage= (ImageView) itemView.findViewById(R.id.imagecontact);


        }
    }
}
