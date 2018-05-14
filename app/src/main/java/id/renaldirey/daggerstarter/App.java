package id.renaldirey.daggerstarter;

import android.app.Application;

import id.renaldirey.daggerstarter.di.component.ApplicationComponent;
import id.renaldirey.daggerstarter.di.component.DaggerApplicationComponent;
import id.renaldirey.daggerstarter.di.module.ApplicationModule;

/**
 * Created by Kwikku on 12/05/2018.
 */

public class App extends Application {

    private ApplicationComponent applicationComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        applicationComponent = DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this)).build();
        applicationComponent.inject(this);
    }

    public ApplicationComponent getApplicationComponent() {
        return applicationComponent;
    }

    public void setApplicationComponent(ApplicationComponent mApplicationComponent) {
        this.applicationComponent = mApplicationComponent;
    }
}
