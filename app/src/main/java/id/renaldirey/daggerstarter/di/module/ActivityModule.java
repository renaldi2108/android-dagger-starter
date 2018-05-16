package id.renaldirey.daggerstarter.di.module;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import id.renaldirey.daggerstarter.di.ActivityContext;
import id.renaldirey.daggerstarter.ui.model.Models;

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

    @Provides
    public Models provideModels() {
        return new Models("Hayy Duniaku ...");
    }
}
