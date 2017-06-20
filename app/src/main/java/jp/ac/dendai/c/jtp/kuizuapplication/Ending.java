package jp.ac.dendai.c.jtp.kuizuapplication;

import android.support.v7.app.AppCompatActivity;
import android.view.View.OnClickListener;

public class Ending {

    //エンディング画面の設定
    public void init(AppCompatActivity activity, int point, OnClickListener end){
        if(point >= 3){
            activity.setContentView(R.layout.happyend);
            activity.findViewById(R.id.happy_button).setOnClickListener(end);
        } else{
            activity.setContentView(R.layout.badend);
            activity.findViewById(R.id.bad_button).setOnClickListener(end);
        }
    }
}
