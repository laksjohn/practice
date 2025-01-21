package com.example.solution;

public class MyHashmap {
    Item[] items;


    public MyHashmap(){
        items=new Item[16];


    }


    static class Item{

        Object key;
        Object value;
        Item nextItem;

        public Item(Object key,Object value,Item nextItem){
            this.key=key;
            this.value=value;
            this.nextItem=nextItem;
        }
    }

    public int size(){
        int size=0;
        for(Item item: items){
            while(item.nextItem!=null){
                size++;
                item=item.nextItem;
            }
        }
        return size;
    }

    public boolean isEmpty(){
        if(items.length==0) return true;
        for(Item item:items){
            if(item!=null) return false;
        }
        return true;
    }

    public void put(Object key, Object value){

        Item newItem = new Item(key,value,null);

        int hashCode = key.hashCode();
        boolean itemFound=false;

        for(Item item:items){

            if(item.key.hashCode()==hashCode){
                while(item.nextItem!=null){
                    if(item.key.equals(key)) {
                        item.value=value;
                    }
                    item=item.nextItem;
                }
                item.nextItem=newItem;
                itemFound=true;
            }

        }

        if(!itemFound){
            items[hashCode]=newItem;
        }

    }

    public Object get(Object key){

        if(items[key.hashCode()]!=null){
            Item currItem = items[key.hashCode()];
            while(currItem.nextItem!=null){
                if(currItem.key.equals(key)){
                    return currItem.value;
                }
            }
        }

        return null;
    }

    public void remove(Object key){

    }





}
