package top.moverco.mtaxiforpassenger.account.view;

/**
 * Created by Moverco.
 */

public interface ISmsCodeDialogView extends IView{
    /**
     * Show if registe success
     */
    void showRegisterSuc();
    /**
     * Show count down timer
     */
    void showCountDownTimer();

    /**
     * Show check information abour sms code
     * @param b
     */
    void showSmsCodeCheckState(boolean b);

    /**
     * Show if user exist
     * @param b
     */
    void showUserExist(boolean b);
}
