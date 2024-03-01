public class Car
{
  private int hoursepower;
 private double engineVolume;
 private String brand;
private String model;
 private int year;
private boolean isAutomatic;
public Car (int hoursepower, double engineVolume,  String brand, String model, int year, boolean isAutomatic )

    {
this.hoursepower= hoursepower;
this.engineVolume=engineVolume;
this.brand=brand;
this.model=model;
this.year=year;
this.isAutomatic=isAutomatic;
}

    public static void main(String[] args) {

        Car car1=new Car(200, 2.0, "Toyota", "Corolla", 2022, true);
        Car car2=new Car(180, 1.6, "Honda", "Civic", 2021, true);
        Car car3=new Car(250, 3.0, "BMW", "X5", 2020, true);
        Car car4 = new Car(150, 1.5, "Ford", "Focus", 2019, false);
        Car car5 = new Car(300, 2.5, "Mercedes-Benz", "E-Class", 2018, true);
        Car car6 = new Car(170, 1.8, "Nissan", "Sentra", 2017, false);
        Car car7 = new Car(220, 2.0, "Audi", "A4", 2016, true);
        Car car8 = new Car(190, 2.2, "Hyundai", "Elantra", 2015, false);
        Car car9 = new Car(210, 1.6, "Kia", "Rio", 2014, true);
        Car car10 = new Car(160, 2.0, "Chevrolet", "Cruze", 2013, false);
        double hpall = car1.hoursepower+car2.hoursepower+car3.hoursepower+car4.hoursepower+car5.hoursepower+car6.hoursepower+car7.hoursepower+car8.hoursepower+car9.hoursepower+car10.hoursepower;
System.out.println("hourse power all:  " + hpall);
double egVolall = car1.engineVolume+car2.engineVolume+car3.engineVolume+car4.engineVolume+car5.engineVolume+car6.engineVolume+car7.engineVolume+car8.engineVolume+car9.engineVolume+car10.engineVolume ;

        System.out.println("engine Volume all: " + egVolall);

    }

}
