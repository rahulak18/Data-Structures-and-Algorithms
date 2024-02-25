#include <iostream>
using namespace std;

void printPatter(int n)
{
    for (int i = n; i > 0; i--)
    {
        for (int j = n; j > 0; j--)
        {
            for (int k = i; k > 0; k--)
            {
                cout << j << " ";
            }
        }
        cout << endl;
    }
}

int main()
{
    int n;
    cout << "Enter the number : ";
    cin >> n;

    printPatter(n);
    return 0;
}