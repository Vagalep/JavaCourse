package Pudge;

public class Fight {

	public static void main(String[] args) {
		boolean end = false;
		Pudge Pudge1 = new Pudge(5, 5, 5, "Bichina");
		Pudge Pudge2 = new Pudge(5, 1, 5, "Rvanina");

		while (!end) {
			if (Pudge1.setHelth() > 0 && Pudge2.setHelth() > 0) {
				Pudge2.getHelth(Pudge1.setStrike());
				if (Pudge2.setHelth() > 0) {
					Pudge2.getInfo();
				} else {
					System.out.print(Pudge1.getObjName()+" Lose        ");
				}
				Pudge1.getHelth(Pudge2.setStrike());
				if (Pudge1.setHelth() > 0) {
					Pudge1.getInfo();
				} else {
					System.out.println(Pudge2.getObjName()+" Lose        ");
				}
			} else {
				end = true;
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
