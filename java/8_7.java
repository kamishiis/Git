import java.io.*;

class Mypoint{
	int x;
	int y;
	
	void setX(int px){
		x = px;
	}

	void setY(int py){
		y = py;
	}

	int getX(){
		return x;
	}

	int getY(){
		return y;
	}


}

class test{

	public static void main(String args[]){
	Mypoint p1 = new Mypoint();
	p1.setX(2);
	p1.setY(1);

	System.out.println(p1.getX());
	System.out.println(p1.getY());
	}
}
