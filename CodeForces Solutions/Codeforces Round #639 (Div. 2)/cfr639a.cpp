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
		int n, m;
		cin >> n >> m;
		string st = (n==1||m==1||(n==2&&m==2))?"YES":"NO";
		cout << st << nl;
	}
}

int main(){ ios_base::sync_with_stdio(false); cin.tie(0); doIt(); return 0;} 