package com.safatech.dsa.datastructure;

import java.util.LinkedList;

/**
 * Input
 * ["MyHashSet", "add", "add", "contains", "contains", "add", "contains", "remove", "contains"]
 * [[], [1], [2], [1], [3], [2], [2], [2], [2]]
 * Output
 * [null, null, null, true, false, null, true, null, false]
 */
class CreateHashSet {

    private static final int BUCKET_SIZE = 1000; // Define the size of the Hash Table
    private LinkedList<Integer>[] buckets;

    public CreateHashSet() {

        buckets = new LinkedList[BUCKET_SIZE];
        for(int i = 0; i< BUCKET_SIZE; i++){

            buckets[i] = new LinkedList<Integer>();  // create the linked list associated with each bucket
        }

    }
    public int hash(int key){

        return key % BUCKET_SIZE; // hash function to get index for a key
    }

    public void add(int key) {

        int bucketIndex = hash(key);
        LinkedList<Integer> bucket = buckets[bucketIndex];
        if(!bucket.contains(key)){
            bucket.add(key);
        }
    }

    public void remove(int key) {

        int bucketIndex = hash(key);
        LinkedList<Integer> bucket = buckets[bucketIndex];
        bucket.remove((Integer)key);
        /**
        if you do not cast to Integer it will throw IndexOutOfBoundsException
        because The IndexOutOfBoundsException occurs because we're using the remove method incorrectly.
        The LinkedList.remove method with a single integer argument treats that argument as an index, not as the value
        to be removed. We should cast the key to Integer before calling the remove method to ensure that the correct overload
        is called (the one that removes the object).
         */

    }

    public boolean contains(int key) {

        int bucketIndex = hash(key);
        LinkedList<Integer> bucket = buckets[bucketIndex];
        return bucket.contains(key);

    }

    public static void main(String[] args){

        CreateHashSet myHashSet = new CreateHashSet();

        myHashSet.add(1);      // set = [1]
        myHashSet.add(2);      // set = [1, 2]
        myHashSet.contains(1); // return True
        myHashSet.contains(3); // return False, (not found)
        myHashSet.add(2);      // set = [1, 2]
        myHashSet.contains(2); // return True
        myHashSet.remove(2);   // set = [1]
        myHashSet.contains(2); // return False, (already removed)
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */
