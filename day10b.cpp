#include <iostream>
using namespace std;

int result[] = {-1, -1};

int *findIndex(int arr[], int n, int key)
{

    int index = 0;

    for (int i = 0; i < n; i++)
    {
        if (arr[i] == key)
        {
            result[index++] = i;
            break;
        }
    }

    for (int i = n - 1; i >= 0; i--)
    {
        if (arr[i] == key)
        {
            result[index++] = i;
            break;
        }
    }

    return result;
}

int main()
{
    int n = 6;
    int arr[] = {1, 2, 3, 2, 3, 12};
    int key = 2;

    int *result = findIndex(arr, n, key);

    cout << "Start index is : " << result[0] << " and last index is : " << result[1] << endl;

    return 0;
}