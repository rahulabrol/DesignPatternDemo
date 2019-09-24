package com.example.designpatterndemo.logical_patterns;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class FirstRepeatingLetter {

    //absolutebalderDash
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(5);
        list.add(30);
        list.add(4);
        list.add(20);
        list.add(60);


        CopyOnWriteArrayList<Integer> cpy = new CopyOnWriteArrayList<>();
        cpy.addAll(list);

        int count = 0;
        while (cpy.size() == list.size() || count > 0) {
            count = 0;
            for (int i = 0; i < cpy.size(); i++) {
                if (i > 0 && i < cpy.size() - 1) {

                    int bef = cpy.get(i - 1);
                    int cr = cpy.get(i);
                    int af = cpy.get(i + 1);

                    if (cr < bef && cr < af) {
                        count++;
                        cpy.remove(i);
                    }
                }
            }
        }
        list.clear();
        list.addAll(cpy);

        System.out.println(list);

//        String givenString = "absolutebalderDash";
//        String givenString = "abcba";
//        char[] charArray = givenString.toCharArray();
//
//        System.out.println(charArray);
//
//        Arrays.sort(charArray);
//
//        System.out.println(charArray);
//        ArrayList<Character> arrayList = new ArrayList<>();
//
//       label: for (char character : charArray) {
//            if (!arrayList.contains(character)) {
//                int count = 0;
//
//                for (char c : charArray) {
//                    if (character == c) {
////                    System.out.print(count);
//                        count++;
//                        if (count > 1) {
//                            System.out.print(character);
//                            arrayList.add(c);
//                            break label;
//                        }
//                    }
//                }
//            }
//        }
//
//        arrayList.toString();
    }
}
