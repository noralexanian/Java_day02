package Factory;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Elf {
    Toy toy;
    List<GiftPaper> giftPaper = new ArrayList<GiftPaper>();
    Factory factory;

    public void listening() {
        //Response messages
        String goodResponse = "What a nice one! I would have liked to keep it...";
        String badResponse = "Minute please ?! I'm not that fast.";

        System.out.println("What do you need?????");

        //Initialize input scanner
        Scanner sc = new Scanner(System.in);
        //Get what the user inputs and split it
        String[] commandSplit = sc.nextLine().split("\\s+");

        //Make all inputs lower case
        for (int i = 0; i < commandSplit.length; i++) {
            commandSplit[i] = commandSplit[i].toLowerCase();
        }

        //[get, the, teddy]

        //Check if second value is a number
        int num = -1;
        if (commandSplit.length > 1) {
            try {
                num = Integer.parseInt(commandSplit[1]);
            } catch (final NumberFormatException e) {}
        }

        //If given command is get
        if (commandSplit[0].contains("get")) {
            //Check if elfs hands are empty
            if (toy == null && giftPaper.isEmpty()) {

                //If the second value was a number, do that.
                if (num != -1 && commandSplit[2].contains("giftpaper")) {
                    for (int i = 0; i < num; i++) {
                        giftPaper.add(new GiftPaper());
                    }
                    System.out.println(goodResponse);
                }
                //If it's get teddy
                else if (commandSplit[1].contains("teddy")) {
                    toy = new TeddyBear();
                    System.out.println(goodResponse);
                }
                //If it's get gameboy
                else if (commandSplit[1].contains("gameboy")) {
                    toy = new Gameboy();
                    System.out.println(goodResponse);
                }
                //If it's neither of the options
                else {
                    System.out.println("Nope");
                }
            }
            else {
                System.out.println(badResponse);
            }
        }

        //If command is pack
        if (commandSplit[0].contains("pack") && commandSplit.length == 1) {

            //Has gift paper
            if (giftPaper.size() > 0) {
                //If it has a toy
                if (toy != null) {
                    System.out.println("And another kid will be happy");
                    //Remove last item in array
                    giftPaper.remove(giftPaper.size() - 1);
                }
                else {
                    System.out.println("Don't have a toyyyy");
                }
            }
            else {
                System.out.println("Wait... I can't pack it with my shirt.");
            }
        }
    }
}
