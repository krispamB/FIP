import java.util.*;

public class Main {

    public static class Exersice {

        // method that counts elements in a collection that have specific properties
        public static <T> int countIf(Collection<T> c, UnaryPredicate<T> p) {
            int count = 0;
            for (T elem : c)
                if (p.test(elem))
                    ++count;
            return count;
        }
    }
    public static void main(String[] args) {
        Collection <Integer> intCollection = Arrays.asList(1, 2, 3, 4, 5);
        int countPrime = Exersice.countIf(intCollection, new PrimePredicate());
        System.out.println(countPrime);

    }
}
