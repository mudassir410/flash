package myfirstproject1;

public class ClassCallingFromAnotherClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Room hall = new Room("Hall");
		hall.area = 200.0;
		hall.paintColor ="Violet";
		hall.flooring ="Marble";
		hall.ceilingFan = new Fan("Bajaj");
		hall.ceilingFan.speed =5;
		hall.tableFan =new Fan("Bajaj");
		hall.tableFan.speed =10;
		hall.tube = new Light("Hall tube light", "White", 40, true);
		//hall.tube.color ="White";
		//hall.tube.watts =40;
		//hall.tube.tube =true;
		Light b1 = new Light("Yellow bed light", "Yellow", 50, false); // LINE D
		hall.bedLight = b1;
	    /*hall.tube = b1;
	    hall.tube.color = "Yellow";
	    hall.tube.watts = 50;
	    hall.tube.tube = false;*/
	        
	    System.out.println("Light Name : " + hall.bedLight.name+ "Light color :"+hall.bedLight.color+"Light watts: " +hall.bedLight.watts+"Light Tube :"+hall.bedLight.tube );
	    //System.out.println("Bed Light color : " + hall.bedLight.color);    

	}

}
class Fan
{
	String name;
	double speed;
	String color;
	int numberOfSpeeds;
	
	Fan(String name)
	{
		this.name = name;
	}
}
class Light
{
	String name;
	String color;
	int watts;
	boolean tube;
	
	
	Light(String name)
	{
		this.name = name;
	}
	Light(String name,String color, int watts, boolean tube)
	{
		this.name = name;
		this.color = color;
		this.watts = watts;
		this.tube = tube;
	}
}
class Room
{
	String name;
	double area;
	String paintColor;
	String flooring;
	Fan ceilingFan;
	Light tube;
	Light bedLight;
	Fan tableFan;
	
	Room(String name)
	{
		this.name = name;
	}
}
	