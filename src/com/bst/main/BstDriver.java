package com.bst.main;

import com.bst.service.Node;
import com.bst.service.Tree;

public class BstDriver {

	public static void main(String[] args) {
		Tree tree = new Tree();
		tree.node = new Node(50);
		tree.node.left = new Node(30);
		tree.node.right = new Node(60);
		tree.node.left.left = new Node(10);
		tree.node.right.left = new Node(40);

		// 0 For Increasing order
		// 1 For Decreasing order
		int order = 0;
		Tree.bstToSkewedTree(tree.node, order);
		Tree.traverseRightSkewed(tree.headNode);

	}

}
