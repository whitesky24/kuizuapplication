package jp.ac.dendai.c.jtp.kuizuapplication;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class MainTitle {

    //タイトル画面の設定
    public void init(AppCompatActivity activity, OnClickListener start){
        activity.setContentView(R.layout.title);
        activity.findViewById(R.id.start_button).setOnClickListener(start);
        TextView text = (TextView)activity.findViewById(R.id.title);
        text.setText(activity.getResources().getString(R.string.title));
        text.setTextSize(48.0f);
        text.setTextColor(Color.BLACK);
        text.setGravity(Gravity.CENTER);
    }
}
