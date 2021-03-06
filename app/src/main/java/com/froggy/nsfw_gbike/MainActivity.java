package com.froggy.nsfw_gbike;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

/**
 * 20210306 更新
 */
public class MainActivity extends AppCompatActivity {

    public static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        testABC();
        // update code to github
        // test
        // 20210216 update Github code for blog
        // update test
        // test
        // third

        testBuildConfigSetting();
    }

    private void testBuildConfigSetting() {
        Log.d(TAG, "WEB URL CASH: " + BuildConfig.WEB_URL_CASH);
    }

    private void testABC() {
        // update remote test
        // commit conflict log
        Log.d(TAG, "onCreate: ");
    }

    /**
     * @Date : 2/13/21
     * @Title  : test
     * @Author : 紅色維尼
     * @Description :
     * @Return : void
     * @Parameter : [a, b]
     */
    private void test(int a, int b) {
        Log.d(TAG, "test: ");
    }

}
