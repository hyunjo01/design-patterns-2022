import java.util.Iterator;

public class ObjectDynamicArray implements Iterable<Object> {

    private int length;
    private int capacity;
    private Object[] data;

    class ODAIterator implements Iterator {
        int index;

        public ODAIterator() { index = 0; }

        public boolean hasNext() { return index < length; }

        public Object next() {
            Object o = get(index++);
            return o;
        }
    }

    public ObjectDynamicArray() {
        length = 0;
        capacity = 10;
        data = new Object[10];
    }

    public boolean add(Object t) {
        if (length>=capacity) {
            resizeArray();
        }
        data[length] = t;
        length++;
        return true;
    }

    public Object get(int index) {
        if (index>=0 && index<length) {
            return data[index];
        }
        return null;
    }

    public int size() {
        return length;
    }

    public Iterator<Object> iterator() {
        return new ODAIterator();
    }

    private boolean resizeArray() {
        capacity += 10;
        Object[] tempData = new Object[capacity];
        for(int i = 0; i<length; i++) {
            tempData[i] = data[i];
        }
        data = tempData;
        return true;
    }
}
