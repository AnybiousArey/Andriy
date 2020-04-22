using System;

namespace Exceptions
{
    class Program
    {
        static void Main(string[] args)
        {
            ExpseptionClass[] objectArray =
            {
                new ExpseptionClass(1, 1, 1),  // All right
                //new ExpseptionClass(8, 1, 0),   // c=0
                //new ExpseptionClass(1, -3, 2),  // a*b<-2
                new ExpseptionClass(3, 42, 1),  // 42-b/c=0
            };
            foreach (var objectExample in objectArray)
            {
                Console.WriteLine(objectExample.Get_Val());
            }
        }
    }
}
