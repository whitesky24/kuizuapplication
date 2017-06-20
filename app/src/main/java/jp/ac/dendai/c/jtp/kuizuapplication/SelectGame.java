package jp.ac.dendai.c.jtp.kuizuapplication;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.View.OnClickListener;
import android.widget.TextView;

/**
 * Created by DE on 2017/06/19.
 */

//難易度選択画面の設定
public class SelectGame {
    public void inti(AppCompatActivity activity, OnClickListener select){
        activity.setContentView(R.layout.selectquestion);

        activity.findViewById(R.id.easy).setOnClickListener(select);
        activity.findViewById(R.id.normal).setOnClickListener(select);
        activity.findViewById(R.id.hard).setOnClickListener(select);

        TextView text = (TextView)activity.findViewById(R.id.select);
        text.setText(activity.getResources().getString(R.string.select));
        text.setTextSize(48.0f);
        text.setTextColor(Color.BLACK);
        text.setGravity(Gravity.CENTER);

        TextView textEasy = (TextView)activity.findViewById(R.id.easy);
        textEasy.setText(activity.getResources().getStringArray(R.array.level)[0]);
        TextView textNormal = (TextView)activity.findViewById(R.id.normal);
        textNormal.setText(activity.getResources().getStringArray(R.array.level)[1]);
        TextView textHard = (TextView)activity.findViewById(R.id.hard);
        textHard.setText(activity.getResources().getStringArray(R.array.level)[2]);
    }
}
