#include <iostream>
#include <bits/stdc++.h>
using namespace std;

vector<int> findElements(int a[], int n)
{
    vector<int> v;
    for (int i = 0; i < n; i++)
    {
        v.push_back(a[i]);
    }

    sort(v.begin(), v.end());

    v.pop_back();
    v.pop_back();

    return v;
}

int main()
{
    int n = 6;

    int arr[] = {2, 4, 53, 32, 24, 46};
    vector<int> v;
    v = findElements(arr, n);
    for (int i : v)
    {
        cout << i << " ";
    }
    return 0;
}