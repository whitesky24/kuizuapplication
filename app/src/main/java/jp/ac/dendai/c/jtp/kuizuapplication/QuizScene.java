package jp.ac.dendai.c.jtp.kuizuapplication;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class QuizScene {
    private int num = 0;

    //クイズ画面を表示
    public  void display(AppCompatActivity activity){
        activity.setContentView(R.layout.activity_main);
    }

    //テキストを表示をする処理
    public void writeText(AppCompatActivity activity, int level){
        //何問目かを表示
        TextView text1 = (TextView)activity.findViewById(R.id.number);
        text1.setText(getNumber(activity)[num]);
        text1.setTextSize(48.0f);
        text1.setTextColor(Color.BLACK);
        text1.setGravity(Gravity.CENTER);

        //難易度ごとに問題文と回答を表示
        switch (level){
            case 1:
                QuestionEasy(activity);
                AnswerEasy(activity);
                break;
            case 2:
                QuestionNormal(activity);
                AnswerNormal(activity);
                break;
            case 3:
                QuestionHard(activity);
                AnswerHard(activity);
                break;
        }

        num++;
    }

    //難易度EASYの問題文を取得
    public void QuestionEasy(AppCompatActivity activity){
        TextView textEasy = (TextView)activity.findViewById(R.id.question);
        textEasy.setText(getQuestionEasy(activity)[num]);
        textEasy.setTextSize(24.0f);
        textEasy.setTextColor(Color.BLACK);
        textEasy.setGravity(Gravity.CENTER);
    }

    //難易度NORMALの問題文を取得
    public void QuestionNormal(AppCompatActivity activity){
        TextView textNormal = (TextView)activity.findViewById(R.id.question);
        textNormal.setText(getQuestionNormal(activity)[num]);
        textNormal.setTextSize(24.0f);
        textNormal.setTextColor(Color.BLACK);
        textNormal.setGravity(Gravity.CENTER);
    }

    //難易度HARDの問題文を取得
    public void QuestionHard(AppCompatActivity activity){
        TextView textHard = (TextView)activity.findViewById(R.id.question);
        textHard.setText(getQuestionHard(activity)[num]);
        textHard.setTextSize(24.0f);
        textHard.setTextColor(Color.BLACK);
        textHard.setGravity(Gravity.CENTER);
    }

    //難易度EASYの回答を取得
    public void AnswerEasy(AppCompatActivity activity){
        TextView ansEasy1 = (TextView)activity.findViewById(R.id.button1);
        ansEasy1.setText(getAnswerEasy1(activity)[num]);
        ansEasy1.setTextColor(Color.BLACK);
        TextView ansEasy2 = (TextView)activity.findViewById(R.id.button2);
        ansEasy2.setText(getAnswerEasy2(activity)[num]);
        ansEasy2.setTextColor(Color.BLACK);
        TextView ansEasy3 = (TextView)activity.findViewById(R.id.button3);
        ansEasy3.setText(getAnswerEasy3(activity)[num]);
        ansEasy3.setTextColor(Color.BLACK);
        TextView ansEasy4 = (TextView)activity.findViewById(R.id.button4);
        ansEasy4.setText(getAnswerEasy4(activity)[num]);
        ansEasy4.setTextColor(Color.BLACK);
    }

    //難易度NORMALの回答を取得
    public void AnswerNormal(AppCompatActivity activity){
        TextView ansNormal1 = (TextView)activity.findViewById(R.id.button1);
        ansNormal1.setText(getAnswerNormal1(activity)[num]);
        ansNormal1.setTextColor(Color.BLACK);
        TextView ansNormal2 = (TextView)activity.findViewById(R.id.button2);
        ansNormal2.setText(getAnswerNormal2(activity)[num]);
        ansNormal2.setTextColor(Color.BLACK);
        TextView ansNormal3 = (TextView)activity.findViewById(R.id.button3);
        ansNormal3.setText(getAnswerNormal3(activity)[num]);
        ansNormal3.setTextColor(Color.BLACK);
        TextView ansNormal4 = (TextView)activity.findViewById(R.id.button4);
        ansNormal4.setText(getAnswerNormal4(activity)[num]);
        ansNormal4.setTextColor(Color.BLACK);
    }

    //難易度HARDの回答を取得
    public void AnswerHard(AppCompatActivity activity){
        TextView ansHard1 = (TextView)activity.findViewById(R.id.button1);
        ansHard1.setText(getAnswerHard1(activity)[num]);
        ansHard1.setTextColor(Color.BLACK);
        TextView ansHard2 = (TextView)activity.findViewById(R.id.button2);
        ansHard2.setText(getAnswerHard2(activity)[num]);
        ansHard2.setTextColor(Color.BLACK);
        TextView ansHard3 = (TextView)activity.findViewById(R.id.button3);
        ansHard3.setText(getAnswerHard3(activity)[num]);
        ansHard3.setTextColor(Color.BLACK);
        TextView ansHard4 = (TextView)activity.findViewById(R.id.button4);
        ansHard4.setText(getAnswerHard4(activity)[num]);
        ansHard4.setTextColor(Color.BLACK);
    }

    //回答ボタンにリスナーを実装
    public void button(AppCompatActivity activity, OnClickListener btn){
        activity.findViewById(R.id.button1).setOnClickListener(btn);
        activity.findViewById(R.id.button2).setOnClickListener(btn);
        activity.findViewById(R.id.button3).setOnClickListener(btn);
        activity.findViewById(R.id.button4).setOnClickListener(btn);
    }

    //何問目かをstringsから
    protected String[] getNumber(AppCompatActivity activity){
        return activity.getResources().getStringArray(R.array.number);
    }

    //問題文をstringsから取得
    protected String[] getQuestionEasy(AppCompatActivity activity){
        return activity.getResources().getStringArray(R.array.questionEasy);
    }
    protected String[] getQuestionNormal(AppCompatActivity activity){
        return activity.getResources().getStringArray(R.array.questionNormal);
    }
    protected String[] getQuestionHard(AppCompatActivity activity){
        return activity.getResources().getStringArray(R.array.questionHard);
    }

    //難易度EASYの回答をstringsから取得
    protected String[] getAnswerEasy1(AppCompatActivity activity){
        return activity.getResources().getStringArray(R.array.answerEasy1);
    }
    protected String[] getAnswerEasy2(AppCompatActivity activity){
        return activity.getResources().getStringArray(R.array.answerEasy2);
    }
    protected String[] getAnswerEasy3(AppCompatActivity activity){
        return activity.getResources().getStringArray(R.array.answerEasy3);
    }
    protected String[] getAnswerEasy4(AppCompatActivity activity){
        return activity.getResources().getStringArray(R.array.answerEasy4);
    }

    //難易度NORMALの回答をstringsから取得
    protected String[] getAnswerNormal1(AppCompatActivity activity){
        return activity.getResources().getStringArray(R.array.answerNormal1);
    }
    protected String[] getAnswerNormal2(AppCompatActivity activity){
        return activity.getResources().getStringArray(R.array.answerNormal2);
    }
    protected String[] getAnswerNormal3(AppCompatActivity activity){
        return activity.getResources().getStringArray(R.array.answerNormal3);
    }
    protected String[] getAnswerNormal4(AppCompatActivity activity){
        return activity.getResources().getStringArray(R.array.answerNormal4);
    }

    //難易度HARDの回答をstringsから取得
    protected String[] getAnswerHard1(AppCompatActivity activity){
        return activity.getResources().getStringArray(R.array.answerHard1);
    }
    protected String[] getAnswerHard2(AppCompatActivity activity){
        return activity.getResources().getStringArray(R.array.answerHard2);
    }
    protected String[] getAnswerHard3(AppCompatActivity activity){
        return activity.getResources().getStringArray(R.array.answerHard3);
    }
    protected String[] getAnswerHard4(AppCompatActivity activity){
        return activity.getResources().getStringArray(R.array.answerHard4);
    }
}
