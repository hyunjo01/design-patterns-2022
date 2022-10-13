public class CompareFileName implements Comparable {
    @Override
    public int compareTo(Object o1, Object o2) {
        String n1 = ((FileInfo) o1).getName();
        String n2 = ((FileInfo) o2).getName();
        return n1.compareTo(n2);
    }
}
