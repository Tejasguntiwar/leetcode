class Solution {
    public double myPow(double x, int n) {
        if(n==0) return 1.0;
        if(x==0) return 0.0;
        if(x==1) return 1.0;
        if(x==-1 && n%2!=1) return 1.0;
        if(x==-1 && n%2==1) return -1.0;

        long binForm = n;
        if(binForm<0) {
            binForm = -binForm;
            x = 1/x;
        }
        double ans = 1.0;
        while(binForm>0) {
            if(binForm%2 == 1) {
                ans *= x;
            }
            x*=x;
            binForm/=2;
        }        
        return ans;
    }
}
// class Solution {
//     public double calculate(double x, int n) {
//         if(n == 0) return 1;

//         double half = calculate(x, n/2);
//         double halfSq = half * half;

//         if(n%2 != 0) halfSq = x * halfSq;

//         return halfSq; 
//     }
//     public double myPow(double x, int n) {
//         if(n<0)
//         return (1/calculate(x , n*-1));

//         return calculate(x , n);
//     }
// }

// class Solution {
//     public double cal(double x, int n) {
//         if(n==0) return 1;

//         if((n&1) == 1) {
//             return x * x * cal(x,n>>1);
//         }
        
//         return cal(x, n>>1);
//     }
//     public double myPow(double x, int n) {
//         if(n<0) return (1/cal(x,n*-1));
//         return cal(x , n);
//     }
// }












