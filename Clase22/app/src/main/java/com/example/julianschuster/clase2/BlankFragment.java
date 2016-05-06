package com.example.julianschuster.clase2;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;


public class BlankFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_blank, container, false);

        Bundle datos = this.getActivity().getIntent().getBundleExtra("contacto");

        if(datos != null) {

            String name = datos.getString("name");
            String imageUrl = datos.getString("image");
            String phone = datos.getString("phone");
            String address = datos.getString("adress");
            String birthdate = datos.getString("birth");
            String email = datos.getString("email");
            boolean favorite = datos.getBoolean("fav");

            TextView textViewname = (TextView) view.findViewById(R.id.nameContact);
            TextView textViewphone = (TextView) view.findViewById(R.id.phoneContact);
            TextView textViewadress = (TextView) view.findViewById(R.id.adressContact);
            TextView textViewbirth = (TextView) view.findViewById(R.id.birthContact);
            TextView textViewemail = (TextView) view.findViewById(R.id.emailContact);
            ImageView imageViewImage = (ImageView) view.findViewById(R.id.ContactImage);
            textViewname.setText(name);
            textViewphone.setText(phone);
            textViewadress.setText(address);
            textViewbirth.setText(birthdate);
            textViewemail.setText(email);
            Picasso.with(imageViewImage.getContext()).load(imageUrl).into(imageViewImage);
        }

        Button boton = (Button)view.findViewById(R.id.botonllamar);


        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity().getApplicationContext(), "seba que puto que sos", Toast.LENGTH_SHORT).show();
            }
        });

        return view;

    }
}
