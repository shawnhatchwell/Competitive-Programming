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

#define MAIN int main(){ ios_base::sync_with_stdio(false); cin.tie(0); doIt(); return 0;} void doIt()
#define finish(x) return cout << x << nl, 0;

void doIt(){
	int t;
	cin >> t;
	while(t-->0){
		int n;
		cin >> n;
		int *a=new int[200000];
		unordered_set<int> set;
		bool q = true;
		FOR(i,n){
			int m;
			cin >> m;
			a[i] = (m + 1000000000+i)%n;
			if(set.count(a[i]) > 0) q = false;
			else set.emplace(a[i]);
			//cout << a[i] << endl;
		}
		string st = q?"YES":"NO";
		cout << st << nl;
		delete a;
	}
}

int main(){ ios_base::sync_with_stdio(false); cin.tie(0); doIt(); return 0;} 