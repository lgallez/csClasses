// p7.cpp
// Layla Gallez
// 3/21/2021
// Description: CLASS and OOP

#include "header.h"
#include "header2.h"
#include <iostream>

using namespace std;

class Link
{
public:
    int     iData;
    double  dData;
    Link    *pNext;

    Link(int id, double dd)
    {
        iData = id;
        dData = dd;
        pNext = NULL;
    }

    void displayLink()
    {
        cout << "{" << iData << ", ";
        cout << dData << " }";
    }
};

class LinkList
{
private:
    Link *pFirst;

public:

    LinkList()
    {
        pFirst = NULL;
    }

    bool isEmpty()
    {
        return pFirst == NULL;
    }

    void insertFirst(int id, double dd)
    {
        Link *pNewLink = new Link(id, dd);
        pNewLink -> pNext = pFirst;
        pFirst = pNewLink;
    }

    Link *getFirst() { return pFirst; }

    void removeFirst()
    {
        Link *pTemp = pFirst;
        pFirst = pFirst -> pNext;
        delete pTemp;
    }

    Link *find(int key)
    {
        Link *pCurrent = pFirst;
        while (pCurrent->iData != key)
        {
            if (pCurrent -> pNext == NULL)
                return NULL;
            else
                pCurrent = pCurrent->pNext;
        }
    }

    bool remove(int key)
    {
        Link *pCurrent = pFirst;
        Link *pPrevious = pFirst;
        while (pCurrent-> iData != key)
        {
            if (pCurrent->pNext == NULL)
                return false;
            else
            {
                pPrevious = pCurrent;
                pCurrent = pCurrent->pNext;
            }
        }
        if (pCurrent == pFirst)
            pFirst = pFirst->pNext;
        else
            pPrevious->pNext = pCurrent->pNext;
        delete pCurrent;
        return true;
    }

    int sumIdata()
    {
        int sum = 0;
        Link *pCurrent = pFirst;

        while ( !(pCurrent == NULL ))
        {
            sum += pCurrent -> iData;
            pCurrent = pCurrent -> pNext;
        }
        return sum;
    }

    int min()
    {
        Link *pCurrent = pFirst;
        int min = pFirst -> iData;
        while ( !(pCurrent == NULL ))
        {
            if (pCurrent -> iData < min)
                min = pCurrent -> iData;
            pCurrent = pCurrent -> pNext;
        }
        return min;
    }

    int numLinks()
    {
        Link *pCurrent = pFirst;
        int count = 0;
        while ( !(pCurrent == NULL ))
        {
            count++;
            pCurrent = pCurrent -> pNext;
        }
        return count;
    }

    int displayList()
    {
        cout << "List (first->last): ";
        Link *pCurrent = pFirst;
        while (pCurrent != NULL)
        {
            pCurrent->displayLink();
            pCurrent = pCurrent->pNext;
        }
        cout << endl;
    }

    int find();

};

int main()
{
    LinkList theList;
    theList.insertFirst(22, 2.99);
    theList.insertFirst(44, 4.99);
    theList.insertFirst(66, 6.99);
    theList.insertFirst(88, 8.99);

    theList.displayList();

    while ( !theList.isEmpty() )
    {
        Link *pTemp = theList.getFirst();
        cout<< "\n Removing link with data ";
        pTemp -> displayLink();
        theList.removeFirst();
    }
    cout << endl << "Empty list :";
    theList.displayList();

    theList.insertFirst(22, 2.99);
    theList.insertFirst(44, 4.99);
    theList.insertFirst(66, 6.99);
    theList.insertFirst(88, 8.99);
    cout << "\n Reinserting the links back" << endl;
    theList.displayList();

    int findKey = 44;
    Link *pFind = theList.find(findKey);
    if (pFind != NULL)
        cout << "Fount link with key: " << findKey << pFind -> iData << endl;
    else cout << "Can't find link with key " << findKey << endl;

    if (theList.remove(findKey))
        cout << "Deleted " << findKey << " from the list. \n";
    else cout << "Did not delete " << findKey << " from the list. \n";

    cout << "Link list after the deletion \n";
    theList.displayList();

    cout << "\nThe sum of all links is: " << theList.sumIdata() << endl;
    cout << "The smallest link is: " << theList.min() << endl;
    cout << "The number of links is: " << theList.numLinks() << endl;
}

/*
 * /Users/layla.gallez/Desktop/laylaStuff/school/gavilan/CSIS45Sp17/cmake-build-debug/CSIS45Sp17
List (first->last): {88, 8.99 }{66, 6.99 }{44, 4.99 }{22, 2.99 }

 Removing link with data {88, 8.99 }
 Removing link with data {66, 6.99 }
 Removing link with data {44, 4.99 }
 Removing link with data {22, 2.99 }
Empty list :List (first->last):

 Reinserting the links back
List (first->last): {88, 8.99 }{66, 6.99 }{44, 4.99 }{22, 2.99 }
Fount link with key: 44-1405106088
Deleted 44 from the list.
Link list after the deletion
List (first->last): {88, 8.99 }{66, 6.99 }{22, 2.99 }

The sum of all links is: 176
The smallest link is: 22
The number of links is: 3

Process finished with exit code 0

 */