package io.github.sangsoonam;

import android.util.Log;

public class NativeCallback {

    @UsedFromNativeCode
    void onLogin(String userId, String token) {
        Log.i("TAG", "onLogin");
    }

    @UsedFromNativeCode
    void onSessionEvent(int event, int param) {
        Log.i("TAG", "onSessionEvent");
    }

    public void onCreate() {
        Log.i("TAG", "onCreate");
    }
}
