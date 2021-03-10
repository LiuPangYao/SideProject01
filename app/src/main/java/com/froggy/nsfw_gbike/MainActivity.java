package com.froggy.nsfw_gbike;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;


public class MainActivity extends AppCompatActivity {

    public static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        testABC();
        createNBADataBase(2, 4);
        testBuildConfigSetting();
    }

    private void testBuildConfigSetting() {
        Log.d(TAG, "WEB URL CASH: " + BuildConfig.WEB_URL_CASH);
    }

    /**
     * prepareGenerateDoc 測試用
     * @since : v 0.0.6
     * @param : [a] 總投籃量
     * @return : int
     */
    private int prepareGenerateDoc(int a) {
        int hitRate = 100;
        return hitRate;
    }

    /**
     * testABC 測試用
     * @since : v 0.0.5
     */
    private void testABC() {

        Log.d(TAG, "testABC()");
    }

    /**
     * For 測試用 {@link MainActivity#testABC()}
     * @see MainActivity#testABC()
     * @since : v 0.0.5
     * @param : [a 為進球數, b 命中率]
     */
    private void createNBADataBase(int a, int b) {
        Log.d(TAG, "test");
    }

}
