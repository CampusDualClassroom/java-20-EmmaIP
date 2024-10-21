package com.campusdual.classroom;

public class PoliceOfficer extends Person {

	protected String squad;

	public PoliceOfficer(String name, String surname, String squad) {
		super(name, surname);
		this.squad = squad;
	}

	@Override
	public String getDetails() {
		return "Police: " + name + " " + surname + ", squad " + squad.toLowerCase();
	}
}
