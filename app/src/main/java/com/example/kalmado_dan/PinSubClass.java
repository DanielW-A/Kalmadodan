package com.example.kalmado_dan;

import android.app.Application;
import com.github.omadahealth.lollipin.lib.managers.LockManager;


public class PinSubClass extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        LockManager<CustomPinActivity> lockManager = LockManager.getInstance();
        lockManager.enableAppLock(this, CustomPinActivity.class);
    }


}
