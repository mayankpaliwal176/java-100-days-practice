// Area Calculator
class AreaOfShapes{
     void area(int a){
            int area= a*a;
            System.out.println("area is :" + area);
        }
      void area(int a, int b){
            int area=a*b;
            System.out.println("area is :" + area);
        }
       void area(double r){
            double area= (22/7)*(r*r);
            System.out.println("area is :" + area);
        }
    }
public class Overloading{
    public static void main(String args[]){
        AreaOfShapes obj = new AreaOfShapes();
        obj.area(3);
        obj.area(3,7);
        obj.area(3.7);
    }
}