package java;

public class Solution {

    public static void main(String[] args) {
        A a = new A();
        C c = new C();
        B b = new B();
        B b1 = new B();
        B b2 = new B();
        a.setB(b);
        a.setB(b1);
        b1.setC(c);
        b.setB(b2);
        b2.setC(c);
    }
}
