package com.example.homeworklearn.ui.sidebar_fragment;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

/**
 * @ClassName : room_ku_user
 * @Author : 骆发茂
 * @Date: 2021/5/8 8:15
 * @Description :
 */

/**tableName=“users”，指定表名
 @PrimaryKey，指定为主键
 autoGenerate=true，自动生成id，与SQL语句中autoincrement的作用类似
 */
@Entity(tableName = "users")
public class room_ku_user {
    @PrimaryKey(autoGenerate = true)
    public  long id;
    public String username;
    public String age;
}
