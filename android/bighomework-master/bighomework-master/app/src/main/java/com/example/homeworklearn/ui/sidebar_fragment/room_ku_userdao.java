package com.example.homeworklearn.ui.sidebar_fragment;

/**
 * @ClassName : room_ku_userdao
 * @Author : 骆发茂
 * @Date: 2021/5/8 8:15
 * @Description :
 */

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

/**insert参数为User类型（之前定义的Entity类）
 Room库会自动为实现insert方法，将user对象中的数据插入数据库
 @Query，指定查询的SQL语句
 */
@Dao
public interface room_ku_userdao {
    @Insert
    void insert(room_ku_user user);

    @Query("select * from users")
    List<room_ku_user> getAll();

    @Query("select * from users where age<:age")
    List<room_ku_user> searchUsersByAge(int age);
}
