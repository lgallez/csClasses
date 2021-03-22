#include <iostream>
using namespace std;

class DoubleEndedList
{
private:
    Link *pFirst, *pLast;

public:
    DoubleEndedList() { pFirst = NULL; pLast = NULL; }
    void displayFirst() { cout << "First:" pFirst->display(); }
    void displayLast() { cout << "Last:" pLast->display(); }
};

class Link
{
public:
    int data;
    Link *pNext, *pPrev;
    Link(int newData) { data=newData; pNext=NULL; pPrev=NULL;  }
    void display()
    {
        cout << "{ " << setw(3) << data << "\t:\t"
             << setw(14) <<pPrev<<"\t:\t\t" << &data
             << "t\t\t" <<setw(14)<< pNext << " }\n"
    }
};

void removeFirst()
{
    cout << "Removing First:\n";

    Link *toDelete = pFirst;
    pFirst = pFirst->pNext;
    pFirst->pPrev = NULL;
    delete  toDelete;
}

void removeLast()
{
    cout << "Removing Last:\n";

    Link *toDelete = pLast;
    pLast = pLast->pPrev;
    pLast->pNext = NULL;
    delete  toDelete;
}

void insert(int newValue)
{
    Link *newLink = new Link(newValue);

    if (pFirst == NULL)
    {
        cout << "Inserting the First/Last link: \n";
        newLink->display();
        cout << endl;
        newLink->pNext = NULL;
        newLink->pPrev = NULL;
        pFirst = newLink;
        pLast = newLink;
        return;
    }

    if ( newValue < pFirst->data)
    {
        cout << "Inserting new First link: \n";
        newLink->display();
        pFirst->pPrev = newLink;
        newLink->pPrev = NULL;
        newLink->pNext = pFirst;
        pFirst = newLink;
        return;
    }

    if ( newValue < pLast->data)
    {
        cout << "Inserting new First link: \n";
        newLink->display();
        pLast->pNext = newLink;
        newLink->pPrev = pLast;
        newLink->pNext = NULL;
        pLast = newLink;
        return;
    }

    cout << "Inserting (somewhere b/w First and Last) the new link: \n";
    newLink->display();
    Link *Next = pFirst;
    while( Next != pLast)
    {
        if (newValue < Next->data)
            break;
        Next = Next->pNext
    }

    newLink->pNext = Next;
    newLink->pPrev = Next->pPrev;
    Next->pPrev->pNext = newLink;
    Next->pPrev = newLink;
}

void displayList()
{
    Link *current = pFirst;
    cout << "Begin List: \n";
    cout << "{ data \t:\t\t\tpPrev\t\t\tself\n\n\n\npNext\t\t}\n";
    while(current!=NULL)
    {
        current->display();
        current = current->pNext;
    }
    cout << "/End List" << endl;
    displayFirst();
    displayLast();
    cout << endl;
}

int main()
{
    DoubleEndedList *aList = new DoubleEndedList();
    aList->insert(10);
    aList->displayList();
    aList->insert(5);
    aList->displayList();
    aList->insert(4);
    aList->displayList();
    aList->insert(20);
    aList->displayList();
    aList->insert(21);
    aList->displayList();
    aList->insert(3);
    aList->displayList();
    aList->insert(6);
    aList->displayList();
    aList->insert(24);
    aList->displayList();
    aList->insert(22);
    aList->displayList();
    aList->insert(23);
    aList->displayList();
    aList->insert(1);
    aList->displayList();
    aList->displayBackward();
    aList->removeFirst();
    aList->displayList();
    aList->removeLast();
    aList->displayList();
    aList->removeValue(3);
    aList->displayList();
    aList->removeValue(23);
    aList->displayList();
    aList->removeValue(21);
    aList->displayList();
    aList->insert(8);
    aList->displayList();
}

