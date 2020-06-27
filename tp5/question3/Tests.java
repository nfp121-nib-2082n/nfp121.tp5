package question3;

import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;

public class Tests extends junit.framework.TestCase {

    public void test1(question3.Factory<Set<Integer>>f) throws Exception {
        Set<Integer> set = f.create();
        for (int i = 20; i > 0; i--)
            set.add(i);
    }

    public void testCreation() {
        try {
            test1(new TreeSetFactory<Integer>());
            test1(new HashSetFactory<Integer>());
        } catch (NoSuchMethodError e) {
            fail("NoSuchMethodError : " + e.getMessage());
        } catch (Exception e) {
            fail(" exception inattendue : " + e.getMessage());
        }
    }

        public void testHashSetFactoryType() {
        Factory<Set<Integer>> factory = new HashSetFactory<Integer>();
        Set<Integer> set = factory.create();
        assertTrue(set instanceof HashSet); 
    }
    
    public void testTreeSetFactoryType() {
        Factory<Set<Integer>> factory = new TreeSetFactory<Integer>();
        Set<Integer> set = factory.create();
        assertTrue(set instanceof TreeSet);
    }
}
