package org.codechimp.apprater;

/**
 * Created by htl on 15/8/24.
 */
public interface AppRaterListener {
    void onNegativeBtnClicked();
    void onLaterBtnClicked();
    void onRateBtnClicked();

    void onRatePromtShow();
}
