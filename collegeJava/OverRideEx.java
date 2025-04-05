class Vehicle {
    void engine() {
        System.out.println("This is vehile engine");
    }
}

class bike extends Vehicle {
    // @overiding
    void engine() {
        System.out.println("This is bike engine");
    }
}

class car extends Vehicle {
    // @overiding
    void engine() {
        System.out.println("This is car engine");
    }
}

class OverRideEx {
    public static void main(String[] args) {
        bike honda = new bike();
        honda.engine();
        car benz = new car();
        benz.engine();
    }
}
