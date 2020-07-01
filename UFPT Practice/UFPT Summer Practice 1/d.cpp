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
#define ROF(i,a,b) for(int i=0;i<(a);i++)

#define f first
#define s second
#define pb push_back
#define mp make_pair
#define all(v) v.begin,v.end()
#define sz(v) (int)v.size()

#define MAIN void doIt(); int main(){ ios_base::sync_with_stdio(false); cin.tie(0); doIt(); return 0;} void doIt()

MAIN{
	int n,k,m,t;
	cin >> n >>k>>m>>t;
	
	FORR(i, t){
		int p,q;
		cin>>p>>q;
		if(p==1){
			n++;
			if(q<=k) k++;
		}
		else{
			if(q<k){
				n-=q;
				k-=q;
			}
			else{
				n=q;
			}
		}
		cout << n <<" "<< k <<nl;
	}
}