package CC_AgendaDigital_Core;

import java.util.ArrayList;

public class ControllerData {

	private ArrayList<Family> ListOfFamilys;
	private int listOfFamily_count;

	public ControllerData() {
		ListOfFamilys = new ArrayList<Family>();
		listOfFamily_count = 0;
	}

	public boolean registerFamily(Family familia) {
		ListOfFamilys.add(familia);
		if (ListOfFamilys.contains(familia)) {
			listOfFamily_count++;
			return true;
		}
		return false;
	}

	public boolean listOfFamily_IsEmpty() {
		if (listOfFamily_count == 0) {
			return true;
		}
		return false;
	}

	public boolean checkFamilyByName(String nameFamily) {
		for (Family family : ListOfFamilys) {
			if (family.getNameFamily().equals(nameFamily)) {
				return true;
			}
		}
		return false;
	}

	public ArrayList<People> returnAllPeopleOfFamilyByName(String NameFamily) {
		ArrayList<People> peoples = null;
		if (!listOfFamily_IsEmpty()) {
			for (Family familia : ListOfFamilys) {
				if (familia.getNameFamily().equals(NameFamily)) {
					peoples = familia.returnPeoples();
				}
			}
		}
		return peoples;
	}
}
