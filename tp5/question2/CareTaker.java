package question2;
import java.util.Stack;


public class CareTaker {
   private Stack<Memento> mementoStack;
   
   public CareTaker(){
       mementoStack = new Stack<Memento>();
    }
    
   public void add(Memento memento){
      mementoStack.push(memento);
   }

   public Memento get(){
      return mementoStack.pop();
   }
   
  public String toString(){
      String res = "";
      Stack<Memento> temp = new Stack<Memento>();
      while(mementoStack.size() > 0){
          System.out.println(mementoStack.peek().toString());
          temp.push(mementoStack.pop());
        }
        while(temp.size() > 0){
            res += mementoStack.peek().toString();
          mementoStack.push(temp.pop());
        }
    return res;
    }
}