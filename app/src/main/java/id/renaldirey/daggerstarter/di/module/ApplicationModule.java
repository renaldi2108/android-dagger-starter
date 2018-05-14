package id.renaldirey.daggerstarter.di.module;

import android.app.Application;
import android.content.Context;

import dagger.Module;
import dagger.Provides;
import id.renaldirey.daggerstarter.di.ApplicationContext;
import id.renaldirey.daggerstarter.holder.AppConstants;

/**
 * Created by Kwikku on 12/05/2018.
 */

@Module
public class ApplicationModule {

    private final Application application;

    public ApplicationModule(Application application) {
        this.application = application;
    }


    @Provides
    @ApplicationContext
    Context provideContext(){
        return application;
    }

    @Provides
    Application provideApplication(){
        return application;
    }

}
