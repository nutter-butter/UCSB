import java.io.*;
import java.util.ArrayList;

public class csvReader {
    String path;
    int col;

    public csvReader(String path, int col) {
        this.path = path;
        this.col = col;
    }

    public ArrayList<String> getColumn() {
        ArrayList<String> list = new ArrayList<>();
        
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line;
            
            while ((line = br.readLine()) != null) {
                String[] columns = parseCsvLine(line);
                
                if (columns.length > col) {
                    list.add(columns[col]);  
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return list;
    }

    private String[] parseCsvLine(String line) {
        ArrayList<String> columns = new ArrayList<>();
        StringBuilder currentColumn = new StringBuilder();
        boolean insideQuotes = false;

        for (int i = 0; i < line.length(); i++) {
            char c = line.charAt(i);

            if (c == '"' && (i == 0 || line.charAt(i - 1) != '\\')) {  
                insideQuotes = !insideQuotes;  
            } else if (c == ',' && !insideQuotes) {  
                columns.add(currentColumn.toString().trim());
                currentColumn.setLength(0);  
            } else {
                currentColumn.append(c);  
            }
        }
        columns.add(currentColumn.toString().trim());

        return columns.toArray(new String[0]);
    }
}
