import java.util.LinkedList;
import java.util.List;

public class LRUCache {
    int capacity;
    List<Integer> cache;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.cache = new LinkedList<>();
    }

    public void getPage(int page) {
        // 페이지가 기존 캐시에 있는지 확인.
        if (cache.contains(page)) { // 있으면 해당 페이지를 맨 앞으로 가져오기
            cache.remove(Integer.valueOf(page));
            cache.add(page);
        } else { // 없으면 맨 뒤의 페이지를 지우기, 맨 앞에 새로운 페이지를 추가하기
            cache.add(page);

            if (cache.size() > capacity) {
                cache.remove(0);
            }
        }
    }

    public static void main(String[] args) {
        LRUCache lruCache = new LRUCache(3);

        lruCache.getPage(1);
        lruCache.getPage(2);
        lruCache.getPage(3);
        lruCache.getPage(5);
        lruCache.getPage(2);

        for (int i = 0; i < lruCache.capacity; i++) {
            System.out.print(lruCache.cache.get(i) + " ");
        }
    }
}
