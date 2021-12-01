package dsa_assignment;

import java.util.Arrays;

public class circularQueue {

    private int maxSize; //the size of the queue
    private String[] queueArray; // the array that contain people data
    private int front; //front side of the array
    private int rear; // last end of the array
    private int itemCount;

    public circularQueue(int maxSize) {
        if (maxSize <= 0) {
            System.out.println("Please enter value grater than 0");
            return;
        }
        this.maxSize = maxSize;
        this.front = this.rear = this.itemCount = 0;
        this.queueArray = new String[maxSize];
    }

    public void insertPerson(String data) {
        if (itemCount == maxSize) {
            System.out.println("Queue is full. Please wait.");
            return;
        }
        queueArray[rear] = data;
        rear++;
        itemCount++;
        System.out.println("Successfully inserted.");
    }

    public void removePerson() {
        if (itemCount == 0) {

            System.out.println("There are no people in the queue");
            return;
        }
        if (rear == itemCount) {
            rear = 0;
        }
        if (front == maxSize - 1) {
            front = 0;
            itemCount--;
            System.out.println("Removed person from queue");
            return;
        }
        front++;
        itemCount--;
        System.out.println("Removed person from queue");
    }

    public void viewFrontPerson() {
        if (itemCount == 0) {
            System.out.println("There are no persons in queue");
            return;
        }
        System.out.println(queueArray[front]);
    }

    public String getFrontPerson() {
        if (itemCount == 0) {
            System.out.println("There are no persons in queue");
            return "0";
        }
        return queueArray[front];
    }

    public void viewRearPerson() {
        if (itemCount == 0) {
            System.out.println("There are no persons in queue");
            return;
        }
        System.out.println(queueArray[rear]);
    }

    public void showAllQueue() {
        System.out.println(Arrays.toString(queueArray));
    }

    public void showQueueItemCount() {
        System.out.println(itemCount + " person(s) in the queue");
    }

}
