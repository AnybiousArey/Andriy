#include <iostream>
#include "Лаба№1.h"
using namespace std;
int main()
{
    setlocale(LC_ALL, "rus");
    int a, b, x, y, counter,s;
    cout << "Введiть чиcла для порiвняння на рiвнiсть " << endl;
    cin >> a >> b;
    Pruriv(a, b);
    cout << "Введiть перше число суми" << endl;
    cin >> x;
    cout << "Введiть друге число для суми" << endl;
    cin >> y;
    s=Suma_Bit(x,y);
    cout << "Отримана сума = " << s;

}


