package com.bst.service;

public class Tree {
	public static Node node;
	public static Node prevNode = null;
	public static Node headNode = null;

	public static void bstToSkewedTree(Node root, int order) {

		if (root == null) {
			return;
		}

		if (order > 0) {
			bstToSkewedTree(root.right, order);
		} else {
			bstToSkewedTree(root.left, order);

		}
		Node rightNode = root.right;
		Node leftNode = root.left;

		if (headNode == null) {
			headNode = root;
			root.left = null;
			prevNode = root;
		} else {
			prevNode.right = root;
			root.left = null;
			prevNode = root;
		}

		if (order > 0) {
			bstToSkewedTree(leftNode, order);

		} else {
			bstToSkewedTree(rightNode, order);

		}
	}

	public static void traverseRightSkewed(Node root) {
		if (root == null) {
			return;
		}
		System.out.print(root.data + " ");
		traverseRightSkewed(root.right);
	}
}
