package com.rainbow.kitchen.utils;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Environment;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.rainbow.kitchen.R;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


public class BitmapUtils {

    /**
     * 保存图片到本地
     * @param bmp:图片的bitmap对象
     * @param fileName:保存的图片的文件名称
     * @return
     */
    public static String  saveImageToSDCard(Bitmap bmp,String fileName) {
        // 首先保存图片
        File rootDir = new File(Environment.getExternalStorageDirectory(), "zhangchu");
        if (!rootDir.exists()) {
            rootDir.mkdir();
        }
        File file = new File(rootDir, fileName);
        try {
            FileOutputStream fos = new FileOutputStream(file);
            bmp.compress(Bitmap.CompressFormat.JPEG, 100, fos);
            fos.flush();
            fos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return  file.getAbsolutePath();

    }
    //根据指定地址得到文件名称
    public static String getFileName(String url) {
        String[] s = url.split("/");
        String name = s[s.length - 1];
        return name;
    }

    public static void  showImageToUser(Context context,String url, ImageView imageView) {
        Glide.with(context)
                .load(url)
                .placeholder(R.mipmap.ic_talent)
              //  .error(R.mipmap.food)
                .skipMemoryCache(true)
                .into(imageView);
    }
    public static void  showImagehead(Context context,String url, ImageView imageView) {
        Glide.with(context)
                .load(url)
                .transform(new GlideCircleTransform(context))
                .placeholder(R.mipmap.ic_talent)
                //.error(R.mipmap.food)
                .skipMemoryCache(true)
                .into(imageView);
    }

}
