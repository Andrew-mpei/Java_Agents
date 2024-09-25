package ru.mpei.HW1.vector_20_10_2024;

public class Vector {
    private double x1, x2, y1, y2, z1, z2;

    private double scalar;
    private double len1;
    private double len2;
    public Vector(double x1, double y1, double z1, double x2, double y2, double z2) {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
        this.z1 = z1;
        this.z2 = z2;
    }

    public double[] vectorProduct (){
        double[] array = new double[3];
        array[0] = y1 * z2 - z1 * y2;
        array[1] = z1 * x2 - x1 * z2;
        array[2] = x1 * y2 - y1 * x2;
        return array;
    }

    public double getAngle() {
        return Math.toDegrees(Math.acos(scalar / (len1 * len2)) );
    }

    public double getScalar() {
        return x1 * x2 + y1 * y2 + z1 * z2;
    }

    public void setScalar(double scalar) {
        this.scalar = scalar;
    }

    public double getLen1() {
        return Math.sqrt(Math.pow((x1), 2) + Math.pow((y1), 2)+Math.pow((z1), 2));
    }

    public void setLen1(double len1) {
        this.len1 = len1;
    }

    public double getLen2() {
        return Math.sqrt(Math.pow((x2), 2) + Math.pow((y2), 2) + Math.pow((z2), 2));
    }

    public void setLen2(double len2) {
        this.len2 = len2;
    }
}
