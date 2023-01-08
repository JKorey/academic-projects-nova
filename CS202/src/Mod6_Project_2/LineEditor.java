/**
 * professor EMILIA BUTU
 * since   CS-202 (FALL 2020)
 *
 * @author Student name:  John C Stelly
 * Completion date: 11/21/2020
 *
 * LineEditor.java
 */
package Mod6_Project_2;
import java.io.IOException;
import java.util.Scanner;
public class LineEditor {
    public static void main(String[] args) throws IOException {

        Operations commands = new Operations();
        Scanner keyboard = new Scanner(System.in);
        String item;
        boolean keepRunning = true;
        //Load header from Operations.java
        commands.showHeader();
        //Load file from CLI on load
        if (args.length > 0)
            commands.autoLoadFile(args[0]);
        //Menu do-while loop
        do {
            System.out.print("[CL]: ");
            item = keyboard.next().toLowerCase();
            switch (item) {
                case "m":
                    commands.showMenu();break;
                case "load":
                    commands.loadFileByName(); break;
                case "s":
                    commands.saveFileByName(); break;
                case "a":
                    commands.addLine(); break;
                case "i":
                    commands.insertLine(); break;
                case "words":
                    commands.numberOfWords(); break;
                case "line":
                    commands.numberOffLines(); break;
                case "del":
                    commands.delete(); break;
                case "rep":
                    commands.replaceWords(); break;
                case "cls":
                    commands.clear(); break;
                case "p":
                    commands.print(); break;
                case "quit": keepRunning = false; break;
                default:
                    System.out.println("[ERROR] --> Not a valid command!");
            }
        } while(keepRunning);
        System.out.println("System Exit!!!");
        System.exit(0);
    }
}
