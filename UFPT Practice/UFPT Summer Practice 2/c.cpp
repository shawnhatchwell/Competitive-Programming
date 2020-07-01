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
#define sz(v) (int)v.size()

#define MAIN void doIt(); int main(){ios_base::sync_with_stdio(false);cin.tie(0);doIt();return 0;} void doIt()

bool overlap(pi p1, pi p2){
	return get<0>(p1)<=get<1>(p2)&&get<0>(p2)<=get<1>(p1);
}

MAIN{
	int t;
	cin>>t;
	FORR(tt,t){
		int m,x,n;
		cin>>m>>x>>n;
		vector<pi> rng;
		rng.pb(mp(x,x));
		FORR(i,n){
			int l,r;
			cin>>l>>r;
			pi np = mp(l,r);
			vi del;
			int pos=0;
			bool ov=false;
			for(pi p:rng){
				if(overlap(np,p)){
					np=mp(min(get<0>(np),get<0>(p)),max(get<1>(np),get<1>(p)));
					del.pb(pos);
					ov=true;
				}
				pos++;
			}
			if(ov){
				ROFF(q,sz(del)){
					rng.erase(rng.begin()+del.at(q));
				}
				rng.pb(np);
			}
		}
		int count=0;
		for(pi p:rng){
			count+=1+(get<1>(p)-get<0>(p));
		}
		cout<<count<<nl;
	}
}