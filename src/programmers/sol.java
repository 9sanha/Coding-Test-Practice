package programmers;

public class sol {
    public long solution(int n, int r, int c) {

        int maxCount = 0;
        int tempR,tempC;
        for (int i = 1; i < n*2; i++) {
            if (r+c==i){
                break;
            }
            if (i<=n){
                maxCount+=i;
            }else {
                maxCount+=(n * 2 - i);
            }
        }
        if (r + c - 1 < n){
            if ((r + c - 1) % 2 == 0){
                tempR = r + c - 1;
                tempC = 1;
                while (tempR != r || tempC != c){
                    tempR--;
                    tempC++;
                    maxCount++;
                }
            }else {
                tempC =1;
                tempR=r + c - 1;
                while (tempR!=r || tempC!=c){
                    tempR++;
                    tempC--;
                    maxCount--;
                }
            }
        }else {
            if ((r + c - 1) % 2 == 1) {
                tempR = (r + c - 1);
                tempC = 1;

                while (tempR != r || tempC != c) {
                    tempR -= 1;
                    tempC += 1;
                    maxCount -= 1;
                }
            }else {
                tempC = 1;
                tempR = (r + c - 1);
                while(tempR != r  ||tempC != c)  {
                    tempR += 1;
                    tempC = 1;
                    maxCount -= 1;
                }
            }
        }

        return maxCount;
    }

}
