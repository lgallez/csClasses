#include "header.h"
#include "header2.h"
#include <iostream>

using namespace std;

class EncapsulatedArray

{
private:
    int *array;
    int numElements;

public:
    EncapsulatedArray(int size)
    {
        array = new int[size];
        numElements=0;
    }

    void swap(int index1, int index2)
    {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    void bubbleSort()
    {
        for (int i = 0; i < numElements-1; i++)
            for (int j = 0; j< numElements-(1+i); j++)
                if (array[j] > array[j+1] )
                    swap(j, j+1);
    }

    void selectSort()
    {
        int min_index;
        for (int current_index=0; current_index<numElements-1; current_index++)
        {
            min_index = current_index;
            for (int i = current_index+1; i< numElements; i++)
                if (array[i] < array[min_index])
                    min_index = i;
            swap(current_index, min_index);
        }
    }

    void insertSort()
    {   int in, out, temp;
        for (out = 1; out < numElements; out++)
        {
            in = out;
            temp = array[in];
            while (in > 0 && array[in-1] > temp)
            {
                array[in] = array [in-1];
                in--;
            }
            array [in] = temp;
        }
    }

    void add(int number_to_add)
    {
        array[numElements] = number_to_add;
        numElements++;
    }

    void show()
    {
        int i=0;
        cout << "array = {";
        for(i = 0; i<numElements-1; i++)
            cout << array[i] << ", ";
        cout << array[i] << "}\n";
    }

    void deleteAtIndex(int index)
    {
        if ( (index >= numElements) || (index < 0) )
            return;
        for (int i = index; i < numElements-1; i++)
            array[i] = array[i+1];
        numElements--;
    }

    void insertAtIndex(int index, int element)
    {
        if ( (index > numElements) || (index < 0) )
            return;
        for(int i=numElements;i>index;i--){
            array[i]=array[i-1];
        }
        array[index]=element;
        numElements++;
    }

    void noDups(){
        int index=1;
        while(index<numElements){
            if(array[index]==array[index-1]){
                deleteAtIndex(index);
            }else{
                index++;
            }
        }
    }

    void insert_in_order(int number_to_insert){
        for(int i=0;i<numElements;i++){
            if(number_to_insert<array[i]){
                insertAtIndex(i,number_to_insert);
                return;
            }
        }
        add(number_to_insert);
    }
};

int main()
{
    cout << "Make an array of 5 integers" << endl;

    EncapsulatedArray anArray(6);

    anArray.add(66);

    anArray.add(23);

    anArray.add(9);

    anArray.add(15);

    anArray.add(-37);

    anArray.show();

    anArray.swap(0,2);

    anArray.show();

    anArray.bubbleSort();

    anArray.show();

    anArray.selectSort();

    anArray.show();

    anArray.insertSort();

    anArray.show();

    anArray.deleteAtIndex(2);

    anArray.show();

    cout<<"creating another array..."<<endl;

    EncapsulatedArray array2(10);

    array2.insert_in_order(97);

    array2.insert_in_order(12);

    array2.insert_in_order(-4);

    array2.insert_in_order(-4);

    array2.insert_in_order(15);

    array2.insert_in_order(46);

    array2.insert_in_order(15);

    array2.insert_in_order(9);

    array2.insert_in_order(19);

    array2.show();

    array2.noDups();

    array2.show();

    return 0;

}

/*
 * "/Users/layla.gallez/Desktop/Gavilan/CSIS46 C++ Programming II/CSIS45Sp17_1/cmake-build-debug/CSIS45Sp17_1"
Make an array of 5 integers
array = {66, 23, 9, 15, -37}
array = {9, 23, 66, 15, -37}
array = {-37, 9, 15, 23, 66}
array = {-37, 9, 15, 23, 66}
array = {-37, 9, 15, 23, 66}
array = {-37, 9, 23, 66}
creating another array...
array = {-4, -4, 9, 12, 15, 15, 19, 46, 97}
array = {-4, 9, 12, 15, 19, 46, 97}

Process finished with exit code 0

 */