package java.chetverikov;

import java.exception.ChetverikovException;
import java.util.ArrayList;

public class LinearEquations {
    protected ArrayList<Double> x;

    public ArrayList<Double> solution(double a, double b) {
        if(a==0)
            throw new ChetverikovException("Уравнение не имеет решений");
        x = new ArrayList<>();
        x.add(-b / a);
        System.out.println("Определено, что это линейное уравнение");
        return x;
    }
}
