package com.t.testdagger;

import dagger.Component;

/**
 * Created by Korir on 10/2/19.
 * amoskrr@gmail.com
 */

@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {

  void inject(MainActivity mainActivity);
}
