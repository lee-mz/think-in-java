package com.lee.think.java.ch11;



import java.util.ArrayList;
import java.util.List;

/**
 * Created by mingzhu on 2016/11/16.
 */

interface Selector{
    boolean end();
    Object current();
    void next();
}

public class Sequence {
    //修改数据结构，使用List集合类,此处使用List接口不使用collection，因为collection接口没有get方法
    //private Object[] items;
    List<Object> items;
    private int next = 0;
    public Sequence(int size){
        //使用指定长度初始化list
        items = new ArrayList<>(size);
    }
    public void add(Object x){
        //使用collection集合无序判断长度，直接添加
        items.add(x);
        /*if(next < items.size()){
            items. = x;
        }*/
    }

    private class SequenceSelector implements Selector{
        private int i = 0;
        @Override
        public boolean end() {
            return i == items.size();
        }

        @Override
        public Object current() {
            return items.get(i);
        }

        @Override
        public void next() {
            if(i < items.size()) i++;
        }
    }

    public Selector selector(){
        return new SequenceSelector();
    }

    public static void main(String[] args) {
        //List集合是可变长度的集合,初始化大小为10，依然可以放入多于10个的元素。此处放入20个
        Sequence sequence = new Sequence(10);
        for(int i = 0; i < 20; i ++){
            sequence.add(Integer.toString(i));
        }
        Selector selector = sequence.selector();
        while (!selector.end()){
            System.out.println(selector.current());
            selector.next();
        }
    }
}
