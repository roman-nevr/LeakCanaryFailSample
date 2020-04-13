package ru.romaberendeev.simpleapplication;

import android.app.Activity;
import android.app.Application;

import java.util.ArrayList;
import java.util.List;

import ru.romaberendeev.simpleapplication.leakcanary.LeakCanaryWrapperImpl;

public class App extends Application {

    public static List<Activity> activities = new ArrayList<>();
    public static LeakCanaryWrapperImpl leakCanaryWrapper;

    @Override
    public void onCreate() {
        super.onCreate();
        leakCanaryWrapper = new LeakCanaryWrapperImpl();
    }
}
