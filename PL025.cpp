#include <iostream>
#include <bits/stdc++.h>
using namespace std;

bool isPerfectArray(vector<int> &arr)
{
    for (int i = 0, j = arr.size() - 1; i < j; i++, j--)
    {
        if (arr[i] != arr[j])
        {
            return false;
        }
    }

    return true;
}

int main()
{
    vector<int> v = {1, 2, 3, 2, 1};
    cout << "Is array perfect or not : " << isPerfectArray(v) << endl;
    return 0;
}