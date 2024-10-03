package org.example;

import java.util.Arrays;

public class ArtifactVault {
    private String[] artifacts;  // Array to store artifacts
    private int size;            // Current number of artifacts in the vault

    // Constructor to initialize the vault with a given capacity
    public ArtifactVault(int capacity) {
        artifacts = new String[capacity];  // Create an array with the specified capacity
        size = 0;  // Start with an empty vault
    }

    // Add an artifact to the first empty slot
    public void addArtifact(String artifact) {
        if (size < artifacts.length) {  // Check if there is space in the vault
            artifacts[size] = artifact;  // Add the artifact to the next empty slot
            size++;  // Increase the count of artifacts
            Arrays.sort(artifacts, 0, size);  // Sort the array by artifact name (assuming names represent age)
            System.out.println(artifact + " added to the vault.");  // Confirm the addition
        } else {
            System.out.println("Vault is full. Cannot add " + artifact);  // Notify if the vault is full
        }
    }

    // Remove an artifact by its name
    public void removeArtifact(String name) {
        int index = findArtifactLinear(name);  // Search for the artifact using linear search
        if (index >= 0) {  // If the artifact is found
            for (int i = index; i < size - 1; i++) {
                artifacts[i] = artifacts[i + 1];  // Shift elements to the left to fill the gap
            }
            artifacts[size - 1] = null;  // Remove the last artifact by setting it to null
            size--;  // Decrease the count of artifacts
            System.out.println(name + " removed from the vault.");  // Confirm the removal
        } else {
            System.out.println(name + " not found in the vault.");  // Notify if the artifact is not found
        }
    }

    // Find an artifact using linear search
    public int findArtifactLinear(String name) {
        for (int i = 0; i < size; i++) {  // Iterate through the artifacts
            if (artifacts[i].equals(name)) {  // Check if the current artifact matches the name
                System.out.println(name + " found at index " + i + " using Linear Search.");  // Confirm finding
                return i;  // Return the index of the found artifact
            }
        }
        System.out.println(name + " not found using Linear Search.");  // Notify if the artifact is not found
        return -1;  // Return -1 to indicate not found
    }

    // Find an artifact using binary search (assuming the array is sorted by artifact name)
    public int findArtifactBinary(String name) {
        int left = 0, right = size - 1;  // Set left and right pointers for the search range
        while (left <= right) {  // Continue until the search range is valid
            int mid = left + (right - left) / 2;  // Find the middle index
            int comparison = artifacts[mid].compareTo(name);  // Compare the middle artifact with the target name

            if (comparison == 0) {  // If the artifact is found
                System.out.println(name + " found at index " + mid + " using Binary Search.");  // Confirm finding
                return mid;  // Return the index of the found artifact
            } else if (comparison < 0) {  // If the middle artifact is less than the target name
                left = mid + 1;  // Move the left pointer to the right
            } else {  // If the middle artifact is greater than the target name
                right = mid - 1;  // Move the right pointer to the left
            }
        }
        System.out.println(name + " not found using Binary Search.");  // Notify if the artifact is not found
        return -1;  // Return -1 to indicate not found
    }

    // Print the list of artifacts in the vault
    public void printArtifacts() {
        System.out.println("Artifacts in the Vault:");
        for (int i = 0; i < size; i++) {  // Iterate through the artifacts
            System.out.println(artifacts[i]);  // Print each artifact
        }
    }

    // Main method to test the ArtifactVault functionality
    public static void main(String[] args) {
        // Create an ArtifactVault with a capacity of 5
        ArtifactVault vault = new ArtifactVault(5);

        // Add artifacts to the vault
        vault.addArtifact("Golden Idol");
        vault.addArtifact("Ancient Vase");
        vault.addArtifact("Silver Coin");
        vault.addArtifact("Bronze Statue");

        // Print the current list of artifacts
        vault.printArtifacts();

        // Search for an artifact using linear search
        vault.findArtifactLinear("Silver Coin");

        // Search for an artifact using binary search
        vault.findArtifactBinary("Ancient Vase");

        // Remove an artifact from the vault
        vault.removeArtifact("Ancient Vase");

        // Print the list of artifacts after removal
        vault.printArtifacts();

        // Add another artifact
        vault.addArtifact("Emerald Gem");

        // Print the final state of the vault
        vault.printArtifacts();
    }
}
