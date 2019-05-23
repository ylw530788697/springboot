package com.evan.springboot.study.jdk7hashmap;

import java.util.Map;

public class MyHashMap<k, v> {
    private Entry<k, v>[] table;
    private static Integer CAPACTIPY = 8;
    private  Integer size=0;

    public MyHashMap() {
        this.table = new Entry[CAPACTIPY];
    }

    public int size() {
        return size;
    }

    public Object put(k key, v value) {
        Integer hash = key.hashCode();
        Integer index = hash % table.length;
        for (Entry<k,v> entry=table[index];entry!=null;entry=entry.next){
            if (key.equals(entry.k)){
                v oldValue=entry.v;
                return oldValue;
            }
        }
        addEntry(key, value, index);
        return null;
    }

    public void addEntry(k key, v value, Integer index) {
        table[index] = new Entry<>(key, value, table[index]);
        size++;
    }

    public Object get(k key, v value) {
        Integer hash = key.hashCode();
        Integer index = hash % table.length;
        for (Entry<k,v> entry=table[index];entry!=null;entry=entry.next){
            if (key.equals(entry.k)){
                return entry;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        MyHashMap<String,String> map=new MyHashMap<String,String>();
        map.put("周瑜","周瑜");
        map.put("曹操","曹操");
        map.put("刘备","刘备");
        map.put("孙权","孙权");
        System.out.println(map.get("孙权","孙权"));
    }




    class Entry<k, v> {
        public k k;
        public v v;
        public Entry<k, v> next;

        public Entry(k k, v v, Entry<k, v> next) {
            this.k = k;
            this.v = v;
            this.next = next;
        }
    }


}
