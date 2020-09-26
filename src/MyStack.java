public class MyStack {
    private int[] arr;
    private int size;
    private int index;


    public MyStack(int size) {
        this.size = size;
        arr = new int[size];

    }

    public void push(int element) {
        if (isFull()){
            throw new StackOverflowError("Full");
        }
        arr[index] =element;
        index++;
    }

    public int pop() throws Exception {
        if (isEmpty()){
            throw  new Exception("null");
        }
        return arr[--index];
    }
    public int size(){
        return index;
    }
    public boolean isEmpty(){
        if (index != 0){
            return false;
        }
        return true;
    }
    public boolean isFull(){
        if (index == size){
            return true;
        }
        return false;
    }

}
