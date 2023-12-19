import java.util.Scanner;
import models.Point;
import models.Shape;
import java.io.File;
import java.io.FileNotFoundException;
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:\\Users\\Falon\\IdeaProjects\\untitled3\\src\\source");
        Scanner sc = new Scanner(file);
        Shape shape = new Shape();
        while (sc.hasNextLine()){
            double x = sc.nextDouble();
            double y = sc.nextDouble();

            Point point = new Point(x,y);
            shape.addPoint( point );
        }
        System.out.println(shape.calculatePerimetr());
        System.out.println(shape.getLongest());
        System.out.println(shape.getAverage());
    }
}