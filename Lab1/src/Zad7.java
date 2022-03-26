package Lab1.src;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Zad7 {

    private static class Animal{
        String name;
        String breed;

        public Animal(String name, String breed){
            this.name=name;
            this.breed=breed;
        }
    }

    public static void main(String[] args) {
        ObjectMapper objectMapper = new ObjectMapper();

        Animal test = new Animal("Moris", "Lemur");

        String testJson = objectMapper.writeValueAsString(test);

        System.out.println(testJson); // {"name":"John","age":21}
    }
}
