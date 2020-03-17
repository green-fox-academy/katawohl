/*
Create Counter class
which has an integer field value
        when creating it should have a default value 0 or we can specify it when creating
    we can add(number) to this counter another whole number
    or we can add() without parameters just increasing the counter's value by one
    and we can get() the current value
    also we can reset() the value to the initial value
*/

package counter;

public class Counter {
  int integer;
  int initialInteger;

  public Counter(){

  }

  public Counter(int startNum){
    this.integer = startNum;
    this.initialInteger = startNum;
  }


  public void add(){
    integer++;
  }

  public int add(int addNum){
    this.integer +=addNum;
    return this.integer;
  }

  public int get(){
    return integer;
  }

  public void reset(){
    this.integer = this.initialInteger;
  }
}
