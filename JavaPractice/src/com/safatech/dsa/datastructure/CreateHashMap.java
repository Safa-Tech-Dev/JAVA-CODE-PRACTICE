package com.safatech.dsa.datastructure;

import java.util.LinkedList;
/**
 * Input
 * ["MyHashMap", "put", "put", "get", "get", "put", "get", "remove", "get"]
 * [[], [1, 1], [2, 2], [1], [3], [2, 1], [2], [2], [2]]
 * Output
 * [null, null, null, 1, -1, null, 1, null, -1]
 */
class CreateHashMap {

    private static final int BUCKET_SIZE = 10000; // Define the size of the hash table
    private LinkedList<Entry>[] buckets;
    public CreateHashMap() {

        buckets = new LinkedList[BUCKET_SIZE];

        for(int i = 0; i< BUCKET_SIZE; i++){

            buckets[i] = new LinkedList<>(); // create the linked list associated with each bucket
        }

    }
    public static void main(String[] args){

        CreateHashMap myHashMap = new CreateHashMap();
        myHashMap.put(1, 1); // The map is now [[1,1]]
        myHashMap.put(2, 2); // The map is now [[1,1], [2,2]]
        myHashMap.get(1);    // return 1, The map is now [[1,1], [2,2]]
        myHashMap.get(3);    // return -1 (i.e., not found), The map is now [[1,1], [2,2]]
        myHashMap.put(2, 1); // The map is now [[1,1], [2,1]] (i.e., update the existing value)
        myHashMap.get(2);    // return 1, The map is now [[1,1], [2,1]]
        myHashMap.remove(2); // remove the mapping for 2, The map is now [[1,1]]
        myHashMap.get(2);    // return -1 (i.e., not found), The map is now [[1,1]]
    }

    public int hash(int key){

        return key % BUCKET_SIZE; // hash function to get index for a key
    }

    public void put(int key, int value) {

        int bucketIndex = hash(key); //find the bucket index using hash function
        LinkedList<Entry> bucket = buckets[bucketIndex]; //find the bucket with this index value

        for(Entry entry : bucket){

            if(entry.key == key){

                entry.value = value;// update the existing value if key is present
                return;
            }
        }
        bucket.add(new Entry(key, value)); // Add new entry if key doesn't exist;



    }

    public int get(int key) {

        int bucketIndex = hash(key); //find the bucket index using hash function
        LinkedList<Entry> bucket = buckets[bucketIndex]; //find the bucket with this index value

        for(Entry entry : bucket){

            if(entry.key == key){

                return entry.value; // return the value if key is found
            }
        }

        return -1; // return - 1 if key is not found


    }

    public void remove(int key) {

        int bucketIndex = hash(key);
        LinkedList<Entry> bucket = buckets[bucketIndex];

        Entry toRemove = null;

        for(Entry entry : bucket){

            if(entry.key == key){

                toRemove = entry; // remove the whole entry
                break;
            }
        }
        if(toRemove != null){

            bucket.remove(toRemove); // remove the entry if key is found
        }

    }

    private static class Entry{

        int key;
        int value;

        Entry(int key, int value){

            this.key = key;
            this.value = value;
        }

    }


}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */
