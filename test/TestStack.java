package qq.com;

import java.util.Stack;

public class TestStack {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("java");
        stack.push("c++");
        stack.push("python");
        stack.push("golang");
        System.out.println("栈的大小"+stack.size());
        System.out.println("栈是否为空"+stack.isEmpty());
        System.out.println("观察栈顶"+stack.peek());
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
    }
}
