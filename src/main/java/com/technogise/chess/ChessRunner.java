package com.technogise.chess;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
@Profile("!test")
public class ChessRunner implements CommandLineRunner {

    @Override
    public void run(String... args) {
        Scanner scanner = new Scanner(System.in);
        ChessDemo chessDemo = new ChessDemo();
        System.out.println("Enter number of test cases");
        int cases = Integer.parseInt(scanner.nextLine());
        for (int caseNumber = 1; caseNumber <= cases; caseNumber++) {
            System.out.printf("Enter test case %d input%n", caseNumber);
            String input = scanner.nextLine();
            System.out.printf("Test case %d output = %s %n", caseNumber, chessDemo.simulatePieceMovement(input));
        }
        scanner.close();
    }
}
