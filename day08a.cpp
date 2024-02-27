#include <iostream>
using namespace std;

int counterFunction(int n, int arr[], int length)
{
    int count = 0;
    for (int i = 0; i < length; i++)
    {
        if (arr[i] <= n)
        {
            count++;
        }
    }
    return count;
}

int main()
{
    int n;
    cout << "Enter the number : ";
    cin >> n;

    int length = 6;
    int arr[] = {1, 2, 3, 5, 46, 77};

    // The array must be sorted (asc)

    cout << "The total numbers which are less or equal to the entered number " << n << " is: " << counterFunction(n, arr, length);

    return 0;
}