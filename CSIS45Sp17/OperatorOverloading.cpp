// CLASS and OOP
#include "header.h"
#include "header2.h"
#include <iostream>

using namespace std;

class Distance
{
private:
    int meter;
public:
    Distance (int m) { meter = m ; }

    bool operator < (const Distance d ) { return meter < d.meter; }
    bool operator <= (const Distance d ) { return meter <= d.meter; }
    bool operator > (const Distance d ) { return meter > d.meter; }
    bool operator >= (const Distance d ) { return meter >= d.meter; }
    bool operator == (const Distance &d ) { return meter == d.meter; }
    bool operator != (const Distance &d ) { return meter != d.meter; }
    void operator = (const Distance &d ) { meter = d.meter; }

    Distance operator + (const Distance &d)
    {
        Distance dist(0);
        dist.meter = this -> meter + d.meter;
        return dist;
    }

    Distance operator - (const Distance &d)
    {
        Distance dist(0);
        dist.meter = this -> meter - d.meter;
        return dist;
    }

    Distance operator * (const Distance &d)
    {
        Distance dist(0);
        dist.meter = this -> meter * d.meter;
        return dist;
    }

    Distance operator / (const Distance &d)
    {
        Distance dist(0);
        dist.meter = this -> meter / d.meter;
        return dist;
    }

    friend ostream &operator << (ostream &output, const Distance &d )
    {
        output << d.meter << "m " << endl;
    }

    friend istream &operator >> (istream &input, const Distance &d )
    {
        input >> d.meter;
        return input;
    }
};

int main()
{
    Distance d1(4), d2(2), d3(0), d4(4);
    cout << boolalpha;
    cout << "d1 = " << d1;
    cout << "d2 = " << d2;
    cout << "d3 = " << d3;
    cout << "d4 = " << d4;

    d4 = d1 + d2;

    cout << "d1 + d2 = d4 = " << d1 + d2;
    cout << "d2 - d1 = " << d2 - d1;
    cout << "d1 / d2 = " << d1 / d2;
    cout << "d2 * d1 = " << d2 * d1;

    cout << "(d1 < d2) = " << (d1 < d2) << endl;
    cout << "(d2 < d1) = " << (d2 < d1) << endl;
    cout << "(d2 <= d1) = " << (d2 <= d1) << endl;
    cout << "(d2 >= d1) = " << (d2 >= d1) << endl;
    cout << "(d2 > d1) = " << (d2 > d1) << endl;
    cout << "(d4 == d1) = " << (d4 == d1) << endl;
    cout << "(d4 != d1) = " << (d4 != d1) << endl;
    cout << "Enter d4:";
    cin >> d4;
    cout << "d4 = " << d4;
}