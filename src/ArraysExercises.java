public class ArraysExercises {
    public static void main(String[]args){
//        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(numbers);

//        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(Arrays.toString(numbers));

        Person[] people = new Person[3];
        people[0] = new Person("Alice");
        people[1] = new Person("Bob");
        people[2] = new Person("Charlie");

        for (Person person : people) {
            System.out.println(person.getName());
        }

    }
}
