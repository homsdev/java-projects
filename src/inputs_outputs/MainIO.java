package inputs_outputs;

import java.io.*;

public class MainIO {

    public static void main(String[] args) {
        String path = "data.txt";
        PeopleDataSet obj = new PeopleDataSet();
        try {
            obj.readInfo(null);
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }
}
