class Solution {
public:
    int largestRectangleArea(vector<int>& heights) {
        int n = heights.size();
        vector<int> prev(n, -1); 
        vector<int> next(n, n); 
        stack<int> s;

        
        for (int i = 0; i < n; i++) {
            while (!s.empty() && heights[i] < heights[s.top()]) {
                next[s.top()] = i;
                s.pop();
            }
            s.push(i);
        }

       
        while (!s.empty()) s.pop();

        for (int i = n - 1; i >= 0; i--) {
            while (!s.empty() && heights[i] < heights[s.top()]) {
                prev[s.top()] = i;
                s.pop();
            }
            s.push(i);
        }

    
        int maximum = 0;
        for (int i = 0; i < n; i++) {
            int width = next[i] - prev[i] - 1;
            int area = heights[i] * width;
            maximum = max(maximum, area);
        }

        return maximum;
    }
};
