package dasha;

public interface HashMapX {


        // fundamentals
        public void set(String key, Integer value);
        public String delete(String key);
        public Integer get(String key);
        public boolean isEmpty();
        public long size();

        // testing access
        boolean bucketSize(String key); // used for tests

}
