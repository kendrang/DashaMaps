package dasha;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Dashamap implements HashMapX {


    Node[] dashaNode = new Node[26];
    Integer size = 0;

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
            size ++;
        } else {
            while (head.next != null) {
                head = head.next;
            }
            head.next = newNode;
            size ++;
        }
    }

    @Override
    public void  delete(String key) {
        String hash = HashFunctionOne(key);
        Integer index = hash.charAt(0) - 'a';
        Node head = dashaNode[index];
        if (head.getKey() == key){
            dashaNode[index] = head.next;
            size --;
        }

        while (head.next != null) {
            if (head.next.getKey() == key) {
                head.next = head.next.next;
            }
            head = head.next;
            size --;
        }
    }

    @Override
    public Integer get(String key) {
        String hash = HashFunctionOne(key);
        int hashKey = hash.charAt(0) - 'a';
        for (Node node = dashaNode[hashKey]; node != null; node = node.getNext()) {
            if (node.getKey().equals(key)) {
                return node.getValue();
            }
        }
        return null;
    }

    @Override
    public boolean isEmpty() {
        for (Node n : dashaNode){
            if (n != null){
                return false;
            }
        } return true;
    }

    @Override
    public long size() {
        return size;
    }

    @Override
    public Integer bucketSize(String key) {
        Integer bucket = 0;
       String hash =  HashFunctionOne(key);
      Integer hashKey =  hash.toCharArray()[0] - 'a';
      Node head = dashaNode[hashKey];
      while (head != null){
          bucket ++;
          head = head.next;
      }
      return bucket;
    }
}
