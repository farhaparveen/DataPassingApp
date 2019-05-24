package com.example.datapassingapp;

import android.os.Parcel;
import android.os.Parcelable;

public class Person implements Parcelable {

    String id;
    String  name;
    String  contact;
    int img;


    public Person(String id, String name, String contact, int img) {
        this.id = id;
        this.name = name;
        this.contact = contact;
        this.img = img;
    }

    public Person(String id, String name, String contact) {
        this.id = id;
        this.name = name;
        this.contact = contact;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    protected Person(Parcel in) {
        id = in.readString();
        name = in.readString();
        contact = in.readString();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(id);
        dest.writeString(name);
        dest.writeString(contact);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<Person> CREATOR = new Creator<Person>() {
        @Override
        public Person createFromParcel(Parcel in) {
            return new Person(in);
        }

        @Override
        public Person[] newArray(int size) {
            return new Person[size];
        }
    };

    @Override
    public String toString() {
        return this.id + ". " + this.name + "."+ this.contact + "";

    }
}


