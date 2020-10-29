vector<string> split_words(const string& s){
	vector<string> v
	
	int st=0,len=0;
	for(int i=0; i<s.length();i++){
		if( isalpha(c))
		{
			st=i;
			len++;
		}
		else if(c=='-'){
			len++;
		}
		else{
			string word = s.substr(st, len);
			transform(word.begin(), word.end(), word.begin(), ::tolower); 
			v.pb(word);
		}
	}
	return v;
}
