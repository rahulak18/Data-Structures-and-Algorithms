#include <iostream>
#include <bits/stdc++.h>
using namespace std;

void printNumbers(int n)
{
    if (n == 0)
    {
        return;
    }

    printNumbers(n - 1);
    cout << n << " ";
}

int main()
{
    printNumbers(9);
    return 0;
}