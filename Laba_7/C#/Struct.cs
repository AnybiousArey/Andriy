using System;
using System.Collections.Generic;
using System.Text;

namespace Лаба_ООП_7_cs
{
    class My_Struct
    {
        private int Form { get; set; }
        private Helper Head { get; set; }
        private Helper Last { get; set; }

        public void Add_Last(long value)
        {
            Helper a = new Helper()
            { Num_Pos = value };
            if (Head == null)
             Head = a; 
            else
            {
                a.Counter = a.Previous.Counter + 1;
                Last.Next = a;
                a.Previous = Last;
            }
            Last = a;
            Form += 1;
        }
        public int Count_spec_Lit()
        {
            Helper a = Head;
            int amount = 0;
            while (a != null)
            {
                try
                {
                    if (a.Num_Pos % 5 == 0 && a.Counter % 2 == 0)
                        amount += 1;
                }
                catch (Exception)
                {
                    return 0;
                }
                a = a.Next;
            }
            return amount;
        }
        public void Removing(int Val_el)
        {
            Helper pres = Head;

            while (pres != null)
            {
                if (pres.Num_Pos >= Val_el)
                {
                    if (pres.Next != null)
                        pres.Next.Previous = pres.Previous;
                    else
                    { Last = pres.Previous; }
                    if (pres.Previous != null)
                    { pres.Previous.Next = pres.Next; }
                    else
                    { Head = pres.Next; }
                }
                pres = pres.Next;
            }
        }
    }
}
