class Car
{
    public static int sum = 0;

    private int num; 
    private double gas;

    public Car()
    {
        num = 0;
        gas = 0.0;
        sum++;
        System.out.println("create car");
    }  
    public void setCar(int n,double g){
        num = n;
        gas = g;
    }
    public static void showSum()
    {
        System.out.println("sum of car = "+sum );
    }
    public void show()
    {
        System.out.println("car's number = " + num);
        System.out.println("car's gas = " + gas);
    }

}

class c9sample8{
    public static void main(String []args){
        Car.showSum();

        Car car1 = new Car();
        car1.setCar(1234,20.5);
        Car.showSum();
        Car car2 = new Car();
        car2.setCar(2345,10);
        Car.showSum();
    }
}