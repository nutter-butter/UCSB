
//import all necessary libraries
package backend;

import java.io.*;
import java.util.ArrayList;

public class csvReader {
    private String path; //path to the csv file
    private int col; 

    //constructor for the csvReader object
    public csvReader(String path, int col) {
        this.path = path;
        this.col = col;
    }

    //returns an ArrayList of strings from a certain column
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
        //show the reason if there is an error
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return list;
    }

    //creates an array list of strings from another string array list
    public ArrayList<String> createList(ArrayList<String> arr) {
        ArrayList<String> list = new ArrayList<>();
        for(int i = 0; i < arr.size(); i++) {
            list.add(createString(arr.get(i)));
        }
        return list;
    }

    //creates an array list of strings but only gathers one word from the other array list
    public ArrayList<String> createListSpace(ArrayList<String> arr) {
        ArrayList<String> list = new ArrayList<>();
        for(int i = 0; i < arr.size(); i++) {
            list.add(createStringSpace(arr.get(i)));
        }
        return list;
    }

    //creates a new string
    public String createString(String s) {
        String returnString = "";
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) != ',') {
                returnString += s.charAt(i);
            } else {
                break;
            }
        }
        return returnString;
    }

    //creates a new string but uses spaces to distinguish
    public String createStringSpace(String s) {
        String returnString = "";
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) != ' ') {
                returnString += s.charAt(i);
            } else {
                break;
            }
        }
        return returnString;
    }

    //parses through the csv file to make sure that the split doesn't mess things up when there are complex fields
    private String[] parseCsvLine(String line) {
        //initialization section
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