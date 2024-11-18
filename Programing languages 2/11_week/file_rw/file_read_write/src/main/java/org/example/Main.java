package org.example;

import FileUtils.FileUtils;

import java.util.List;

import static FileUtils.FileUtils.WriteLines;

public class Main {
    public static void main(String[] args) {
        List<String> lines = FileUtils.readLines("src/main/test_read.txt");
        for (String line : lines) {
            System.out.println(line);
        }

        WriteLines(lines, "test_write.txt");
    }
}