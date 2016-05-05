package Pudge;

public class Pudge {
	int intelligence = 5;
	int strenght = 5;
	int agility = 5;
	int helth = 100;
	private String objName;

	void setObjName(String objN){
	this.objName = objN;
	}
	
	String getObjName(){
	 return objName;
	}
	
	void setStats() {
		strenght=strenght+3;
	}
	
	int setStrike() {
		int strike = intelligence / 3 + agility / 2 + strenght;
		return strike;
	}
	
	void getHelth(int strike){
		helth=helth-strike;
	}
	
	void getInfo(){
		System.out.print(getObjName()+" Helth: "+helth+"   ");
	}
	
	int setHelth(){
		return helth;
	}
}
