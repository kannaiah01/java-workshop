import java .util.Arrays;
public class Platform{
public static int findMinimumPlatform(int[] arrivals,int[]  departures,int n){
Arrays.sort(arrivals);
Arrays.sort(departures);
int PlatformNeeded=1;
int i=1;
int j=0;
while(i<n&&i<n){
[if(arrivals[i]<=departures[j]){
PlatformNeeded++;
i++;
}else{
platformNeeded--;
j++;
}
maxPlatform=Math.max(maxPlatforms,PlatformNeeded);
}
return maxPlatform;
}

public static void main[String []args){
int[] arrivals=(900,940,950,1100,1800);
int[]departures={910,1200,1120,1130,1900,2000};
int n=arrivals.length;
int result=findMinimumPlatform(arrivals,departures)
int i=1;
int j=0;
int min=1;
int max=1;
}
}