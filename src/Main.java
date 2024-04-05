//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle(10, 30);
        Rectangle rect2 = new Rectangle(20, 20);
        Circle cicr1 = new Circle(1.18);
        Triangle tr1 = new Triangle(5.2,4.5,6.87);


        Figure [] arrayOfFigures = new Figure[]{rect1, rect2, tr1, cicr1};
        for (Figure f:arrayOfFigures){
            for (Figure g:arrayOfFigures)
                if (f!=g)
                    if(Figure.whosAreaBigger(f,g)) System.out.println("Yes"); else System.out.println("NO");

        }

    }
}
class Figure {
    public double calcArea (){
        return 0;
    }
    public static  boolean whosAreaBigger (Figure a, Figure b){
        double c = a.calcArea(); double d = b.calcArea();
        return c > d;
    }
}
class Circle extends Figure{
     double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calcArea() {
        return Math.PI*Math.pow(radius,2);
    }
}
class Rectangle extends Figure{
    double lenght; double width;

    public Rectangle(double lenght, double width) {
        this.lenght = lenght;
        this.width = width;
    }

    @Override
    public double calcArea() {
        return lenght*width;
    }
}
class Triangle extends Figure{
    double sideAB, sideBC, sideCA;

    public Triangle(double sideAB, double sideBC, double sideCA) {
        if(sideAB<(sideBC+sideCA)&&sideBC<(sideAB+sideCA)&&sideCA<(sideAB+sideBC)) {
            this.sideAB = sideAB;
            this.sideBC = sideBC;
            this.sideCA = sideCA;
        }
        else {
            System.out.println("такого треугольника не существует, введи стороны так, чтобы соблюдалось правило неравенства треугольника ");
            this.sideAB = 0;
            this.sideBC = 0;
            this.sideCA = 0;
        }
    }

    @Override
    public double calcArea() {
        double p= (sideAB+sideBC+sideCA)/2;
        return Math.sqrt(p*(p-sideAB)*(p-sideBC)*(p-sideCA));
    }
}


