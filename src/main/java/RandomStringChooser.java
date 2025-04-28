import java.util.*;
public class RandomStringChooser
{
  private String[] s;
  private int v;
  public RandomStringChooser(String[] x){
    s = new String[x.length];
    for(int i = 0; i < s.length; i++){
      s[i] = x[i];
    }
    v = x.length;
  }
  public String getNext(){
    if(v == 0){
      return "NONE";
    }
    int i = (int)(Math.random()*v);
    String se = s[i];
    s[i] = s[v - 1];
    v--;
    return se;
  }
  /* to be implemented in part (a) */
  
  //Heads up! 
  //You will get a very confusing error message until you have working code in part b as well
}
