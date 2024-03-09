#include <iostream>
#include <bits/stdc++.h>
using namespace std;

string transform(string s)
{
    string result = s;
    bool flag = true;

    for (int i = 0; i < result.length(); i++)
    {
        if (result[i] == ' ')
        {
            flag = true;
            continue;
        }

        if (flag)
        {
            if (result[i] >= 'a' && result[i] <= 'z')
                result[i] -= 32;
            flag = false;
        }
    }

    return result;
}

int main()
{

    string s;
    cout << "Enter the string to convert it into the title case : " << endl;
    // cin >> s;
    getline(cin, s);
    cout << "The title case string is : " << transform(s) << endl;

    return 0;
}