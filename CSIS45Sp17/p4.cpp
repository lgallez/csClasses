// CLASS and OOP
#include "header.h"
#include "header2.h"
#include <iostream>
using namespace std;

class Item
{
private:
    string name;
    double cost;

public:
    Item()
    {
        name = "";
        cost = 0.0;
    }

    Item (string newName, double newCost)
    {
        name = newName;
        cost = newCost;
    }

    void show () { cout << "- " << name << " $" << cost << endl; }
    string get_name() { return name; }
    double get_cost() { return cost; }

    void set_item(string newName, double newCost) {
        name = newName;
        cost = newCost;
    }

    void setItem(Item item) {
        name = item.get_name();
        cost = item.get_cost();
    }
};

class Bag
{
private:
    Item *items;
    int number_items;
    int max;

public:
    Bag(int Max)
    {
        items = new Item[Max];
        number_items = 0;
        max = Max;
    }

    void insert_item(string name, double cost)
    {
        items[number_items].set_item(name, cost);
        number_items++;
    }

    void insertItem(Item item)
    {
        items[number_items].setItem(item);
        number_items++;
    }

    int size() { return max;}

    void showItems()
    {
        for (int i = 0; i< number_items; i++)
            items[i].show();
    }

    void delete_first()
    {
        for (int i = 0; i < max -1; i++)
            items[i] = items[i+1];
        number_items--;
    }

    bool contains (string name_to_find)
    {
        for (int i = 0; i < number_items; i++)
            if (name_to_find == items[i].get_name())
                return true;
        return false;
    }

    void sort_by_cost_acending()
    {
        for (int i = 0; i < number_items -1; i++)
            for (int j = 0; j< number_items -1; j++)
                if (items[j].get_cost() > items[j+1].get_cost())
                    swap(j,j+1);
    }

    void swap(int index1, int index2)
    {
        Item temp = items[index1];
        items[index1] = items[index2];
        items[index2] = temp;
    }

    void most_expensive()
    {
        if(number_items>0)
        {
            double maxExp=items[0].get_cost();
            int index=0;

            for(int i = 0; i < number_items; i++)
            {
                if(items[i].get_cost()>maxExp)
                {
                    maxExp=items[i].get_cost();
                    index=i;
                }
            }

            cout<<"\nMost expensive item: ";
            items[index].show();
        }
    }

    void show_reverse()
    {
        for(int i = number_items-1; i >= 0; i--)
            items[i].show();
    }

    void get_frequency (Item item)
    {
        int count=0;
        for(int i = 0; i < number_items; i++)
        {
            if(items[i].get_name()==item.get_name())
                count++;
        }

        cout<<"\nThe item "<<item.get_name()<<" appears in the bag "<<count<<" times."<<endl;
    }

    bool delete_item (Item item)
    {
        int index=-1;

        for(int i = 0; i < number_items; i++)
        {
            if(items[i].get_name()==item.get_name())
            {
                index=i;
                break;
            }
        }

        if(index!=-1)
        {
            number_items--;
            for(int i = index; i <number_items; i++)
            {
                items[i]=items[i+1];
            }
            return true;
        }
        else
            return false;
    }

    int get_index_of (Item item)
    {
        int index=-1;

        for(int i = 0; i < number_items; i++)
        {
            if(items[i].get_name()==item.get_name())
            {
                index=i;
                break;
            }
        }
        return index;
    }

    double sum_of_all ( )
    {
        double sum=0;
        for(int i = 0; i < number_items; i++)
        {
            sum+=items[i].get_cost();
        }
        return sum;
    }
};

int main()
{
    cout << "Testing Item: ";

    Item anItem("Fuji Apple", 4.99);

    Item anItem2("Green Apple", 5.99);

    Item anItem3("Apple", 8.99);

    Item anItem4("Mango", 6.99);

    Item anItem5("Fuji Apple", 4.99);

    anItem.show();

    Bag b(10);

    b.insertItem(anItem);

    b.insertItem(anItem2);

    b.insertItem(anItem3);

    b.insertItem(anItem4);

    b.insertItem(anItem5);

    b.most_expensive();

    cout<<"Items in reverse :"<<endl;

    b.show_reverse();

    b.get_frequency(anItem);

    b.get_index_of(anItem3);

    b.delete_item(anItem4);

    cout<<"After deleting "<<anItem4.get_name()<<" items are: "<<endl;

    b.showItems();

    cout<<"Sum of all items: "<<b.sum_of_all();

    return 0;
}

/*
 "/Users/layla.gallez/Desktop/Gavilan/CSIS46 C++ Programming II/CSIS45Sp17_1/cmake-build-debug/CSIS45Sp17_1"
Testing Item: - Fuji Apple $4.99

Most expensive item: - Apple $8.99
Items in reverse :
- Fuji Apple $4.99
- Mango $6.99
- Apple $8.99
- Green Apple $5.99
- Fuji Apple $4.99

The item Fuji Apple appears in the bag 2 times.
After deleting Mango items are:
- Fuji Apple $4.99
- Green Apple $5.99
- Apple $8.99
- Fuji Apple $4.99
Sum of all items: 24.96
Process finished with exit code 0
 */