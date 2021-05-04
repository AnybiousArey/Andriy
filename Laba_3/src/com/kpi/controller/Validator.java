package com.kpi.controller;

import com.kpi.exceptions.InvalidInputException;

public class Validator {
    public static boolean checkInt(String value) {
        if (value.matches("[+,-]?[0-9]+"))
            return true;
        throw new InvalidInputException("Wrong input type ");
    }

    public static boolean checkPositiveInt(int value) {
        if (value > 0)
            return true;
        throw new InvalidInputException("Value can't be negative or zero");
    }
}