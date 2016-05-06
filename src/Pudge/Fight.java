package Pudge;

public class Fight {

	public static void main(String[] args) throws InterruptedException {
		boolean end = false;
		Pudge Pudge1 = new Pudge(5, 5, 5, "Bichina");
		Pudge Pudge2 = new Pudge(5, 5, 5, "Rvanina");
		PreFight pf = new PreFight();
		System.out.println("          " + Pudge1.getObjName() + "        VS         " + Pudge2.getObjName());
		Pudge1.getInfoIntelligence();
		Pudge2.getInfoIntelligence();
		System.out.println();
		Pudge1.getInfoStrenght();
		Pudge2.getInfoStrenght();
		System.out.println();
		Pudge1.getInfoAgility();
		Pudge2.getInfoAgility();
		System.out.println();
		System.out.println();
		pf.couner();

		while (!end) {
			if (Pudge1.setHelth() > 0)
				Pudge1.getInfo();
			if (Pudge1.setHelth() > 0)
				Pudge2.getInfo();
			System.out.println();
			if (Pudge2.setHelth() > 0 && Pudge1.setHelth() > 0) {
				Pudge1.setStrike();
				Pudge2.setHelth(Pudge1.getDamage());
				Pudge1.setStrikeInfo();
			} else {
				System.out.print(Pudge1.getObjName() + " Lose");
				end = true;
				break;
			}

			if (Pudge1.setHelth() > 0 && Pudge2.setHelth() > 0) {
				Pudge2.setStrike();
				Pudge1.setHelth(Pudge2.getDamage());
				Pudge2.setStrikeInfo();
			} else {
				System.out.print(Pudge2.getObjName() + " Lose");
				end = true;
				break;
			}
			System.out.println();
			System.out.println();
		}
		System.out.println();
		System.out.println();
		if (Pudge1.setHelth() >= 0) {
			System.out.print("             Resolution: " + Pudge1.getObjName() + " Win!");
		} else {
			System.out.print("             Resolution: " + Pudge2.getObjName() + " Win!");
		}
	}
}
