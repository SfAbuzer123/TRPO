package java.core;

public abstract class LogAbstract {
    protected String formatLog(String[] strings){
        return String.join(";\n\r", strings);
    }

    protected void writeConsole(String s){
        System.out.println(s);
    }

    protected void writeConsole(String[] s){
        System.out.println(formatLog(s));
    }
}
