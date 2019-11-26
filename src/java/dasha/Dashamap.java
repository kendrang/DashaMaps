package dasha;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Dashamap implements HashMapX {


    Node[] dashaNode = new Node[26];

    private String HashFunctionOne(String input) {
        if (input.length() > 0) {
            return (String.valueOf(input.charAt(0)).toLowerCase());
        }
        return null;
    }

    @Override
    public void set(String key, Integer value) {
        String result = HashFunctionOne(key);
        char c = result.charAt(0);
        int index = c - 'a';

        Node newNode = new Node(key, value);
        Node head = dashaNode[index];
        if (head == null) {
            dashaNode[index] = newNode;
        } else {
            while (head.next != null){
                head = head.next;
            }
            head.next = newNode;
        }
    }

    @Override
    public String delete(String key) {
        return null;
    }

    @Override
    public Integer get(String key) {
        String hash =  HashFunctionOne(key);
        int hashKey = hash.charAt(0) -'a';
        for (Node node = dashaNode[hashKey]; node != null; node = node.getNext()) {
//            return dashaNode[hashKey].getValue();
            if (node.getKey().equals(key)) return node.getValue();
        }
        return null;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public long size() {
        return 0;
    }

    @Override
    public boolean bucketSize(String key) {
        return false;
    }
}
