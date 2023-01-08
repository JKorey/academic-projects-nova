package Mod6_Project_2;
/**
 * professor EMILIA BUTU
 * since   CS-202 (FALL 2020)
 *
 * @author Student name:  John C Stelly
 * Completion date: 11/21/2020
 *
 * Operations.java
 */
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Operations {

    protected LineList lines;

    //Constructor
    Operations() {
        lines = new LineList();
    }

    //Create Main Header
    public void showHeader() {
        String header = "";
        header = header + "_____________________________________________________________________________________\n";
        header = header + "CLI LINE EDITOR (LEI) INTERFACE Version 1\n";
        header = header + "=====================================================================================\n";
        header = header + "[LEI]--> Hello human, type m to view menu options if needed.";
        System.out.println(header);
    }

    //Show menu item key
    public void showMenu() {
        System.out.println("_____________________________________________________________________________________");
        System.out.println("[LEI MENU COMMANDS...]");
        System.out.println("Menu: m");
        System.out.println("Load File: load fileName appendOption (1-append, 0-new list)");
        System.out.println("Print: p");
        System.out.println("Display number of lines: lines");
        System.out.println("Display line: lineNumber");
        System.out.println("Count words: words");
        System.out.println("Delete line: del lineNumberToDelete");
        System.out.println("Append line: a");
        System.out.println("Insert line: i lineNumberToInsert");
        System.out.println("Clear document: cls");
        System.out.println("Replace words: rep originalWord newWord");
        System.out.println("Save to a file: s fileName");
        System.out.println("Quit: quit");
        System.out.println("[...LEI MENU COMMANDS]");
        System.out.println("_____________________________________________________________________________________\n\n");
    }

    //Load File from Command Line on start
    public void autoLoadFile(String fileName) {
        try {
            lines.load(fileName, false);
        }
        catch (FileNotFoundException e){
            System.out.println("[ERROR]: FILE NOT FOUND");
        }
    }
    //Manual file load with option to append
    public void loadFileByName() {
        try {
            Scanner stringKeyboard = new Scanner(System.in);
            Scanner intKeyboard = new Scanner(System.in);
            System.out.print("[ENTER FILENAME]: ");
            String fileName = stringKeyboard.next();
            System.out.print("[ENTER APPEND OPTION (1-append 0-new list)]: ");
            int appendOption = intKeyboard.nextInt();
            String loadFile = "src\\Mod6_Project_2\\" + fileName + ".txt";
            lines.load(loadFile, appendOption == 1);
        }
        catch (FileNotFoundException e){
            System.out.println("[ERROR]: FILE NOT FOUND");
        }
    }

    //Save File
    public void saveFileByName() throws IOException {
        Scanner stringKeyboard = new Scanner(System.in);
        System.out.print("[ENTER FILENAME]: ");
        String fileName = stringKeyboard.next();
        lines.save("src\\Mod6_Project_2\\" + fileName + ".txt");
        System.out.println("[FILE SAVED]!");
    }

    //Add line to end of list
    public void addLine() {
        Scanner stringKeyboard = new Scanner(System.in);
        System.out.print("[ENTER LINE TEXT]: ");
        String lineText = stringKeyboard.nextLine();
        lines.addLine(lineText);
    }

    //Insert line to specific line number
    public void insertLine() {
        Scanner stringKeyboard = new Scanner(System.in);
        Scanner intKeyboard = new Scanner(System.in);
        System.out.print("[ENTER LINE TEXT]: ");
        String lineText = stringKeyboard.nextLine();
        System.out.print("[ENTER LINE NUMBER]: ");
        int lineNumber = intKeyboard.nextInt();
        lines.addLine(lineText, lineNumber);
    }

    //Delete line at specific line number
    public void delete() {
        Scanner intKeyboard = new Scanner(System.in);
        System.out.print("[ENTER LINE NUMBER TO DELETE]: ");
        int lineNumber = intKeyboard.nextInt();
        lines.delete(lineNumber);
        System.out.println("[DELETED] ");
    }

    //Clear entire list
    public void clear(){
        lines.empty();
        System.out.println("[LINES CLEARED] ");
    }

    //View number of line contained in list
    public void numberOffLines(){
        System.out.println("[NUMBER OF LINES]: " + lines.lines());
        lines.lines();
    }

    //View number of words in list
    public void numberOfWords(){
        System.out.println("[NUMBER OF WORDS]: " + lines.words());
    }

    //Replace specific words
    public void replaceWords(){
        Scanner stringKeyboard = new Scanner(System.in);
        System.out.print("ENTER TARGET WORD: ");
        String s1 = stringKeyboard.next();
        System.out.print("ENTER NEW WORD: ");
        String s2 = stringKeyboard.next();
        lines.replace(s1, s2);
        System.out.println("[DONE!]");
    }

    //Print lines with line numbers
    public void print(){
        System.out.println("\n_____________________________________________________________________________________");
        lines.print();
        System.out.println("_____________________________________________________________________________________\n");
    }
}
