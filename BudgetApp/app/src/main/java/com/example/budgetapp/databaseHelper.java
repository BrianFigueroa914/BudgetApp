package com.example.budgetapp;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class databaseHelper extends SQLiteOpenHelper {

    private static final String databaseName = "registration.db";

    public databaseHelper(@Nullable Context context) {
       super(context, databaseName, null,1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table users(username TEXT primary key, email TEXT, password TEXT, phoneNumber TEXT)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("drop table if exists users");
    }
    public boolean insertData(String username, String email, String password, String phoneNumber) {
        SQLiteDatabase registrationDatabase = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("username", username);
        contentValues.put("email", email);
        contentValues.put("password", password);
        contentValues.put("phone", phoneNumber);
        long result = registrationDatabase.insert("users", null, contentValues);
        if (result == -1)
            return false;
        else
            return true;
    }
}
