package ru.mpei.HW1.vector_20_10_2024;

public class HW_vector_20_10_2024 {
    public static void main(String[] args) {
        double x1 = 1;
        double y1 = 0;
        double z1 = 0;

        double x2 = 1;
        double y2 = 1;
        double z2 = 0;

        Vector vectors = new Vector(x1 ,y1, z1, x2 ,y2, z2);

        double len1 = vectors.getLen1();
        System.out.println("Длина вектора 1: " + len1);
        double len2 = vectors.getLen2();
        System.out.println("Длина вектора 2: " + len2);
        System.out.println("Скалярное произведение векторов: " + vectors.getScalar());

        Vector vectorCount = new Vector(x1 ,y1, z1, x2 ,y2, z2);
        System.out.print("Векторное произведение векторов: ");
        for (int i = 0; i <= 2; i++){
            System.out.print(vectorCount.vectorProduct()[i] + " ");
        }

        Vector angle = new Vector(x1 ,y1, z1, x2 ,y2, z2);
        angle.setScalar(vectorCount.getScalar());
        angle.setLen1(len1);
        angle.setLen2(len2);
        System.out.println("//" + "Угол между векторами в градусах: " + angle.getAngle());
    }
}
