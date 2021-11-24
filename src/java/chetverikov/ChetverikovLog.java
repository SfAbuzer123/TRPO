package java.chetverikov;

import java.core.LogAbstract;
import java.core.LogInterface;
import java.util.ArrayList;

public class ChetverikovLog extends LogAbstract implements LogInterface {
    private static ChetverikovLog instance = null;
    private static final ArrayList<String> logs = new ArrayList<>();

    private ChetverikovLog() {
    }

    public static ChetverikovLog getInstance(){
        if (instance == null)
            instance = new ChetverikovLog();
        return instance;
    }

    @Override
    public LogInterface log(String str) {
        logs.add(str);
        return this;
    }

    @Override
    public LogInterface write() {
        writeConsole(logs.toArray(new String[0]));
        return this;
    }
}
