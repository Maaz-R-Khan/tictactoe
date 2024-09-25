import java.sql.SQLOutput;

public class LinkedList {

    private Node head;  // Head of the linked list

    // Constructor to initialize an empty linked list
    public LinkedList() {
        this.head = null;
    }

    // Method to insert a new node at the end
    public void insertAtEnd(String data) {

        //creates a new Node
       Node newNode = new Node(data);

       //if head is empty meaning a new linked list is being created, it creates a new Node
       if(head == null) {
           head = newNode;
           return;
       }

       //start the current node at the at head.
        Node current = head;


        //In a linked list, each node holds the data and pointer to the memory address of the next node.
        //Traverse the list until the last node is reached which will point to null.
        //Traversal involves visiting each node in the linked list and performing some operation on the data.
        while (current != null) {
            current = current.next;
        }

        // Link the new node to the current last node
        current.next = newNode;
    }

    // Method to update a specific position in the list
    public void updatePosition(int position, String data) {
        // To be implemented

     //if the user enters a position less than 0, it will print an error message saying Invalid Position.
    if(position <= 0 || position > 9) {
        System.out.println("Invalid position");
    }

        int index = 0;

     //start the loop from the head of the linked list.
      Node current = head;

      while(current != null) {
          index++;
          current = current.next;

          //if the current index we are at is the same as the position then set the current Node data to either X or O
          if(index == position) {
              current.data = data;
          }

      }
    }

    // Method to get the value at a specific position
    public String getPositionValue(int position) {
        // To be implemented

        //if the user enters a position less than or equal to 0 or greater than 9, it will print an error message saying Invalid Position.
        if(position <= 0 || position > 9) {
            System.out.println("Invalid position");
        }

        int index = 0;

        Node current = head;
        while(current != null) {
            index++;
            if(index == position) {
                return current.data;
            }
            current = current.next;
        }
        return null;
    }

    // Method to display the Tic Tac Toe board
    public void displayBoard() {
        // To be implemented

        int index = 0;
        Node current = head;

        while(current != null) {
            index++;
            current = current.next;



            if(index % 3 == 0 ) {
                System.out.println();
            }

            if(current.data == null) {
                System.out.println(" * ");
            }



        }

    }

    // Method to check for a win
    public boolean checkWinCondition() {

/*

        int index = 0;
        Node current = head;

        while(current != null) {
            index++;
            current = current.next;
        }

 */

        // Check rows
        for (int i = 1; i <= 7; i += 3) {
            String data1 = getPositionValue(i);
            String data2 = getPositionValue(i + 1);
            String data3 = getPositionValue(i + 2);

            if (data1 != null && data1.equals(data2) && data1.equals(data3)) {
                return true;
            }
        }

        // Check columns
        for (int i = 1; i <= 3; i++) {
            String data1 = getPositionValue(i);
            String data2 = getPositionValue(i + 3);
            String data3 = getPositionValue(i + 6);

            if (data1 != null && data1.equals(data2) && data1.equals(data3)) {
                return true;
            }
        }

        // Check diagonals
        String data1 = getPositionValue(1);
        String data2 = getPositionValue(5);
        String data3 = getPositionValue(9);

        if (data1 != null && data1.equals(data2) && data1.equals(data3)) {
            return true;
        }

        data1 = getPositionValue(3);
        data2 = getPositionValue(5);
        data3 = getPositionValue(7);

        if (data1 != null && data1.equals(data2) && data1.equals(data3)) {
            return true;
        }


        // To be implemented
        return false;
    }

    // Method to check if the board is full (for draw condition)
    public boolean isBoardFull() {
        // To be implemented

        int index = 0;
        Node current = head;

        return false;
    }

    // Method to reset the board
    public void resetBoard() {
        // To be implemented
        int index = 0;
        Node current = head;
        while(current != null) {
            current.data = null;
        }

    }
}
