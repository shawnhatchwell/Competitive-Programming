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

#define f first
#define s second
#define pb push_back
#define mp make_pair
#define all(v) v.begin(),v.end()
#define sz(v) (int)v.size()

#define FOR(i,a,b) for(int i=(a);i<(b);i++)
#define FORR(i,a) for(int i=0;i<(a);i++)
#define ROF(i,a,b) for(int i=(b)-1;i>=(a);i--)
#define ROFF(i,a) for(int i=(a)-1;i>=0;i--)

#define MAIN void doIt(); int main(){ios_base::sync_with_stdio(false);cin.tie(0);doIt();return 0;} void doIt()

MAIN{
	int n,w;
	cin>>n>>w;
	int* a=new int[100];
	int* ans=new int[100];
	vector<pi> ind;
	FORR(i,n){
		cin>>a[i];
		ind.pb(mp(a[i],i));
		ans[i]=(a[i]+1)/2;
		w-=ans[i];
	}
	if(w<0){
		cout<<-1<<nl;
		return;
	}
	else{
		sort(all(ind));
		reverse(all(ind));
		while(w>0){
			for(vector<pi>::iterator i=ind.begin();i<ind.end();){
				int x=i->s;
				if(ans[x]!=a[x]){
					ans[x]+=1;
					w--;
					if(w==0){
						break;
					}
					++i;
				}
				else{
					i=ind.erase(i);
				}
			}
		}
	}
	FORR(i,n){
		cout<<ans[i];
		if(i<n-1) cout<<" ";
		else cout<<nl;
	}

}