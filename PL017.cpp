#include <iostream>
using namespace std;

int reverseDigit(int n)
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
    cout << "Enter the number : " << endl;
    cin >> n;

    cout << "The reverse number is : " << reverseDigit(n) << endl;

    return 0;
}