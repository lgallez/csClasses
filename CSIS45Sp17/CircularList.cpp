// CLASS and OOP
#include "header.h"
#include "header2.h"
#include <iostream>

using namespace std;

class Link
{
public:
    int data;
    Link *next;
    Link(int newData) { data = newData; next = NULL; }
    void show() { cout << "{" << data << "}"; }
};

class CircularList
{
private:
    Link *current;
    int numLinks;
public:
    CircularList() { current = NULL; numLinks = 0;}
    bool empty() { return (numLinks == 0); }

    bool found(int value)
    {
        if ( !empty() )
            for (int i = 0; i < numLinks; i++)
            {
                if (current -> data == value)
                    return true;
                current = current -> next;
            }
        return false;
    }

    void displayList()
    {
        cout << "The list:";
        if ( !empty() )
            for (int i = 0; i < numLinks; i++)
            {
                current -> show();
                current = current -> next;
            }
        else cout << "is empty\n";
    }

    void insertInitialLink(int newValue)
    {
        Link *newLink = new Link(newValue);
        current = newLink;
        current -> next = newLink;
        numLinks++;
    }

    void insertAfterValue(int newValue, int value)
    {
        if ( found(value) )
        {
            Link *newLink = new Link(newValue);
            newLink -> next = current -> next;
            current -> next = newLink;
            numLinks++;
        }
        else
            cout << value << " was not found. Nothing inserted. \n";
    }

    bool deleteLink (int value)
    {
        if ( !empty() )
            for (int i = 0; i < numLinks; i++)
            {
                if (current -> next -> data == value)
                {
                    Link *toDelete = current -> next;
                    current -> next = toDelete -> next;
                    delete toDelete;
                    numLinks--;
                    return true;
                }
                current = current -> next;
            }
        return false;
    }
};

int main()
{
    CircularList circ;
    cout << boolalpha;
    cout << "made a new circ list" << endl;
    cout << "the list is empty() ? " << circ.empty() << endl;

    cout << "displayList()";
    circ.displayList();

    cout << "test find(10) " << circ.found(10) << endl;

    cout << "Inserting the initial link \n";
    circ.insertInitialLink(10);
    cout << "displayList(): ";
    circ.displayList();
    cout << "\n test find(10) " << circ.found(10);

    cout << "Inserting 20 after link \n";
    circ.insertAfterValue(20,10);
    cout << "displayList(): ";
    circ.displayList();

    cout << "Inserting 15 after link \n";
    circ.insertAfterValue(15,10);
    cout << "displayList(): ";
    circ.displayList();

    cout << "Inserting 25 after link \n";
    circ.insertAfterValue(25,20);
    cout << "displayList(): ";
    circ.displayList();

    cout << "Inserting 25 after link {99}, 99 doesn't exist \n";
    circ.insertAfterValue(33,99);
    cout << "displayList(): ";
    circ.displayList();

    cout << "\n Trying to delete link that doesn't exist\n";
    cout << "test deleteLink(99) :" << circ.deleteLink(99) << endl;

    cout << "\n Trying to delete link 25\n";
    cout << "test deleteLink(25) :" << circ.deleteLink(25) << endl;
    cout << "displayList(): ";
    circ.displayList();

    cout << "\n Trying to delete link 20\n";
    cout << "test deleteLink(20) :" << circ.deleteLink(20) << endl;
    cout << "displayList(): ";
    circ.displayList();

    cout << "\n Trying to delete link 10\n";
    cout << "test deleteLink(10) :" << circ.deleteLink(10) << endl;
    cout << "displayList(): ";
    circ.displayList();

    cout << "\n Trying to delete link 15\n";
    cout << "test deleteLink(15) :" << circ.deleteLink(15) << endl;
    cout << "displayList(): ";
    circ.displayList();
}

/*
 * "/Users/layla.gallez/Desktop/Gavilan/CSIS46 C++ Programming II/CSIS45Sp17_1/cmake-build-debug/CSIS45Sp17_1"
made a new circ list
the list is empty() ? true
displayList()The list:is empty
test find(10) false
Inserting the initial link
displayList(): The list:{10}
 test find(10) trueInserting 20 after link
displayList(): The list:{10}{20}Inserting 15 after link
displayList(): The list:{10}{15}{20}Inserting 25 after link
displayList(): The list:{20}{25}{10}{15}Inserting 25 after link {99}, 99 doesn't exist
99 was not found. Nothing inserted.
displayList(): The list:{20}{25}{10}{15}
 Trying to delete link that doesn't exist
test deleteLink(99) :false

 Trying to delete link 25
test deleteLink(25) :true
displayList(): The list:{20}{10}{15}
 Trying to delete link 20
test deleteLink(20) :true
displayList(): The list:{15}{10}
 Trying to delete link 10
test deleteLink(10) :true
displayList(): The list:{15}
 Trying to delete link 15
test deleteLink(15) :true
displayList(): The list:is empty

Process finished with exit code 0
 */