/*
 * {  10    :           	0x0    :   	 0x7fefc8500010    :           	0x0 }

Begin List:
{ data    :   		 pPrev   		 self   			 pNext   	 }
{  10    :           	0x0    :   	 0x7fefc8500010    :           	0x0 }
/End List
First:{  10    :           	0x0    :   	 0x7fefc8500010    :           	0x0 }
Last :{  10    :           	0x0    :   	 0x7fefc8500010    :           	0x0 }

Inserting new First link:
{   5    :           	0x0    :   	 0x7fefc8500030    :           	0x0 }
Begin List:
{ data    :   		 pPrev   		 self   			 pNext   	 }
{   5    :           	0x0    :   	 0x7fefc8500030    :    0x7fefc8500010 }
{  10    :    0x7fefc8500030    :   	 0x7fefc8500010    :           	0x0 }
/End List
First:{   5    :           	0x0    :   	 0x7fefc8500030    :    0x7fefc8500010 }
Last :{  10    :    0x7fefc8500030    :   	 0x7fefc8500010    :           	0x0 }

Inserting new First link:
{   4    :           	0x0    :   	 0x7fefc8500050    :           	0x0 }
Begin List:
{ data    :   		 pPrev   		 self   			 pNext   	 }
{   4    :           	0x0    :   	 0x7fefc8500050    :    0x7fefc8500030 }
{   5    :    0x7fefc8500050    :   	 0x7fefc8500030    :    0x7fefc8500010 }
{  10    :    0x7fefc8500030    :   	 0x7fefc8500010    :           	0x0 }
/End List
First:{   4    :           	0x0    :   	 0x7fefc8500050    :    0x7fefc8500030 }
Last :{  10    :    0x7fefc8500030    :   	 0x7fefc8500010    :           	0x0 }

Inserting new Last link:
{  20    :           	0x0    :   	 0x7fefc8600000    :           	0x0 }
Begin List:
{ data    :   		 pPrev   		 self   			 pNext   	 }
{   4    :           	0x0    :   	 0x7fefc8500050    :    0x7fefc8500030 }
{   5    :    0x7fefc8500050    :   	 0x7fefc8500030    :    0x7fefc8500010 }
{  10    :    0x7fefc8500030    :   	 0x7fefc8500010    :    0x7fefc8600000 }
{  20    :    0x7fefc8500010    :   	 0x7fefc8600000    :           	0x0 }
/End List
First:{   4    :           	0x0    :   	 0x7fefc8500050    :    0x7fefc8500030 }
Last :{  20    :    0x7fefc8500010    :   	 0x7fefc8600000    :           	0x0 }






Inserting new Last link:
{  21    :           	0x0    :   	 0x7fefc8600020    :           	0x0 }
Begin List:
{ data    :   		 pPrev   		 self   			 pNext   	 }
{   4    :           	0x0    :   	 0x7fefc8500050    :    0x7fefc8500030 }
{   5    :    0x7fefc8500050    :   	 0x7fefc8500030    :    0x7fefc8500010 }
{  10    :    0x7fefc8500030    :   	 0x7fefc8500010    :    0x7fefc8600000 }
{  20    :    0x7fefc8500010    :   	 0x7fefc8600000    :    0x7fefc8600020 }
{  21    :    0x7fefc8600000    :   	 0x7fefc8600020    :           	0x0 }
/End List
First:{   4    :           	0x0    :   	 0x7fefc8500050    :    0x7fefc8500030 }
Last :{  21    :    0x7fefc8600000    :   	 0x7fefc8600020    :           	0x0 }

Inserting new First link:
{   3    :           	0x0    :   	 0x7fefc8700000    :           	0x0 }
Begin List:
{ data    :   		 pPrev   		 self   			 pNext   	 }
{   3    :           	0x0    :   	 0x7fefc8700000    :    0x7fefc8500050 }
{   4    :    0x7fefc8700000    :   	 0x7fefc8500050    :    0x7fefc8500030 }
{   5    :    0x7fefc8500050    :   	 0x7fefc8500030    :    0x7fefc8500010 }
{  10    :    0x7fefc8500030    :   	 0x7fefc8500010    :    0x7fefc8600000 }
{  20    :    0x7fefc8500010    :   	 0x7fefc8600000    :    0x7fefc8600020 }
{  21    :    0x7fefc8600000    :   	 0x7fefc8600020    :           	0x0 }
/End List
First:{   3    :           	0x0    :   	 0x7fefc8700000    :    0x7fefc8500050 }
Last :{  21    :    0x7fefc8600000    :   	 0x7fefc8600020    :           	0x0 }

Inserting (somewhere b/w First and Last) the new link:
{   6    :           	0x0    :   	 0x7fefc8700020    :           	0x0 }
Begin List:
{ data    :   		 pPrev   		 self   			 pNext   	 }
{   3    :           	0x0    :   	 0x7fefc8700000    :    0x7fefc8500050 }
{   4    :    0x7fefc8700000    :   	 0x7fefc8500050    :    0x7fefc8500030 }
{   5    :    0x7fefc8500050    :   	 0x7fefc8500030    :    0x7fefc8700020 }
{   6    :    0x7fefc8500030    :   	 0x7fefc8700020    :    0x7fefc8500010 }
{  10    :    0x7fefc8700020    :   	 0x7fefc8500010    :    0x7fefc8600000 }
{  20    :    0x7fefc8500010    :   	 0x7fefc8600000    :    0x7fefc8600020 }
{  21    :    0x7fefc8600000    :   	 0x7fefc8600020    :           	0x0 }
/End List
First:{   3    :           	0x0    :   	 0x7fefc8700000    :    0x7fefc8500050 }
Last :{  21    :    0x7fefc8600000    :   	 0x7fefc8600020    :           	0x0 }










Inserting new Last link:
{  24    :           	0x0    :   	 0x7fefc84025c0    :           	0x0 }
Begin List:
{ data    :   		 pPrev   		 self   			 pNext   	 }
{   3    :           	0x0    :   	 0x7fefc8700000    :    0x7fefc8500050 }
{   4    :    0x7fefc8700000    :   	 0x7fefc8500050    :    0x7fefc8500030 }
{   5    :    0x7fefc8500050    :   	 0x7fefc8500030    :    0x7fefc8700020 }
{   6    :    0x7fefc8500030    :   	 0x7fefc8700020    :    0x7fefc8500010 }
{  10    :    0x7fefc8700020    :   	 0x7fefc8500010    :    0x7fefc8600000 }
{  20    :    0x7fefc8500010    :   	 0x7fefc8600000    :    0x7fefc8600020 }
{  21    :    0x7fefc8600000    :   	 0x7fefc8600020    :    0x7fefc84025c0 }
{  24    :    0x7fefc8600020    :   	 0x7fefc84025c0    :           	0x0 }
/End List
First:{   3    :           	0x0    :   	 0x7fefc8700000    :    0x7fefc8500050 }
Last :{  24    :    0x7fefc8600020    :   	 0x7fefc84025c0    :           	0x0 }

Inserting (somewhere b/w First and Last) the new link:
{  22    :           	0x0    :   	 0x7fefc84025e0    :           	0x0 }
Begin List:
{ data    :   		 pPrev   		 self   			 pNext   	 }
{   3    :           	0x0    :   	 0x7fefc8700000    :    0x7fefc8500050 }
{   4    :    0x7fefc8700000    :   	 0x7fefc8500050    :    0x7fefc8500030 }
{   5    :    0x7fefc8500050    :   	 0x7fefc8500030    :    0x7fefc8700020 }
{   6    :    0x7fefc8500030    :   	 0x7fefc8700020    :    0x7fefc8500010 }
{  10    :    0x7fefc8700020    :   	 0x7fefc8500010    :    0x7fefc8600000 }
{  20    :    0x7fefc8500010    :   	 0x7fefc8600000    :    0x7fefc8600020 }
{  21    :    0x7fefc8600000    :   	 0x7fefc8600020    :    0x7fefc84025e0 }
{  22    :    0x7fefc8600020    :   	 0x7fefc84025e0    :    0x7fefc84025c0 }
{  24    :    0x7fefc84025e0    :   	 0x7fefc84025c0    :           	0x0 }
/End List
First:{   3    :           	0x0    :   	 0x7fefc8700000    :    0x7fefc8500050 }
Last :{  24    :    0x7fefc84025e0    :   	 0x7fefc84025c0    :           	0x0 }

Inserting (somewhere b/w First and Last) the new link:
{  23    :           	0x0    :   	 0x7fefc8600040    :           	0x0 }
Begin List:
{ data    :   		 pPrev   		 self   			 pNext   	 }
{   3    :           	0x0    :   	 0x7fefc8700000    :    0x7fefc8500050 }
{   4    :    0x7fefc8700000    :   	 0x7fefc8500050    :    0x7fefc8500030 }
{   5    :    0x7fefc8500050    :   	 0x7fefc8500030    :    0x7fefc8700020 }
{   6    :    0x7fefc8500030    :   	 0x7fefc8700020    :    0x7fefc8500010 }
{  10    :    0x7fefc8700020    :   	 0x7fefc8500010    :    0x7fefc8600000 }
{  20    :    0x7fefc8500010    :   	 0x7fefc8600000    :    0x7fefc8600020 }
{  21    :    0x7fefc8600000    :   	 0x7fefc8600020    :    0x7fefc84025e0 }
{  22    :    0x7fefc8600020    :   	 0x7fefc84025e0    :    0x7fefc8600040 }
{  23    :    0x7fefc84025e0    :   	 0x7fefc8600040    :    0x7fefc84025c0 }
{  24    :    0x7fefc8600040    :   	 0x7fefc84025c0    :           	0x0 }
/End List
First:{   3    :           	0x0    :   	 0x7fefc8700000    :    0x7fefc8500050 }
Last :{  24    :    0x7fefc8600040    :   	 0x7fefc84025c0    :           	0x0 }


 */