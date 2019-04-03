
package Q1;

public class TestMyStack {
    
    public static void main(String[] args) {
        
        MyStack<Character> stack = new MyStack<>();
        MyStack<Integer> addStack = new MyStack<>();

        stack.push('a');
        stack.push('b');
        stack.push('c');
        System.out.println(stack.toString());
        System.out.println(stack.search('b'));
        System.out.println(stack.search('k'));
        
        System.out.println();
        addStack.push(1);
        addStack.push(2);
        addStack.push(3);
        System.out.println(addStack.toString());
        System.out.println(stack.search('6'));
                
    }
}
