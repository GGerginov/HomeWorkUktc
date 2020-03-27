package classOverLoading;


//Java class overloading
public class Car {

    private Integer year;


    private String manufacturer;


    private String model;


    public Car(Integer year, String manufacturer, String model) {
        this.year = year;
        this.manufacturer = manufacturer;
        this.model = model;
    }

    public Car(Integer year, String manufacturer) {
        this.year = year;
        this.manufacturer = manufacturer;
    }

    public Car(String manufacturer) {
        this.manufacturer = manufacturer;
    }


    @Override
    public String toString() {
        return "Car{" +
                "year=" + year +
                ", manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}


