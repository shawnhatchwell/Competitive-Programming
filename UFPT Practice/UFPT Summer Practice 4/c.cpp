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
	int n,k;
	cin>>n>>k;
	int* a=new int[200000];
	int* buc=new int[100];
	memset(buc,0,sizeof(int)*100);
	FORR(i,n){
		int x;
		cin>>x;
		a[i]=x%k;
		buc[a[i]]++;
		//cout<<a[i]<<" "<<buc[a[i]]<<nl;
	}
	/*FORR(i,k){
		cout<<buc[i]<<nl;
	}*/
	int ans=buc[0]-(buc[0]%2);
	if(k%2==0){
		ans+=buc[k/2]-(buc[k/2]%2);
	}
	FOR(i,1,(k+1)/2){
		ans+=min(buc[i],buc[k-i])*2;
	}
	cout<<ans<<nl;
}