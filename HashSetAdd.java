import java.util.LinkedHashSet;

class HashSetAdd {
    public static void main(String[] args) {
        LinkedHashSet<Integer> evenNumber = new LinkedHashSet<>();

        // Using add() method
        evenNumber.add(201);
        evenNumber.add(401);
        evenNumber.add(601);
        System.out.println("LinkedHashSet: " + evenNumber);

        LinkedHashSet<Integer> numbers = new LinkedHashSet<>();
        
        // Using addAll() method
        numbers.addAll(evenNumber);
        numbers.add(501);
        System.out.println("New LinkedHashSet: " + numbers);
    }
}