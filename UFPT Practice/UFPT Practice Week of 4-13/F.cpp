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
#define mp make_pair
#define all(v) v.begin(),v.end()
#define sz(v) (int)v.size()

#define FAST ios_base::sync_with_stdio(false); cin.tie(0);
#define finish(x) return cout << x << nl, 0;

int main(){ FAST
	int n;
	cin >> n;
	string* arr=new string[1000];
	int * adj=new int[1000][1000];
	FOR(i,n){
		cin >> arr[i];
		FOR(j,i){
			int cnt=0;
			FOR(k,3){
				if(arr[j].at(k)!=arr[i].at(k)) cnt++;
			}
			adj[i][j]=cnt;
			adj[j][i]=cnt;
		}
	}
	vi q;
	vi sp;
	vi wd;
	q.pb(0);
	sp.pb(0);
	while(true){
		int curr=q.
	}


	

}