package dasha;

public class HashMap2 implements HashMapX {


    Node[] dashaNode2 = new Node[26];
    Integer size = 0;


    private String HashFunctionTwo(String input) {
        if (input.length() > 0) {
            return (String.valueOf(input.charAt(1)).toLowerCase());
        }
        return null;
    }

    @Override
    public void set(String key, Integer value) {
        String result = HashFunctionTwo(key);
        char c = result.charAt(0);
        int index = c - 'a';

        Node newNode = new Node(key, value);
        Node head = dashaNode2[index];
        if (head == null) {
            dashaNode2[index] = newNode;
            size++;
        } else {
            while (head.next != null) {
                head = head.next;
            }
            head.next = newNode;
            size++;
        }
    }

    @Override
    public void delete(String key) {
        String hash = HashFunctionTwo(key);
        Integer index = hash.charAt(0) - 'a';
        Node head = dashaNode2[index];
        if (head.getKey().equals(key)) {
            dashaNode2[index] = head.next;
            size--;

        } else {

            while (head.next != null) {
                if (head.next.getKey().equals(key)) {
                    head.next = head.next.next;
                    break;
                }
                head = head.next;
                size--;
            }
        }
    }

    @Override
    public Integer get(String key) {
        String hash = HashFunctionTwo(key);
        int hashKey = hash.charAt(0) - 'a';
        for (Node node = dashaNode2[hashKey]; node != null; node = node.getNext()) {
            if (node.getKey().equals(key)) {
                return node.getValue();
            }
        }
        return null;
    }

    @Override
    public boolean isEmpty() {
        for (Node n : dashaNode2) {
            if (n != null) {
                return false;
            }
        }
        return true;
    }

    @Override
    public long size() {
        return size;
    }

    @Override
    public Integer bucketSize(String key) {
        Integer bucket = 0;
        String hash = HashFunctionTwo(key);
        Integer hashKey = hash.toCharArray()[0] - 'a';
        Node head = dashaNode2[hashKey];
        while (head != null) {
            bucket++;
            head = head.next;
        }
        return bucket;
    }
}
