package Controller;

import Model.Offerten;
import Model.Ort;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
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
            offerte = new Offerten(Integer.parseInt(attributes[0]), attributes[1],
                    Integer.parseInt(attributes[2]),
                    Float.parseFloat(attributes[3]), attributes[4], Ort.valueOf(attributes[5]));
            liste.add(offerte);

            line = bufferedReader.readLine();
        }

        return liste;
    }


    public void writeToFile(String fileName, List<Offerten> liste, String character) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName));
        for (Offerten offerte : liste) {
            String line = offerte.getId() + character + offerte.getUnternehmensname() + character +
                    offerte.getPreis() + character + offerte.getProzent() + character + offerte.getAdresse() +
                    character + offerte.getOrt();
            bufferedWriter.write(line);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();
    }

    /*
    public List<Offerten> sort(List<Offerten> list){
        List<Offerten> lista_sortata = new ArrayList<>();
        lista_sortata = Collections.sort(list);
        return lista_sortata;
    }

     */


}
