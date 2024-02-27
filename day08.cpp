#include <iostream>
using namespace std;

bool isBinary(string str)
{
    for (int i = 0; i < str.length(); i++)
    {
        if (str[i] != '1' && str[i] != '0')
        {
            return false;
        }
    }
    return true;
}

int main()
{
    string str;
    cout << "Enter the string to validate the it is binary string or not : ";
    cin >> str;

    cout << (isBinary(str) ? "Yes it is a binary string" : "No it is not a binary string");

    return 0;
}