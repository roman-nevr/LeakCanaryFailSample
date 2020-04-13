package ru.romaberendeev.simpleapplication.leakcanary;

import androidx.annotation.NonNull;

/**
 * Wrapper for LeakCanary. Needed for exclude LeakCanary classes in production builds
 */
@SuppressWarnings("unused")
public class LeakCanaryWrapperImpl {

  public void watch(@NonNull Object watchedReference) {
  }

  public void watch(@NonNull Object watchedReference, @NonNull String description) {
  }

  public String name() {
    return "fake";
  }
}
