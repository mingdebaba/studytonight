import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class Csvreader {
    public static void main(String[] args) {
        try {
            List<List<String>> data = new ArrayList<>();// list of lists to store data
            String file = "D:\\studytonight\\csvreader.txt";// file path
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);

            // Reading until we run out of lines
            String line = br.readLine();
            while (line != null) {
                List<String> lineData = Arrays.asList(line.split(","));// splitting lines
                data.add(lineData);
                line = br.readLine();
            }

            // printing the fetched data
            for (List<String> list : data) {
                for (String str : list)
                    System.out.print(str + " ");
                System.out.println();
            }
            br.close();
        } catch (Exception e) {
            System.out.print(e);
        }
    }
}