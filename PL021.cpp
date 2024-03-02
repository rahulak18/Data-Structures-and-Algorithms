#include <iostream>
using namespace std;

int main()
{
    int n = 7;
    int key; // Take it from user
    cout << "Enter the key index : range(0-" << n - 1 << ") : ";
    cin >> key;
    int arr[] = {1, 2, 3, 4, 5, 5, 6};
    if (key <= n - 1)
    {
        cout << "Element found at " << key << " index is : " << arr[key] << endl;
    }
    else
    {
        cout << "Key is out of bound range" << endl;
    }
    return 0;
}