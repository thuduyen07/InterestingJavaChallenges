package com.thuduyen07;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// https://www.hackerrank.com/challenges/tag-content-extractor/problem
public class TagContentExtractor {
    static void extractTagContent() {
        Scanner in = new Scanner(System.in);
        in.useDelimiter("[^\n]+");
        System.out.println("Please enter number of lines:");
        int testCases = Integer.parseInt(in.nextLine());
        while (in.hasNext()) {
            String line = in.nextLine();
            String regex = "<(.+)>([^<>]+)</\\1>";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(line);
            if (matcher.find()) {
                matcher.reset();
                while (matcher.find()) {
                    System.out.printf("\n" + matcher.group(2));
                }
            } else {
                System.out.println("\nNone");
            }
            testCases--;
        }
    }
}

/**
 * Thanks anh Quan Hoang for some notes about Maven
 * Maven is a build tool, which builds and wraps the source code into jar or war file.
 * Maven also manage the libraries used in project using dependency describe in pom file
 * All files are built and stored in target folder as .class files.
 * The app also run on target folder but not on the source code
 */