package com.suadahaji.android.firebasegoogleloginapplication.dagger;

import android.app.Application;

/**
 * @author suadahaji (suada.haji@andela.com)
 * @created 20/03/2018.
 */

public class BaseApplication extends Application {
    private AppComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        appComponent = DaggerAppComponent.builder()
                .application( this)
                .build();

        appComponent.inject(this);
    }

    public AppComponent getAppComponent() {
        return appComponent;
    }


}
