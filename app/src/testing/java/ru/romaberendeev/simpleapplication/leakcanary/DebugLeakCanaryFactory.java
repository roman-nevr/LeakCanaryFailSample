package ru.romaberendeev.simpleapplication.leakcanary;

public class DebugLeakCanaryFactory {

    public LeakCanaryWrapperImpl getLeakCanary() {
        return new LeakCanaryWrapperImpl();
    }
}
