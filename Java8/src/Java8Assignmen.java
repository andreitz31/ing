import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Java8Assignment {

    public static void main(String[] args) {
        /**
         * Given the following input data.
         */
        List<Integer> numbers = IntStream.range(0, 1_000)
                .boxed()
                .collect(Collectors.toList());

        List<String> words = Arrays.asList("One", "Two", "three", "four", "five", "six", "seven", "Eight", "nine",
                "ten", "eleven", "twelve", "thirteen", "Fourteen", "fifteen", "sixteen", "Nineteen", "twenty");
       // exFour(numbers);
        exEight(numbers);
        exSeven(numbers);
        exSix(numbers);
        exForteen(words);
        exFifteen(words).forEach(wd->System.out.println(wd));
        exSixteen(words).forEach(wd->System.out.println(wd));
        exNineteen(words).forEach(wd->System.out.println(wd));

         // exTwo(numbers);
        /**
         * Implement ONE method PER exercise given todos:
         */

        /**
         * For each
         */
        // 1: using "numbers" as input, print first ten numbers
//        example(numbers);
        // 2: using "numbers" as input print first ten odd numbers
        // 3: using "numbers" as input print first ten even numbers
        // 4: implement 1, 2, 3 using one method

        /**
         * Sums
         */
        // 5. using "numbers" as input print their sum
        // 6. using "numbers" as input print the sum of the odd numbers
        // 7. using "numbers" as input print the sum of the even numbers
        // 8. using "numbers" as input print the sum of the even numbers which contain '7'
        // 9. implement 5, 6, 7, 8 using one method

        /**
         * Mixed map/filter/reduce
         */
        // 10. using "numbers" calculate the sum of the double of even numbers
        // 11. using "numbers" calculate the sum of the triple of odd numbers
        // 12. using "numbers" calculate the sum of their half (1/2)
        // 13 implement 10, 11, 12 using one method

        /**
         * Collectors
         */
        // 14. using "words" as input print a string with each UPPERCASED word separated by ', '
        // 15. using "words" as input create a List containing all words starting with a vowel
        // 16. using "words" as input create a List containing all words ending in 'teen'
        // 17. implement 11 and 12 using one method
        // 18. using words as input create a Set of words with an odd number of letters
        // 19. using words as input create a Set containing the number of letters in a word

        /**
         * Converting to java 8
         */
        // 20. convert the following code to java 8
        nonJava8Method(numbers);

        /**
         * Optional<T>
         */
        // 21. using "numbers" as input print the first odd number that can be divided by 121, if it does not exist print -1
    }

    private static void example(List<Integer> numbers) {
        numbers.stream()
                .limit(10)
                .forEach(System.out::print);
    }

    private static void exTwo(List<Integer> numbers){
        numbers.stream()
                .limit(20)
                .filter(num->num%2==1)
                .forEach(System.out::print);
    }
    private static void exThree(List<Integer> numbers){
        numbers.stream()
                .limit(20)
                .filter(num->num%2==0)
                .forEach(System.out::print);
    }

    private static void exFour(List<Integer> numbers){
        numbers.stream()
                .limit(20)
                .filter(num->{
                    int k=0;
                    if(num<10) System.out.println("Numarul" + k + "este "+num);
                    if(num%2==1) System.out.println(num);
                    k++;
                    if(num%2==0) return true;
                    else return false;
                })
                .forEach(System.out::println);
    }

    private static void exFive(List<Integer> numbers){
        System.out.println(numbers.stream()
                .reduce(0,(acc,e)->acc+e));
    }
    private static void exSix(List<Integer> numbers){
        System.out.println(numbers.stream()
        .filter(nums->nums%2==1)
        .reduce(0,(acc,e)->acc+e));
    }
    private static void exSeven(List<Integer> numbers){
        System.out.println(numbers.stream()
        .filter(nums->nums%2==0)
        .reduce(0,(acc,e)->acc+e));
    }
    private static void exEight(List<Integer> numbers){
        System.out.println(numbers.stream()
        .filter(nums->{
            StringBuilder str = new StringBuilder();
            str.append("");
            str.append(nums);
            if((nums%2==0)&&(str.toString().contains("7"))) return true;
            else
                return false;
        })
        .reduce(0,(acc,e)->acc+e));
    }
    private static void exNine(List<Integer> numbers){
        // I have no other idea than reusing code
    }

    private static void exTen(List<Integer> numbers){
        numbers.stream()
                .filter(nums->nums%2==0)
                .map(nums->nums*2)
                .reduce(0,(acc,e)->acc+e);
    }
    private static void exEleven(List<Integer> numbers){
        numbers.stream()
                .filter(nums->nums%2==1)
                .map(nums->nums*3)
                .reduce(0,(acc,e)->acc+e);
    }
    private static void exTwelve(List<Integer> numbers){
        numbers.stream()
                .map(nums->nums/2)
                .reduce(0,(acc,e)->acc+e);
    }
    private static void exForteen(List<String> words){
        System.out.println(words.stream()
                .map(str->str.toUpperCase())
                .reduce("",(acc,e)->acc+e+","));
    }

    private static List<String> exFifteen(List<String> words){
       return words.stream()
                .filter(wd->{
                    String temp = wd.toLowerCase();
                    if((temp.toLowerCase().startsWith("a"))||(wd.startsWith("e"))||(wd.startsWith("i"))||(wd.startsWith("o"))||(wd.startsWith("u"))||(wd.startsWith("A")||(wd.startsWith("E")||(wd.startsWith("I")||(wd.startsWith("O")||(wd.startsWith("U")))))))
                        return true;
                    else return false;
                })
                .collect(Collectors.toList());

    }
    private static List<String> exSixteen(List<String> words){
        return words.stream()
                .filter(wd->wd.endsWith("teen"))
                .collect(Collectors.toList());
    }
    private static void exSeventeen(List<Integer> numbers){
       List<Integer> list = new ArrayList<>();
       list = numbers.stream()
               .filter(num->num%2==0)
               .map(num->num*3)
               .collect(Collectors.toList());
       System.out.println(
               list.stream()
               .reduce(0,(acc,e)->acc+e)
       );
       System.out.println(
               numbers.stream()
               .map(nums->nums/2)
               .reduce(0,(acc,e)->acc+e)
       );
    }
    private static Set<String> exEighteen(List<String> words){
       return words.stream()
                .filter(wd->wd.length()%2==1)
                .collect(Collectors.toSet());
    }
    private static Set<String> exNineteen(List<String> words){
        return words.stream()
                .map(wd->Integer.toString(wd.length()))
                .collect(Collectors.toSet());
    }
    private static void nonJava8Method(List<Integer> numbers) {
        int sum = 0;
        int counter = 0;

        for (int i = 0; i < numbers.size(); i++) {
            int num = 0;

            if (numbers.get(i) % 2 == 0) {
                num = numbers.get(i) + 5;
            } else {
                sum += 0;
                continue;
            }

            num = num * 7;
            if (num % 20 == 3) {
                num = num / 20;
            }

            sum += (num / 10);

            if (++counter > 5) {
                break;
            }
        }

       // System.out.println(sum);
    }
}
