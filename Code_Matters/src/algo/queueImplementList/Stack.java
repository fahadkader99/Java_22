package algo.queueImplementList;

import java.util.ArrayList;
import java.util.List;

public class Stack {


    private List<String> list = new ArrayList<>();

    public String peek(){            // peek - view the top / first object, which is the last in the list
        if (list.isEmpty()){
            return null;

        }else {
            return list.get(list.size()-1);
        }
    }

    public String pop(){        // Pop - top element took out
        if (list.isEmpty()){
            return null;

        }else {
            String top = list.get(list.size()-1);
                        list.remove(list.size()-1);
                        return top;
        }
    }

    public void push(String str){       // Push - add element to the list
        list.add(str);
    }

    public int size(){          // returning the size of the list
        return list.size();
    }


    public boolean isEmpty(){       // returning is the list empty or not
        return list.isEmpty();
    }

    public String toString(){
        return "Stack elements = "+ list;
    }


    public static void main(String[] args) {
        Stack stack = new Stack();
        System.out.println(stack.isEmpty());
        stack.push("Ash");
        stack.push("Kader");
        stack.push("Fahad");
        System.out.println(stack);
        System.out.println(stack.isEmpty());
        System.out.println(stack.size());
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.size());


    }



}

