package com.architecture.main;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import com.architecture.service.OrderOfConstruction;

public class ArchitectureDriver {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Queue<Integer> stories = new LinkedList<>();

		System.out.println("Enter the total no of floors in the  building");
		int floorCount = sc.nextInt();

		for (int i = 0; i < floorCount; i++) {
			System.out.println("enter the floor size on the given day");
			stories.add(sc.nextInt());
		}

		OrderOfConstruction.findOrder(stories, floorCount);
		sc.close();
	}

}
