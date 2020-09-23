package com.edureka.com.edureka.collectionsdemo;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        QueueDemo queueDemo= new QueueDemo();
        Queue queue = queueDemo.createQueueForDemo();
        queueDemo.printQueueOfIntegers(queue);

    }

    private Queue createQueueForDemo(){
        PriorityQueue<Integer> queueOfIntegers = new PriorityQueue<>();
        queueOfIntegers.add(100);
        queueOfIntegers.add(200);
        queueOfIntegers.add(50);

        return queueOfIntegers;
    }

    private void printQueueOfIntegers(Queue queue){
        System.out.println("Retrieving head of list: "+queue.peek() );
        System.out.println("Retrieve & remove head of List-1 st attempt: "+ queue.poll());
        System.out.println("Retrieve & remove head of List-2nd attempt: "+ queue.poll());
    }
}
