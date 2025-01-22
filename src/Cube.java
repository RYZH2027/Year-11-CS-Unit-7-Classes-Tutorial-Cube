public class Cube {

    private int side;

    // No-argument constructor
    public Cube() {
        this.side = 1; // Default side length
    }

    // Constructor with side length
    public Cube(int side) {
        setSide(side); // Use setter to validate side length
    }

    // Getter for side
    public int getSide() {
        return side;
    }


    // Setter for side
    public void setSide(int side) {
        if (side <= 0) {
            throw new IllegalArgumentException("Side length must be positive.");
        }
        this.side = side;
    }

    // Method to calculate volume
    public int calculateVolume() {
        return side * side * side; // Volume = side^3
    }

    // Method to calculate surface area
    public int calculateSurfaceArea() {
        return 6 * side * side; // Surface Area = 6 * side^2
    }

    public String toString(){
        return "Cube: " + side;
    }
}

