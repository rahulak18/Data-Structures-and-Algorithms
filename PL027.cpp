#include <iostream>
#include <bits/stdc++.h>
using namespace std;

string oddOrEven(int n)
{
    if (n % 2 == 0)
    {
        return "Even";
    }

    return "Odd";
}

int main()
{
    int n;
    cout << "Enter the number : " << endl;
    cin >> n;
    cout << "The number is : " << oddOrEven(n) << endl;
    return 0;
}