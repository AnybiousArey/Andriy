#include<iostream>
#include"Exception.h"
#include<iomanip>

using namespace std;
int main()
{
    Exception* obj[4];
    obj[0] = new Exception(1, 1, 1);
    obj[2] = new Exception(5, 2, 0);
    obj[3] = new Exception(1, -3, 2);
    obj[1] = new Exception(1, 42, 1);
    for (int i = 0; i < 4; i++)
    {
        cout << "Value " << i + 1 << " = " << fixed << setprecision(3) << obj[i]->Get_val() << endl;;//Output result
    }
    system("pause");
    return 0;
}