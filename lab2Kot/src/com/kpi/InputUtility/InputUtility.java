package com.kpi.InputUtility;
import com.kpi.view.PaymentView;

import com.kpi.exceptions.InvalidInputException;
import com.kpi.controller.Validator;
import java.util.Scanner;
public class InputUtility {
    private static Scanner sc = new Scanner(System.in);
    public static String inputString(PaymentView view, String message) {
        view.printMessage(message);
        return sc.next();
    }
    public static int inputInt(PaymentView view, String message) {
        view.printMessage(message);
        String integer = sc.next();
        try{
            Validator.checkInt(integer);
            Validator.checkPositiveInt(Integer.parseInt(integer));
        }catch (InvalidInputException ex){
            view.printMessage(ex.getMessage() + "\n");
            return inputInt(view, message);
        }
        return Integer.parseInt(integer);
    }

//    public static int inputBIC(PaymentView view, String message) {
//        view.printMessage(message);
//        while (!sc.hasNextInt() || sc.nextInt() > 999999 || sc.nextInt() < 100000) {
//            view.printMessage(view.INVALID_VALUE + "\n" + message);
//            sc.next();
//        }
//        return sc.nextInt();
//    }

//    public static String inputSettlementAccount(PaymentView view, String message) {
//        view.printMessage(message);
//        while(sc.next().length() > 29){
//            view.printMessage(view.INVALID_VALUE + "\n" + message);
//        }
//        return sc.next();
//    }
}
