package id.renaldirey.daggerstarter.di.component;

import android.app.Application;
import android.content.Context;

import javax.inject.Singleton;

import dagger.Component;
import id.renaldirey.daggerstarter.App;
import id.renaldirey.daggerstarter.di.ApplicationContext;
import id.renaldirey.daggerstarter.di.module.ApplicationModule;

/**
 * Created by Kwikku on 12/05/2018.
 */

@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {

    void inject(App app);

    @ApplicationContext
    Context context();

    Application application();

}
