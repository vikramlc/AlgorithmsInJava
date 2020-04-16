package CovidProblem;/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class CovidProblem
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner scanner = new Scanner(System.in);
        try {
            int t = scanner.nextInt();
            for(int tt=0; tt<t; tt++) {
                int numOfInputs = scanner.nextInt();
                boolean flag = true;
                int lastPos = -1;
                for(int i=0; i<numOfInputs; i++) {
                    int place = scanner.nextInt();
                    if(place == 1) {
                        int curPos = i;

                        if(lastPos != -1) {
                            int diff = curPos - lastPos;
                            if(diff < 6) {
                                flag = false;
                            }
                        }
                        lastPos = curPos;
                    }
                }

                if(flag) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        } catch(Exception e) {
            return;
        }
    }

}
