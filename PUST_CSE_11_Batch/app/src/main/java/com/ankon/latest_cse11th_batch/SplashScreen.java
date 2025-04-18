#include<bits/stdc++.h>
using namespace std;
int main()
{
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);
    int t;
    cin>>t;
    while(t--)
    {
        int n;
        cin>>n;
        unordered_map<string,int>change;
                unordered_map<string,string>present;



        while(n--)
        {
            int a;
            cin>>a;
            if(a==1)
            {
                string s1,s2;
                cin>>s1>>s2;
                if(present[s2]=="")
                {
                    present[s2]=s1;
                    present[s1]="";
                    //ava[s2]=1;
                    if(change[s2]==1)
                    {
                        
                        change[s2]=0;
                    }
                     change[s1]=1;
                }

            }
            else
            {
                string s;
                cin>>s;
                if(change[s]==1)cout<<"Not in use!"<<endl;
                else if(present[s]!="")cout<<present[s]<<endl;
                else cout<<s<<endl;
            }
        }

    }

    return 0;
}
