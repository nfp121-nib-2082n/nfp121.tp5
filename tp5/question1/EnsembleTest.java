package question1;

public class EnsembleTest extends junit.framework.TestCase {

    public void testAdd() {
        Ensemble<Integer> e = new Ensemble<>();
        assertTrue(e.add(new Integer(10)));
        assertTrue(e.contains(new Integer(10)));
    }
    
    public void testUnion() {
        question1.Ensemble<Integer> e1, e2;
        e1 = new question1.Ensemble<Integer>();
        assertEquals(true, e1.add(2));
        assertEquals(true, e1.add(3));

        e2 = new question1.Ensemble<Integer>();
        assertEquals(true, e2.add(3));
        assertEquals(true, e2.add(4));

        question1.Ensemble<Integer> union = e1.union(e2);
        assertEquals(3, union.size());
        assertTrue(union.contains(2));
        assertTrue(union.contains(3));
        assertTrue(union.contains(4));
    }
  
    public void testInter() {
        Ensemble<Integer> e1, e2;
        e1 = new Ensemble<Integer>();
        assertEquals(true, e1.add(2));
        assertEquals(true, e1.add(3));

        e2 = new Ensemble<Integer>();
        assertEquals(true, e2.add(3));
        assertEquals(true, e2.add(4));
        
        Ensemble<Integer> inter = e1.inter(e2);
        assertEquals(1, inter.size());
        assertTrue(inter.contains(3));
    }
    
    public void testDiff() {
        Ensemble<Integer> e1, e2;
        e1 = new Ensemble<Integer>();
        assertEquals(true, e1.add(2));
        assertEquals(true, e1.add(3));

        e2 = new Ensemble<Integer>();
        assertEquals(true, e2.add(3));
        assertEquals(true, e2.add(4));
        
        Ensemble<Integer> diff = e1.diff(e2);
        assertEquals(1, diff.size());
        assertTrue(diff.contains(2));
     }
    
    public void testDiffSync() {
        Ensemble<Integer> e1, e2;
        e1 = new Ensemble<Integer>();
        assertEquals(true, e1.add(2));
        assertEquals(true, e1.add(3));

        e2 = new Ensemble<Integer>();
        assertEquals(true, e2.add(3));
        assertEquals(true, e2.add(4));
        
        Ensemble<Integer> diff = e1.diffSym(e2);
        assertEquals(2, diff.size());
        assertTrue(diff.contains(2));
        assertTrue(diff.contains(4));
    }
    
    public void testToString() {
        Ensemble<Integer> e = new Ensemble();
        e.add(new Integer(10));
        e.add(new Integer(20));
        assertEquals("[10, 20]", e.toString());
    }
}
