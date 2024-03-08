#include <iostream>
#include <bits/stdc++.h>
using namespace std;

vector<int> getMultiplication(int n)
{
    vector<int> v;
    for (int i = 1; i < 11; i++)
    {
        v.push_back(n * i);
    }

    return v;
}

int main()
{
    int n;
    cout << "Enter the number : " << endl;
    cin >> n;
    cout << "Below is the multiplication of the number " << n << endl;
    vector<int> result = getMultiplication(n);
    for (int i : result)
    {
        cout << i << " ";
    }

    cout << endl;
    return 0;
}