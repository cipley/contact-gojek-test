package com.gojektest.dipo.contact.models;

import android.databinding.BaseObservable;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

import java.io.Serializable;

/**
 * @author Dipo
 * @since 4/8/2017.
 */
@DatabaseTable(tableName = "Contact")
public class Contact extends BaseObservable implements Serializable {
    @DatabaseField(canBeNull = false, allowGeneratedIdInsert = true)
    private int id;
    @DatabaseField(canBeNull = false)
    private String first_name;
    @DatabaseField(canBeNull = false)
    private String last_name;
    @DatabaseField(canBeNull = false)
    private String profile_pic;
    @DatabaseField
    private boolean favorite;
    @DatabaseField
    private String url;

    public Contact() {}

    public Contact(int id, String first_name, String last_name, String profile_pic, boolean favorite, String url) {
        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.profile_pic = profile_pic;
        this.favorite = favorite;
        this.url = url;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getProfile_pic() {
        return profile_pic;
    }

    public void setProfile_pic(String profile_pic) {
        this.profile_pic = profile_pic;
    }

    public boolean isFavorite() {
        return favorite;
    }

    public void setFavorite(boolean favorite) {
        this.favorite = favorite;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
