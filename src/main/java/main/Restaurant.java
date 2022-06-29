package main;

import java.util.Queue;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class Restaurant {
    private Queue<String> waitList;
    private List<Boolean> restaurant;

    public void checkIn() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Whats your name?");
        String name = scanner.nextLine();
        if (restaurant.contains(false)) {
            int index = restaurant.indexOf(false);
            restaurant.set(index, true);
            System.out.println("Placing " + name + " at a table");
        } else {
            waitList.add(name);
            System.out.println("Placing " + name + " on the waitlist");
        }

    }

    public void checkOut() {
        if (restaurant.contains(true)) {
            int index = restaurant.indexOf(true);
            restaurant.set(index, false);
            System.out.println("Checking out table " + index);
        }
        if (waitList.peek() == null) {
            System.out.println("The waitlist is empty.");
        } else {
            System.out.println("Checking in " + waitList.poll()+ " at a table");
        }
    }

    public Queue getWaitList() {
        return waitList;
    }

    public Restaurant() {
        this.waitList = new PriorityQueue<>();
        this.restaurant = new ArrayList<Boolean>(Arrays.asList(false, false));
    }

    public void setWaitList(Queue waitList) {
        this.waitList = waitList;
    }

    public List<Boolean> getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(List<Boolean> restaurant) {
        this.restaurant = restaurant;
    }

}
