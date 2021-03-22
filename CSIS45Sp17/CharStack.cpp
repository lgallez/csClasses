// CharStack.cpp
// Layla Gallez
// 3/14/2021
// Description: CLASS and OOP
// CLASS and OOP
#include "header.h"
#include "header2.h"
#include <iostream>

using namespace std;

class CharStack
{
private:
    int size;
    int top;
    char *stackArray;

public:
    CharStack(int newSize)
    {
        size = newSize;
        stackArray = new char [size];
        top = -1;
    }

    void push(char newLetter){ stackArray[++top] = newLetter;}

    char pop() { return stackArray[top--];}

    char peek() { return stackArray[top];}

    bool isEmpty() { return (top == -1); }

    bool isFull() { return (top == size -1); }
};

int main()
{
    char a[] = {'l', 'a', 'y', 'l', 'a',' ', 'g', 'a', 'l', 'l', 'e', 'z'};

    CharStack reverse(12);

    for (int i=0; i < 12; i++)
        reverse.push(a[i]);
    while (!reverse.isEmpty())
        cout << reverse.pop();
}

/*
 * /Users/layla.gallez/Desktop/laylaStuff/school/gavilan/CSIS45Sp17/cmake-build-debug/CSIS45Sp17
zellag alyal
Process finished with exit code 0

 */