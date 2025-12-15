/*
   Simple CUI Digital Logic Simulator in DLD for 3rd-semester project.
 
   Features:
   - Supports gates: AND, OR, NOT, NAND, NOR, XOR, XNOR
   - Accepts 1 or 2 binary inputs (0 or 1)
   - Validates input
   - Repeats until user chooses to exit
 */
import java.util.*;

public class DigitalLogicSimulator{

    // Gate implementations
    public static int AND(int a, int b){ return (a & b); }
    public static int OR(int a, int b){ return (a | b); }
    public static int NOT(int a)     { return (a == 0) ? 1 : 0; }
    public static int NAND(int a, int b){ return NOT(AND(a,b)); }
    public static int NOR(int a, int b){ return NOT(OR(a,b)); }
    public static int XOR(int a, int b){ return (a ^ b); }
    public static int XNOR(int a, int b){ return NOT(XOR(a,b)); }

    // Helper to read a binary input (0 or 1)
    private static int readBinary(Scanner sc, String prompt){
        while (true){
            System.out.print(prompt);
            String s = sc.nextLine().trim();
            if (s.equals("0") || s.equals("1")){
                return Integer.parseInt(s);
            }else{
                System.out.println("Invalid input. Enter 0 or 1.");
            }
        }
    }

    // Main menu
    private static void printMenu(){
        System.out.println("\n=== Digital Logic Simulator (DLS)===");
        System.out.println("Choose a gate:");
        System.out.println("1) AND");
        System.out.println("2) OR");
        System.out.println("3) NOT");
        System.out.println("4) NAND");
        System.out.println("5) NOR");
        System.out.println("6) XOR");
        System.out.println("7) XNOR");
        System.out.println("8) Truth Table (selected gate)");
        System.out.println("9) Exit");
        System.out.print("Select option (1-9): ");
    }

    // Print truth table for a 1-input or 2-input gate
    private static void printTruthTable(int option){
        System.out.println("\nTruth table:");
        if (option == 3){ // NOT is single input
            System.out.println("A | NOT(A)");
            System.out.println("0 | " + NOT(0));
            System.out.println("1 | " + NOT(1));
            return;
        }
        System.out.println("A B | OUT");
        for (int a = 0; a <= 1; a++){
            for (int b = 0; b <= 1; b++){
                int out = 0;
                switch (option){
                    case 1: out = AND(a,b); break;
                    case 2: out = OR(a,b); break;
                    case 4: out = NAND(a,b); break;
                    case 5: out = NOR(a,b); break;
                    case 6: out = XOR(a,b); break;
                    case 7: out = XNOR(a,b); break;
                    default: out = 0;
                }
                System.out.printf("%d %d |  %d%n", a, b, out);
            }
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        while (true){
            printMenu();
            String choiceStr = sc.nextLine().trim();
            int choice;
            try{
                choice = Integer.parseInt(choiceStr);
            }catch (NumberFormatException e){
                System.out.println("Invalid selection. Enter number 1-9.");
                continue;
            }

            if (choice == 9){
                System.out.println("Exiting. Good luck!");
                break;
            }

            if (choice < 1 || choice > 9){
                System.out.println("Invalid option. Enter number 1-9.");
                continue;
            }

            if (choice == 8){
                // Ask which gate truth table to print
                System.out.println("\nWhich gate truth table do you want?");
                System.out.println("1) AND 2) OR 3) NOT 4) NAND 5) NOR 6) XOR 7) XNOR");
                System.out.print("Select (1-7): ");
                String opt = sc.nextLine().trim();
                int optNum;
                try{ optNum = Integer.parseInt(opt);}
                catch (NumberFormatException e){ System.out.println("Invalid. Returning to menu."); continue; }
                if (optNum < 1 || optNum > 7){ System.out.println("Invalid. Returning to menu."); continue; }
                printTruthTable(optNum);
                continue;
            }

            // For NOT (single input)
            if(choice == 3){
                int a = readBinary(sc, "Enter input A (0 or 1): ");
                int result = NOT(a);
                System.out.println("Output: " + result);
            }else{
                int a = readBinary(sc, "Enter input A (0 or 1): ");
                int b = readBinary(sc, "Enter input B (0 or 1): ");
                int result = 0;
                switch (choice){
                    case 1: result = AND(a,b); break;
                    case 2: result = OR(a,b); break;
                    case 4: result = NAND(a,b); break;
                    case 5: result = NOR(a,b); break;
                    case 6: result = XOR(a,b); break;
                    case 7: result = XNOR(a,b); break;
                    default: result = 0;
                }
                System.out.println("Result: " + result);
            }

            // ask to continue or not
            System.out.print("\nDo you want to continue? (y/n): ");
            String cont = sc.nextLine().trim().toLowerCase();
            if (!cont.equals("y") && !cont.equals("yes")){
                System.out.println("Exiting. Good luck!");
                break;
            }
        }

    }
}
