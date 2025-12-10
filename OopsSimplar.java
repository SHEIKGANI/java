//attributes(class Creation)
class Car{
    String brandname;
    int year;
    //methods(behaviour)
void PrintInfo(){
    System.out.println("car brand is :"+ brandname );
    System.out.println("car year is :"+ year );
}
}




public class OopsSimplar {
    public static void main(String[] args) {
        Car car = new Car();

        car.brandname="porsche";
        car.year=2024;

        car.PrintInfo();
    }
}
