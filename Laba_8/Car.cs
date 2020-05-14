using System;
using System.Collections.Generic;
using System.Text;

namespace Лаба_8_ООП
{
    class Car
    {
        //public delegate void ForCar(string message);
        //public event ForCar Repor;

        public static System.Timers.Timer It_turned_out;
        private bool Lets_Go;
        public double Drive_time { get; private set; }
        public double Fuel_capacity { get; private set; }

        public event EventHandler<string> Report;
        public Car()
        {
            Lets_Go = false;
            Drive_time = 0;
            Fuel_capacity = 20;
        }
        public void Start()
        {
            It_turned_out.Start();
            Lets_Go = true;
        }
        public void Time_move(int cap_fuel)
        {
            if (cap_fuel > 0)
            {
                if (Lets_Go)
                {
                    while (Fuel_capacity > 0)
                    {
                        Drive_time += 1;
                        Fuel_capacity -= 1;
                        Report?.Invoke(this, $"The rest of the gasoline is {Fuel_capacity}");
                    }

                    Lets_Go = false;
                    Report?.Invoke(this, "Your fuel is gone");
                }
                else { Report?.Invoke(this, "Start the car"); }
            }
            else { Report?.Invoke(this, "You need to add fuel"); }
        }
        public void Stop()
        {
            It_turned_out.Stop();
            Console.WriteLine("Stop!!!");
        }
        public void Add_fuel(int value)
        {
            if (value > 0)
            {
                Fuel_capacity += value;
            }
            else
                throw new ArgumentException();
        }
        public void Check_Fuel()
        {
            if (Fuel_capacity == 0)
                Without_fuel();
        }
        public static void Without_fuel()
        {
            It_turned_out.Stop();
            Console.WriteLine("No fuel!!!");
        }
    };
}
