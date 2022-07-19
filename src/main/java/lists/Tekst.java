package lists;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Tekst {
    public static void main(String[] args) throws IOException {


        File files = new File("tekst.txt");

        BufferedReader bufferedReader = new BufferedReader(new FileReader(files));


        List<String> list = new ArrayList<>();

        while (( bufferedReader.readLine()) != null) {
            list.add(bufferedReader.readLine());

            System.out.println(list);
        }

    }
}


