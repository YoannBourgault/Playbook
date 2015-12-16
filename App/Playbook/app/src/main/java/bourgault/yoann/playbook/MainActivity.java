package bourgault.yoann.playbook;

import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.wang.avi.AVLoadingIndicatorView;

import bourgault.yoann.playbook.textViews.RobotoTextView;

public class MainActivity extends AppCompatActivity {

    private AVLoadingIndicatorView mIndicatorView;
    private RobotoTextView mTextViewLoading;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        initLoadingIndicator();
        exampleLoading();
    }

    private void initLoadingIndicator() {
        mIndicatorView = (AVLoadingIndicatorView) findViewById(R.id.av_loading_indicator_view);
        mTextViewLoading = (RobotoTextView) findViewById(R.id.tv_loading);
    }

    private void startLoadingIndicator() {
        mIndicatorView.setVisibility(View.VISIBLE);
        mTextViewLoading.setVisibility(View.VISIBLE);
    }

    private void stopLoadingIndicator() {
        mIndicatorView.setVisibility(View.GONE);
        mTextViewLoading.setVisibility(View.GONE);
    }

    @SuppressWarnings("unused")
    private void exampleLoading() {
        startLoadingIndicator();
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            public void run() {
                stopLoadingIndicator();
            }
        }, 3000);
    }
}
