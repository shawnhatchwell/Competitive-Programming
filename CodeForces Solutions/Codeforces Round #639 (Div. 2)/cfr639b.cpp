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
	int t;
	cin >> t;
	int *a=new int[10000];
	int cur = 2;
	int add = 2;
	int mx = 0;
	FOR(i,10000){
		a[i]=cur;
		mx = i;
		add+=3;
		cur+=add;
		if(cur > 1000000) break;
	}
	while(t-->0){
		int n;
		cin >> n;
		int count = 0;
		
		/*while(n>1){
			int h = mx;
			int l = 0;
			while(h > l){
				int mid = (h+l+1)/2;
				if( a[mid] >  n){
					h = mid-1;
				}
				else{
					l = mid;
				}
				if(h == l){
					count++;
					n-=a[h];
					break;
				}
				
			}
		}*/
		cout << count << endl;
	}
}