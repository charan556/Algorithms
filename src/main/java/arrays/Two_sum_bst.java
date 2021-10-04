package arrays;

public class Two_sum_bst {
	public static void main(String[] args) {
		BinaryTree bt = new BinaryTree();

		bt.add(6);
		bt.add(4);
		bt.add(8);
		bt.add(3);
		bt.add(5);
		bt.add(7);
		bt.add(9);

//		System.out.println(traverse(bt));
	}

//	private static char[] traverse(BinaryTree bt) {
//		if (node == null)
//			return false;
//
//		boolean result = false;
//
//		if (node.left != null) {
//			result = result || inorder(node.left, k);
//		}
//
//	}
}

class TreeNode {
	int value;
	TreeNode left;
	TreeNode right;

	TreeNode(int value) {
		this.value = value;
		right = null;
		left = null;
	}
}

class BinaryTree {

	TreeNode root;

	TreeNode addRecursive(TreeNode current, int value) {
		if (current == null) {
			return new TreeNode(value);
		}

		if (value < current.value) {
			current.left = addRecursive(current.left, value);
		} else if (value > current.value) {
			current.right = addRecursive(current.right, value);
		} else {
			return current;
		}

		return current;
	}

	public void add(int i) {
		root = addRecursive(root, i);
	}
}