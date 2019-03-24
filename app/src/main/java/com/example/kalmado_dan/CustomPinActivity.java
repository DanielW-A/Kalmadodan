package com.example.kalmado_dan;


import com.github.omadahealth.lollipin.lib.managers.AppLockActivity;

public class CustomPinActivity extends AppLockActivity {
    @Override
    public void showForgotDialog() {
        //Launch your popup or anything you want here
    }

    @Override
    public void onPinSuccess(int attempts) {

    }

    @Override
    public void onPinFailure(int attempts) {

    }

}
