package fr.xebia.hashcode;


import java.util.Arrays;

public class HashCodeApp {

    public static void main(String[] args) {
        FileIn fileIn = new FileIn("/Users/Maxime/IdeaProjects/hashcode-2018/hashcode/src/resources/example.in");
        Arrays.stream(fileIn.content).forEach(System.out::println);

    }

}
