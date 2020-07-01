#include <bits/stdc++.h>
#include <string>
#include <iostream>
using namespace std;

typedef long long ll;
typedef long double ld;
typedef vector<int> vi;
typedef pair<ld,ld> pd;

#define nl '\n'

#define FOR(i,a,b) for(int i=(a);i<(b);i++)
#define FORR(i,a) for(int i=0;i<(a);i++)
#define ROF(i,a,b) for(int i=(b)-1;i>=(a);i--)
#define ROFF(i,a) for(int i=(a)-1;i>=0;i--)

#define f first
#define s second
#define pb push_back
#define mp make_pair
#define all(v) v.begin(), v.end()
#define sz(v) (int)v.size()

#define MAIN void doIt(); int main(){ios_base::sync_with_stdio(false);cin.tie(0);doIt();return 0;} void doIt()

MAIN{
	int c;
	cin>>c;
	FORR(t,c){
		int n;
		cin>>n;
		int*a=new int[n];
		int sum=0;
		FORR(i,n){
			cin>>a[i];
			sum+=a[i];
		}
		double total=0;
		FORR(i,n){
			if(a[i]*n>sum) total++;
		}
		double ans=total/n;
		ans*=100;
		printf("%6.3f%%\n",ans);
		delete a;
	}
}