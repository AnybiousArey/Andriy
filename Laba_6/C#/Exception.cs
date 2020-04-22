using System;
using System.Collections.Generic;
using System.Text;

namespace Exceptions
{
    public class ExpseptionClass
    {
        private double val_1, val_2, val_3;//Our values
        public ExpseptionClass(double a, double b, double c) // Constructor with variables
        {
            if (c != 0)
            {
                if (a * b + 2 > 0)
                {
                    if (42 - b / c != 0)
                    {
                        val_2 = b;
                        val_3 = c;
                    }
                    else 
                    {
                        throw new DivideByZeroException("Wrong value of denominator"); 
                    }
                }
                else 
                { 
                    throw new ArithmeticException("Wrong values(value of log <0)"); 
                }
            }
            else {
                throw new DivideByZeroException("Wrong value of c"); 
            }
        }
        public double Get_Val()  // Calculate expression from the task
        {
            double Expres_result;
            try
            {
                Expres_result = Math.Log(val_1 * val_2 + 2, Math.E) * val_3 / (42 - val_2 / val_3);
            }
            catch (DivideByZeroException)
            {
                throw new DivideByZeroException("Divide by zero");
            }
            return Expres_result;
        }
    }
}
