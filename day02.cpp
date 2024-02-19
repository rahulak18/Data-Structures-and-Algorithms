#include <iostream>
#include <bits/stdc++.h>
using namespace std;

vector<int> valueEqualToIndex(int arr[], int n)
{
    vector<int> resultArray;

    for (int i = 0; i < n; i++)
    {
        if (arr[i] == (i + 1))
        {
            resultArray.push_back(arr[i]);
        }
    }

    return resultArray;
}

int main()
{
    int n;
    int arr[100] = {
        1,
        2,
        6,
        3,
        46,
        2,
        32,
        35,
        8,
        5,
        11,
        75,
    };
    n = sizeof(arr) / sizeof(int);

    vector<int> v = valueEqualToIndex(arr, n);
    cout << "The elements in the array that are equal to their index number are: ";
    for (int i : v)
    {
        cout << i << endl;
    }
    return 0;
}