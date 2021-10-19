package com.architecture.service;

import java.util.Stack;

public class StackSort {
	
	private static void sortedInsert(Stack<Integer> s, int x) {

		if (s.isEmpty() || x > s.peek()) {
			s.push(x);
			return;
		}

		int temp = s.pop();
		sortedInsert(s, x);

		s.push(temp);
	}

	public static void sortStack(Stack<Integer> s) {
		if (!s.isEmpty()) {
			// Remove the top item
			int x = s.pop();

			// Sort remaining stack
			sortStack(s);

			// Push the top item back in sorted stack
			sortedInsert(s, x);
		}
	}
}
