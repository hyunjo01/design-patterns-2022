public class CompareFileType implements Comparable {
    @Override
    public int compareTo(Object o1, Object o2) {
        String t1 = ((FileInfo) o1).getType();
        String t2 = ((FileInfo) o2).getType();
        return t1.compareTo(t2);
    }
}
