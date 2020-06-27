package question1;

import java.util.*;

public class Ensemble<T> extends AbstractSet<T> {

    protected java.util.Vector<T> table = new java.util.Vector<T>();

    public int size() {
        return table.size();
    }

    public Iterator<T> iterator() {
        return table.iterator();
    }

    public boolean add(T t) {
    if (!this.contains(t)) {
            return table.add(t);            
        }
        return false;
    }
    
    //si on utilise this.add(..) sa va donner une erreur 
    //this.contains(..) marche bien 

    public Ensemble<T> union(Ensemble<? extends T> e) {
        Ensemble<T> ens = new Ensemble();
        ens.addAll(this);
        ens.addAll(e);
        return ens;
    }

    public Ensemble<T> inter(Ensemble<? extends T> e) {
       	 Ensemble<T> ens = new Ensemble();
         ens.addAll(this);
         ens.retainAll(e);
         return ens;
    }

    public Ensemble<T> diff(Ensemble<? extends T> e) {
         Ensemble<T> ens = new Ensemble();
         ens.addAll(this);
         ens.removeAll(e);
         return ens;
         }

    Ensemble<T> diffSym(Ensemble<? extends T> e) {
         return union(e).diff(inter(e));
    }
    
}
