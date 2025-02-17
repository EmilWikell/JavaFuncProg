package AoC2021.Dec1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Dec1 {

    public int uppgA(String path)  throws IOException{
        List<Integer> input = Files.lines(Path.of(path))
                .map(l -> Integer.parseInt(l.trim()))
                .collect(Collectors.toList());

        int counter = 0;
        for (int i = 0; i < input.size()-1; i++){
            if (input.get(i) < input.get(i+1)){
                counter++;
            }
        }
        return counter;
    }

    public long uppgA2(String path)  throws IOException{
        List<Integer> input = Files.lines(Path.of(path))
                .map(l -> Integer.parseInt(l.trim()))
                .collect(Collectors.toList());

        return IntStream.range(0, input.size()-1).filter(i ->input.get(i)< input.get(i+1)).count();
    }

    public long uppgB(String path, int winSize)  throws IOException{
        List<Integer> input = Files.lines(Path.of(path))
                .map(l -> Integer.parseInt(l.trim()))
                .collect(Collectors.toList());

        return IntStream.range(0, input.size()-winSize)
                .filter(i ->input.get(i) < input.get(i+winSize)).count();
    }



    public static void main(String[] args) throws IOException{

        Dec1 d = new Dec1();
        System.out.println("Uppg A, test: " + d.uppgA("src/AoC2021/Dec1/input_mini.txt"));
        System.out.println("Uppg A: " + d.uppgA("src/AoC2021/Dec1/input.txt"));
        System.out.println();
        System.out.println("Uppg A, test: " + d.uppgA2("src/AoC2021/Dec1/input_mini.txt"));
        System.out.println("Uppg A: " + d.uppgA2("src/AoC2021/Dec1/input.txt"));
        System.out.println();
        System.out.println("Uppg B, test: " + d.uppgB("src/AoC2021/Dec1/input_mini.txt", 3));
        System.out.println("Uppg B: " + d.uppgB("src/AoC2021/Dec1/input.txt", 3));

    }

}
