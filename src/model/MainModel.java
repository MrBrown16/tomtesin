package model;

public class MainModel {
    public double calcBodyWeight(double weight, double height){
        double bodyweight = weight / Math.pow(height, 2);

        return bodyweight;

    }
}
