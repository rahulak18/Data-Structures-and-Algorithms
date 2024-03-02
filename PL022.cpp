#include <iostream>
using namespace std;

string toLower(string s)
{
    for (int i = 0; i < s.length(); i++)
    {
        if (s[i] >= 'A' && s[i] <= 'Z')
        {
            s[i] = s[i] + 32;
        }
    }

    return s;
}

int main()
{
    string s;
    cout << "Enter the string : " << endl;
    cin >> s;

    cout << "The lower case of string '" << s << "' is : " << toLower(s) << endl;

    return 0;
}