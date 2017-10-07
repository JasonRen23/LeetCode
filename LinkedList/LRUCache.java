class LRUCache {
    private int capacity;
    private final HashMap<Integer, Node>map;
    private Node head;
    private Node end;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        map = new HashMap<>();
    }
    
    public int get(int key) {
        if(map.containsKey(key)){
            Node n = map.get(key);
            update(n);
            return n.value;
        }
        return -1;
    }
    

    public void put(int key, int value){
        Node node = null;
        if(!map.containsKey(key)){
            if(map.size() == capacity){
                map.remove(end.key);
                removeEnd();
            }
            node = new Node(key, value);
            map.put(key,node);
            setHead(node);
        }else{
            node = map.get(key);
            node.value = value;
            update(node);
        }
    }
    public void removeEnd(){
        if(end == null) return;
        if(end.next == null){
            end = null;
            head = null;
        }else{
            end.next.prev = null;
            end = end.next;
        }
    }
    //node existed but have new value
    public void update(Node node){
        if(node.next == null) return; 
        node.next.prev = node.prev;
        if(node.prev != null) node.prev.next = node.next;
        else end = node.next;
        node.next = null;
        node.prev = null;
        setHead(node);
    }

    public void setHead(Node n){
        if(head == null){
            head = n;
            end = n;
            return;
        }else{
            head.next = n;
            n.prev = head;
            head = n;
        }
    }
    //doubly linked list
    static class Node{
        int key;
        int value;
        Node prev;
        Node next;
        
        public Node(int key, int value){
            this.key = key;
            this.value = value;
        }
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
