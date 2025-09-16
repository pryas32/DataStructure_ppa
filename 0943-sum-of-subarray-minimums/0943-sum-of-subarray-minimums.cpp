class Solution {
public:
    int sumSubarrayMins(vector<int>& arr) {
       
        int modulo=1000000007;
        
        int n=arr.size();
         vector<int>next(n,n);
           vector<int>prev(n,-1);
        stack<int>s;
        s.push(0);
       
      for(int i=1;i<n;i++)
      {
        while(!s.empty() && arr[i]<arr[s.top()])
        {
            next[s.top()]=i;
            s.pop();
        }
        s.push(i);
      }

        while(!s.empty())
        {
            s.pop();
        }

       s.push(n-1);
     for(int i=n-2;i>=0;i--)
      {
        while(!s.empty() && arr[i]<=arr[s.top()])
        {
            prev[s.top()]=i;
            s.pop();
        }
        s.push(i);
      }

        while(!s.empty())
        {
            s.pop();
        }
        
     long long ans = 0;
        for (int i = 0; i < n; ++i) {
            long long left = i - prev[i];
            long long right = next[i] - i;
            long long contrib = (left * right) % modulo * arr[i] % modulo;
            ans = (ans + contrib) % modulo;
        }

        return ans;
























    }
};