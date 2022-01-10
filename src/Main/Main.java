package Main;

import Controller.Repository;
import Model.Offerten;
import Model.Ort;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        /*
        Offerten off = new Offerten(1, "name", 7, 70, "Adresse", Ort.THURGAU);
        Repository x = new Repository();
        Offerten off2 = new Offerten(1, "name", 2, 70, "Adresse", Ort.THURGAU);
        List<Offerten> offerten = new ArrayList<>();
        offerten.add(off);
        offerten.add(off2);
        x.writeToFile("oferte.txt", offerten, "&");

        System.out.println(x.sort(offerten));

         */

        Repository x = new Repository();
        List<Offerten> lis = x.readFromFile("oferte.txt", "&");
        System.out.println(lis);

        x.sort();
    }
}
