package java;

import java.util.ArrayList;
import java.util.List;

public class A {
    protected List<Float> x;

    public List<Float> solution(float a, float b) {
        if(a==0)
            throw new RuntimeException("No roots");
        x = new ArrayList<>();
        x.add(-b / a);
        return x;
    }
}
