package java.chetverikov;

import java.core.EquationInterface;
import java.exception.ChetverikovException;
import java.util.ArrayList;
import java.util.List;

public class SquareEquations extends LinearEquations implements EquationInterface {

    @Override
    public ArrayList<Double> solve(double a, double b, double c) {
        if (a == 0) {
            return  x = solution(b, c);
        }
        ChetverikovLog.getInstance().log("Определено, что это квадратное уравнение");
        double sqrt = discriminant(a, b, c);
        if (sqrt < 0) {
            throw new ChetverikovException("Уравнение не имеет решений");
        }
        if (sqrt == 0){
            x.add((-b) / (2 * a));
            return x;
        }
        x = new ArrayList<>();
        x.add((-b + Math.sqrt(sqrt)) / (2 * a));
        x.add((-b - Math.sqrt(sqrt)) / (2 * a));
        return x;
    }

    protected Double discriminant(double a, double b, double c) {
        return Math.pow(b, 2) - 4 * a * c;
    }
}
