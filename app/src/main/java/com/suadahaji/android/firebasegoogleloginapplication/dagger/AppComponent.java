package com.suadahaji.android.firebasegoogleloginapplication.dagger;

import com.suadahaji.android.firebasegoogleloginapplication.MainActivity;
import com.suadahaji.android.firebasegoogleloginapplication.SecondActivity;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;

/**
 * @author suadahaji (suada.haji@andela.com)
 * @created 20/03/2018.
 */
@Singleton
@Component(modules = {FirebaseModule.class})
public interface AppComponent {
    void inject(BaseApplication baseApplication);

    void inject(MainActivity mainActivity);

    void inject(SecondActivity secondActivity);

    @Component.Builder
    interface Builder {
        AppComponent build();
        @BindsInstance
        Builder application(BaseApplication application);
    }
}
