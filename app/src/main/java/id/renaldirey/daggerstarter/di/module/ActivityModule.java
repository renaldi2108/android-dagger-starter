package id.renaldirey.daggerstarter.di.module;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;

import dagger.Module;
import dagger.Provides;
import id.renaldirey.daggerstarter.di.ActivityContext;

/**
 * Created by Kwikku on 12/05/2018.
 */

@Module
public class ActivityModule {

    private AppCompatActivity appCompatActivity;

    public ActivityModule(AppCompatActivity appCompatActivity) {
        this.appCompatActivity = appCompatActivity;
    }

    @Provides
    @ActivityContext
    Context provideContext(){
        return appCompatActivity;
    }

    @Provides
    AppCompatActivity provideAppCompatActivity(){
        return appCompatActivity;
    }

}
