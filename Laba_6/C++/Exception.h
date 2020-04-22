#include<math.h>
#include<iostream>
#include <windows.h>//For message

using namespace std;
class Exception
{
    private: double val_1, val_2, val_3;//Our values
    public: Exception(double a, double b, double c)//Constructor with parametrs
{
    this->val_1 = a;
    this->val_2 = b;
    this->val_3 = c;
}
        public: double Get_val()//Method for output of value our Expression
{
    try
    {
        if (val_3 == 0)//If d>41 i show massage
        {
            throw "Expression have a zero the root!";//Output message with exception
        }
    }
    catch (const char* s)
    {
        MessageBoxA(GetActiveWindow(), s, "Error. Value = NULL!", MB_ICONERROR);
        exit(1);//Exit from program
    }
    try
    {
        if (42 - val_2 / val_3 == 0)//if denominator=0
        {
            throw "Expression have a zero Denominator!";//Output message with exception
        }
    }
    catch (const char* s)
    {
        MessageBoxA(GetActiveWindow(), s, "Error.Denominator = 0! ", MB_ICONERROR);
        exit(1);//Exit from program
    }
    try
    {
        if (val_1 * val_2 + 2 < 0)//If denominator = 0 i show massage with exception
        {
            throw "Expression have a zero the denominator!";//I show message with exception
        }
    }
    catch (const char* a)
    {
        MessageBoxA(GetActiveWindow(), a, "Error message", MB_ICONERROR);
        exit(1);//Exit from program
    }
    return((log(val_1 * val_2 / 2.0) * val_3) / (42 - val_2 / val_3));// Else return result
}
};
