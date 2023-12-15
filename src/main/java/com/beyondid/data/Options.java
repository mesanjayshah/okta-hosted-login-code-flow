package com.beyondid.data;

public class Options {
    public boolean multiOptionalFactorEnroll;
    public boolean warnBeforePasswordExpired;

    public Options() {
    }

    public Options(boolean multiOptionalFactorEnroll, boolean warnBeforePasswordExpired) {
        this.multiOptionalFactorEnroll = multiOptionalFactorEnroll;
        this.warnBeforePasswordExpired = warnBeforePasswordExpired;
    }

    public boolean isMultiOptionalFactorEnroll() {
        return multiOptionalFactorEnroll;
    }

    public void setMultiOptionalFactorEnroll(boolean multiOptionalFactorEnroll) {
        this.multiOptionalFactorEnroll = multiOptionalFactorEnroll;
    }

    public boolean isWarnBeforePasswordExpired() {
        return warnBeforePasswordExpired;
    }

    public void setWarnBeforePasswordExpired(boolean warnBeforePasswordExpired) {
        this.warnBeforePasswordExpired = warnBeforePasswordExpired;
    }

    @Override
    public String toString() {
        return "Options{" +
                "multiOptionalFactorEnroll=" + multiOptionalFactorEnroll +
                ", warnBeforePasswordExpired=" + warnBeforePasswordExpired +
                '}';
    }
}