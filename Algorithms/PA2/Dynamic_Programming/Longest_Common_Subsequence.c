#include<stdio.h>
#include<string.h>
#define maxn 100100
int max(int a,int b)
{
        return a>b?a:b;
}
int LongestCommonSubsequence(char S[],char T[])
{
        int Slength = strlen(S);
        int Tlength = strlen(T);
        
        int iter,jter;
        for(iter=Slength;iter>=1;iter--)
        {
                S[iter] = S[iter-1];
        }
        for(iter=Tlength;iter>=1;iter--)
        {
                T[iter] = T[iter-1];
        }

        int common[Slength+1][Tlength+1];
        /* common[i][j] represents length of the longest common sequence in S[1..i], T[1..j] */
        /* Recurrence:  common[i][j] = common[i-1][j-1] + 1 if S[i]==T[j]
                                     = max(common[i-1][j],common[i][j-1]) otherwise
        */      
        /*common[0][i]=0, for all i because there are no characters from string S*/
        for(iter=0;iter<=Tlength;iter++)
        {
                common[0][iter]=0;
        }
        /*common[i][0]=0, for all i because there are no characters from string T*/
        for(iter=0;iter<=Slength;iter++)
        {
                common[iter][0]=0;
        }
        for(iter=1;iter<=Slength;iter++)
        {
                for(jter=1;jter<=Tlength;jter++)
                {
                        if(S[iter] == T[jter] )
                        {
                                common[iter][jter] = common[iter-1][jter-1] + 1;
                        }
                        else
                        {
                                common[iter][jter] = max(common[iter][jter-1],common[iter-1][jter]);
                        }

                }
        }
        return common[Slength][Tlength];

}
int main()
{
        char S[maxn],T[maxn];/* S,T are two strings for which we have to find the longest common sub sequence. */
        scanf("%s%s",S,T); 
        printf("%d\n",LongestCommonSubsequence(S,T));

}
