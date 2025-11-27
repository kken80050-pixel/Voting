package voting;

import java.io.*;
import java.util.*;

public class voterdata {
    public static ArrayList<String> voters = new ArrayList<>();
    public static final String votersfile = "voters.txt";
    
    public static void loadvoter(){
        voters.clear();
        try (BufferedReader br = new BufferedReader(new FileReader(votersfile))){
                String line;
                while((line = br.readLine()) != null){
                    voters.add(line);
                }
            } catch (IOException e){
                
            }
    }
    public static void savevoter(){
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(votersfile))){
            for (String v : voters){
                bw.write(v);
                bw.newLine();
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }
    public static String[] voted(String voterid){
        loadvoter();
        for (String line : voters){
            String[] parts = line.split(",");
            if (parts.length >= 4 && parts[1].equals(voterid)){
                return parts;
            }
        }
        return null;
    }
}
