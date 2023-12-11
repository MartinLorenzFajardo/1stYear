// Martin Lorenz S. Fajardo
// BIT112L OBcL
// November 16, 2023

import java.util.*;
import static java.lang.System.out;

class FoPGrades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = 0;
        byte num = 0;
        float FqSum = 0, MeSum = 0, CeSum = 0;

        // vars
        float FqAve = 0, MeAve = 0, CeAve = 0, gwa = 0;
        float fqScore1 = 0, fqScore2 = 0, fqScore3 = 0, fqScore4 = 0, fqScore5 = 0;
        float meScore1 = 0, meScore2 = 0, meScore3 = 0, meScore4 = 0, meScore5 = 0;
        float ceScore1 = 0, ceScore2 = 0, ceScore3 = 0, ceScore4 = 0, ceScore5 = 0;

        // ph grading point system
        float gradePoint = 0;

        // HEADER
        out.print("========== GRADE CALCULATOR ==========\n\n\n");


        // FOUNDATIONAL QUIZ =============================================================================
        out.print("======================================");
        out.print("\n");
        out.print("Number of Foundational(s): ");
        num = sc.nextByte();
        for (byte quiz = 1; quiz <= num; quiz++) {
            out.print("------------------------------------\n");
            out.print("Total Score of Foundational " + quiz + ": ");
            total = sc.nextInt();
            out.print("Enter your Score for F" + quiz + ": ");
            out.print("");

            float fqScore = sc.nextFloat();

            fqScore = (fqScore / total) * 100;

            // assign to vars
            if (quiz == 1) {
                fqScore1 = fqScore;
            } else if (quiz == 2) {
                fqScore2 = fqScore;
            } else if (quiz == 3) {
                fqScore3 = fqScore;
            } else if (quiz == 4) {
                fqScore4 = fqScore;
            } else  {
                fqScore5 = fqScore;
            }

            // foundational quiz average
            FqAve = (FqSum += fqScore) / num;
        }

        out.print("\n\n");


        // MEDIATING EXERCISE =============================================================================
        out.print("======================================");
        out.print("\n");
        out.print("Number of Mediating(s): ");
        num = sc.nextByte();
        for (byte exercise = 1; exercise <= num; exercise++) {
            out.print("------------------------------------\n");
            out.print("Total Score of Mediating " + exercise + ": ");
            total = sc.nextInt();
            out.print("Enter your Score of M" + exercise + ": ");

            float meScore = sc.nextFloat();

            meScore = (meScore / total) * 100;

            // assign to vars
            if (exercise == 1) {
                meScore1 = meScore;
            } else if (exercise == 2) {
                meScore2 = meScore;
            } else if (exercise == 3) {
                meScore3 = meScore;
            } else if (exercise == 4) {
                meScore4 = meScore;
            } else {
                meScore5 = meScore;
            }

            // medeating exercise average
            MeAve = (MeSum += meScore) / num;
        }

        out.print("\n\n");


        // CULMINATING EXAM =============================================================================
        out.print("======================================");
        out.print("\n");
        out.print("Number of Culminating(s): ");
        num = sc.nextByte();
        for (byte exam = 1; exam <= num; exam++) {
            out.print("------------------------------------\n");
            out.print("Total Score of Culminating " + exam + ": ");
            total = sc.nextInt();
            out.print("Enter your Score of C" + exam + ": ");

            float ceScore = sc.nextFloat();

            ceScore = (ceScore / total) * 100;

            // assign to vars
            if (exam == 1) {
                ceScore1 = ceScore;
            } else if (exam == 2) {
                ceScore2 = ceScore;
            } else {
                ceScore3 = ceScore;
            }

            // culminating exam average
            CeAve = (CeSum += ceScore) / num;
        }

        out.print("\n\n");

        // GRADE PERCENTAGE =====
        FqAve *= 0.20;
        MeAve *= 0.30;
        CeAve *= 0.50;

        gwa = FqAve + MeAve + CeAve;

        // EQUIVALENT GRADE =====
        if (gwa < 75f) {
            gradePoint = 5.0f;
        } else if (gwa >= 75f && gwa <= 77f) {
            gradePoint = 3.0f;
        } else if (gwa >= 78f && gwa <= 80f) {
            gradePoint = 2.75f;
        } else if (gwa >= 81f && gwa <= 83f) {
            gradePoint = 2.50f;
        } else if (gwa >= 84f && gwa <= 86f) {
            gradePoint = 2.25f;
        } else if (gwa >= 87f && gwa <= 89f) {
            gradePoint = 2.0f;
        } else if (gwa >= 90f && gwa <= 92f) {
            gradePoint = 1.75f;
        } else if (gwa >= 93f && gwa <= 95f) {
            gradePoint = 1.50f;
        } else if (gwa >= 96f && gwa <= 98f) {
            gradePoint = 1.75f;
        } else {
            gradePoint = 1.0f;
        }

        // OUTPUT =====
        // display all score, the average, and the equivalent ph gpoint
        out.print("================================================\n");
        out.printf("|| %-12s | %-12s | %-12s ||\n", "Foundational", "Mediating", "Culminating");
        out.printf("|| %-12.2f | %-12.2f | %-12.2f ||\n", fqScore1, meScore1, ceScore1);
        out.printf("|| %-12.2f | %-12.2f | %-12.2f ||\n", fqScore2, meScore2, ceScore2);
        out.printf("|| %-12.2f | %-12.2f | %-12.2f ||\n", fqScore3, meScore3, ceScore3);
        out.printf("|| %-12.2f | %-12.2f | %-12s ||\n", fqScore4, meScore4, ceScore4);
        out.printf("|| %-12.2f | %-12.2f | %-12s ||\n", fqScore5, meScore5, ceScore5);        
        out.print("================================================\n");
        out.print("|| GWA : " + gwa + "\t| EQUIVALENT TO: " + gradePoint + "\t||\n");
        out.print("================================================\n");

        sc.close();
    }
}
