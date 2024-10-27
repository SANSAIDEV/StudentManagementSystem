package com.StudentManagementSystem;
import java.util.Scanner;
import java.util.ArrayList;
public class StudentManagemnetSystem {
	static ArrayList<Student> students = new ArrayList<>();
	public static void displaymenu() {
		System.out.println();
		System.out.println("----Student Management System----");
		System.out.println();
		System.out.println("Enter Your Choice");
		System.out.println("1.Add Student Data");
		System.out.println("2.Display Student Data");
		System.out.println("3.Exit");
		
	}
	static class Student {
		private String id;
		private String name;
		private int age;
		public Student(String id,String name,int age){
			this.id=id;
			this.name=name;
			this.age=age;
		}
		public String toString() {
			return "id "+id+"  .Name"+name+" .age"+age;
		}
	}
	private static void add(Scanner s) {
		System.out.println("Enter id no");
		String id = s.next();
		System.out.println("Enter Student name");
		String name=s.next();
		System.out.println("Enter Student age");
		int age = s.nextInt();
		Student s1 = new Student(id,name,age);
		students.add(s1);
		System.out.println("--- Student Data Succesfully Added---");
	}
	private static void view() {
		System.out.println("Displaying All Student Details");
		try {
			for(Student x:students) {
				System.out.println(x);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int ch = 0;
		while(ch!=3) {
			displaymenu();
			ch = scan.nextInt();
			switch(ch) {
			case 1:
				add(scan);
				break;
			case 2:
				view();
				break;
			case 3:
				System.out.println("Succesfully Updated All Student Data");
				break;
			default:
				System.out.println("Invalid Choice");
				break;
			}
			
		}
	
	}

}
