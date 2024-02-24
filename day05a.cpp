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

bool palindromeArray(int arr[], int n)
{
    for (int i = 0; i < n; i++)
    {
        if (arr[i] != reverseNumber(arr[i]))
        {
            return false;
        }
    }

    return true;
}

int main()
{

    int n = 5;
    int arr[] = {101, 121, 454, 656, 676};

    if (palindromeArray(arr, n))
    {
        cout << "Yes it is palindrome array" << endl;
    }
    else
    {
        cout << "No it is not a palindrome array" << endl;
    }

    return 0;
}