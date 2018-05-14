package id.renaldirey.daggerstarter.ui.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;

import id.renaldirey.daggerstarter.R;
import id.renaldirey.daggerstarter.ui.base.BaseActivity;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

}
