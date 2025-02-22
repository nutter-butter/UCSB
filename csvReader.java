import java.io.*;
import java.util.ArrayList;

public class csvReader {
    String path;
    String line = "";
    ArrayList<String> list = new ArrayList<>();
    int col;

    public csvReader(String path, int col) {
        this.path = path;
        this.col = col;
    }

    public ArrayList<String> getColumn(String path, int col) {
        try {
            BufferedReader br = new BufferedReader(new FileReader(path));

            while ((line = br.readLine()) != null) {
                String[] columns = line.split(",");
                if (columns.length > col) {  
                    String data = columns[col];  
                    list.add(data);  
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }
}