package util;

import java.util.StringTokenizer;

//This is an example (faulty) class to be used for A4 Task1 and Task2
public class Counter {
	public int _ctr;
	public int _multiplier;

	// method increments _ctr
	public void increment() {
		_ctr++; // faulty increment
	}

	// method decrements _ctr
	public void decrement() {
		_ctr--; // faulty decrement
	}

	// method resets _ctr
	public void reset() {
		_ctr = 0; // faulty reset, _ctr should rather be 0
	}

	// method multiplies _ctr by n
	public void multiplyBy(int multiplier) {
		_multiplier = multiplier; // no fault here
		_ctr = _ctr * _multiplier; // no fault here
	}

	// TODO: dev1- method for increment to closest even number
	public void incrementToEven() {
		if (_ctr % 2 == 0) {
			increment();
		} else {
			_ctr++;
		}
	}

	// TODO: dev1- method for decrement to closest even number
	public void decrementToEven() {
		if (_ctr % 2 == 0) {
			_ctr -= 2;
		} else {
			_ctr--;
		}
	}

	// TODO: dev2- method for increment to closest prime number
	public void incrementToPrime() {
		increment();
		while (!isPrime(_ctr)) {
			_ctr++;
		}
	}
	

	// TODO: dev2- method for decrement to closest prime number
	public void decrementToPrime() {
		decrement();
		while (!isPrime(_ctr)) {
			_ctr--;
		}
	}
	private boolean isPrime(int n) {
		if (n <= 1) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

	// TODO: dev3- count the frequency of word in sentence,
	// refactor source code from dev1 and dev2
	public void countFrequency(String word, String sentence) {

		// Split sentence into words
        String[] words = sentence.split(" ");

        for (String w : words) {
            if (word.equals(w)) {
            	_ctr++;
            }
        }
	}

}
