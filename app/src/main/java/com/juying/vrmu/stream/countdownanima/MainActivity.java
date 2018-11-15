package com.juying.vrmu.stream.countdownanima;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    TextView animNumberTv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        animNumberTv = findViewById(R.id.tv_number_anim);
        //显示倒计时
        CountTimerUtil.start(animNumberTv);

    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        // 清除动画，如果有
        if (animNumberTv != null) animNumberTv.clearAnimation();
    }
}
