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
#define ROF(i,a,b) for(int=0;i<(a);i++)

#define f first
#define s second
#define pb push_back
#define mp make_pair
#define all(v) v.begin(),v.end()
#define sz(v) (int)v.size();

#define MAIN void doIt(); int main(){ios_base::sync_with_stdio(false);cin.tie(0);doIt();return 0;} void doIt();

MAIN{
	int n;
	ld d;
	cin >>n>>d;
	int*x=new int[100];
	int*y=new int[100];
	int*pn=new int[100];
	int*m=new int[100];
	FORR(i,n){
		cin>>x[i]>>y[i]>>pn[i]>>m[i];
	}
	int**am[]=new int[100][100];
	
}