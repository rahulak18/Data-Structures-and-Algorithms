#include <iostream>
#include <bits/stdc++.h>
using namespace std;

int nthTermOfAP(int a1, int a2, int n)
{
    return (a1 + ((a2 - a1) * (n - 1)));
}

int main()
{
    int a = 3, b = 6;
    int n;
    cout << "Enter the value of n" << endl;
    cin >> n;
    cout << "The nth term is  " << nthTermOfAP(a, b, n);
    return 0;
}