#include <iostream>
using namespace std;

int reverseNumber(int n)
{
    int finalValue = 0;

    while (n != 0)
    {
        int digit = n % 10;
        finalValue = finalValue * 10 + digit;
        n = n / 10;
    }

    return finalValue;
}

int main()
{
    int n;
    cout << "Enter the number : ";
    cin >> n;

    cout << "Reversed number is : " << reverseNumber(n);
    return 0;
}