public class Main {
    public static void main(String[] args) {
        Point point = new Point();
        point.setX(5);
        point.setY(10);

        System.out.println("Point");
        System.out.println("X = " + point.getX());
        System.out.println("Y = " + point.getY());
        System.out.println();

        Line line = new Line();
        line.setX1(1);
        line.setY1(2);
        line.setX2(3);
        line.setY2(4);

        System.out.println("Line");
        System.out.println("X1 = " + line.getX1());
        System.out.println("Y1 = " + line.getY1());
        System.out.println("X2 = " + line.getX2());
        System.out.println("Y2 = " + line.getY2());
        System.out.println();

        Person person = new Person();
        person.setSurname("Ivanov");
        person.setName("Artem");
        person.setAge(22);

        System.out.println("Person");
        System.out.println("Surname: " + person.getSurname());
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
    }
}
