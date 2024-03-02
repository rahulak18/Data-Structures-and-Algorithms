#include <iostream>
using namespace std;

int gcdOfTwoNumbers(int a, int b)
{
    while (a != b)
    {
        if (a > b)
        {
            a -= b;
        }
        else
        {
            b -= a;
        }
    }

    return a;
}

int main()
{
    int a, b;
    cout << "Enter the number a : ";
    cin >> a;
    cout << "Enter the number b : ";
    cin >> b;
    // cout << endl;

    cout << "Gcd of two numbers " << a << " and " << b << " is : " << gcdOfTwoNumbers(a, b) << endl;

    return 0;
}