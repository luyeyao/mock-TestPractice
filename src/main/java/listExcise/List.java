package listExcise;

import java.util.ArrayList;
import java.util.Stack;

public class List {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        list1.add(0,10);
        list1.add(1,20);
        list1.add(2,30);
        list1.add(1,40);
        System.out.println(list1);//list底层重写了toString方法
        for (int i = 0; i <list1.size() ; i++) {
            list1.remove(i);

        }
        System.out.println(list1);
        Integer[] x = new Integer[list1.size()];
        list1.toArray(x);
        for (int a:x
             ) {
            System.out.println(a);
        }

        ArrayList<String> list2 = new ArrayList<String>();
        list2.add("这是一");
        list2.add("个为了");
        ArrayList<String> list3 = new ArrayList<String>();
        list3.add("添加addAll的");
        list3.add("test");
        list2.addAll(list3);  //addAll同类或继承
        for (String value:list2
             ) {
            System.out.print(value);

        }
        System.out.println("");

        Stack<Character> stack = new Stack<Character>();
        stack.push('a');
        stack.push('b');
        stack.push('c');
        System.out.println(stack);
        System.out.println(stack.search('a'));

    }
}
