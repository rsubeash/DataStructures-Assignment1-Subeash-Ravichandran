package org.example;

public class ClueTree {

    // Node class representing each clue in the binary tree
    static class Node {
        String clue;
        Node left, right;

        Node(String clue) {
            this.clue = clue;
            left = right = null;
        }
    }

    private Node root;

    public ClueTree() {
        this.root = null;
    }

    // Insert a new clue into the tree
    public void insert(String clue) {
        root = insertRec(root, clue);
        System.out.println("Inserted clue: " + clue);
    }

    private Node insertRec(Node root, String clue) {
        if (root == null) {
            return new Node(clue);
        }
        if (clue.compareTo(root.clue) < 0) {
            root.left = insertRec(root.left, clue);
        } else if (clue.compareTo(root.clue) > 0) {
            root.right = insertRec(root.right, clue);
        }
        return root;
    }

    // In-order traversal
    public void inOrder() {
        System.out.print("In-order traversal: ");
        inOrderRec(root);
        System.out.println();
    }

    private void inOrderRec(Node root) {
        if (root != null) {
            inOrderRec(root.left);
            System.out.print(root.clue + " ");
            inOrderRec(root.right);
        }
    }

    // Pre-order traversal
    public void preOrder() {
        System.out.print("Pre-order traversal: ");
        preOrderRec(root);
        System.out.println();
    }

    private void preOrderRec(Node root) {
        if (root != null) {
            System.out.print(root.clue + " ");
            preOrderRec(root.left);
            preOrderRec(root.right);
        }
    }

    // Post-order traversal
    public void postOrder() {
        System.out.print("Post-order traversal: ");
        postOrderRec(root);
        System.out.println();
    }

    private void postOrderRec(Node root) {
        if (root != null) {
            postOrderRec(root.left);
            postOrderRec(root.right);
            System.out.print(root.clue + " ");
        }
    }

    // Find a specific clue in the tree
    public boolean find(String clue) {
        return findRec(root, clue);
    }

    private boolean findRec(Node root, String clue) {
        if (root == null) {
            return false;
        }
        if (root.clue.equals(clue)) {
            return true;
        }
        return clue.compareTo(root.clue) < 0 ? findRec(root.left, clue) : findRec(root.right, clue);
    }

    // Count the total number of clues in the tree
    public int count() {
        return countRec(root);
    }

    private int countRec(Node root) {
        if (root == null) {
            return 0;
        }
        return 1 + countRec(root.left) + countRec(root.right);
    }

    // Main method to demonstrate functionality
    public static void main(String[] args) {
        ClueTree clueTree = new ClueTree();

        // Insert clues
        clueTree.insert("The hidden treasure is beneath the old oak tree.");
        clueTree.insert("Look for the key under the welcome mat.");
        clueTree.insert("The map leads to the riverbank.");
        clueTree.insert("Search near the ancient ruins.");
        clueTree.insert("Follow the trail of footprints.");

        // Perform traversals
        clueTree.inOrder();
        clueTree.preOrder();
        clueTree.postOrder();

        // Find a specific clue
        String searchClue = "Look for the key under the welcome mat.";
        if (clueTree.find(searchClue)) {
            System.out.println("Clue found: " + searchClue);
        } else {
            System.out.println("Clue not found: " + searchClue);
        }

        // Count total clues
        System.out.println("Total number of clues in the tree: " + clueTree.count());
    }
}
