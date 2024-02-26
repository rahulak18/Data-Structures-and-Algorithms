#include <iostream>
#include <bits/stdc++.h>
using namespace std;

string armstrongNumber(int n)
{

    int digit3 = n % 10;
    int digit2 = (n / 10) % 10;
    int digit1 = ((n / 10) / 10) % 10;

    int armStrongNumber = pow(digit1, 3) + pow(digit2, 3) + pow(digit3, 3);

    if (n == armStrongNumber)
    {
        return "Yes";
    }

    return "No";
}

int main()
{
    int n;
    cout << "Enter the 3 digit number : ";
    cin >> n;

    cout << armstrongNumber(n) << endl;

    return 0;
}