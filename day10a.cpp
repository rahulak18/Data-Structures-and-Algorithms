#include <iostream>
using namespace std;

void printArrayElements(int arr[], int n)
{

    for (int i = 0; i < n; i++)
    {
        cout << arr[i] << " ";
    }
}

int main()
{
    int n = 5;
    int arr[] = {1, 2, 3, 4, 4};

    printArrayElements(arr, n);

    return 0;
}