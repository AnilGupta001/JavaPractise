class Stack implements MyStack{
    private int stack[];
    private static int top;
    final static int MAX_SIZE = 5;
    Stack(){
      stack = new int[MAX_SIZE];
      top = -1;
    }
    public void push(int element) throws OverflowException{
      if(top == MAX_SIZE - 1){
        throw new OverflowException("No space in stack to add element");
      }
      stack[++top] = element;
    }
    public int pop() throws UnderflowException{
      if(top == -1){
        throw new Exception("No elements in the stack");
      }
      return stack[top--];
    }
    public int peek() throws UnderflowException{
      if(top == -1){
        throw new Exception("No elements in the stack");
      }
      return stack[top];
    }
    public static String displayStackElements(int stack[]){
      StringBuilder sb = new StringBuilder();
      for(int i = 0; i <= top; i++){
        sb.append(stack[i]);
        if(i != top){
          sb.append(", ");
        }
      }
      return sb.toString();
    }
    public String toString(){
      return MyStack.displayStackElements(stack);
    }
  }
  