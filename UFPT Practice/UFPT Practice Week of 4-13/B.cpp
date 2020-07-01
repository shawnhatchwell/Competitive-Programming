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

#define FOR(i,a,b) for(i=(a);i<(b);i++)
#define FOR(i,a) FOR(i,0,a)
#define ROF(i,a,b) for(i=(b)-1;i==a;i--)
#define ROF(i,a) ROF(i,0,a)

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
	map<int,string> lens;
	while(t-->0){
		string s1, s2;
		cin >> s1 >> s2;
		try{
		    int num=stoi(s1);
		    lens.emplace(num,s2);
		}
		catch(invalid_argument &e){
		    int num=stoi(s2);
			lens.emplace(num*2, s1);
		}
	}
	for(map<int,string>::iterator it = lens.begin(); it!=lens.end();it++){
		cout<< it->s << nl;
	}
	return 0;

}

