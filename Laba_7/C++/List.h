#pragma once
#include <iostream>
#include <iomanip>
struct My_List
{
	My_List* Next;
	My_List* Previous;
	long int El;
	int Counter;
};
My_List* root(long int a)
{
	My_List* Roster = new My_List();
	Roster->El = a;
	Roster->Next = NULL;
	Roster->Previous = NULL;
	return(Roster);
}
My_List* Add_in_the_end_List(My_List* Roster, long int val) {
	My_List* tmp = root(val);
	tmp->El = val;
	tmp->Next = NULL;
	tmp->Previous = Roster;
	tmp->Counter = Roster->Counter + 1;


	if (Roster) {
		Roster->Next = tmp;
	}
	Roster = tmp;

	return Roster;
}


int Count_Spec_Lit(My_List* head)
{
	My_List* ref = head;
	int Number = 0;
	while (ref)
	{
		if (ref->El % 5 == 0 && ref->Counter % 2 == 0)
		{
			Number += 1;
		}
		ref = ref->Next;
	}
	return Number;
}
void Delete(My_List* Head, int nom)
{
	My_List* pres = Head;
	My_List* pres_1;
	while (pres)
	{
		if (pres->El >= nom) {
			if (pres->Previous != nullptr)pres->Previous->Next = pres->Next;
			if (pres->Next != nullptr)pres->Next->Previous = pres->Previous;
			if (Head == pres) Head = pres->Next;
			pres_1 = pres->Next;
			delete pres;
			pres = pres_1;
		}
		else pres = pres->Next;
	}
}