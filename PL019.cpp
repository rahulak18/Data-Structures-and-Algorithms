#include <iostream>
using namespace std;

string displayLongName(string names[], int n)
{
    int length = 0;
    string longName;

    for (int i = 0; i < n; i++)
    {
        if (length < names[i].length())
        {
            longName = names[i];
            length = names[i].length();
        }
    }

    return longName;
}

int main()
{
    int n = 6;
    string names[] = {"Shikhar dhawan", "Dale steyn", "Ravindra Jadeja", "Rohit sharma", "kane williamson", "Suresh Raina"};

    cout << "The longest name from the array is : " << displayLongName(names, n);

    return 0;
}