package com.serbanscorteanu.wrongWay.openClose.notsolved;

import com.serbanscorteanu.wrongWay.openClose.notsolved.IPrintTasks;

public class CannonUltraPerformantPrinter implements IPrintTasks {
    @Override
    public boolean scan(String content) {
        return false;
    }

    @Override
    public boolean printFromExternalDevice(String content) {
        return false;
    }

    @Override
    public boolean print(String content) {
        return false;
    }

    @Override
    public boolean openClose() {
        return false;
    }

    @Override
    public boolean authenticate(String content) {
        return false;
    }

    @Override
    public boolean fax(String content, String number) {
        return false;
    }
}
