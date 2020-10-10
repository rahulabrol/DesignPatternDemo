package com.example.designpatterndemo.design_patterns.structural_pattern.facade_pattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * A facade pattern says that just provide a unified and simplified interface to a set of interface in a subsystem,
 * therefore it hides the complexities of the subsystem from the client.In other words facade pattern describes a higher
 * level interface that makes the sub-system easier to use.
 * <p>
 * Partially, every abstract factory is a type of facade.
 * <p>
 * Use the Facade pattern when
 * <p>
 * you want to provide a simple interface to a complex subsystem. Subsystems often get more complex as they
 * evolve. Most patterns, when applied, result in more and smaller classes. This makes the subsystem more reusable
 * and easier to customize, but it also becomes harder to use for clients that don't need to customize it. A facade
 * can provide a simple default view of the subsystem that is good enough for most clients. Only clients needing
 * more customizability will need to look beyond the facade.
 * there are many dependencies between clients and the implementation classes of an abstraction. Introduce a facade
 * to decouple the subsystem from clients and other subsystems, thereby promoting subsystem independence and portability.
 * you want to layer your subsystems. Use a facade to define an entry point to each subsystem level. If subsystems
 * are dependent, then you can simplify the dependencies between them by making them communicate with each other solely
 * through their facades.
 */
public class FacadePatternDemo {

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
