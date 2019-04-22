import java.io.*;



class Sample1
{

    public static void main(String [] args){
        Car car1 = new Car(); 
        car1.num = 1234;
        car1.gas = 20.5;
        Car car2 = new Car();
        car2.num = 2345;
        car2.gas = 10.5;

        car1.showCar();
        car2.showCar();
        //System.out.println("car2's number is "+car2.num);   
        //System.out.println("car2's gas is "+car2.gas);
    }
}

class Car 
{
      int num;
      double gas;

      void show(){
          System.out.println(" number is "+ num);   
          System.out.println(" gas is "+ gas);
      }

      void showCar(){
        System.out.println("show car's information");
        this.show();
      }
}