/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Util;

import java.time.LocalDate;
import java.util.EmptyStackException;
import java.util.NoSuchElementException;

/**
 *
 * @author WildW
 */
public class BoundedPriorityQueueSet extends Task {

    private static final int maximumSize = 10;
    private int capacity;

    public BoundedPriorityQueueSet(int capacity) {
        if (capacity > maximumSize) {
            throw new IndexOutOfBoundsException("Invalid Capacity Provided");
        }

        this.capacity = capacity;
    }

    public int size() {
        return super.getSize();
    }

    public boolean isEmpty() {
        return super.getSize() == 0;
    }

    public boolean isFull() {
        return super.getSize() >= capacity;
    }
}
    
//     public boolean add(Task value) {
//        if (isFull()) {
//            throw new IllegalStateException();
//        } else if (value.compareTo()) {
//        }
//    }
//     
//    public int remove(Task data, int value) {
//        if (isEmpty()) {
//            throw new NoSuchElementException("Queue is empty");
//        }
//
//        for (int i = 0; i < data.getSize(); i++) {
//            if (data == value) {
//                return i;
//            }
//        }
//        return -1;
//    }
//    
//    }


