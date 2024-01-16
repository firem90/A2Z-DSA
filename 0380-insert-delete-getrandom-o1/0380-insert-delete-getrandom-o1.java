class RandomizedSet {

    HashMap<Integer,Integer> hashTable;
    List<Integer> index;
    // int i;
    Random rand;

    public RandomizedSet() {
        this.hashTable = new HashMap<Integer,Integer>();
        this.index = new ArrayList<Integer>();
        // this.i = 0;
        this.rand = new Random();

    }
    
    public boolean insert(int val) {
        if(!hashTable.containsKey(val)) {
            index.add(val);
            int i = index.indexOf(val);
            hashTable.put(val,i);            
            // i++;
            return true;
        } else {
            return false;
        }
    }
    
    public boolean remove(int val) {
        if(hashTable.containsKey(val)) {
            final int i = hashTable.get(val);
            // The order of the following two lines is important when vals.size() == 1.
            hashTable.put(last(index), i);
            hashTable.remove(val);
            index.set(i, last(index));
            index.remove(index.size() - 1);
            return true;
        } else {
            return false;
        }
    }

    private int last(List<Integer> vals) {
            return vals.get(vals.size() - 1);
    }
    
    public int getRandom() {
        int i = rand.nextInt(index.size());
        return index.get(i);
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */

 /*Fastest Soln - Refer: 
 class RandomizedSet {
    private final Random random = new Random();
    private final Map<Integer, Integer> map = new HashMap<>();
    private int[] vals = new int[32];
    private int i = 0;

    public RandomizedSet() {
        
    }
    
    public boolean insert(int val) {
        Integer added = map.putIfAbsent(val, i);
        if (added != null) return false;

        if (i >= vals.length) {
            vals = Arrays.copyOf(vals, vals.length * 2);
        }
        vals[i++] = val;
        return true;
    }
    
    public boolean remove(int val) {
        Integer removed = map.remove(val);
        if (removed == null) return false;

        if (removed < i - 1) {
            vals[removed] = vals[i-1];
            map.put(vals[i-1], removed);
        }
        i--;
        return true;
    }
    
    public int getRandom() {
        int index = random.nextInt(i);
        return vals[index];
    }
}

*/