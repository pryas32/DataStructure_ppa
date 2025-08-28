struct point{
    int x;
    int y;
};

bool cmp(point p1,point p2)
{
    int d1=p1.x*p1.x+p1.y*p1.y;
    int d2=p2.x*p2.x+p2.y*p2.y;

  return d1<d2;


}







class Solution {
public:
    vector<vector<int>> kClosest(vector<vector<int>>& points, int k) {
        
      vector<point>v;  
  for(int i=0;i<points.size();i++)
  {                  
   
    {
         point p;
         p.x=points[i][0];
         p.y=points[i][1];

         v.push_back(p);
    }
  }


sort(v.begin(),v.end(),cmp);

vector<vector<int>> dist;

  for(int i=0;i<k;i++)
  {
       dist.push_back({v[i].x,v[i].y});
  }


return dist;


    }
};