#include <iostream>
using namespace std;

long long sumOfSeries(int n)
{

    return long(n) * (long)(n + 1) / 2;
}

int main()
{
    int n;
    cout << "Enter the number : " << endl;
    cin >> n;
    cout << "Sum of the series till " << n << " is : " << sumOfSeries(n) << endl;
    return 0;
}