// p2.cpp
// Layla Gallez
// 2/21/2021
// Description: CLASS and OOP

#include "header.h"
#include "header2.h"
#include <iostream>
using namespace std;

class Person
{
private:
    int age;
    float weight;
public:
    void showAge();
    void changeAge(int newAge);
    void showWeight();
    void changeWeight(float newWeight);
    Person();
    Person(int newAge);
    Person(float newWeight);
};

void Person::showAge()
{
    cout << age << endl;
}
void Person::showWeight()
{
    cout << weight << endl;
}

void Person::changeAge(int newAge)
{
    age = newAge;
}

Person::Person()
{
    age = 101;
    weight = 120;
}

Person::Person(int newAge)
{
    age = newAge;
}

int main()
{
    Person layla;
    layla.showAge();
    layla.showWeight();
    layla.changeAge(32);
    layla.showAge();

    Person dog(3);
    dog.showAge();
}

/*
 * "/Users/layla.gallez/Desktop/Gavilan/CSIS46 C++ Programming II/CSIS45Sp17_1/cmake-build-debug/CSIS45Sp17_1"
101
120
32
3

Process finished with exit code 0

 */