#include <iostream>
using namespace std;

string stringModify(string s)
{
    int index = 0;
    for (int i = 0; i < s.length(); i++)
    {
        if (s[i] == ' ')
        {
            continue;
        }
        else
        {
            s[index++] = s[i];
        }
    }

    for (int i = index; i < s.length(); i++)
    {
        s.erase(i);
    }

    return s;
}

int main()
{
    string s = "Gokul    Nandan       ";

    cout << "Original string : " << s << endl;
    cout << "Removed whitespaces from string : " << stringModify(s) << endl;
    return 0;
}