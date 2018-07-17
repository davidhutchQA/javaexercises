package level2;

import java.util.Random;

public class Person {
	private static final String[] FIRSTNAMES={"Bob","Joe","Bill","Mark","Graham","Peter","Mary","Sue","Jane","Sarah","Wobbie","Dale","Amanda","Emma"};
	private static final String[] SURNAMES= {"Peters","Smith","Roberts","Flemming","Ford","Sutherland","Kaufmann","Gilespey","Townsend"};
	private static final String[] JOBTITLES= {"Lecturer","Programmer","Nurse","Gardener","Doctor","Physician"};
	
	private String name;
	private int age;
	private String jobTitle;
	
	private static Random rand=new Random();
	
	public Person(String name, int age, String jobTitle) {
		this.name=name;
		this.age=age;
		this.jobTitle=jobTitle;
	}
	
	public Person() {
		name=FIRSTNAMES[rand.nextInt(FIRSTNAMES.length)]+" "+SURNAMES[rand.nextInt(SURNAMES.length)];
		age=20+rand.nextInt(30);
		jobTitle=JOBTITLES[rand.nextInt(JOBTITLES.length)];
	}
	
	public String getName() {
		return name;
	}
	
	@Override
	public String toString() {
		return name+" "+age+" "+jobTitle;
	}
}
