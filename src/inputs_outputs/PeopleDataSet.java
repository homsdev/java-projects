package inputs_outputs;

import inputs_outputs.enums.GenderType;
import inputs_outputs.models.IP;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class PeopleDataSet {
    private List<String> names;
    private List<IP> ips;
    private List<GenderType> genderTypeList;

    private static final String RED = "\033[31m";
    private static final String RESET = "\033[0m";

    public void readInfo(String path) throws IOException {
        if (path != null) {
            FileReader fr = new FileReader(path);
            BufferedReader br = new BufferedReader(fr);

            do {

            } while (true);
        } else {
            //System.out.printf("\033[0mProvided Path is invalid \n");
            System.out.printf(RED + "Provide path invalid\n%s", RESET);
            System.out.println("Give a valid path");
        }
    }
}
