package top.moverco.mtaxiforpassenger.account.view.impl;

import android.app.Dialog;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.StyleRes;

import top.moverco.mtaxiforpassenger.account.view.ICreatePasswordDialogView;

/**
 * Created by Moverco.
 */

public class CreatePasswordDialogImpl extends Dialog implements ICreatePasswordDialogView {

    public CreatePasswordDialogImpl(@NonNull Context context) {
        super(context);
    }

    public CreatePasswordDialogImpl(@NonNull Context context, @StyleRes int themeResId) {
        super(context, themeResId);
    }

    @Override
    public void showLoading() {

    }

    @Override
    public void showError() {

    }

    @Override
    public void showRegisterSuc() {

    }

    @Override
    public void showLoginSuc() {

    }

    @Override
    public void showPasswordNull() {

    }

    @Override
    public void showPasswordNotEqual() {

    }
}
