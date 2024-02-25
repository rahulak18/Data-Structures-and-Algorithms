
#include <bits/stdc++.h>
using namespace std;

class Solution
{
public:
public:
    int find_median(vector<int> v)
    {
        sort(v.begin(), v.end());

        int length = v.size();
        int i = 0;

        if (length % 2 != 0)
        {
            int mid = length / 2;
            for (auto value : v)
            {
                if (i == mid)
                {
                    return value;
                }
                i++;
            }
        }
        else
        {
            int result = 0;
            int mid = length / 2 - 1;
            for (auto value : v)
            {
                if (i == mid || i == mid + 1)
                {
                    result += value;
                }
                i++;
            }
            return result / 2;
        }
    }
};

int main()
{
    int T;
    cin >> T;
    while (T--)
    {
        int n;
        cin >> n;
        vector<int> v(n);
        for (int i = 0; i < n; i++)
            cin >> v[i];
        Solution ob;
        int ans = ob.find_median(v);
        cout << ans << "\n";
    }
    return 0;
}
