package jp.ac.dendai.c.jtp.kuizuapplication;

import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Game {
    private AppCompatActivity activity;
    private SelectGame selectgame;
    private MainTitle title;
    private QuizScene scene;
    private  Ending end;
    private int level = 0;
    private int flag = 0;
    private  int point = 0;
    private String words = null;

    //コンストラクタ
    public Game(AppCompatActivity activity) {
        this.activity = activity;
    }

    //タイトル画面に遷移
    public void play() {
        title = new MainTitle();
        title.init(activity, start);
    }

    //難易度選択画面に遷移
    public void select(){
        selectgame = new SelectGame();
        selectgame.inti(activity, selectlevel);
    }

    //クイズ画面に遷移
    public void start() {
        scene = new QuizScene();
        scene.display(activity);
        scene.writeText(activity, level);
        scene.button(activity, btn);
    }

    //エンディング画面に遷移
    public void end() {
        end = new Ending();
        end.init(activity, point, restart);
    }

    //スタートボタンが押された時の処理
    OnClickListener start = new OnClickListener() {
        @Override
        public void onClick(View view) {
            select();
        }
    };

    //難易度選択ボタンが押された時の処理
    OnClickListener selectlevel = new OnClickListener() {
        @Override
        public void onClick(View view) {
            switch (view.getId()){
                case R.id.easy:
                    level = 1;
                    break;
                case R.id.normal:
                    level = 2;
                    break;
                case R.id.hard:
                    level = 3;
                    break;
            }
            start();
        }
    };

    //回答ボタンが押された時の処理
    OnClickListener btn = new OnClickListener() {
        @Override
        public void onClick(View view) {
            flag++;

            Button btn = (Button) view;
            words = (String) btn.getText();

            switch (words){
                case "青カビ":
                    point++;
                    break;
                case "RPG":
                    point++;
                    break;
                case "17":
                    point++;
                    break;
                case "ABC予想":
                    point++;
                    break;
                case "ルート5":
                    point++;
                    break;
                case "ひし形":
                    point++;
                    break;
                case "5.6":
                    point++;
                    break;
                case "12":
                    point++;
                    break;
                case "ムーアの法則":
                    point++;
                    break;
                case "力学的エネルギーの保存則":
                    point++;
                    break;
                case "光電効果":
                    point++;
                    break;
                case "カリフォルニア科学センター":
                    point++;
                    break;
            }

            if(flag != 4){
                scene.writeText(activity, level);
            } else{
                end();
                flag = 0;
                point = 0;
                level = 0;
            }
        }
    };

    //エンディング画面で戻るボタンが押された時の処理
    OnClickListener restart = new OnClickListener() {
        @Override
        public void onClick(View v) {
            play();
        }
    };
}
