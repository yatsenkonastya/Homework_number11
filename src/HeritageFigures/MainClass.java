package HeritageFigures;

public class MainClass {
    public static void main(String[] args) {

        Shape myTriangle = new Triangle(5, 0, 3, 1, 1, 8);
        Shape myTriangle1 = new Triangle(5, 0, 3, 1, 1, 8);


        Shape myCircle = new Circle(7,3,0,-5);
        Shape myCircle1 = new Circle(7,3,0,-5);


        Shape myRectangle = new Rectangle(3, 4, 5, 8, 4, 3, 2, 1, "Прямокутник");
        Shape myRectangle1 = new Rectangle(3, 4, 5, 8, 4, 3, 2, 1, "Інший прямокутник");

//масив фігур
        Shape[] arrayOfShapes = { myCircle, myRectangle, myTriangle};
        for (Shape arrayOfShape : arrayOfShapes) {
            arrayOfShape.calculateArea();
            arrayOfShape.calculatePerimeter();
            if(arrayOfShape == myTriangle) {
                arrayOfShape.paint("блакитний");
            }else if(arrayOfShape == myCircle) {
                arrayOfShape.paint("червоний");
            } else arrayOfShape.paint("чорний");
            System.out.println("\n");
        }

        System.out.println(myTriangle);
        System.out.println(myCircle);
        System.out.println(myRectangle);
        System.out.println("\n");

        System.out.println("Equals для трикутника: " + myTriangle.equals(myTriangle));
        System.out.println("Equals для трикутника та кола: " + myTriangle.equals(myCircle));
        System.out.println("Equals для прямокутника: " + myRectangle.equals(myRectangle));
        System.out.println("Equals для прямокутника з різними назвами: " + myRectangle.equals(myRectangle1));
        System.out.println("Equals для кола: " + myCircle.equals(myCircle1));
        System.out.println("Equals для кола та прямокутника : " + myCircle.equals(myRectangle) + "\n");
        System.out.println("Hashcode Трикутника: " + myTriangle.hashCode());
        System.out.println("Hashcode Прямокутника: " + myRectangle.hashCode());
        System.out.println("Hashcode Кола: " + myCircle.hashCode());
    }
}
