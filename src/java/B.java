package java;

import java.util.ArrayList;
import java.util.List;

public class B extends A {
    public List<Float> solution(Float a, Float b, Float c) {
        if (a == 0) {
            return  x = solution(b, c);
        }
        float sqrt = discriminant(a, b, c);
        if (sqrt < 0) {
            throw new RuntimeException("Discriminant < 0");
        }
        if (sqrt == 0){
            x.add((-b + 0) / 2 * a);
            return x;
        }
        x = new ArrayList<>();
        x.add((-b + sqrt) / 2 * a);
        x.add((-b - sqrt) / 2 * a);
        return x;
    }

    protected Float discriminant(float a, float b, float c) {
        return (float) Math.sqrt(Math.pow(b, 2) - 4 * a * c);
    }

    public static void main(String[] args) {
        List<Float> list = new B().solution(1F, -6F, 13F);
        for (Float integer:list) {
            System.out.println(integer);
        }
    }
}
