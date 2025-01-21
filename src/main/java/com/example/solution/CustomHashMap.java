package com.example.solution;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class CustomHashMap<K, V> {


    private Item<K, V>[] items;

    public CustomHashMap() {
        items = new Item[16];
    }


    static class Item<K, V> {
        K key;
        V value;
        Item<K, V> next;

        public Item(K key, V value, Item<K, V> next) {
            this.key = key;
            this.value = value;
            this.next = next;
        }


    }


    public int size() {

        Item currItem;
        int size=0;

        for(Item item:items){
            currItem =item;
            while(currItem!=null){
                size++;
                currItem=currItem.next;

            }
        }
        return size;
    }

    public boolean isEmpty() {

       if(items.length==0) return true;



        return false;
    }

    public boolean containsKey(Object o) {
        return get(o)==null?false:true;
    }

    public boolean containsValue(Object o) {
        return false;
    }

    public Object get(Object o) {
        int hashCode = o.hashCode();
        Item currItem = items[hashCode];

        if (currItem == null) return null;
        if (o.equals(currItem.key)) return currItem.value;
        else {
            Item prevItem = currItem;
            while (currItem != null) {
                if (currItem.key.equals(o)) {
                    return currItem.value;
                } else {
                    prevItem = currItem;
                    currItem = prevItem.next;
                }
            }
            return null;


        }


    }

    public Object put(K key, V value) {
        if (key == null)
            return null;

        Item<K, V> newItem = new Item<>(key, value, null);
        int hash = getHashCode(key);
        Item currItem = items[hash];
        if (currItem == null) {
            items[hash] = newItem;
            return newItem;
        } else {
            Item prevItem = currItem;
            while (currItem != null) {
                if (currItem.key.equals(key)) {
                    currItem.value = value;
                    return newItem;
                } else {
                    prevItem = currItem;
                    currItem = prevItem.next;
                }

            }
            prevItem.next = newItem;

        }


        return newItem;
    }

    private int getHashCode(K key) {
        return key.hashCode();
    }

    public Object remove(Object o) {
        return null;
    }

    public void putAll(Map map) {

    }

    public void clear() {

    }

    public Set keySet() {
        return null;
    }

    public Collection values() {
        return null;
    }

    public Set<Map.Entry> entrySet() {
        return null;
    }

    public boolean equals(Object o) {
        return false;
    }

    public int hashCode() {
        return 0;
    }
}
