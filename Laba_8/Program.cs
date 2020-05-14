using System;

namespace Лаба_8_ООП
{
    delegate string Del(string[] arr);
    class Program
    {
        static void Main(string[] args)
        {
            Del newDel;
            newDel = Count_Lett;
            string str = Console.ReadLine();
            string[] arr = str.Split();
            Console.WriteLine(newDel(arr));
            Console.ReadKey();

            Car example = new Car();
            example.Report += Notify;
            try
            {
                example.Start();
                example.Add_fuel(10);
                example.Add_fuel(10);
                example.Check_Fuel();
                example.Add_fuel(10);
                example.Time_move(4);
                example.Stop();
            }
            catch (Exception ex)
            {
                Console.WriteLine("Something is wrong");
            }

            Console.ReadKey();
        }
        public static void Notify(object sender, string message)
        {
            Car example = sender as Car;

            if (example != null)
            {
                Console.WriteLine($"Leavings fuel{example.Fuel_capacity}");
            }
        }
        static string Count_Lett(string[]arr)
        {
            string result = "";
            try
            {
                for (int i = 0; i < arr.Length; i++)
                    result += arr[i][i].ToString();
            }
            catch (Exception ex)
            {
                Console.WriteLine("Something is wrong:  " + ex.Message);
            }
            return result;
        }
    }
}
