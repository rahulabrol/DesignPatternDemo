package com.example.designpatterndemo.logical_patterns;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class FindFirstTwoElementWithoutPair {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int listCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < listCount; i++) {
            int listItem = Integer.parseInt(bufferedReader.readLine().trim());
            list.add(listItem);
        }

        List<Integer> result = FindFirstTwoElementWithoutPair.getFirstTwoItemsWithoutPair(list);

        for (int i = 0; i < result.size(); i++) {
            bufferedWriter.write(String.valueOf(result.get(i)));

            if (i != result.size() - 1) {
                bufferedWriter.write("\n");
            }
        }

        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();


    }

    private static List<Integer> getFirstTwoItemsWithoutPair(List<Integer> list) {
        List<Integer> elements = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            int count = 0;
            int element = list.get(i);
            for (int j = 0; j < list.size(); j++) {
                if (i != j && element == list.get(j)) {
                    count++;
                } else if (j == list.size() - 1 && count == 0) {
                    elements.add(list.get(i));
                }
            }
        }
        return elements;
    }
}
