package NewPudge;

public class Shop {
	Item bop = new Item(1, 3, 2, 0, "Boots of Power");
	Item bos = new Item(1, 2, 3, 0, "Boots of Speed");
	Item boh = new Item(3, 0, 0, 50, "Boots of Helth");
	Item item = new Item(0, 0, 0, 0, "Empty slot");

	Item[] ItemsSelector(int[] boughtItems) {
		Item items[] = { null, null, null };
		for (int i = 0; i < items.length; i++) {
			if (boughtItems[i] == 1) {
				items[i] = bop;
			} else if (boughtItems[i] == 2) {
				items[i] = bos;
			} else if (boughtItems[i] == 3) {
				items[i] = boh;
			}else{
				items[i] = item;
			}
		}
		return items;
	}
}
