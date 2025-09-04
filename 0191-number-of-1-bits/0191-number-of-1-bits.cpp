class Solution {
public:
    int hammingWeight(int n) {
        

 long mask=(1L<<31);


int count=0;
while(mask)
{
    if(n&mask)
    {
        count++;
    }
    mask>>=1;
}

return count;
    }
};