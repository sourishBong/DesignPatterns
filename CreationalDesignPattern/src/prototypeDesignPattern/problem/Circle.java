package prototypeDesignPattern.problem;

import java.util.Objects;

public class Circle {

        private int radius;
        private String color;

        public Circle(int radius, String color) {
            this.radius = radius;
            this.color = color;
        }

        // Getters and setters...

        public Circle clone() {
            return new Circle(this.radius, this.color);
        }

    @Override
    public boolean equals(Object object2) {
        if (this == object2) {
            return true; // Same reference, so they are equal
        }
        if(object2==null || getClass()!=object2.getClass()){
            return false; //not same class
        }
        Circle shape2=(Circle) object2;
        return shape2.radius == radius && Objects.equals(shape2.color, color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(radius, color);
    }
}

