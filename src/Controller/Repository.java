package Controller;

import Model.Offerten;
import Model.Ort;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Repository {
    public List<Offerten> readFromFile(String fileName, String character) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));
        String line = bufferedReader.readLine();
        String[] attributes;
        Offerten offerte;
        List<Offerten> liste = new ArrayList<>();
        while (line != null) {
            attributes = line.split(character);
            offerte = new Offerten(Integer.valueOf(attributes[0]), attributes[1], Float.valueOf(attributes[2]), Integer.valueOf(attributes[3]), attributes[4], Ort.valueOf(attributes[5]) );
            liste.add(offerte);

            line = bufferedReader.readLine();
        }

        return liste;
    }
}
