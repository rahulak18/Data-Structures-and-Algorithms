#include <iostream>
using namespace std;

void swapkth(int n, int k, int arr[])
{
    int temp = arr[k - 1];
    arr[k - 1] = arr[n - k];
    arr[n - k] = temp;
}

void printArr(int arr[], int n)
{
    for (int i = 0; i < n; i++)
    {
        cout << arr[i] << ' ';
    }
    cout << endl;
}

int main()
{
    int n = 6;
    int k = 1;
    int arr[] = {1, 24, 554, 36, 24, 231};
    printArr(arr, n);
    swapkth(n, k, arr);
    printArr(arr, n);
    return 0;
}