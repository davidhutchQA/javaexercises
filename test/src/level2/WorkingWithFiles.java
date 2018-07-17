package level2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;

import java.io.IOException;

import java.util.ArrayList;
import java.util.Scanner;

public class WorkingWithFiles {

	ArrayList<Person> people;

	ArrayList<Person> peopleFromFiles;
	
	public WorkingWithFiles() {
		peopleFromFiles=new ArrayList<>();
		
		populatePeopleArray();

		//writePeopleToFile();
		readPeopleFromFile();
		
		System.out.println(peopleFromFiles.toString());
	}

	private void populatePeopleArray() {
		people=new ArrayList<Person>();

		for (int i=0;i<5;i++) {
			people.add(new Person());
		}
	}
	private boolean writePeopleToFile() {
		int fileID=0;
		BufferedWriter bufferedWriter;
		try {
			for (Person person:people) {
				bufferedWriter=new BufferedWriter(new FileWriter("Person"+fileID+".txt"));
				bufferedWriter.write(person.toString());
				bufferedWriter.newLine();
				bufferedWriter.close();
				fileID++;
			}
			return true;
		}
		catch(IOException e) {
			System.out.println("Could not write to file");
			return false;
		}
	}
	
	private boolean readPeopleFromFile() {
		String name,occupation;
		int age;
		
		BufferedReader bufferedReader;
		Scanner lineParser;
		try {
			for(int i=0;i<5;i++) {
				bufferedReader=new BufferedReader(new FileReader("Person"+i+".txt"));
				lineParser=new Scanner(bufferedReader.readLine());
				name=lineParser.next()+" "+lineParser.next();
				age=lineParser.nextInt();
				occupation=lineParser.next();
				peopleFromFiles.add(new Person(name,age,occupation));
				lineParser.close();
			}
			return true;
		}
		catch(FileNotFoundException e) {
			System.out.println("File was not found");
			return false;
		}
		catch(IOException e) {
			System.out.println("Scanner has thrown an exception, unable to scan line");
			return false;
		}
	}
}