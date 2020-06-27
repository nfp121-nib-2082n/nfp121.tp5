  
package question2;
import java.util.List;

public class Memento {
   private List liste;

   public Memento(List liste){
      this.liste = liste;
   }

   public List getListe(){
      return liste;
   }
   
   public String toString(){
       return liste.toString();
    }
}