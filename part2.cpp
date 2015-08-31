#include <iostream>
#include <string>
#include <locale>

using namespace std;

string obenglobish(string);
bool is_wollar(char);
void cast(string);

void cast (string messege) {
	cout << messege << endl;
}

string obenglobish(string english) {

	string 	result = "";

	int 	length = english.size(),
			current = 0;

	char	currchar,
			nextchar;

	bool	doit_flag = false;

	// cast("initialized");
	while (current < length) {
		currchar = english.at(current);

		// cast("iteration");
		if (is_wollar(currchar)) {
			// cast("wollar");
			doit_flag = true;
			nextchar = (current+1 < length) ? english.at(current+1) : ' ';
			if (is_wollar(nextchar))
				doit_flag = false;
			if (currchar == 'e' && !isalpha(nextchar))
				doit_flag = false;
			if (doit_flag) {
				result.push_back('o');
				result.push_back('b');
			}
		}
		result.push_back(currchar);
		current ++;
	}

	return result;

}

bool is_wollar(char letter) {
	return (
		letter == 'a' ||
		letter == 'o' ||
		letter == 'i' ||
		letter == 'u' ||
		letter == 'e' ||
		letter == 'y'
	) ? true : false ;
}

int main(int argc, char const *argv[]) {
	
	while (true) {

		string word;
		cout << "Enter word: ";
		getline(cin, word);
		if (word == "") break;
		cout << word << " --> " << obenglobish(word) << endl;
	}

	return 0;
}