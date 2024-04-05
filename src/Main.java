//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle(10, 30);
        Rectangle rect2 = new Rectangle(20, 20);
        Circle cicr1 = new Circle(1.18);
        Triangle tr1 = new Triangle(5.2,4.5,6.87);
        if (rect1.whosAreaBigger(rect1, rect2)) System.out.println("Yes"); else System.out.println("NO");
        if (rect1.whosAreaBigger(rect1, tr1)) System.out.println("Yes"); else System.out.println("NO");
        if (rect1.whosAreaBigger(rect1, cicr1)) System.out.println("Yes"); else System.out.println("NO");

        if (rect2.whosAreaBigger(rect2, rect1)) System.out.println("Yes"); else System.out.println("NO");
        if (rect2.whosAreaBigger(rect2, tr1)) System.out.println("Yes"); else System.out.println("NO");
        if (rect2.whosAreaBigger(rect2, cicr1)) System.out.println("Yes"); else System.out.println("NO");

        if (tr1.whosAreaBigger(tr1, rect2)) System.out.println("Yes"); else System.out.println("NO");
        if (tr1.whosAreaBigger(tr1, rect1)) System.out.println("Yes"); else System.out.println("NO");
        if (tr1.whosAreaBigger(tr1, cicr1)) System.out.println("Yes"); else System.out.println("NO");

        if (cicr1.whosAreaBigger(cicr1, rect2)) System.out.println("Yes"); else System.out.println("NO");
        if (cicr1.whosAreaBigger(cicr1, tr1)) System.out.println("Yes"); else System.out.println("NO");
        if (cicr1.whosAreaBigger(cicr1, rect1)) System.out.println("Yes"); else System.out.println("NO");



        Figure [] arrayOfFigures = new Figure[]{rect1, rect2, tr1, cicr1};
        for (Figure f:arrayOfFigures){
            if(f.whosAreaBigger(f,))
        }

    }
}
class Figure {
    public double calcArea (){
        return 0;
    }
    public boolean whosAreaBigger (Figure a, Figure b){
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
    double AB, BC, CA;

    public Triangle(double AB, double BC, double CA) {
        this.AB = AB;
        this.BC = BC;
        this.CA = CA;
    }

    @Override
    public double calcArea() {
        double p= (AB+BC+CA)/2;
        return Math.sqrt(p*(p-AB)*(p-BC)*(p-CA));
    }
}