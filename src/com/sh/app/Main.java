package com.sh.app;

import com.sh.app.animal.Bird;
import com.sh.app.animal.Cat;
import com.sh.app.animal.Dog;
import com.sh.app.animal.Pig;
import com.sh.app.animal.Tiger;

public class Main {

	public static void main(String[] args) {
		System.out.println("HELLO WORLD");
		System.out.println("HELLO GIT");
	
		System.out.println("동물기능 시작~");
		new Dog().bark();
		new Cat().jump();
		new Pig().cry();
		new Bird().fly();
		new Tiger().jump();
	}

	public void test() {
		System.out.println("Main#test");
	}
}
