public class Rectangle_Enc_Q3 {

    // private attribes

    private double length;
    private double width;

    // getters and setters

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if (length > 0) {
            this.length = length;
        } else {
            System.out.println(" Length must be positive..");
        }
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width > 0) {
            this.width = width;
        } else {
            System.out.println("Width must be positive");
        }
    }

    // calculate th area of the rectangle
    public double calculateArea() {
        return length * width;
    }

    // display info..

    public void displayInfo() {

        System.out.println("Length : " + length);
        System.out.println("width: " + width);
        System.out.println("Area : " + calculateArea());

    }

    public static void main(String[] args) {

        // create obj..

        Rectangle_Enc_Q3 rectangle = new Rectangle_Enc_Q3();

        rectangle.setLength(4);
        rectangle.setWidth(5);

        System.out.println("length : " + rectangle.getLength() + " : " + "width :" + rectangle.getWidth());

        // calculate area

        rectangle.calculateArea();

        rectangle.displayInfo();

    }

}
