#include <iostream>
using namespace std;
void Pruriv(int &x, int &y)
{
    if ((x ^ y) != 0)
    {
        cout << "Данi числа є нерiвнi" << endl;
    }
    else {
        cout << "Данi числа є рiвнi" << endl;
    }
}
int Suma_Bit(int a,int b)
{
    int counter;
    while (b != 0) {
        counter = a & b;
        a = a ^ b;
        b = counter << 1;
    }
    return a;
}