package com.serbanscorteanu.wrongWay.openClose.solved;

public class CannonUltraPerformantPrinter implements IPrintTasks,
        IAuthenticator, IFax, IPrintFromExternalSource, IScanner {

    @Override
    public boolean authenticate(String content) {
        return false;
    }

    @Override
    public boolean fax(String content, String number) {
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
    public boolean scan(String content) {
        return false;
    }
}
