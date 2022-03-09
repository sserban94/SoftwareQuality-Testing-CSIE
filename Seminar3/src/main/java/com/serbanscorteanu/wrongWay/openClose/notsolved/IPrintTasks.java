package com.serbanscorteanu.wrongWay.openClose.notsolved;

public interface IPrintTasks {
    boolean scan(String content);
    boolean printFromExternalDevice(String content);
    boolean print(String content);
    boolean openClose();
    boolean authenticate(String content);
    boolean fax(String content, String number);
}
