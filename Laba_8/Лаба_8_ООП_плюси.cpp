#include <iostream>
#include <vector>
using namespace std;

int CountSymbol(char Sumb, string& Row) { 
    int amount = 0;
    for (char a : Row) {
        if (a == Sumb)
            amount += 1;
    }
    return amount;
}

void main() 
{
    int(*Del)(char, string&);
    string row1 = "Hello";
    string row2 = "How are you?";
    string row3 = "Nice to meet you";
    Del = CountSymbol;
    cout << Del('l',row1) <<"\t"<< Del('a', row2) << "\t" << Del('e', row3);
}