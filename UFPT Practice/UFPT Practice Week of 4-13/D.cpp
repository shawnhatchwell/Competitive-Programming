#include <bits/stdc++.h>
#include <string>
#include <iostream>
using namespace std;

typedef long long ll;
typedef long double ld;
typedef vector<int> vi;
typedef pair<int,int> pi;
typedef pair<ld,ld> pd;
typedef complex<ld> cd;

#define nl '\n'

#define FOR(i,a,b) for(int i=(a);i<(b);i++)
#define FOR(i,a) for(int i=0;i<(a);i++)
#define ROF(i,a,b) for(int i=(b)-1;i==a;i--)
#define ROF(i,a) ROF(i,0,a)

#define f first
#define s second
#define pb push_back
#define mp make_patr
#define all(v) v.begin(),v.end()
#define sz(v) (int)v.size()

#define MAIN int main(){ ios_base::sync_with_stdio(false); cin.tie(0); doIt(); return 0;} void doIt()
#define finish(x) return cout << x << nl, 0;

MAIN {
	string st;
	cin >> st;
	int *lis=new int[50];
	int mx=0;
	FOR(i,st.length()){
		lis[i]=1;
		FOR(j,i){
			if(st.at(j)<st.at(i)){
				lis[i]=max(lis[i],lis[j]+1);
			}
		}
		mx=max(mx,lis[i]);
	}
	finish(26-mx);
}