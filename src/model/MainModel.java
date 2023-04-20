package model;

public class MainModel {
    public boolean checkInput(String input) {
        if (input.matches("[0-9.,]+")) {
            return true;
        } else {
            return false;
        }

    }

    public double calcBodyWeight(double weight, double height) {
        double bodyweight = weight / Math.pow(height, 2);

        return bodyweight;

    }
}
