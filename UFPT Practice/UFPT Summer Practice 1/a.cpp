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

#define f first
#define s second
#define pb push_back
#define mp make_patr
#define all(v) v.begin(),v.end()
#define sz(v) (int)v.size()

#define MAIN void doIt(); int main(){ ios_base::sync_with_stdio(false); cin.tie(0); doIt(); return 0;} void doIt()
#define finish(x) return cout << x << nl, 0;

MAIN{
	int s,t,n;
	cin >> s >> t >> n;
	int* d = new int[21];
	int* b = new int[20];
	int* c = new int[20];
	FOR(i,n+1){
		cin >> d[i];
	}
	FOR(i,n){
		cin >> b[i];
	}
	FOR(i,n){
		cin >> c[i];
	}
	s+=d[0];
	FOR(i,n){
		if(s%c[i]!=0){
			s+=(c[i]-(s%c[i]));
			s+=b[i]+d[i+1];
		}
	}
	cout << ((s<=t)?"yes":"no");
}