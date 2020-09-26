public class Main {
    public static void main(String[] args) throws Exception {
        MyStack stack = new MyStack(5);
        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);
//        stack.push(7);
//        stack.push(8);

        System.out.println("Size " + stack.size());

        System.out.printf("Stack ");
        while (!stack.isEmpty()) {
            System.out.printf("%d", stack.pop());
        }
        System.out.println(" Size2 " + stack.size());
    }
}
