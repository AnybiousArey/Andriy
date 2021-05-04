package com.kpi.view;

public class PaymentView {
    public static final String INPUT_AMOUNT = "Enter the amount of money: ";
    public static final String INPUT_BIC = "Enter the BIC(6 numbers): ";
    public static final String INPUT_PAYMENT_APPOINTMENT = "Enter payment appointment: ";
    public static final String INPUT_SETTLEMENT_ACCOUNT = "Enter a settlement account(29 symbols) ";
    public static final String INPUT_DATE = "Enter the date (YY-MM-DD) ";
    public static final String INVALID_VALUE = "Invalid value!";
    public static final String ALL_PAYMENTS = "All payments:";
    public static final String CURRENT_PAYMENTS = "Current payments: ";
    public static final String INPUT_POINT = "Select the point: ";
    public static final String INPUT_START_DATE = "Enter the start date (YY-MM-DD) ";
    public static final String INPUT_END_DATE = "Enter the end date (YY-MM-DD) ";

    public static final String MAIN_MENU = "\nSelect option:" + "\n"
            + "1 - Add payment" + "\n"
            + "2 - Get payments for current appointment" + "\n"
            + "3 - Get payments for current ammount of money" + "\n"
            + "4 - Get payments for current period" + "\n"
            + "5 - Show all payments" + "\n"
            + "6 - Exit";

    public static void printMessage(String... message) {
        for(String m:message)
            System.out.print(m + "\n");
    }

    public static void printMessageAndPayments(String message, String value) {
        if (value.length() != 0) {
            System.out.println(message + "\n");
            System.out.println(value);
        } else
            System.out.println(INVALID_VALUE);
    }
}
