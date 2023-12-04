class RectangleAccessingMembers {
    int length;
    int width;

    // Method to calculate area
    int calculateArea() {
        return length * width;
    }

    public static void main(String[] args) {
        RectangleAccessingMembers rect = new RectangleAccessingMembers();

        // Accessing and setting dimensions directly
        rect.length = 5;
        rect.width = 10;

        // Calculating and displaying area
        System.out.println("Area by accessing members: " + rect.calculateArea());
    }
}