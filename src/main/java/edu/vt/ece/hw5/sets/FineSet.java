package edu.vt.ece.hw5.sets;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class FineSet<T> implements Set<T>{
    private final Node<T> head;

    public FineSet() {
        head = new Node<>(Integer.MIN_VALUE);
        head.next = new Node<>(Integer.MAX_VALUE);
    }

    @Override
    public boolean add(T item) {
        /* YOUR IMPLEMENTATION HERE */
    }

    @Override
    public boolean remove(T item) {
        /* YOUR IMPLEMENTATION HERE */
    }

    @Override
    public boolean contains(T item) {
        /* YOUR IMPLEMENTATION HERE */
    }

    private static class Node<U> {
        private final Lock lock = new ReentrantLock();
        int key;
        Node<U> next;

        public Node(U item, Node<U> next) {
            this.key = item.hashCode();
            this.next = next;
        }

        public Node(int key) {
            this.key = key;
            next = null;
        }

        public void lock() {
            lock.lock();
        }

        public void unlock() {
            lock.unlock();
        }
    }
}
