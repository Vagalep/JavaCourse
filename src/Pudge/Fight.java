package Pudge;

public class Fight {

	public static void main(String[] args) {
		boolean end = true;
		Pudge Pudge2 = new Pudge();
		Pudge Pudge1 = new Pudge();
		Pudge1.setObjName("Pudge 1");
		Pudge2.setObjName("Pudge 2");
		Pudge2.setStats();
		while (end) {
			if (Pudge2.setHelth() > 0 && Pudge1.setHelth() > 0) {
				Pudge1.getHelth(Pudge2.setStrike());
				if (Pudge1.setHelth() > 0) {
					Pudge1.getInfo();
				} else {
					System.out.print(Pudge1.getObjName()+" Lose        ");
				}
				Pudge2.getHelth(Pudge1.setStrike());
				if (Pudge2.setHelth() > 0) {
					Pudge2.getInfo();
				} else {
					System.out.println(Pudge2.getObjName()+" Lose        ");
				}
			} else {
				end = false;
			}
			System.out.println();
		}
		if (Pudge1.setHelth() >= 0) {
			System.out.print("Resolution: "+Pudge1.getObjName()+" Win");
		} else {
			System.out.print("    Resolution: "+Pudge2.getObjName()+" Win");
		}
	}
}
