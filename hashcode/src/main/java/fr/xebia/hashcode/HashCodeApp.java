package fr.xebia.hashcode;


import java.net.URL;
import java.util.Arrays;

public class HashCodeApp {

    public static void main(String[] args) {
         URL path = HashCodeApp.class.getResource("/a_example.in");
        FileIn fileIn = new FileIn(path.getPath());
        fileIn.getRideList().forEach(System.out::println);
    }

}
