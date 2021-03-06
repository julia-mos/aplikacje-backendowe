package Lab1.src;

 import com.fasterxml.jackson.core.JsonProcessingException;
 import com.fasterxml.jackson.databind.ObjectMapper;

public class Zad7 {
    private static class Animal {
        private String name;
        private String breed;

        public Animal(String name, String breed) {
            this.name = name;
            this.breed = breed;
        }

        public String getName() {
            return this.name;
        }

        public String getBreed() {
            return this.breed;
        }
    }

    public static void main(String[] args) {
        ObjectMapper objectMapper = new ObjectMapper();

        Animal test = new Animal("Moris", "Lemur");

        String testJson = null;
        try {
            testJson = objectMapper.writeValueAsString(test);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

        System.out.println(testJson);
    }
}
