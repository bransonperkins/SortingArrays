import java.util.ArrayList; 
import java.util.Collections;  

public class AscendingDescending {
  
  private ArrayList<Integer> arrayList;       
  
  public AscendingDescending(ArrayList<Integer> arrayList) {         
    this.arrayList = arrayList;
  }

  public ArrayList<Integer> getArrayList() {         
    return this.arrayList;     
  }

  public ArrayList<Integer> sortAscending() {         
    Collections.sort(this.arrayList);         
    return this.arrayList;     
  }

  public ArrayList<Integer> sortDescending() {         
    Collections.sort(this.arrayList, Collections.reverseOrder());         
    return this.arrayList;     
  } 

}