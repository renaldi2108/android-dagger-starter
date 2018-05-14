package id.renaldirey.daggerstarter.di.component;

import dagger.Component;
import id.renaldirey.daggerstarter.ui.activity.MainActivity;
import id.renaldirey.daggerstarter.di.PerActivity;
import id.renaldirey.daggerstarter.di.module.ActivityModule;

/**
 * Created by Kwikku on 12/05/2018.
 */

@PerActivity
@Component(dependencies = ApplicationComponent.class, modules = ActivityModule.class)
public interface ActivityComponent {

    // TODO : Inject your activity and Fragment ...

    void inject(MainActivity activity);

}
