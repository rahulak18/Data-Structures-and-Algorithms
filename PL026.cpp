#include <iostream>
#include <bits/stdc++.h>
using namespace std;

int reverseNum(int n)
{
    int result = 0;
    while (n != 0)
    {
        int digit = n % 10;
        result = result * 10 + digit;
        n /= 10;
    }

    return result;
}

int digitSum(int n)
{
    int result = 0;
    while (n != 0)
    {
        int digit = n % 10;
        result = result + digit;
        n /= 10;
    }

    return result;
}

int main()
{
    int n;
    cout << "Enter the number : " << endl;
    cin >> n;

    int sumOfDigits = digitSum(n);
    if (sumOfDigits == reverseNum(sumOfDigits))
    {
        cout << "The sum of digits is palindrome" << endl;
    }
    else
    {
        cout << "The sum of the digits is not a palindrome" << endl;
    }
    return 0;
}