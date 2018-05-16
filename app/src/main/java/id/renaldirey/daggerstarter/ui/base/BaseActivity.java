package id.renaldirey.daggerstarter.ui.base;

import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.WindowManager;

import butterknife.ButterKnife;
import id.renaldirey.daggerstarter.App;
import id.renaldirey.daggerstarter.di.component.ActivityComponent;
import id.renaldirey.daggerstarter.di.component.DaggerActivityComponent;
import id.renaldirey.daggerstarter.di.module.ActivityModule;

/**
 * Created by Kwikku on 12/05/2018.
 */

public class BaseActivity extends AppCompatActivity {

    private ActivityComponent activityComponent;

    // TODO : Binding Toolbar
//    @Optional @InjectView(R.id.toolbar) Toolbar toolbar;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityComponent = DaggerActivityComponent.builder()
                .activityModule(new ActivityModule(this))
                .applicationComponent(((App) getApplication()).getApplicationComponent()).build();
    }

    @Override
    public void setContentView(int layoutResID) {
        super.setContentView(layoutResID);
        injectViews();
    }

    protected void injectViews() {
        ButterKnife.inject(this);

        // TODO : Call Setup Toolbar
//        setupToolbar();
    }

    public void setContentViewWithoutInject(int layoutResId) {
        super.setContentView(layoutResId);
    }

    // TODO : Setup Toolbar
//    protected void setupToolbar() {
//        if (toolbar != null) {
//            setSupportActionBar(toolbar);
//            getSupportActionBar().setDisplayShowHomeEnabled(true);
//        }
//    }

//    public Toolbar getToolbar() {
//        return toolbar;
//    }


    // TODO : Setup Fragment
//    public void addFragment(Fragment fragment) {
//        FragmentManager fragmentManager = getSupportFragmentManager();
//        fragmentManager.popBackStack(MainActivity.class.getSimpleName(), FragmentManager.POP_BACK_STACK_INCLUSIVE);
//
//        // Add the new tab fragment
//        fragmentManager.beginTransaction()
//                .replace(R.id.fl_content, fragment, fragment.getClass().getSimpleName())
//                .addToBackStack(MainActivity.class.getSimpleName())
//                .commit();
//    }

    protected void setTransparentStatusBar() {
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.KITKAT) {
            return;
        }
        // set flags
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            getWindow().addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            getWindow().clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
            getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION);
            getWindow().setStatusBarColor(Color.TRANSPARENT);
        } else {
            getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        }
    }

    public ActivityComponent getActivityComponent() {
        return activityComponent;
    }

    public void setActivityComponent(ActivityComponent activityComponent) {
        this.activityComponent = activityComponent;
    }
}
