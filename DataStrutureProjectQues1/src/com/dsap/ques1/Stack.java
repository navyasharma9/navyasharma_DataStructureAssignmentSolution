package com.dsap.ques1;
import java.util.Scanner;
//import java.util.Arrays;
public class Stack {
	public static void main(String[] args) {
		System.out.println("Enter the total no of floor in the building:");
		Scanner sc=new Scanner(System.in);
		int numberofFloor=sc.nextInt();
		int[] listofFloors=new int[numberofFloor];
		for(int i=0;i<numberofFloor;i++) {
			System.out.println("Enter the Floor size given on day:"+(i+1));
			int floorsize=sc.nextInt();
			listofFloors[i]=floorsize;
		}
		System.out.println("The order of Construction is as follows\n");
		Skycraper1.calculateFloors(listofFloors);
	}
}	
	