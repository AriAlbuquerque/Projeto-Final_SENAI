/*package model.util;
import model.Product;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LeituraArquivo  {

    public LeituraArquivo() {

    }

    public List<Product> Burgers() {

        String pathBurger = "C:\\Users\\arthu\\OneDrive\\Documentos\\Arthur\\Programação\\Java Senai\\lista-burguer.csv";    List<Product> burgersList;
        burgersList = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader((File) burgersList))) {

            String line = br.readLine();
            while (line != null) {
                String[] fields = line.split(",");

                burgersList.add(new Product(Long.parseLong(fields[0]), fields[1], fields[2],
                        Double.parseDouble(fields[4])));
                line = br.readLine();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        return burgersList;

    }


}



*/