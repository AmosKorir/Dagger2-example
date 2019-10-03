package com.t.testdagger;

import dagger.Module;
import dagger.Provides;
import javax.inject.Named;

/**
 * Created by Korir on 10/2/19.
 * amoskrr@gmail.com
 */
@Module
public class ApplicationModule {
  public ApplicationModule() {
  }

  @Provides
  @Named("testing") String provideProductNaming() {
    return "name changed";
  }
}
