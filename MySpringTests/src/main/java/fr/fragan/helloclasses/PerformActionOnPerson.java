package fr.fragan.helloclasses;

public class PerformActionOnPerson {

	private Person person;

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}
	
	public void printPerson() {
		System.out.println(person.getFirstname()+" "+person.getLastname()+", "+person.getAge()+" old.");
	}
}
