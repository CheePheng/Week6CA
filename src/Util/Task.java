/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Util;

import java.time.LocalDate;

/**
 *
 * @author WildW
 */
public class Task implements Comparable<Task> {

    private String owner;
    private String description;
    private LocalDate deadline;
    private int size;

    public Task(String owner, String description, LocalDate deadline) {
        if (deadline.compareTo(LocalDate.now()) >= 0) {
            throw new IndexOutOfBoundsException("Invalid Deadline Provided");
        }

        this.owner = owner;
        this.description = description;
        this.deadline = deadline;
        size++;
    }

    public Task(int capacity) {
    }

    public Task() {

    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getDeadline() {
        return deadline;
    }

    public void setDeadline(LocalDate deadline) {
        if (deadline.compareTo(LocalDate.now()) >= 0) {
            throw new IndexOutOfBoundsException("Invalid Deadline Provided");
        }
        this.deadline = deadline;
    }

    @Override
    public String toString() {
        return "Task{" + "owner=" + owner + ", description=" + description + ", deadline=" + deadline + '}';
    }

    @Override
    public int compareTo(Task o) {
        if (this.getOwner().compareToIgnoreCase(o.getOwner()) < 0) {
            return -1;
        }
        if (this.getOwner().compareToIgnoreCase(o.getOwner()) > 0) {
            return 1;
        } else {
            return 0;
        }
    }
}
