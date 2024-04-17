package swiggyapp;

public class Dish {
    private String name;
    private double price;
    private double rating;

    public Dish(String name, double price) {
        this.name = name;
        this.price = price;
        this.rating = 0;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }
    }


