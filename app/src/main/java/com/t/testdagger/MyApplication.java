package com.t.testdagger;

import android.app.Application;

/**
 * Created by Korir on 10/2/19.
 * amoskrr@gmail.com
 */
public class MyApplication extends Application {
  ApplicationComponent applicationComponent;

  @Override public void onCreate() {
    super.onCreate();
    applicationComponent = DaggerApplicationComponent.builder()
        .applicationModule(new ApplicationModule())
        .build();
  }

  public ApplicationComponent getApplicationComponent() {
    return applicationComponent;
  }
}
