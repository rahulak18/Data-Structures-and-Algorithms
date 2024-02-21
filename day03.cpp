#include <iostream>
using namespace std;

void printingAlternateElements(int arr[], int n)
{
    for (int i = 0; i < n;)
    {
        cout << arr[i] << " ";
        i += 2;
    }
}

int main()
{
    int n = 5;
    int arr[] = {1, 2, 3, 4, 5};
    printingAlternateElements(arr, n);
    return 0;
}