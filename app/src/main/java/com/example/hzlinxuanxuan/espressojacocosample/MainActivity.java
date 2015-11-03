package com.example.hzlinxuanxuan.espressojacocosample;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

import com.example.hzlinxuanxuan.mylibrary.LogUtil;

/**
 * Created by hzlinxuanxuan on 2015/11/3.
 */
public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void click(View view){
        LogUtil.d("there is a message");
    }
}
