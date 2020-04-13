# Add project specific ProGuard rules here.
# You can control the set of applied configuration files using the
# proguardFiles setting in build.gradle.
#
# For more details, see
#   http://developer.android.com/guide/developing/tools/proguard.html

# If your project uses WebView with JS, uncomment the following
# and specify the fully qualified class name to the JavaScript interface
# class:
#-keepclassmembers class fqcn.of.javascript.interface.for.webview {
#   public *;
#}

# Uncomment this to preserve the line number information for
# debugging stack traces.
#-keepattributes SourceFile,LineNumberTable

# If you keep the line number information, uncomment this to
# hide the original source file name.
#-renamesourcefileattribute SourceFile

-dontwarn com.google.errorprone.annotations.**

# https://github.com/square/leakcanary/issues/1754
# Leak Canary 2

# Loaded via reflection & referenced by shark.AndroidReferenceMatchers.LEAK_CANARY_INTERNAL
-keep class leakcanary.internal.InternalLeakCanary { *; }
# Referenced by shark.AndroidReferenceMatchers.LEAK_CANARY_HEAP_DUMPER
-keep class leakcanary.internal.AndroidHeapDumper { *; }
# Marshmallow removed Notification.setLatestEventInfo()
-dontwarn android.app.Notification