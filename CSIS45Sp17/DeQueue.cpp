// DeQueue.cpp
// Layla Gallez
// 3/14/2021
// Description: CLASS and OOP
#include "header.h"
#include "header2.h"
#include <iostream>

using namespace std;

class Queue
{
private:
    int size, front, rear, number_items;
    int * queueArray;
public:
    Queue(int newSize)
    {
        size = newSize;
        queueArray = new int[size];
        front = 0;
        rear = -1;
        number_items = 0;
    }

    void insert_rear(int newValue)
    {
        if(rear == size - 1)
            rear = -1;
        rear++;
        queueArray[rear] = newValue;
        number_items++;
    }

    void insert_front(int newValue)
    {
        if(front == 0)
            front = size;
        front --;
        queueArray[front] = newValue;
        number_items++;
    }

    int remove_front()
    {
        int temp = queueArray[front];
        if (front == size - 1)
            front = - 1;
        front ++;
        number_items--;
        return temp;
    }

    void remove_rear()
    {
        if (rear == 0)
            rear = size;
        rear--;
        number_items--;
    }

    int peekFront() { return queueArray[front];}
    int peekRear() { return queueArray[rear];}
    bool isEmpty() { return (number_items == 0);}
    bool isFull() { return (number_items == size);}
    int qize() { return number_items;}
};

int main()
{
    Queue aQueue(5);
    aQueue.insert_rear(10);
    aQueue.insert_rear(20);
    aQueue.insert_rear(30);
    aQueue.insert_rear(40);

    while ( !aQueue.isEmpty() )
    {
        cout << aQueue.peekRear() << " ";
        aQueue.remove_rear();
    }
    aQueue.insert_rear(10);
    cout << "\n" << aQueue.peekRear() << " ";
    cout << "\n" << aQueue.peekFront() << " ";
    aQueue.insert_front(20);
    cout << "\n" << aQueue.peekFront() << " ";
    aQueue.insert_front(30);
    cout << "\n" << aQueue.peekFront() << " ";
    aQueue.remove_front();
    cout << "\n" << aQueue.peekFront() << " ";
}

/*
 * /Users/layla.gallez/Desktop/laylaStuff/school/gavilan/CSIS45Sp17/cmake-build-debug/CSIS45Sp17
40 30 20 10
10
10
20
30
20
Process finished with exit code 0

 */