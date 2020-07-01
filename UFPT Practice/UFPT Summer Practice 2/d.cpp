#include <bits/stdc++.h>
#include <string>
#include <iostream>
using namespace std;

typedef long long ll;
typedef long double ld;
typedef vector<int> vi;
typedef pair<int,int> pi;
typedef pair<ld,ld> pd;

#define nl '\n'

#define FOR(i,a,b) for(int i=(a);i<(b);i++)
#define FORR(i,a) for(int i=0;i<(a);i++)
#define ROF(i,a,b) for(int i=(b)-1;i>=(a);i--)
#define ROFF(i,a) for(int i=(a)-1;i>=0;i--)

#define f first
#define s second
#define pb push_back
#define mp make_pair
#define all(v) v.begin(),v.end()
#define sz(v) (int)v.size();

#define MAIN void doIt(); int main(){ios_base::sync_with_stdio(false);cin.tie(0);doIt();return 0;} void doIt()

int x1,x2,y1,y2;

inB(int x, int y){
	return x>=x1&&x<=x2&&y>=y1&&y<=y2;
}

MAIN{
	int n;
	cin>>n;
	//int x1,y1,x2,y2;
	cin>>x1>>y1>>x2>>y2;
	int cx = (x1>x2)?-1:1;
	int cy = (y1>y1)?-1:1;
	x1*=cx;x2*=cx;y1*=cy;y2*=cy;
	vi a();
	FORR(i,n){
		int x,y;
		cin>>x>>y;
		x*=cx;y*=cy;
		if(inB(x,y)) a.insert(pi(x,y));
	}
	sort(all(a));
	

}