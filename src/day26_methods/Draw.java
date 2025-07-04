package day26_methods;
// Runner Class
public class Draw {
    public static void main(String[] args) {

        Picture.draw();
        Picture.draw("Yellow");
        // Picture.draw(5); // Because NO int parameterize method

        Picture.draw("Red", "Blue");

        Picture.draw(7);
        // Picture.draw(6.0);// Because NO double parameterize method


        Picture.draw("Pink", 3);

        Picture.draw(4, "Green");


    }
}
