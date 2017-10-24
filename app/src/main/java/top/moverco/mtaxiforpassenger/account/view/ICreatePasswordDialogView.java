package top.moverco.mtaxiforpassenger.account.view;

/**
 * Created by Moverco.
 */

public interface ICreatePasswordDialogView extends IView {
    /**
     * Show if registe success
     */
    void showRegisterSuc();

    /**
     * Show if log in success
     */
    void showLoginSuc();

    /**
     * Set password to null
     */
    void showPasswordNull();

    /**
     * Show the password which inputed is not equal.
     */
    void showPasswordNotEqual();
}
