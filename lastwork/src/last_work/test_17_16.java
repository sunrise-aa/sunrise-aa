package last_work;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class test_17_16 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        String file1 = sc.next();
        File file = new File(file1);
        Scanner input = new Scanner(file);
        String strings = "";

        while (input.hasNext()) {
            strings = strings.concat(input.next());

        }
        char[] array2 = strings.toCharArray();
        ArrayList<Character> chars = new ArrayList<>();


        for (int i = 0; i < strings.length(); i++) {
            chars.add(array2[i]);
            }

         removeDuplicate(chars);
            int[] count = new int[chars.size()];
            for (int i = 0; i < chars.size(); i++) {
                for (int j = 0; j < array2.length; j++) {
                    if (chars.get(i) == array2[j])
                        count[i] += 1;
                }

            }
            System.out.println(chars.size());
            for (int i = 0; i < chars.size(); i++)
                System.out.println(chars.get(i) + "³öÏÖ" + count[i] + "´Î");
        }
           public static void removeDuplicate(ArrayList<Character> list) {
        int i = 0;
        for (i = 0; i < list.size(); i++) {
            while (list.indexOf(list.get(i)) != list.lastIndexOf(list.get(i))) {
                list.remove(list.get(i));

            }

        }
    }
    }



