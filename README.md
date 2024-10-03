Name: Subeash Ravichandran
ID: C0904336

1.Challenge Overview: The Array Artifact
Description
The Array Artifact challenge required the implementation of a class named ArtifactVault, which utilizes an array to manage ancient artifacts. The class includes methods for adding artifacts, removing them by name, and searching for artifacts using both linear and binary search algorithms. This task aimed to reinforce my understanding of array manipulation and searching techniques.

Approach
To tackle this challenge, I started by defining the ArtifactVault class with an array to hold the artifacts and a variable to track the current number of artifacts. I implemented the following methods:
addArtifact(String artifact): Adds an artifact to the first empty slot in the array, then sorts the array to maintain order.
removeArtifact(String name): Uses linear search to find an artifact by name, removes it from the array, and shifts subsequent artifacts to fill the gap.
findArtifactLinear(String name): Implements linear search to locate an artifact by name.
findArtifactBinary(String name): Implements binary search, assuming the artifacts are sorted by name.
printArtifacts(): Displays the current list of artifacts in the vault.
Assumptions and Design Decisions
I assumed that the names of the artifacts represent their age, as sorting by name is the only criterion provided.
The array size is fixed, meaning if the vault is full, no new artifacts can be added unless a removal occurs.
The sorting method was integrated into the addArtifact method to ensure the array remains ordered after each addition, which is essential for binary search.

Running the Code
To run the ArtifactVault code:
Copy and paste the provided code into a new file named ArtifactVault.java.
Compile and run the program. The main method contains test cases that demonstrate the functionality of the ArtifactVault class.


2.Challenge Overview: LabyrinthPath
Description of the LabyrinthPath Program
The LabyrinthPath class represents a linked list that tracks locations in a labyrinth. The program allows users to:
Add new locations to the path.
Remove the last visited location.
Check if the path contains a loop (indicating a trap).
Print the current path of locations.

Challenges and Approaches
Managing a Linked List:
The main challenge was to implement a singly linked list structure where nodes represent locations.
I used a nested Node class to represent each location. The Node class contains the location string and a pointer to the next Node. The LabyrinthPath class manages the linked list operations.
Adding and Removing Locations:
Implemented methods to add new locations to the end of the list and remove the last location. Careful handling was necessary for edge cases, such as when the list is empty or contains only one node.
Loop Detection:
To check for loops, I implemented the Floyd's Cycle Detection Algorithm using two pointers (slow and fast). This efficiently detects loops in the linked list, which can simulate traps in the labyrinth.
Printing the Path:
Implemented a method to traverse and print the entire path, providing a visual representation of the locations in the linked list.
Assumptions and Design Decisions
Assumption: Each location is unique, and there are no duplicates allowed in the linked list.
Design Decision: Used a simple singly linked list implementation for clarity and ease of understanding. This is sufficient for the requirements given, as complex operations like insertion and deletion can be efficiently handled.
Error Handling: Added print statements to indicate the state of the path during operations, which helps in debugging and understanding the program flow.
Running the Code
To run the LabyrinthPath code:
Copy and paste the provided code into a new file named LabyrinthPath.java.
Compile and run the program. The main method contains test cases that demonstrate the functionality of the LabyrinthPath class.


3.Challenge Overview: The Stack of Ancient Texts

Description
The Stack of Ancient Texts challenge involved creating a ScrollStack class that utilizes a stack data structure to manage ancient scrolls. The class supports operations such as pushing new scrolls onto the stack, popping the top scroll off, peeking at the top scroll without removing it, and checking for the existence of a specific scroll title in the stack. This task aimed to solidify my understanding of stack operations and their practical applications.

Approach
I implemented the ScrollStack class using Java's LinkedList to provide the underlying data structure for the stack. This choice was motivated by the flexibility and efficiency of LinkedList for stack operations, particularly for adding and removing elements from the front. The key methods included:
push(String title): Adds a new scroll to the top of the stack and prints a confirmation message.
pop(): Removes and returns the top scroll from the stack, handling the case where the stack is empty gracefully.
peek(): Returns the title of the top scroll without removing it, also checking for an empty stack.
contains(String title): Checks if a specific scroll exists in the stack and returns a boolean value.
isEmpty(): Checks whether the stack is empty.
Assumptions and Design Decisions
I assumed that the scroll titles are unique, meaning there will be no duplicates in the stack.
The use of LinkedList allows for dynamic resizing and efficient operations, which aligns with the stack's Last In First Out (LIFO) principle.
I included print statements to confirm actions taken on the stack, aiding in debugging and demonstrating functionality during execution.

Running the Code
To run the ScrollStack code:
Copy and paste the provided code into a new file named ScrollStack.java.
Compile and run the program. The main method contains test cases that showcase the functionality of the ScrollStack class.
4. Challenge Overview: The Explorer Queue
Description
The Explorer Queue challenge involved implementing a queue data structure to manage a line of explorers waiting for exploration tasks. The ExplorerQueue class supports operations such as enqueueing new explorers, dequeueing explorers, peeking at the next explorer in line, and checking whether the queue is full or empty. This task aimed to deepen my understanding of queue operations and their practical applications.

Approach
I implemented the ExplorerQueue class using a circular array to handle the queue operations efficiently. The key methods included:
enqueue(String explorer): Adds a new explorer to the rear of the queue, handling the case where the queue is full.
dequeue(): Removes and returns the explorer at the front of the queue, checking for an empty queue before proceeding.
peek(): Returns the explorer at the front of the queue without removing them, also checking for an empty queue.
isFull(): Checks if the queue has reached its capacity.
isEmpty(): Checks if the queue is empty.
Assumptions and Design Decisions
I assumed that the queue has a fixed capacity, which is set at the time of its creation, and that explorers are unique in their names.
The use of a circular array allows for efficient use of space, enabling enqueue and dequeue operations to wrap around when the end of the array is reached.
I included print statements for confirming actions taken on the queue, which aids in debugging and demonstrates functionality during execution.
Running the Code
To run the ExplorerQueue code:
Copy and paste the provided code into a new file named ExplorerQueue.java.
Compile and run the program. The main method contains test cases that showcase the functionality of the ExplorerQueue class.

5.Challenge Overview: The Clue Tree
Description
The Clue Tree challenge involved implementing a binary search tree (BST) to manage a collection of clues for a treasure hunt. The ClueTree class supports various operations such as inserting clues, traversing the tree in different orders (in-order, pre-order, and post-order), finding specific clues, and counting the total number of clues in the tree. This task aimed to enhance my understanding of tree data structures and their applications.
Approach
I implemented the ClueTree class using a nested Node class to represent each clue in the binary tree. The main features included:
insert(String clue): This method adds a new clue to the tree while maintaining the binary search tree properties.
inOrder(), preOrder(), postOrder(): These methods implement the three types of tree traversal, allowing users to view the clues in different orders.
find(String clue): This method searches for a specific clue in the tree.
count(): This method returns the total number of clues stored in the tree.
Assumptions and Design Decisions
I assumed that the clues are unique and that the comparison of clues is based on their string values.
The binary search tree structure allows for efficient insertion, searching, and traversal of clues. Each clue is stored in a node, with left children containing clues that are lexicographically smaller and right children containing clues that are larger.
I included print statements for confirming actions taken on the tree, which aids in debugging and demonstrates functionality during execution.
Running the Code
To run the ClueTree code:
Copy and paste the provided code into a new file named ClueTree.java.
Compile and run the program. The main method contains test cases that showcase the functionality of the ClueTree class.
