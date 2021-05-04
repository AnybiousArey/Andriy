package com.kpi.model;

import java.time.LocalDate;

public class Payment {
    private static int paymentId = 0;
    private int id;
    private int amount;
    private int BIC;
    private String appointment;
    private String SettlementAccount;
    private LocalDate date;

    public LocalDate getDate() {
        return date;
    }

    public Payment() {
        paymentId++;
        this.id = paymentId;
        this.date = LocalDate.now();
    }

    public Payment(int amount, int BIC, String appointment, String settlementAccount,String date) {
        paymentId++;
        this.id = paymentId;
        this.amount = amount;
        this.BIC = BIC;
        this.appointment = appointment;
        SettlementAccount = settlementAccount;
        this.date = LocalDate.parse(date);////////////////////////////////Validator
    }

    public int getId() {
        return id;
    }

    public int getAmount() {
        return amount;
    }

    public int getBIC() {
        return BIC;
    }

    public String getAppointment() {
        return appointment;
    }

    public String getSettlementAccount() {
        return SettlementAccount;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "id=" + id +
                ", sum=" + amount +
                ", BIC=" + BIC +
                ", appointment='" + appointment + '\'' +
                ", SettlementAccount='" + SettlementAccount + '\'' +
                ", Date = " + date +
                '}';
    }
}
