package com.example.homeworklearn.ui.newworldtwo;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.util.Log;

import com.example.homeworklearn.R;


public class Bullet {

    int x, y, width, height;
    Bitmap bullet;

    Bullet (Resources res) {
        Log.e("activityState", "子弹情况");


        bullet = BitmapFactory.decodeResource(res, R.drawable.bullet);

        width = bullet.getWidth();
        height = bullet.getHeight();

        width /= 4;
        height /= 4;

        width = (int) (width * GameView.screenRatioX);
        height = (int) (height * GameView.screenRatioY);

        bullet = Bitmap.createScaledBitmap(bullet, width, height, false);

    }

    Rect getCollisionShape () {
        return new Rect(x, y, x + width, y + height);
    }

}
