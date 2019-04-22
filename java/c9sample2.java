class Car 
{
    private int num;
    private double gas;

    public void setNumGas(int n, double g){
        if(g>0 && g < 1000){
            num = n;
            gas = g;
            System.out.println("decite number = " + num);
            System.out.println("decite gas = " + gas);
        }else{
            System.out.println("car's gas = false");
        }
    }

    public void show(){
        System.out.println("car's number = "+ num);
        System.out.println("car's gas = "+ gas);
    }

}

class c9sample2
{
    public static void main(String[] args){
        Car car1 = new Car();
        car1.setNumGas(1234,10.5);
        car1.show();

        System.out.println("FAILED");
        car1.setNumGas(1234,-12);
        car1.show();
    }
}
