#include <iostream>
#include <bits/stdc++.h>
using namespace std;

vector<int> getMoreAndLess(int arr[], int n, int x)
{

    int lessNum = 0;
    int maxNum = 0;

    for (int i = 0; i < n; i++)
    {
        if (arr[i] < x)
        {
            lessNum++;
        }
        else if (arr[i] > x)
        {
            maxNum++;
        }
        else
        {
            lessNum++;
            maxNum++;
        }
    }

    vector<int> v;
    v.push_back(lessNum);
    v.push_back(maxNum);
    return v;
}

int main()
{
    int n = 6;
    int arr[] = {1, 2, 34, 34, 72, 91};
    int x = 34;

    vector<int> v;

    v = getMoreAndLess(arr, n, x);

    cout << "Number of elements smaller than " << x << " : " << v[0] << endl;
    cout << "Number of elements greater than " << x << " : " << v[1] << endl;

    return 0;
}