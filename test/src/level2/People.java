package level2;

import java.util.ArrayList;

public class People {

	ArrayList<Person> people=new ArrayList<Person>();
	
	public People(int personCount) {
		for (int i=0;i<personCount;i++)
			people.add(new Person());
	}
	/**
	 * Add a person to the people array
	 * @param name
	 * @param age
	 * @param jobTitle
	 * @return was the action completed successfully?
	 */
	public boolean addPerson(String name, int age, String jobTitle) {
		try {
			people.add(new Person(name, age, jobTitle));
			return true;
		}
		catch(NumberFormatException e){
			return false;
		}
	}
	/**
	 * find a person using the given name
	 * @param name Firstname and Surname
	 * @return Details of person specified
	 */
	public String findPerson(String name) {
		String personDetails="Person Not Found";
		
		for (int i=0;i<people.size();i++)
		if (people.get(i).getName()==name) {
			personDetails = "Person Found: "+people.get(i).toString();
			break;
		}
		return personDetails;
	}

	@Override 
	public String toString() {
		String peopleList="";
		for (Person person: people)
			peopleList=peopleList+person.toString()+"\n";
		return peopleList;
	}
}