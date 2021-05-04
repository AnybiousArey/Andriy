package com.kpi.controller;

import com.kpi.InputUtility.InputUtility;
import com.kpi.model.Payment;
import com.kpi.model.PaymentModel;
import com.kpi.view.PaymentView;

public class PaymentController {
    PaymentModel model = new PaymentModel();
    PaymentView view = new PaymentView();

    public void menu() {
        while (true) {
            view.printMessage(view.MAIN_MENU);
            switch (InputUtility.inputInt(view, view.INPUT_POINT)) {
                case 6:
                    return;
                case 1:
                    model.addPayment(new Payment(InputUtility.inputInt(view, view.INPUT_AMOUNT),
                            InputUtility.inputInt(view, view.INPUT_BIC),
                            InputUtility.inputString(view, view.INPUT_PAYMENT_APPOINTMENT),
                            InputUtility.inputString(view, view.INPUT_SETTLEMENT_ACCOUNT),
                            InputUtility.inputString(view, view.INPUT_DATE)
                    ));
                    break;
                case 2:
                    view.printMessageAndPayments(view.CURRENT_PAYMENTS,
                            model.getPaymentsForCurrentAppointment(InputUtility.inputString(view, view.INPUT_PAYMENT_APPOINTMENT)));
                    break;
                case 3:
                    view.printMessageAndPayments(view.CURRENT_PAYMENTS,
                            model.getPaymentsForCurrentAmmount(InputUtility.inputInt(view, view.INPUT_AMOUNT)));
                    break;
                case 4:
                    view.printMessageAndPayments(view.CURRENT_PAYMENTS, model.getPaymentsForCurrentPeriod(
                            InputUtility.inputString(view, view.INPUT_START_DATE),
                            InputUtility.inputString(view, view.INPUT_END_DATE)));
                    break;
                case 5:
                    view.printMessage(view.ALL_PAYMENTS, model.showInfo());
                    break;
                default:
                    view.printMessage(view.INVALID_VALUE);
                    break;
            }
        }
    }
}
