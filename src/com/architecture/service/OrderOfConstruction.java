package com.architecture.service;

import java.util.Iterator;
import java.util.Queue;
import java.util.Stack;

public class OrderOfConstruction {

	public static void findOrder(Queue<Integer> stories, int floorCount) {
		int temp;
		int maxVal = floorCount;
		Stack<Integer> stack = new Stack<Integer>();

		System.out.println("Order of construction is as follows");
		for (int i = 1; i <= floorCount; i++) {

			temp = stories.remove();
			System.out.println();
			System.out.println("Day :" + i);
			if (temp == maxVal) {

				System.out.print(temp + " ");
				maxVal--;
//				checking if the stack has the next max value and printing the value
				while (!stack.isEmpty()) {

					if (stack.peek() == maxVal) {
						int temp2 = stack.pop();

						System.out.print(temp2 + " ");
						maxVal--;
					} else
						break;

				}
//			storing the queue values in stack and sorting them
			} else if (temp != maxVal) {
				stack.push(temp);
				StackSort.sortStack(stack);
			}
//			printing the stack values
			if (i == floorCount) {
				Iterator<Integer> value = stack.iterator();
				while (value.hasNext()) {
					System.out.print(value.next());
				}
				System.out.println();
			}

		}

	}

}
