package CC_AgendaDigital_Core;

import java.util.ArrayList;

public class Family {
	private String NameOfFamily;
	private ArrayList<People> ListOfPeoples;
	private int countPeoples;

	public Family() {
		NameOfFamily = "";
		ListOfPeoples = new ArrayList<People>();
		countPeoples = 0;
	}

	public Family(String NameOfFamily) {
		this.NameOfFamily = NameOfFamily;
		ListOfPeoples = new ArrayList<People>();
		countPeoples = 0;
	}

	public boolean registerPeople(People people) {
		ListOfPeoples.add(people);
		if (ListOfPeoples.contains(people)) {
			countPeoples++;
			return true;
		}
		return false;
	}

	public ArrayList<People> returnPeoples() {
		return ListOfPeoples;
	}

	public String getNameFamily() {
		return NameOfFamily;
	}

	public void setNameFamily(String NameOfFamily) {
		if (NameOfFamily != null) {
			this.NameOfFamily = NameOfFamily;
		}
	}

	public boolean listOfPeople_isEmpty() {
		if(countPeoples == 0){
			return true;
		}
		return false;
	}

}
