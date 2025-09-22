import java.time.Year;
class Solution {
    public int dayOfYear(String date) {
        int val=Integer.parseInt(date.substring(5,7));
        int ans=0;
        for(int i=1;i<val;i++){
            if(i==1 || i==3 || i==5 || i==7 || i==8 || i==10 || i==12) ans+=31;
            else if(i==2){
            if(Year.of(Integer.parseInt(date.substring(0,4))).isLeap()){
                ans+=29;
            }
            else  ans+=28;
            }
            else ans+=30;
        }
        ans+=Integer.parseInt(date.substring(8));   
        return ans;
         }
}