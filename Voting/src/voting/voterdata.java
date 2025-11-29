package voting;

import java.io.*;
import java.util.*;
import java.nio.file.Files;
import java.nio.file.Paths;


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
    public static boolean register(String voterid){
        try{
            List<String> lines = Files.readAllLines(Paths.get("notvoted.txt"));
            for (String line : lines){
                String[] parts = line.split(",");
                if (parts[1].equals(voterid)){
                    return true;
                }
            }
        } catch (Exception e){
            
        }
        return false;
    }

    public static String[] registered(String voterid){
        try{
            List<String> lines = Files.readAllLines(Paths.get("notvoted.txt"));
            for (String line : lines){
                String[] parts = line.split(",");
                if (parts[1].equals(voterid)){
                    return parts;
                }
            }
        } catch (Exception e){
            
        }
        return null;
    }
    public static String[] voted (String voterid){
        try {
            List<String> lines = Files.readAllLines(Paths.get("voted.txt"));
            for (String line : lines){
                String[] parts = line.split(",");
                if (parts[1].equals(voterid)){
                    return parts;
                }
            }
        } catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
