using System;
using System.Collections.Generic;
using System.Text;

namespace Лаба_ООП_7_cs
{
    class Program
    {
        static void Main(string[] args)
        { 
         var a = new My_Struct();
            long value_el;
            bool flag = true;
            long suma_elem = 0;
            int counter = 0;
            int average = 0;
            while (flag)
            {
                Console.WriteLine("1.Add in the end of the list");
                Console.WriteLine("2.Number litters that multiples 5");
                Console.WriteLine("3.Removing elements if bigger avarage");
                Console.WriteLine("4.Finish program");
                int Numer = Convert.ToInt32(Console.ReadLine());
                switch (Numer)
                {
                    case 1:
                        Console.Write("Input element = ");
                        value_el = long.Parse(Console.ReadLine());
                        suma_elem = suma_elem + value_el;
                        counter += 1;
                        a.Add_Last(value_el);
                        break;
                    case 2:
                        Console.WriteLine(a.Count_spec_Lit().ToString());
                        break;
                    case 3:
                        average = Convert.ToInt32(suma_elem / counter);
                        a.Removing(average);
                        break;
                    case 4:
                        flag = false;
                        continue;
                }
            }
        }
    }
}
