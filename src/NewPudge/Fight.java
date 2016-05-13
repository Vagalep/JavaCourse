package NewPudge;

import java.util.Arrays;
import java.util.Scanner;

import Pudge.PreFight;

public class Fight {

	public static void main(String[] args) throws InterruptedException {
		Shop shop = new Shop();
		Hero hero[] = { null, null };
		NewPudge.PreFight pf = new NewPudge.PreFight();

		for (int i = 0; i < hero.length; i++) {
			Scanner scan = new Scanner(System.in);
			System.out.print("Enter name " + (i == 0 ? "first" : "second") + " hero: ");
			String name = scan.nextLine();
			System.out.println();
			System.out.println("              SHOP for "+name);
			System.out.println("In shop you can chose 3, or less items at choice: ");
			System.out.println();
			System.out.println("    For chose Boots of Power press \"1\"");
			System.out.println("    For chose Boots of Speed press \"2\"");
			System.out.println("    For chose Boots of Helth press \"3\"");
			System.out.println("       For Exit from shop press \"4\"");
			boolean shopping = true;
			int heroItems = 0;
			int[] boughtItems = { 0, 0, 0 };
			while (shopping && heroItems < 3) {
				for (int j = 0; j < 3; j++) {
					int num = scan.nextInt();
					switch (num) {
					case 1:
						boughtItems[j] = num;
						heroItems++;
						break;
					case 2:
						boughtItems[j] = num;
						heroItems++;
						break;
					case 3:
						boughtItems[j] = num;
						heroItems++;
						break;
					case 4:
						shopping = false;
						j = 2;
						break;
					default:
						break;
					}
				}
			}
			hero[i] = new Hero(5, 5, 5, name, shop.ItemsSelector(boughtItems));
		}
		hero[0].getStats();
		hero[1].getStats();
		System.out.println();
		System.out.println("                 ____   ____ ________            ");
		System.out.println("                 \\   \\ /   //  _____/           ");
		System.out.println("            " + hero[0].getName() +"   \\   Y   / \\_____  \\   "+  hero[1].getName());
		System.out.println("                   \\     /  /        \\            ");
		System.out.println("                    \\___/  /_______  /           ");
		System.out.println("                                   \\/            ");
		pf.couner();
		System.out.println();
		boolean battle = true;
		while (battle) {
			if (hero[0].getHelth() > 00 && hero[1].getHelth() > 0)
				hero[0].getHelthInfo();
			if (hero[1].getHelth() > 00 && hero[0].getHelth() > 0)
				hero[1].getHelthInfo();
			System.out.println();

			if (hero[0].getHelth() > 0 && hero[1].getHelth() > 0) {
				hero[0].setStrike();
				hero[1].setHelth(hero[0].getDamage());
				hero[0].getStrikeInfo();
			} else {
				System.out.println(" Character "+hero[0].getName() + " lose     ");
				battle = false;
				break;
			}

			if (hero[1].getHelth() > 0 && hero[0].getHelth() > 0) {
				hero[1].setStrike();
				hero[0].setHelth(hero[1].getDamage());
				hero[1].getStrikeInfo();
			} else {
				System.out.println(" Character "+hero[1].getName() + " lose     ");
				battle = true;
				break;
			}
			System.out.println();
			System.out.println();
		}
		System.out.println();
		System.out.println();
		if (hero[0].getHelth() >= 0) {
			System.out.print("                Resolution: " + hero[0].getName() + " Win!");
		} else {
			System.out.print("                Resolution: " + hero[1].getName() + " Win!");
		}
	}
}