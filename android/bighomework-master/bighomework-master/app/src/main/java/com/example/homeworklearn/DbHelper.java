package com.example.homeworklearn;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

/**
 * @ClassName : DHHelper
 * @Author : 骆发茂
 * @Date: 2021/5/7 22:20
 * @Description :
 */
public class DbHelper extends SQLiteOpenHelper {
    public static final String CREATE_TABLE ="create table users (id INTEGER PRIMARY KEY AUTOINCREMENT,"
            +"username TEXT," +
            "age INTEGER)";


    public DbHelper(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    public DbHelper(Context context){
        super(context,"sqlite.db",null,1);
        System.out.println("==============DbHelper=====================");


    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_TABLE);
        System.out.println("==============onCreate=====================");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        System.out.println("==============onUpgrade=====================");
    }
}
