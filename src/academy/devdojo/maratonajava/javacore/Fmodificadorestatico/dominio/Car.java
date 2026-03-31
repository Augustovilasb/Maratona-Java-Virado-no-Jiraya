package academy.devdojo.maratonajava.javacore.Fmodificadorestatico.dominio;

public class Car {

    private String brand;
    private double maxSpeed;
    public static double limitedSpeed = 250;

    public Car(String brand, double maxSpeed) {
        this.brand = brand;
        this.maxSpeed = maxSpeed;
    }

    public void imprime() {
        System.out.println("--------------");
        System.out.println("Nome: " + this.brand);
        System.out.println("Max Speed: " + this.maxSpeed);
        System.out.println("Limited Speed: " + Car.limitedSpeed);
    }

    public String getbrand() {
        return brand;
    }

    public void setbrand(String brand) {
        this.brand = brand;
    }

    public double getmaxSpeed() {
        return maxSpeed;
    }

    public void setmaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

}
