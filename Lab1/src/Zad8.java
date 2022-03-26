package Lab1.src;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Zad8 {
    private static class Animal {
        private String name;
        private String breed;

        public Animal() {
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

        String animalJson = "{\"name\":\"Burek\",\"breed\":\"Pies\"}";
        Animal animalObject = null;
        try {
            animalObject = objectMapper.readValue(animalJson, Animal.class);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

        System.out.println(animalObject.getName());
        System.out.println(animalObject.getBreed());
    }
}
