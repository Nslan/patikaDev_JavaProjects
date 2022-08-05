package List;

public class MyList<T> {
    private int capacity ;
    private  T  myArray[] ;


    public MyList(){
        this.capacity = 10;
        this.myArray = (T[])new Object[capacity];
    }

    public MyList(int capacity) {
        this.capacity = capacity;
        this.myArray = (T[])new Object[capacity];
    }

    public int size(){

        int count=0;
        for ( T in : myArray ) {
            if ( in != null ){
                count++;
            }
        }
        return count;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int newCapacity){
        this.capacity = newCapacity;
    }

   public void add(T data){

        if ( this.size() < this.getCapacity() ){
            this.myArray[this.size()] = data;
        }
        else if ( this.size() == this.getCapacity() ){//

            T tempArray[] = (T[]) new Object[ this.getCapacity() * 2  ];

            for ( int i=0; i < this.getCapacity(); i++  ) {
                tempArray[i] = this.myArray[i];
            }

            this.myArray = tempArray;


        }

    }

    public T get(int index){

       if ( 0 <= index && index < capacity ){
           return (T) myArray[index];
       }

            return (T) null;
    }

    public T remove(int index){

        if ( 0 <= index && index < this.size() ){

            for (int i=index; i < this.size() -1 ; i++  ){

                this.myArray[i] = this.myArray[i+1];

            }
            this.myArray[size()-1]=null;//herseferinde son elemanı silmek lazım
            return (T) "silindi";
        }

        else  return (T) null;

    }


  public T set(int index, T data){

        if ( 0 <= index && index < this.capacity ){
            myArray[index] = data;
            return (T) "directory changed";
        }

        else return (T) null;

    }


    public String toString(){
        String string = "[";
        String str;


        for ( int i=0; i < this.size() ; i++ ) {
            str = String.valueOf( myArray[i] );

            if ( i != this.size()-1 ){
                string += str + ",";
            }else string += str;

        }
        string+="]";


        return string;
    }

    public int indexOf(T data){

        for ( int i=0; i < this.size() ; i++  ) {

            if ( myArray[i].equals(data) ){
                return i;
            }


        }
        return -1;
    }


    public int lastIndexOf(T data){

        for ( int i = this.size(); i>=0 ; i--  ) {

            if ( data.equals(myArray[i]) ){
                return i;
            }

        }
        return -1;
    }

    public boolean isEmpty(){
        if ( this.size() == 0 ) return true;
        else return false;
    }

    public T[] toArray(){
        return myArray;
    }

    public void clear(){

        for (int i=0; i< myArray.length; i++ ){
            myArray[i]=null;
        }



    }

    public MyList<T> subList(int start , int finish){

        MyList<T> tempList = new MyList<T>(finish-start);
        for (int i=start; i<=finish; i++){
            tempList.add( this.myArray[i] ) ;
        }

        return  tempList;
    }

    public boolean contains(T data){

        for ( T in : myArray ) {
            if (in == null && data==null) return true;
            if (in == null && data!=null) return false;
            if ( in.equals(data) ){
                return true;
            }

        }


        return false;

    }

}
