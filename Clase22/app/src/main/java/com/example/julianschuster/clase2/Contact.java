package com.example.julianschuster.clase2;

import android.media.Image;
import android.net.Uri;

import java.net.URI;

/**
 * Created by julianschuster on 05/05/16.
 */
public class Contact {

    private String name;
    private String imageUrl;
    private String phone;
    private String address;
    private String birthdate;
    private String email;
    private boolean favorite;

    public Contact() {

    }

    public Contact(String name, String imageUrl, String phone, String address, String birthdate, String email, boolean favorite) {
        this.name = name;
        this.imageUrl = imageUrl;
        this.phone = phone;
        this.address = address;
        this.birthdate = birthdate;
        this.email = email;
        this.favorite = favorite;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isFavorite() {
        return favorite;
    }

    public void setFavorite(boolean favorite) {
        this.favorite = favorite;
    }
}
