package java;

import java.chetverikov.ChetverikovLog;
import java.chetverikov.SquareEquations;
import java.exception.ChetverikovException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        SquareEquations equations = new SquareEquations();
        System.out.println("Введите a, b, c:");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            double a = Double.parseDouble(reader.readLine());
            double b = Double.parseDouble(reader.readLine());
            double c = Double.parseDouble(reader.readLine());
            reader.close();
            ChetverikovLog.getInstance().log("Введено уравнение " + a + "x^2 + " + b + "x + " + c);
            ArrayList<Double> roots = equations.solve(a, b, c);
            ChetverikovLog.getInstance().log("Корни уравненеия:" + roots );
        } catch (ChetverikovException e) {
            ChetverikovLog.getInstance().log(e.getLocalizedMessage());
        } catch (IOException e) {
            e.printStackTrace();
        }
        ChetverikovLog.getInstance().write();
    }
}
