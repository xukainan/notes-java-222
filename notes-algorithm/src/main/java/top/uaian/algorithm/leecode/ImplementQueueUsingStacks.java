package top.uaian.algorithm.leecode;

import java.util.Stack;

public class ImplementQueueUsingStacks {

    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue();
        myQueue.push(1); // queue is: [1]
        myQueue.push(2); // queue is: [1, 2] (leftmost is front of the queue)
        myQueue.peek(); // return 1
        myQueue.pop(); // return 1, queue is [2]
        myQueue.empty(); // return false
    }
}

class MyQueue {

    Stack<Integer> putBucket = null;
    Stack<Integer> getBucket = null;

    public MyQueue() {
        putBucket = new Stack<>();
        getBucket = new Stack<>();
    }

    public void push(int x) {
        putBucket.push(x);
    }

    public int pop() {
        if(getBucket.isEmpty()){
            while (!putBucket.isEmpty()){
                getBucket.push(putBucket.pop());
            }
        }
        return getBucket.pop();
    }

    public int peek() {
        if(getBucket.isEmpty()){
            while (!putBucket.isEmpty()){
                getBucket.push(putBucket.pop());
            }
        }
        return getBucket.peek();
    }

    public boolean empty() {
        if(putBucket.empty() && getBucket.empty())
            return true;
        return false;
    }
}
