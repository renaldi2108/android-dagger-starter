package id.renaldirey.daggerstarter.ui.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.widget.Toast;

import javax.inject.Inject;

import id.renaldirey.daggerstarter.R;
import id.renaldirey.daggerstarter.ui.base.BaseActivity;
import id.renaldirey.daggerstarter.ui.model.Models;

public class MainActivity extends BaseActivity {

    @Inject
    Models models;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getActivityComponent().inject(this);
        Toast.makeText(this, models.getText(), Toast.LENGTH_SHORT).show();
        Log.e("message", models.getText());
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
