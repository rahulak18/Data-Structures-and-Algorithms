#include <iostream>
#include <bits/stdc++.h>
using namespace std;

string reverseString(string s)
{
    string result = "";

    for (int i = s.length() - 1; i >= 0; i--)
    {

        result.push_back(s[i]);
    }

    return result;
}

int main()
{
    string s = "Rohit sharma";

    cout << "Reverse of string is : " << reverseString(s) << endl;

    return 0;
}