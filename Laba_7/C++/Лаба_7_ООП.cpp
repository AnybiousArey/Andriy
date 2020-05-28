#include <iostream>
#include <iomanip>
#include <vector>
#include "List.h"
using namespace std;

int main() {
	vector<long int> mass;

	My_List* head = NULL;
	My_List* elem = NULL;
	long int a;
	long int sum = 0;
	double averange;
	int av;

	cout << "Input element" << endl;
	cin >> a;
	mass.push_back(a);
	head = root(a);
	elem = head;

	bool flag = true;

	while (flag) {
		cout << endl;
		cout << "1.Add in the end of the list" << endl;
		cout << "2.Number litters that multiples 5" << endl;
		cout << "3.Removing elements if bigger avarage" << endl;
		cout << "4.Finish program" << endl;
		cout << endl;
		int Numer;
		cin >> Numer;
		switch (Numer) {
		case 1:
			cin >> a;
			mass.push_back(a);
			elem = Add_in_the_end_List(elem, a);
			break;
		case 2:
			cout  << Count_Spec_Lit(head) << endl;
			break;
		case 3:
			for (int i : mass) {
				sum = sum + i;
			}
			averange = sum / mass.size();
			av = int(averange);
			cout  << av << endl;
			Delete(head, av);
			break;
		case 4:
			flag = false;
			continue;
		}
	}
	system("pause");
	return 0;
}