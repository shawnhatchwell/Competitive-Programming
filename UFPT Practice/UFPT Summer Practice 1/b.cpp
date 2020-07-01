#include <bits/stdc++.h>
#include <string>
#include <iostream>
using namespace std;

typedef long long ll;
typedef long double ld;
typedef vector<int> vi;
typedef pair<ld,ld> pd;
typedef complex<ld> cd;

#define nl '\n'

#define FOR(i,a,b) for(int i=(a);i<(b);i++)
#define FORR(i,a) for(int i=0;i<(a);i++)
#define ROF(i,a,b) for(int i=0;i<(b)-1;i==(a);i--)

#define f first
#define s second
#define pb push_back
#define mp make_pair
#define all(v) v.begin(),v.end()
#define sz(v) (int)v.size()

#define MAIN void doIt(); int main(){ ios_base::sync_with_stdio(false); cin.tie(0); doIt(); return 0;} void doIt()
//--------------------------------------------------------------
MAIN{
	string s1;
	int n;
	string s2;
	cin >> s1 >> n >> s2;

	int* a1=new int[128];
	int* a2=new int[128];

	memset(a1, 0, sizeof(a1));
	memset(a2, 0, sizeof(a2));
	bool ch=true;
	int val=1;
	int lc=(int)s1.at(0);
	FOR(i,1,sz(s1)){
		if(ch){
			if(s1.at(i)>=65){
				a1[lc]+=val;
				lc=(int)s1.at(i);
			}
			else{
				val=s1.at(i)-48;
				ch=false;
			}
		}
		else{
			if(s1.at(i)>=65){
				ch=true;
				a1[lc]+=val;
				lc=(int)s1.at(i);
				val=1;
			}
			else{
				val*=10;
				val+=s1.at(i)-48;
			}
		}
	}
	a1[lc]+=val;
	FORR(i,128){
		a1[i]*=n;
	}
	ch=true;
	val=1;
	lc=(int)s2.at(0);
	FOR(i,1,sz(s2)){
		if(ch){
			if(s2.at(i)>=65){
				a2[lc]+=val;
				lc=(int)s2.at(i);
			}
			else{
				val=s2.at(i)-48;
				ch=false;
			}
		}
		else{
			if(s2.at(i)>=65){
				ch=true;
				a2[lc]+=val;
				lc=(int)(s2.at(i));
				val=1;
			}
			else{
				val*=10;
				val+=s2.at(i)-48;
			}
		}
	}
	a2[lc]+=val;
	int ans=1000000000;
	FOR(i,64,128){
		//cout << i << " " << a1[i] << " " << a2[i] << nl; 
		if(a2[i]>0){
			ans=min(ans, a1[i]/a2[i]);
		}
	}

	cout << ans << nl;
}