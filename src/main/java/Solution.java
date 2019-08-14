import java.util.HashSet;
import java.util.Set;

public class Solution {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        if (!set.isEmpty()) {
            System.out.println(set.iterator().next());
        } else {
            System.out.println("Empty set");
        }
        System.out.println("isEmpty = " + set.isEmpty() + ", iterator.hasNext = " + set.iterator().hasNext());
    }
}
