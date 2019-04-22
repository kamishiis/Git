class Car 
{
    private int num;
    private double gas;

    public void setCar(int n)
    {
        num = n;
        System.out.println("decite number");
    }


    public void setCar(double n)
    {
        gas = n;
        System.out.println("decite gas");
    }


    public void setCar(int n,double g)
    {
        num = n;
        gas = g;
        System.out.println("decite number");
        System.out.println("decite gas");
    }

    public void show(){
        System.out.println("car's number = "+ num);
        System.out.println("car's gas = "+ gas);
    }

}

class c9sample3
{
    public static void main(String[] args){
        Car car1 = new Car();
        car1.setNumGas(1234,10.5);
        car1.show();

        car1.setNumGas(4321);
        car1.show();
        car1.setNumGas(30.5);
        car1.show();
    }
}
