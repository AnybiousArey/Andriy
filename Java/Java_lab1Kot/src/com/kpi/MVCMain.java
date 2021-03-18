package com.kpi;

import com.kpi.controller.PaymentController;
import com.kpi.model.Payment;
import com.kpi.model.PaymentModel;

public class MVCMain {
    public static void main(String[] args) {
//        Payment payment = new Payment(1,2,"1243", "214", 2001, 2, 3);
//        System.out.println(payment.getDate());
//        Payment p = new Payment();
//        Payment b = new Payment();
//        System.out.println(b.getId());
//        System.out.println(payment.getId());
//
//
//        Payment[] payments = {
//                new Payment(1, 2, "1343244", "421dsgdgds4", "2001-01-01"),
//                new Payment(2, 24, "13423434", "4sdgfg214", "2002-01-01"),
//                new Payment(3, 26, "132354", "421sdsdff", "2003-01-01"),
//                new Payment(4, 27, "13324234", "42gfg14", "2004-01-01"),
//                new Payment(5, 27, "13143244", "421sgf4", "2005-01-01")
//        };
//
//        PaymentModel paymentModel = new PaymentModel(payments);
//        System.out.println(paymentModel.showInfo());
//        System.out.println(paymentModel.getPaymentsForCurrentPeriod("2002-01-01", "2005-01-02"));
//        System.out.println(paymentModel.getPaymentsForCurrentAppointment("13143244"));
//        System.out.println(paymentModel.getPaymentsForCurrentAmmount(3));
//        paymentModel.addPayment(new Payment(1213, 2342, "1343sdf223444", "421ddsfsgdgds4"));
//        System.out.println(paymentModel.toString());
        PaymentController controller = new PaymentController();
        controller.menu();

    }
}
