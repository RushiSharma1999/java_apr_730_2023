package com.careerit.jfs.cj.day11;

import com.careerit.jfs.cj.day9.ReadDataFromFile;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;
import java.util.Scanner;

import static java.io.File.*;

public class ReadingDataFromFile {
    public static void main(String[] args) throws IOException {
//        Scanner sc = new Scanner(ReadDataFromFile.class.getResourceAsStream("/names.txt"));
//        while( sc.hasNextLine()) {
//            String str = sc.nextLine();
//            System.out.println(str.toUpperCase());
//        }
        File file = new File(ReadDataFromFile.class.getResourceAsStream("/names.txt").toString());

        List<String> list = Files.readAllLines(file.toPath());
        for (String name: list) {
            System.out.println(name);
        }
    }
}
