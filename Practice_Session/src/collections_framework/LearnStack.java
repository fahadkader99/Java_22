package collections_framework;

import java.util.Stack;

public class LearnStack {
    public static void main(String[] args) {

        Stack<String> animal = new Stack<>();
        System.out.println(animal.empty());
        animal.push("cat");
        animal.push("dog");
        animal.push("rat");
        animal.push("tiger");

        System.out.println("Stack: "+ animal);
        System.out.println(animal.peek());  // see the first / top element
        animal.pop();   // took out the top elements
        System.out.println(animal.peek());
        System.out.println("Stack: "+ animal);

    }
}
