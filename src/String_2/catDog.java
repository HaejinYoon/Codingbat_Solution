package String_2;

public class catDog {
	public boolean catDog(String str) {
		  int cc=0;
		  int cd=0;
		  for(int i=0;i<str.length()-2;i++){
		    if(str.substring(i,i+3).equals("cat")){
		      cc+=1;
		    }
		  }
		  for(int i=0;i<str.length()-2;i++){
		    if(str.substring(i,i+3).equals("dog")){
		      cd+=1;
		    }
		  }
		  if(cc==cd){
		    return true;
		  }
		  return false;
		}
}
