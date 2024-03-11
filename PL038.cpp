#include <iostream>
#include <bits/stdc++.h>
using namespace std;

double findAvg(int arr[], int n)
{

    double avg = 0, sum = 0;
    for (int i = 0; i < n; i++)
    {
        sum += arr[i];
    }

    avg = sum / n;
    cout << fixed << setprecision(2);
    return avg;
}

int main()
{
    int n = 6;
    int arr[] = {12, 24, 435, 54, 3, 4};
    cout << "Average is : " << findAvg(arr, n) << endl;
    return 0;
}