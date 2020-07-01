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
#define ROF(i,a) for(int i=(a)-1;i==0;i--)

#define f first
#define s second
#define pb push_back
#define mp make_patr
#define all(v) v.begin(),v.end()
#define sz(v) (int)v.size()

#define FAST ios_base::sync_with_stdio(false); cin.tie(0);
#define finish(x) return cout << x << nl, 0;



int main(){ FAST
	int t;
	cin >> t;
	
	while(t-->0){
		int n;
		int x;
		cin >> n >> x;
		int mx=0;
		bool one=false;
		FOR(i,n){
			int cr;
			cin >> cr;
			mx=max(mx,cr);
			one = one | (cr==x);
		}
		int jumps=(x-1)/mx+1;
		auto ans = one?"1":(mx>x?"2":to_string(jumps));
		cout << ans << nl;
	}
	return 0;

}
