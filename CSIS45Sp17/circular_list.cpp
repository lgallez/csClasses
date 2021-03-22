// CLASS and OOP
#include <iostream>
using namespace std;
class Link
{
public:
    int data;
    Link  *next;
    Link(int newData) { data = newData; next = NULL;}
    void show() { cout << "{" <<  data << "}" ;}
};

class CircularList {
private:
    Link *current;
    int numLinks;
public:
    CircularList() {
        current = NULL;
        numLinks = 0;
    }

    bool empty() { return (numLinks == 0); }

    bool found(int value) {
        if (!empty())
            for (int i = 0; i < numLinks; i++) {
                if (current->data == value)
                    return true;
                current = current->next;
            }
        return false;
    }

    void displayList() {
        cout << "The List: ";
        if (!empty())
            for (int i = 0; i < numLinks; i++) {
                current->show();
                current = current->next;
            }
        else
            cout << "is empty\n";
    }

    void insertInitialLink(int newValue)
    {
        Link *newLink = new Link(newValue);
        current = newLink;
        current->next = newLink;
        numLinks++;
    }

    void insertAfterValue(int newValue, int value)
    {
        if (found(value))
        {
            Link *newLink = new Link(newValue);
            newLink->next = current->next;
            current->next = newLink;
            numLinks++;
        }
        else
            cout << value << " was not found. Nothing inserted.\n";
    }

    bool deleteLink (int value)
    {
        if (!empty())
            for (int i=0; i<numLinks; i++)
            {
                if (current->next->data == value)
                {
                    Link *toDelete = current->next;
                    current->next = toDelete->next;
                    delete toDelete;
                    numLinks--;
                    return true;
                }
                current = current->next;
            }
        return false;
    }

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
        cout << "\ntest find(10) " << circ.found(10);

        cout << "\ninserting 20 after Link {10}\n";
        circ.insertAfterValue(20,10);
        cout << "displayList(): ";
        circ.displayList();

        cout << "\ninserting 15 after link {10}\n";
        circ.insertAfterValue(15,10);
        cout << "displayList(): ";
        circ.displayList();

        cout << "\ninserting 25 after link {20}\n";
        circ.insertAfterValue(25,20);
        cout << "displayList(): ";
        circ.displayList();

        cout << "\ninserting 25 after link {99}, 99 doesn't exist\n";
        circ.insertAfterValue(33,99);
        cout << "displayList(): ";
        circ.displayList();

        cout << "\nTrying to delete link that does not exist\n";
        cout << "test deleteLink(99) : " << circ.deleteLink(99) << endl;

        cout << "\nTrying to delete link 25\n";
        cout << "test deleteLink(25) : " << circ.deleteLink(25) << endl;
        cout << "displayList(): ";
        circ.displayList();

        cout << "\nTrying to delete link 20\n";
        cout << "test deleteLink(20) : " << circ.deleteLink(20) << endl;
        cout << "displayList(): ";
        circ.displayList();

        cout << "\nTrying to delete link 10\n";
        cout << "test deleteLink(10) : " << circ.deleteLink(10) << endl;
        cout << "displayList(): ";
        circ.displayList();

        cout << "\nTrying to delete link 15\n";
        cout << "test deleteLink(15) : " << circ.deleteLink(15) << endl;
        cout << "displayList(): ";
        circ.displayList();
    }
};

