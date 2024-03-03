#include <iostream>
using namespace std;

string compareNM(int n, int m)
{
    if (n < m)
    {
        return "lesser";
    }
    else if (n == m)
    {
        return "equal";
    }
    else
    {
        return "greater";
    }
}

int main()
{
    int n = 9, m = 3;
    cout << "The relationship between " << n << " and " << m << " is : " << n << " is " << compareNM(n, m) << " than " << m << "." << endl;

    return 0;
}