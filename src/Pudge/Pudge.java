package Pudge;

public class Pudge {
	private int intelligence;
	private int strenght;
	private int agility;
	private int helth = 100;
	private int damage;
	private boolean slot1 = false;
	private boolean slot2 = false;
	private boolean crit = false;
	private String objName;
	BootsOfPower bop = new BootsOfPower();
	BootsOfSpeed bos = new BootsOfSpeed();

	Pudge(int intelligence, int strenght, int agility, String name) {
		this.intelligence = intelligence;
		this.strenght = strenght;
		this.agility = agility;
		this.objName = name;
		boolean end = true;
		while (end) {
			if (!slot1) {
				setStatsWitItem(bop.getItemIntelligence(), bop.getItemStrenght(), bop.getItemAgility());
				slot1 = true;
			} else if (!slot2) {
				setStatsWitItem(bos.getItemIntelligence(), bos.getItemStrenght(), bos.getItemAgility());
				slot2 = true;
			} else {
				end = false;
			}
		}
	}

	String getObjName() {
		return objName;
	}

	void setStatsWitItem(int i, int s, int a) {
		intelligence = intelligence + i;
		strenght = strenght + s;
		agility = agility + a;
	}

	void setStrike() {

		int randomCrit = 1 + (int) (Math.random() * ((3 - 1) + 1));
		damage = intelligence / 3 + agility / 2 + strenght;
	switch (randomCrit) {
		case 1:
			break;
		case 2:
			break;
		case 3:
			damage=damage*2;
			crit=true;
			break;
		default:
			break;
		}
	}
	
	void setStrikeInfo() {
		if (crit){
			System.out.print(Pudge.class.getSimpleName()+" "+getObjName() + " Deals: " + damage + "(!) ");	
			crit=false;
		}else{
			System.out.print(Pudge.class.getSimpleName()+" "+getObjName() + " Deals: " + damage + "    ");
		}
	}

	void setHelth(int strike) {
		helth = helth - strike;
	}
	
	int getDamage() {
		return damage;
	}

	void getInfo() {
		String stringHelth=helth+"";
		if(stringHelth.length()>=3){
			System.out.print(Pudge.class.getSimpleName()+" "+getObjName() + " Helth: " + helth + "   ");			
		}else if(stringHelth.length()>=2){
			System.out.print(Pudge.class.getSimpleName()+" "+getObjName() + " Helth: " + helth + "    ");	
		}else{
			System.out.print(Pudge.class.getSimpleName()+" "+getObjName() + " Helth: " + helth + "     ");	
		}

	}

	int setHelth() {
		return helth;
	}

	void getInfoIntelligence() {
		System.out.print("       "+"Intelligence: "+intelligence+"    ");


	}
	void getInfoStrenght() {

		System.out.print("       "+"Strenght: "+strenght+"       ");


	}
	void getInfoAgility() {
		System.out.print("       "+"Agility: "+agility+"        ");

	}

}
