package com.example.homeworklearn.ui.sidebar_fragment;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

/**
 * @ClassName : room_ku_DataBase
 * @Author : 骆发茂
 * @Date: 2021/5/8 8:21
 * @Description :
 */

/**继承RoomDatabase 的抽象类
 entities = {User.class}指定数据库用到的Entity类列表
 version = 1定义数据库的版本号，用于数据库升级
 定义一个抽象方法，返回之前定义的DAO类对象
 */
@Database(entities = room_ku_user.class,version = 1,exportSchema = false)
public abstract class room_ku_DataBase extends RoomDatabase {
    private static room_ku_DataBase instance;

    public abstract room_ku_userdao userdao();

    static room_ku_DataBase getInstance(Context context){
        if(instance ==null){
            instance= Room.databaseBuilder(context.getApplicationContext(),
                    room_ku_DataBase.class,"room")
                    .allowMainThreadQueries()
                    .build();
        }
        return instance;
    }
}
