package ÖvnUppg5_URLWordCount;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class ÖvnUppg5_URLWordCountB_altSolution {

    public ÖvnUppg5_URLWordCountB_altSolution() {

        try{
            URL url = new URL("https://github.com/dwyl/english-words/blob/master/words.txt?raw=true");
            
            BufferedReader words = new BufferedReader(
                    new InputStreamReader(url.openStream()));
            
            Map <Integer, List<String>> letterCountWordListMap = words.lines()
                    .collect(Collectors.groupingBy(n -> n.length()));
            
            letterCountWordListMap.forEach((k,v) -> System.out.println(k + " " +v.get(0).length()));
            
        }
        catch (MalformedURLException e){
            e.printStackTrace();
       }

        catch (Exception e){
            e.printStackTrace();
        }
    }
    
    public static void main(String[] args){
        ÖvnUppg5_URLWordCountB_altSolution ö = new ÖvnUppg5_URLWordCountB_altSolution();
    }
}
