package com.example.designpatterndemo.design_patterns.structural_pattern.facade_pattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * A facede pattern says that just provide a unified and simplified interface to a set of interface in a subsystem,
 * therefore it hides the complexities of the subsystem from the client.In other words facade pattern describes a higher
 * level interface that makes the sub-system easier to use.
 * <p>
 * Partially, every abstract factory is a type of facade.
 */
public class FacedePatternDemo {

    public static void main(String[] args) throws IOException {
        int choice;
        do {
            System.out.print("========= Mobile Shop ============ \n");
            System.out.print("            1. IPHONE.              \n");
            System.out.print("            2. SAMSUNG.              \n");
            System.out.print("            3. BLACKBERRY.            \n");
            System.out.print("            4. Exit.                     \n");
            System.out.print("Enter your choice: ");

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            choice = Integer.parseInt(br.readLine());
            ShopKeeper sk = new ShopKeeper();

            switch (choice) {
                case 1: {
                    sk.iphoneSale();
                }
                break;
                case 2: {
                    sk.samsungSale();
                }
                break;
                case 3: {
                    sk.blackberrySale();
                }
                break;
                default: {
                    System.out.println("Nothing You purchased");
                }
                return;
            }

        } while (choice != 4);
    }
}
