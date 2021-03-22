// p3.cpp
// Layla Gallez
// 3/14/2021
// Description: CLASS and OOP

#include "header.h"
#include "header2.h"
#include <iostream>
using namespace std;

class EncapsulatedArray
{
private:
    int *array;
    int number_of_elements;
public:
    EncapsulatedArray(int size);
    void add(int number_to_add);
    void insertFirst(int number_to_add);
    void deleteNumber(int number_to_delete);
    void sort();
    void show();
};

EncapsulatedArray::EncapsulatedArray(int size)
{
    array = new int[size];
    number_of_elements = 0;
}

void EncapsulatedArray::add(int number_to_add)
{
    array[number_of_elements] = number_to_add;
    number_of_elements++;
}

void EncapsulatedArray::insertFirst(int number_to_add)
{
    if(number_of_elements == 0)
        array[0] = number_to_add;

    else
    {
        for(int i = number_of_elements-1; i>=0; i--)
            array[i+1] = array[i];

        array[0] = number_to_add;
    }

    number_of_elements++;
}

void EncapsulatedArray::deleteNumber(int number_to_delete)
{
    int index = -1;

    for(int i=0; i<number_of_elements; i++)
    {
        if(array[i]==number_to_delete)
        {
            index = i;
            break;
        }
    }

    if(index!=-1)
    {
        for(int i=index+1; i<number_of_elements; i++)
        {
            array[i-1] = array[i];
        }
        number_of_elements--;
    }
}

void EncapsulatedArray::sort()
{
    for(int i = 0; i<number_of_elements-1; i++)
    {
        for(int j=0; j<number_of_elements-i-1; j++)
        {
            if(array[j] > array[j+1])
            {
                int temp = array[j];
                array[j] = array[j+1];
                array[j+1] = temp;

            }
        }
    }
}

void EncapsulatedArray::show()
{
    if(number_of_elements == 1)
    {
        cout<<"array = {"<<array[0]<<"}\n";
        return;
    }

    int i;
    cout << "array = {";
    for(i = 0; i<number_of_elements-1;i++)
        cout<<array[i]<<", ";
    cout<<array[i]<<"}\n";

}

int main()
{
    EncapsulatedArray anArray(5);
    anArray.add(9);
    anArray.show();
    anArray.add(101);
    anArray.add(9);
    anArray.show();
    anArray.insertFirst(3);
    anArray.show();
    anArray.deleteNumber(9);
    anArray.show();
    anArray.sort();
    anArray.show();
}

/*
/Users/layla.gallez/Desktop/laylaStuff/school/gavilan/CSIS45Sp17/cmake-build-debug/CSIS45Sp17
array = {9}
array = {9, 101, 9}
array = {3, 9, 101, 9}
array = {3, 101, 9}
array = {3, 9, 101}

Process finished with exit code 0

 */