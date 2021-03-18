package com.kpi.InputUtility;
import com.kpi.view.PaymentView;

import java.util.Scanner;
public class InputUtility {
    private static Scanner sc = new Scanner(System.in);

    public static int inputInt(PaymentView view, String message) {
        view.printMessage(message);
        while (!sc.hasNextInt()) {
            view.printMessage(view.INVALID_VALUE + "\n" + message);
            sc.next();
        }
        return sc.nextInt();
    }

    public static String inputString(PaymentView view, String message) {
        view.printMessage(message);
        return sc.next();
    }
}
