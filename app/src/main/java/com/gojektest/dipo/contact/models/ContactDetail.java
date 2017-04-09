package com.gojektest.dipo.contact.models;

import android.databinding.BaseObservable;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

import java.io.Serializable;
import java.util.Date;

/**
 * @author Dipo
 * @since 4/8/2017.
 */
@DatabaseTable(tableName = "ContactDetail")
public class ContactDetail extends BaseObservable implements Serializable {
    @DatabaseField(canBeNull = false, allowGeneratedIdInsert = true)
    private int id;
    @DatabaseField(canBeNull = false)
    private String first_name;
    @DatabaseField(canBeNull = false)
    private String last_name;
    @DatabaseField
    private String email;
    @DatabaseField(canBeNull = false)
    private String phone_number;
    @DatabaseField(canBeNull = false)
    private String profile_pic;
    @DatabaseField
    private boolean favorite;
    @DatabaseField
    private Date created_at;
    @DatabaseField
    private Date updated_at;

    public ContactDetail() {}

    public ContactDetail(int id, String first_name, String last_name, String email,
                         String phone_number, String profile_pic, boolean favorite, Date created_at,
                         Date updated_at) {
        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
        this.phone_number = phone_number;
        this.profile_pic = profile_pic;
        this.favorite = favorite;
        this.created_at = created_at;
        this.updated_at = updated_at;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
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

    public Date getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }

    public Date getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(Date updated_at) {
        this.updated_at = updated_at;
    }
}
