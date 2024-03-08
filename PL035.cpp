#include <iostream>
#include <bits/stdc++.h>
using namespace std;

pair<int, int> swapping(int a, int b)
{
    pair<int, int> p;
    p.first = b;
    p.second = a;
    return p;
}

int main()
{
    pair<int, int> p;
    int a, b;
    cout << "Enter the number a : " << endl;
    cin >> a;
    cout << "Enter the number b : " << endl;
    cin >> b;

    cout << "After swapping : " << endl;
    p = swapping(a, b);
    cout << "a is : " << p.first << endl;
    cout << "b is : " << p.second << endl;
}