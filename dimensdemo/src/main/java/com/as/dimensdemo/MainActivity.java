package com.as.dimensdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.as.dimensdemo.constants.DimenTypes;
import com.as.dimensdemo.utils.MakeUtils;

import java.io.File;

public class MainActivity extends AppCompatActivity {


    /**
     * 设计稿尺寸(将自己设计师的设计稿的宽度填入)
     */
    private static final int DESIGN_WIDTH = 1080;

    /**
     * 设计稿的高度  （将自己设计师的设计稿的高度填入）
     */
    private static final int DESIGN_HEIGHT = 1920;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        int smallest = DESIGN_WIDTH>DESIGN_HEIGHT? DESIGN_HEIGHT:DESIGN_WIDTH;  //     求得最小宽度
        DimenTypes[] values = DimenTypes.values();
        for (DimenTypes value : values) {
            File file = new File("");
            MakeUtils.makeAll(smallest, value, file.getAbsolutePath());
        }
    }
}
