package pczhu.com.androidlibrary.activity;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * 名称：BaseActivity
 * 作用：根本基类
 * 描述：该类包含了非功能性的基类,主要用于
 * 1-划分生命周期;
 * 2-加载通用变量;
 * 3-加载第三方注解功能;
 * 作者：pczhu
 * 创建时间： 2017/3/7 下午12:25
 * 版本：V1.0
 * 修改历史：
 */

public abstract class BaseActivity extends AppCompatActivity {
    protected Context mContext;
    @Override
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(newBase);
        this.mContext = newBase;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initVariables();
        initViews();
        loadData();
    }


    /**
     * 加载初始化变量
     */
    protected abstract void initVariables();

    /**
     * 初始化布局
     */
    protected abstract void initViews();

    /**
     * 加载数据
     */
    protected abstract void loadData();

    @Override
    protected void onDestroy() {
        super.onDestroy();
        //TODO 清除缓存信息
        //dialog.dismiss()

    }
}
