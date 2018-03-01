package fr.xebia.hashcode;

import java.io.File;
import java.util.Scanner;

// Classe permettant de lire un ficher d'entrée
public class FileIn {

    private String filename;
    private int rows = 0;
    private int columns = 0;
    private int ingredientsPerSlice = 0;
    private int maxCellsPerSlice = 0;
    public char[][] content;

    public FileIn(String filename) {
        this.filename = filename;
        try {
            File file = new File(filename);
            try (Scanner sc = new Scanner(file)) {
                this.rows = sc.nextInt();
                this.columns = sc.nextInt();
                this.ingredientsPerSlice = sc.nextInt();
                this.maxCellsPerSlice = sc.nextInt();
                this.content = new char[this.columns][this.rows];

                int j = 0;
                while (sc.hasNext() && j < this.rows) {
                    String str = sc.next();
                    for (int i = 0; i < this.columns; i++) {
                        this.content[i][j] = str.charAt(i);
                    }
                    j++;
                }

            }
        } catch(Exception e) {}
    }

    public void debug() {
        System.out.println("Nombre de lignes : " + this.rows);
        System.out.println("Nombre de colonnes : " + this.columns);
        System.out.println("Nombre de chaque ingrédient au minimum par part : " + this.ingredientsPerSlice);
        System.out.println("Nombre de cellules max par part : " + this.maxCellsPerSlice);
    }
}