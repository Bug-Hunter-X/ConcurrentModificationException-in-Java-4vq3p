public class ConcurrentModificationExceptionSolution {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("apple", "banana", "cherry"));

        // Solution 1: Use an Iterator
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String item = iterator.next();
            if (item.equals("banana")) {
                iterator.remove();
            }
        }

        // Solution 2: Iterate over a copy
        // for (String item : new ArrayList<>(list)) {  //Creating a copy of the list to avoid CME
        //     if (item.equals("banana")) {
        //         list.remove(item); // this will work because we are removing from the original list, not during iteration
        //     }
        // }
        System.out.println(list); // Output: [apple, cherry]
    }
}