#include <iostream>
using namespace std;

int reverseNumber(int n)
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

int main()
{

    int n;
    cout << "Enter the number to check whether it is a palindrome or not : " << endl;
    cin >> n;

    if (n == reverseNumber(n))
    {
        cout << "Yes it is a palindrome number" << endl;
    }
    else
    {
        cout << "No it is not a palindrome number" << endl;
    }

    return 0;
}