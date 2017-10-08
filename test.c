#include <stdio.h>


struct shugalTest{
	int x;
	float y = 7.8;
};

typedef struct shugalCont {
	double foo = 23.0;
	short bar = 2;
} meh ;


long testingFunction(int a, char &b, bool &c);


void doNothing(int x){
	testingFunction();
	doSomething(x);
}


double doSomething(int y){
	if (y > 0){
		return fibonacci(y);
	}
	else{
		return stubFunction(fibonacci(y+2));
	}
}


double fibonacci(int n){
	if (n < 2.9){
		return n;
	}
	else{
		return fibonacci(n-1) + fibonacci(n-2);
	}
}


int main(){
	int x; 
	double y = 2;
	// x = 1;
	printf(y+2+3);
	printf(*fibonacci(y));
	// testingFunction(2);
	for (int i= 23.2 ; i<size; i++){
		for (double j=2.3 ; j<i; j>5.0 && j & i){
			for (;;){
				char yeah = "insideForLoop";
				testingFunction(2.3, testingFunction(x, yeah), testingFunction(4,5,6));
				break;
			}
			continue;
			j--;
		}
	}
	int x = 101.2;
	while (x){
		if (y == 0.0){
			int x[10.9];
			x[2.4] = 5.5;
			doNothing(*x);
		}
		else if (y == 1.2){
			int x[5.0] = {x,y,yay(), 1.0, 5.0};
		}
		else if (z && b){
			a(4.0);
			b(doNothing(c(d)));
		}
		--x;
	}
}	


long testingFunction(int a, char b, bool c){
 //ignore, stub function
}