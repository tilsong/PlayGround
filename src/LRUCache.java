import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class LRUCache {

    static class Node {
        int key;
        String value;

        public Node(int key, String value) {
            this.key = key;
            this.value = value;
        }
    }

    int capacity;
    HashMap<Integer, Node> cache;
    LinkedList<Node> list;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.list = new LinkedList<>();
        cache = new HashMap<>();
    }

    public String getPage(int page) {
        // 페이지가 기존 캐시에 있는지 확인.
        if (cache.containsKey(page)) { // 있으면 해당 페이지를 맨 앞으로 가져오기
            Node node = cache.get(page);
            list.remove(node);
            list.addLast(node);
            return node.value;
        } else { // 없으면 맨 뒤의 페이지를 지우기, 맨 앞에 새로운 페이지를 추가하기
            if (cache.size() >= capacity) {
                Node node = list.removeFirst();
                cache.remove(node.key);
            }
            Node node = new Node(page, page + "");
            cache.put(page, node);
            list.addLast(node);
            return node.value;
        }
    }

    public static void main(String[] args) {
        LRUCache lruCache = new LRUCache(3);

        System.out.println(lruCache.getPage(1));
        System.out.println(lruCache.getPage(2));
        System.out.println(lruCache.getPage(3));
        System.out.println(lruCache.getPage(5));
        System.out.println(lruCache.getPage(2));

        for (int i = 0; i < lruCache.capacity; i++) {
            System.out.print(lruCache.list.get(i).value + " ");
        }
    }
}
