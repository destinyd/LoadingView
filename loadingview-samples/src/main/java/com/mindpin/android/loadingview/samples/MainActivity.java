package com.mindpin.android.loadingview.samples;

import android.os.AsyncTask;
import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;

import android.view.View;
import android.widget.LinearLayout;
import com.mindpin.android.loadingview.LoadingView;
import com.mindpin.android.loadingview.samples.BuildConfig;
import com.mindpin.android.loadingview.samples.R;

public class MainActivity extends Activity
{
    private LinearLayout mLoadingLayout;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new RequestTask().execute();
    }

    // 数据加载完毕后运行该方法
    public void loading_done(){
        LinearLayout main_info = (LinearLayout)findViewById(R.id.main_info_view);
        main_info.setVisibility(View.VISIBLE);

        LoadingView lv = (LoadingView)findViewById(R.id.loading_view);
        lv.hide();
    }


    private class RequestTask extends AsyncTask<Void, Long, Void> {
        @Override
        protected Void doInBackground(Void... params) {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return null;
        }

        @Override
        protected void onPostExecute(Void aVoid) {
            super.onPostExecute(aVoid);
            loading_done();
        }
    }
}
