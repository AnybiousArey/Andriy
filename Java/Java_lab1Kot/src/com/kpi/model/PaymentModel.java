package com.kpi.model;

import java.time.LocalDate;

public class PaymentModel {
    private Payment[] payments = new Payment[5];
    private int countOfPayments;

    public PaymentModel(){
        this.countOfPayments = 0;
    }

    public PaymentModel(Payment[] payments) {
        this.payments = payments;
        this.countOfPayments = payments.length;
    }

    private Payment[] expandArray(){
        Payment[] payments = new Payment[this.payments.length*2];
        System.arraycopy(this.payments, 0, payments, 0, this.payments.length);
        return payments;
    }

    public void addPayment(Payment payment) {
        if (countOfPayments == payments.length)
            this.payments = expandArray();
        payments[countOfPayments] = payment;
        countOfPayments++;
    }

    public String showInfo() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < countOfPayments; i++) {
            sb.append(payments[i].toString());
            sb.append("\n");
        }
        return sb.toString();
    }

    public String getPaymentsForCurrentAppointment(String appointment){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < countOfPayments; i++) {
            if (payments[i].getAppointment().equals(appointment)) {
                sb.append(payments[i].toString() + "\n");
            }
        }
        return sb.toString();
    }

    public String getPaymentsForCurrentAmmount(int ammount){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < countOfPayments; i++) {
            if (payments[i].getAmount() > ammount) {
                sb.append(payments[i].toString() + "\n");
            }
        }
        return sb.toString();
    }

    public String getPaymentsForCurrentPeriod(String dateAfter, String dateBefore){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < countOfPayments; i++){
            if(payments[i].getDate().isAfter(LocalDate.parse(dateAfter)) &&
                    payments[i].getDate().isBefore(LocalDate.parse(dateBefore))) {
                sb.append(payments[i].toString() + "\n");
            }
        }
        return sb.toString();
    }
}

