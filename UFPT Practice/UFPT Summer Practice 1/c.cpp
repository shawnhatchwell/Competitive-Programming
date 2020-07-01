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
#define all(v) v.begin(),v.end()
#define sz(v) (int)v.size()

#define MAIN void doIt(); int main(){ ios_base::sync_with_stdio(false); cin.tie(0); doIt(); return 0;} void doIt()

MAIN{
	int n;
	cin >> n;
	int* a=new int[100000];
	int mx=0;
	bool uni=true;
	FORR(i,n){
		cin >> a[i];
		if(a[i]!=0&&a[i]!=1) uni=false;
		mx=max(mx,a[i]);
		mx=max(mx,-a[i]-1);
	}
	FORR(i,n){
		if(n%2==0){
			if(a[i]>=0) a[i]=-a[i]-1;
		}
		else{
			if(a[i]==mx || -a[i]-1==mx){
				if(a[i]<0) a[i]=-a[i]-1;
				mx=1000000000;
			}
			else if(a[i]>=0) a[i]=-a[i]-1;
		}
		cout << a[i] << (i==n?"":" ");
	}
	cout << nl;

}