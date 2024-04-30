package oop.java.fundamental.data;

public class Fruits {

    public String fruit;

    public String color;
    public int weight;

    public Fruits(String fruit, String color, int weight){
        this.fruit = fruit;
        this.color = color;
        this.weight = weight;
    }

    public class products extends Fruits {

        public products(String fruit, String color, int weight) {
            super(fruit, color, weight);
        }
    }
}
