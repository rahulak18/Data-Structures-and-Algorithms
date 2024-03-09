#include <iostream>
#include <bits/stdc++.h>
using namespace std;
string modify(string s)
{
    for (int i = 0, j = s.length() - 1; i < j;)
    {

        if ((s[i] == 'a' || s[i] == 'e' || s[i] == 'i' || s[i] == 'o' || s[i] == 'u') && (s[j] == 'a' || s[j] == 'e' || s[j] == 'i' || s[j] == 'o' || s[j] == 'u'))
        {
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
            i++;
            j--;
            continue;
        }

        if (s[i] != 'a' && s[i] != 'e' && s[i] != 'i' && s[i] != 'o' && s[i] != 'u')
        {
            i++;
        }
        if (s[j] != 'a' && s[j] != 'e' && s[j] != 'i' && s[j] != 'o' && s[j] != 'u')
        {
            j--;
        }
    }
    return s;
}

int main()
{
    cout << "Enter the string : ";
    string s;
    cin >> s;
    cout << "Reversed vowel string is : " << modify(s) << endl;
    return 0;
}