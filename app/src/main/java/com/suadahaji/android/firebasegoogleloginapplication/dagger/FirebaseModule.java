package com.suadahaji.android.firebasegoogleloginapplication.dagger;

import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.firebase.auth.FirebaseAuth;
import com.suadahaji.android.firebasegoogleloginapplication.R;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * @author suadahaji (suada.haji@andela.com)
 * @created 20/03/2018.
 */

@Module
public class FirebaseModule {
    @Provides
    @Singleton
    FirebaseAuth provideFirebaseAuth() {
        return FirebaseAuth.getInstance();
    }

    @Provides
    @Singleton
    GoogleSignInOptions provideGoogleSignInOptions(BaseApplication application) {
        return new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
                .requestIdToken(application.getApplicationContext().getString(R.string.default_web_client_id))
                .requestEmail()
                .build();
    }
}
