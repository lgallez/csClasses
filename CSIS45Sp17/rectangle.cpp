#include <iostream>
#include <cassert>

using namespace std;

void area (float width, float height)
{
    assert(width > 0 && height > 0);
    cout << "Area is " << width * height << endl;
}

void perimeter (float width, float height)
{
    assert(width > 0 && height > 0);
    cout << "Perimeter is " << 2 * (width + height) << endl;
}
