package com.zheng;

import java.util.NoSuchElementException;

public class ArrayQueue {

    private Employee[] queue;
    private int front;
    private int back;

    public ArrayQueue(int capacity) {
        queue = new Employee[capacity];
    }

    public void add(Employee employee) {

        if (back == queue.length) {  //checking to see if it needs to be resized
            Employee[] newArray = new Employee[2 * queue.length];   //doubles the size of the array
            System.arraycopy(queue, 0, newArray, 0, queue.length);  //copies the elements into the resized array
            queue = newArray;
        }

        queue[back] = employee; // adds the new employee onto the end of the line
        back++; //increments back
    }

    public Employee remove() {
        if (size() == 0) {  //checks if there are elements in the array
            throw new NoSuchElementException();
        }
        Employee employee = queue[front]; //removes the employee, only at the front of the array
        queue[front] = null; //clean up by replacing the removed element with a null placeholder
        front++;
        if(size() == 0) {   //resetting the queue if the remove method removes the last element
            front = 0;
            back = 0;
        }

        return employee;
    }
    public Employee peek() {
        if(size() == 0) {   //cant peek if there is an empty queue
            throw new NoSuchElementException();
        }

        return queue[front];    //just returns the element in the first position
    }

    public int size() { // based off of total size of array(back) and removed (front)
        return back - front;
    }

    public void printQueue() {
        for(int i = front; i< back; i++) {
            System.out.println(queue[i]);
        }
    }
}
